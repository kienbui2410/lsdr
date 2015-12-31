/*
 * generated by Xtext
 */
package org.xtext.validation

import java.util.ConcurrentModificationException
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.BasicEMap
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.EMap
import org.eclipse.xtext.validation.Check
import org.xtext.rdsl.Children
import org.xtext.rdsl.Component
import org.xtext.rdsl.Export
import org.xtext.rdsl.Graph
import org.xtext.rdsl.Imports
import org.xtext.rdsl.RdslPackage
import org.xtext.rdsl.exportVariable
import org.xtext.rdsl.importVariable
import org.xtext.rdsl.Extends

//import org.eclipse.xtext.validation.Check
/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RdslValidator extends AbstractRdslValidator {

	public static val INVALID_CARD = 'INVALID CARD'
    EList<String> listextends ;
//children : 0..1, extends 0..1, exports: *, imports: *
	@Check(FAST)
	def checkCardinalityOfProperties(Component c) {

		if (c.childrens.size > 1) {
			error(
				'At max we can have one children',
				RdslPackage.Literals.COMPONENT__CHILDRENS,
				INVALID_CARD
			)
		}
		if (c.extends.size > 1) {
			error(
				'At max we can have one extends',
				RdslPackage.Literals.COMPONENT__EXTENDS,
				INVALID_CARD
			)
		}
	}
	
		@Check(NORMAL)
	def checkCardinalityOfComponent(Graph g) {

		if (g.components.size < 1) {
			error(
				'At least one component is required',
				RdslPackage.Literals.GRAPH__COMPONENTS,
				INVALID_CARD
			)
		}

	}
/*
 * A component can't extends itself
 */
	/*	@Check(NORMAL)
	def checkCardinalityOfComponent(Component c) {
	listextends = new BasicEList<String>;
			var EList<Extends> listparent = new BasicEList<Extends>
		var EList<Component> listcomponent = new BasicEList<Component>
	    var bool= true;
	 listparent = c.extends
	 for ( Extends ch : listparent){
	 	listcomponent.add(ch.supComponent)
	 				 listextends.add(ch.supComponent.name);
	 }
        if (listcomponent.size < 0) {
        	return true;
        }
		else if (listextends.contains(c.name)){
					bool= false;
		}
				if (! extendRule(c)){
			error(
				'A component can\'t extends itself',
				RdslPackage.Literals.GRAPH__COMPONENTS,
				INVALID_CARD
			)			
		}
		return bool && extendRule(listcomponent.get(0) as Component);

	}
	
	def Boolean extendRule(Component c){
		var EList<Extends> listparent = new BasicEList<Extends>
		var EList<Component> listcomponent = new BasicEList<Component>
	    var bool= true;
	 listparent = c.extends
	 for ( Extends ch : listparent){
	 	listcomponent.add(ch.supComponent)
	 				 listextends.add(ch.supComponent.name);
	 }
        if (listcomponent.size < 0) {
        	return true;
        }
		else if (listextends.contains(c.name)){
					bool= false;
		}
		return bool && extendRule(listcomponent.get(0) as Component);
	}
	
	*/
	/* Error : Child name already declared : Duplicate child name forbidden */
	@Check(FAST)
	def checkDuplicateChildreen(Children c) {
		var EList<Component> childreenList = new BasicEList<Component>
		childreenList = c.children
		childreenList.add(c.child)
		for (Component comp : childreenList) {
			childreenList.remove(comp);
			for (Component compo : childreenList) {
				if (comp.name.equals(compo.name)) {
					error(
						'Child already declared',
						RdslPackage.Literals.CHILDREN__CHILDREN,
						INVALID_CARD
					)
				}
			}
		}
	}

	/* Variable exported already declared : Duplicate variable forbidden */
	@Check(FAST)
	def checkExportsDeclareInComponent(exportVariable ex) {
		var Component eCompo = ex.eContainer().eContainer() as Component;
		var EList<Export> exports = new BasicEList<Export>;
		exports = eCompo.exports;
		var int count = 0;
		try {
			for (Export e : exports) {
				for (exportVariable exv : e.exports) {
					if (exv.name.equals(ex.name)) {
						count++;
					}
				}
				if (e.export.name.equals(ex.name)) {
					count++;
				}

			}

			if (count > 1) {
				error(
					'Variable exported already declared',
					RdslPackage.Literals.EXPORT_VARIABLE__INITIAL,
					INVALID_CARD
				)
			}
		} catch (ConcurrentModificationException e) {
		}
	}

	/* Variable Import already declared : Duplicate variable forbidden */
	@Check(FAST)
	def checkDuplicateImport(importVariable imp) {
		var Component eCompo = imp.eContainer().eContainer() as Component;
		var EList<Imports> imports = new BasicEList<Imports>;
		imports = eCompo.imports;
		var int count = 0;
		try {
			/*  Case 1 : importname is star ( Example : eimports : lamb.*) => name is null*/
			if (imp.name == null) {
				for (Imports impo : imports) {
					for (importVariable impv : impo.imports) {
						if (impv.importvariable.name.equals(imp.importvariable.name)) {
							count++;
						}
					}
					if (impo.imported.importvariable.name.equals(imp.importvariable.name)) {
						count++;
					}
				}
			} /*  Case 2 : importVariable is null ( Example : imports : ip) */
			else if (imp.importvariable == null) {
				for (Imports impo : imports) {
					for (importVariable impv : impo.imports) {
						if (impv.importvariable == null && impv.name.equals(imp.name)) {
							count++;
						}
					}
					if (impo.imported.importvariable == null && impo.imported.name.equals(imp.name)) {
						count++;
					}
				}

			} /*  Case 3 :  ( Example : imports : LB.ip) */
			else {
				for (Imports impo : imports) {
					for (importVariable impv : impo.imports) {
						if (impv.importvariable != null && impv.importvariable.name.equals(imp.importvariable.name) &&
							impv.name.equals(imp.name)) {
							count++;
						}
					}
					if (impo.imported.importvariable != null &&
						impo.imported.importvariable.name.equals(imp.importvariable.name) &&
						impo.imported.name.equals(imp.name)) {
						count++;
					}
				}
			}

			if (count > 1) {
				error(
					'Variable import already declared',
					RdslPackage.Literals.IMPORT_VARIABLE__IMPORTVARIABLE,
					INVALID_CARD
				)
			}
		} catch (ConcurrentModificationException e) {
		}
	}

	/* Variable imported must be declare as Export in its component */
	@Check(FAST)
	def checkImportsDeclareInComponent(importVariable imp) {
		var Graph eGraph = imp.eContainer().eContainer().eContainer() as Graph;
		var EMap<String, EList<String>> emap = new BasicEMap();
		var EList<String> elist;
		try {

			for (Component c : eGraph.components) {
				elist = new BasicEList<String>;
				for (Export export : c.exports) {
					for (exportVariable exVar : export.exports) {
						elist.add(exVar.name);
					}
					elist.add(export.export.name);
				}
				
				emap.put(c.name, elist);
			}

			var String CompFacet = imp.importvariable.name;
			var String importVal = imp.name;
			var Component compo = imp.eContainer().eContainer() as Component;
			if (CompFacet == null) {
				if (! emap.get(compo.name).contains(importVal)) {
					error(
						'Variable imported must be declare as Export in the component',
						RdslPackage.Literals.IMPORT_VARIABLE__IMPORTVARIABLE,
						INVALID_CARD
					)
				}
			} else {
				if ((! emap.get(CompFacet).contains(importVal)) && importVal!=null) {
					error(
						'Variable imported must be declare as Export in the component',
						RdslPackage.Literals.IMPORT_VARIABLE__IMPORTVARIABLE,
						INVALID_CARD
					)
				}
			}
		} catch (ConcurrentModificationException e) {
		}
	}
}
