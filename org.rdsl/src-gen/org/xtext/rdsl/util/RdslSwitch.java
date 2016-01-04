/**
 */
package org.xtext.rdsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.rdsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.rdsl.RdslPackage
 * @generated
 */
public class RdslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RdslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RdslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RdslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RdslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.GRAPH:
      {
        Graph graph = (Graph)theEObject;
        T result = caseGraph(graph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.URL:
      {
        URL url = (URL)theEObject;
        T result = caseURL(url);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IMPOT_URI:
      {
        ImpotUri impotUri = (ImpotUri)theEObject;
        T result = caseImpotUri(impotUri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.COMP_FACET:
      {
        CompFacet compFacet = (CompFacet)theEObject;
        T result = caseCompFacet(compFacet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseCompFacet(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.INSTALLER:
      {
        Installer installer = (Installer)theEObject;
        T result = caseInstaller(installer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.EXTENDS:
      {
        Extends extends_ = (Extends)theEObject;
        T result = caseExtends(extends_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.CHILDREN:
      {
        Children children = (Children)theEObject;
        T result = caseChildren(children);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.EXPORT:
      {
        Export export = (Export)theEObject;
        T result = caseExport(export);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.EXPORT_VARIABLE:
      {
        exportVariable exportVariable = (exportVariable)theEObject;
        T result = caseexportVariable(exportVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.INITIALISATION:
      {
        Initialisation initialisation = (Initialisation)theEObject;
        T result = caseInitialisation(initialisation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IMPORTS:
      {
        Imports imports = (Imports)theEObject;
        T result = caseImports(imports);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IMPORT_VARIABLE:
      {
        importVariable importVariable = (importVariable)theEObject;
        T result = caseimportVariable(importVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.FACETS:
      {
        Facets facets = (Facets)theEObject;
        T result = caseFacets(facets);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.FACET:
      {
        Facet facet = (Facet)theEObject;
        T result = caseFacet(facet);
        if (result == null) result = caseCompFacet(facet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.LOAD:
      {
        Load load = (Load)theEObject;
        T result = caseLoad(load);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IP_ADRESS:
      {
        IpAdress ipAdress = (IpAdress)theEObject;
        T result = caseIpAdress(ipAdress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.IP_TABLE:
      {
        IpTable ipTable = (IpTable)theEObject;
        T result = caseIpTable(ipTable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RdslPackage.ATTRIBUT:
      {
        Attribut attribut = (Attribut)theEObject;
        T result = caseAttribut(attribut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGraph(Graph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURL(URL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Impot Uri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Impot Uri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImpotUri(ImpotUri object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comp Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comp Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompFacet(CompFacet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Installer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Installer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstaller(Installer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtends(Extends object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Children</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Children</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildren(Children object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Export</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Export</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExport(Export object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>export Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>export Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexportVariable(exportVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Initialisation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Initialisation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitialisation(Initialisation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Imports</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Imports</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImports(Imports object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>import Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>import Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseimportVariable(importVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facets</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facets</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacets(Facets object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Facet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFacet(Facet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Load</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoad(Load object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ip Adress</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ip Adress</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpAdress(IpAdress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ip Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ip Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpTable(IpTable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribut(Attribut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RdslSwitch
