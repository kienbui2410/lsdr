/**
 * generated by Xtext
 */
package org.xtext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.rdsl.Instance;
import org.xtext.rdsl.IpTable;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class RdslGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Instance> _filter = Iterables.<Instance>filter(_iterable, Instance.class);
    for (final Instance instance : _filter) {
      String _hostname = instance.getHostname();
      boolean _notEquals = (!Objects.equal(_hostname, null));
      if (_notEquals) {
        String _hostname_1 = instance.getHostname();
        String _plus = (_hostname_1 + ".cfg");
        CharSequence _compile = this.compile(instance);
        fsa.generateFile(_plus, _compile);
        String _hostname_2 = instance.getHostname();
        String _plus_1 = (_hostname_2 + "_rules.html");
        CharSequence _compileIp = this.compileIp(instance);
        fsa.generateFile(_plus_1, _compileIp);
      }
    }
  }
  
  public CharSequence compile(final Instance instance) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("  ");
    _builder.append("define host {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("use                             linux-server");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("host_name                       ");
    String _hostname = instance.getHostname();
    _builder.append(_hostname, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("alias                           ");
    String _name = instance.getName();
    _builder.append(_name, "        ");
    _builder.append(" ");
    EList<String> _fullname = instance.getFullname();
    String _join = IterableExtensions.join(_fullname, " ");
    _builder.append(_join, "        ");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("address                         ");
    {
      boolean _and = false;
      EList<Integer> _ip4 = instance.getIp4();
      boolean _notEquals = (!Objects.equal(_ip4, null));
      if (!_notEquals) {
        _and = false;
      } else {
        EList<Integer> _ip4_1 = instance.getIp4();
        int _size = _ip4_1.size();
        boolean _greaterThan = (_size > 0);
        _and = _greaterThan;
      }
      if (_and) {
        EList<Integer> _ip4_2 = instance.getIp4();
        String _join_1 = IterableExtensions.join(_ip4_2, ".");
        _builder.append(_join_1, "        ");
        _builder.append(".");
        int _ip4last = instance.getIp4last();
        _builder.append(_ip4last, "        ");
      } else {
        boolean _and_1 = false;
        EList<Integer> _ip6 = instance.getIp6();
        boolean _notEquals_1 = (!Objects.equal(_ip6, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          EList<Integer> _ip4_3 = instance.getIp4();
          int _size_1 = _ip4_3.size();
          boolean _greaterThan_1 = (_size_1 > 0);
          _and_1 = _greaterThan_1;
        }
        if (_and_1) {
          EList<Integer> _ip6_1 = instance.getIp6();
          String _join_2 = IterableExtensions.join(_ip6_1, ".");
          _builder.append(_join_2, "        ");
          _builder.append(".");
          int _ip6last = instance.getIp6last();
          _builder.append(_ip6last, "        ");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("max_check_attempts              5");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("check_period                    24x7");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("notification_interval           30");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("notification_period             24x7");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileIp(final Instance c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("iptables -L");
    _builder.newLine();
    _builder.append("<table border=\"1\" style=\"width:100%\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<td>traffic</td> <td>target</td> <td>prot</td> <td>source</td> <td>destination</td>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</tr>");
    _builder.newLine();
    {
      EList<IpTable> _iptable = c.getIptable();
      for(final IpTable rule : _iptable) {
        _builder.append("  ");
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("<td>");
        String _traffic = rule.getTraffic();
        _builder.append(_traffic, "");
        _builder.append("</td> ");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        String _target = rule.getTarget();
        _builder.append(_target, "");
        _builder.append("</td> ");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        String _protocol = rule.getProtocol();
        _builder.append(_protocol, "");
        _builder.append("</td> ");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        EList<Integer> _source = rule.getSource();
        String _join = IterableExtensions.join(_source, ".");
        _builder.append(_join, "");
        _builder.append(".");
        int _sourcefinal = rule.getSourcefinal();
        _builder.append(_sourcefinal, "");
        _builder.append("</td> ");
        _builder.newLineIfNotEmpty();
        _builder.append("<td>");
        EList<Integer> _destination = rule.getDestination();
        String _join_1 = IterableExtensions.join(_destination, ".");
        _builder.append(_join_1, "");
        _builder.append(".");
        int _destinationfinal = rule.getDestinationfinal();
        _builder.append(_destinationfinal, "");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("</table>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
