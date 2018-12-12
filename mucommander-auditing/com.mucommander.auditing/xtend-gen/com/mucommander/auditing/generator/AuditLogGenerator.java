package com.mucommander.auditing.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.mucommander.auditing.auditLog.Case;
import com.mucommander.auditing.auditLog.Command;
import com.mucommander.auditing.auditLog.State;
import com.mucommander.job.AuditLogMessage;
import java.io.File;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AuditLogGenerator extends AbstractGenerator {
  private Resource resource;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String _replaceAll = "com.mucommander.job.".replaceAll("\\.", File.separator);
    String path = (_replaceAll + "Logs.aj");
    fsa.generateFile(path, this.compile(resource));
  }
  
  public CharSequence compile(final Resource resource) {
    CharSequence _xblockexpression = null;
    {
      this.resource = resource;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package com.mucommander.job;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("import org.aspectj.lang.annotation.*;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("      ");
      _builder.append("@HideType");
      _builder.newLine();
      _builder.append("public privileged aspect Logs {");
      _builder.newLine();
      {
        Iterable<Command> _iterable = IteratorExtensions.<Command>toIterable(Iterators.<Command>filter(resource.getAllContents(), Command.class));
        for(final Command command : _iterable) {
          _builder.append("  ");
          CharSequence _compile = this.compile(command);
          _builder.append(_compile, "  ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      _builder.append("        ");
      _builder.append("@HideMethod");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("private void audit(String msg, Object... args) {");
      _builder.newLine();
      _builder.append("  \t\t");
      _builder.append("System.out.println(");
      _builder.newLine();
      _builder.append("  \t\t");
      _builder.append("new java.text.SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss \").format(new java.util.Date()) +");
      _builder.newLine();
      _builder.append("  \t\t");
      _builder.append("java.text.MessageFormat.format(msg, args));");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence compile(final Command command) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      final Function1<Case, Boolean> _function = (Case c) -> {
        State _state = c.getState();
        return Boolean.valueOf(Objects.equal(_state, State.START));
      };
      boolean _exists = IterableExtensions.<Case>exists(command.getCases(), _function);
      if (_exists) {
        _builder.append("     ");
        CharSequence _sourcePosition = this.toSourcePosition(NodeModelUtils.getNode(command));
        _builder.append(_sourcePosition, "     ");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("after(");
        String _qualifiedName = command.getType().getQualifiedName();
        _builder.append(_qualifiedName, "     ");
        _builder.append(" job): execution(void start()) && this(job) {");
        _builder.newLineIfNotEmpty();
        {
          final Function1<Case, Boolean> _function_1 = (Case c) -> {
            State _state = c.getState();
            return Boolean.valueOf(Objects.equal(_state, State.START));
          };
          Iterable<Case> _filter = IterableExtensions.<Case>filter(command.getCases(), _function_1);
          for(final Case start : _filter) {
            _builder.append("     ");
            _builder.append("  ");
            CharSequence _compile = this.compile(start);
            _builder.append(_compile, "       ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("     ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      final Function1<Case, Boolean> _function_2 = (Case c) -> {
        return Boolean.valueOf((Objects.equal(c.getState(), State.FINISH) || Objects.equal(c.getState(), State.INTERRUPT)));
      };
      boolean _exists_1 = IterableExtensions.<Case>exists(command.getCases(), _function_2);
      if (_exists_1) {
        _builder.append("     ");
        CharSequence _sourcePosition_1 = this.toSourcePosition(NodeModelUtils.getNode(command));
        _builder.append(_sourcePosition_1, "     ");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("after(");
        String _qualifiedName_1 = command.getType().getQualifiedName();
        _builder.append(_qualifiedName_1, "     ");
        _builder.append(" job): execution(void run()) && this(job) {");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("  ");
        _builder.append("if (job.getState() == FileJobState.INTERRUPTED) {");
        _builder.newLine();
        {
          final Function1<Case, Boolean> _function_3 = (Case c) -> {
            State _state = c.getState();
            return Boolean.valueOf(Objects.equal(_state, State.INTERRUPT));
          };
          Iterable<Case> _filter_1 = IterableExtensions.<Case>filter(command.getCases(), _function_3);
          for(final Case interrupt : _filter_1) {
            _builder.append("     ");
            _builder.append("    ");
            CharSequence _compile_1 = this.compile(interrupt);
            _builder.append(_compile_1, "         ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("     ");
        _builder.append("  ");
        _builder.append("} else {");
        _builder.newLine();
        {
          final Function1<Case, Boolean> _function_4 = (Case c) -> {
            State _state = c.getState();
            return Boolean.valueOf(Objects.equal(_state, State.FINISH));
          };
          Iterable<Case> _filter_2 = IterableExtensions.<Case>filter(command.getCases(), _function_4);
          for(final Case finish : _filter_2) {
            _builder.append("     ");
            _builder.append("    ");
            CharSequence _compile_2 = this.compile(finish);
            _builder.append(_compile_2, "         ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("     ");
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    {
      final Function1<Case, Boolean> _function_5 = (Case c) -> {
        return Boolean.valueOf((Objects.equal(c.getState(), State.PAUSE) || Objects.equal(c.getState(), State.RESUME)));
      };
      boolean _exists_2 = IterableExtensions.<Case>exists(command.getCases(), _function_5);
      if (_exists_2) {
        _builder.append("     ");
        CharSequence _sourcePosition_2 = this.toSourcePosition(NodeModelUtils.getNode(command));
        _builder.append(_sourcePosition_2, "     ");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("after(");
        String _qualifiedName_2 = command.getType().getQualifiedName();
        _builder.append(_qualifiedName_2, "     ");
        _builder.append(" job): execution(void setPaused(boolean)) && this(job) {");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("\t ");
        _builder.append("if (job.getState() == FileJobState.PAUSED) {");
        _builder.newLine();
        {
          final Function1<Case, Boolean> _function_6 = (Case c) -> {
            State _state = c.getState();
            return Boolean.valueOf(Objects.equal(_state, State.PAUSE));
          };
          Iterable<Case> _filter_3 = IterableExtensions.<Case>filter(command.getCases(), _function_6);
          for(final Case pause : _filter_3) {
            _builder.append("     ");
            _builder.append("\t   ");
            CharSequence _compile_3 = this.compile(pause);
            _builder.append(_compile_3, "     \t   ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("     ");
        _builder.append("  ");
        _builder.append("} else {");
        _builder.newLine();
        {
          final Function1<Case, Boolean> _function_7 = (Case c) -> {
            State _state = c.getState();
            return Boolean.valueOf(Objects.equal(_state, State.RESUME));
          };
          Iterable<Case> _filter_4 = IterableExtensions.<Case>filter(command.getCases(), _function_7);
          for(final Case resume : _filter_4) {
            _builder.append("     ");
            _builder.append("    ");
            CharSequence _compile_4 = this.compile(resume);
            _builder.append(_compile_4, "         ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("     ");
        _builder.append("  ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t\t   ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Case acase) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (true");
    {
      EList<JvmField> _fields = acase.getFields();
      for(final JvmField field : _fields) {
        CharSequence _compile = this.compile(field);
        _builder.append(_compile);
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("audit(\"");
    String _string = AuditLogMessage.valueOf(acase.getMsg().getSimpleName()).toString();
    _builder.append(_string, "  ");
    _builder.append("\"");
    {
      EList<JvmField> _vars = acase.getVars();
      for(final JvmField variable : _vars) {
        CharSequence _compileVar = this.compileVar(variable);
        _builder.append(_compileVar, "  ");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final JvmField field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("&& job.");
    String _simpleName = field.getSimpleName();
    _builder.append(_simpleName, " ");
    return _builder;
  }
  
  public CharSequence compileVar(final JvmFeature field) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(", job.");
    String _simpleName = field.getSimpleName();
    _builder.append(_simpleName);
    return _builder;
  }
  
  public CharSequence toSourcePosition(final ICompositeNode node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@BridgedSourceLocation(line=");
    int _startLine = node.getStartLine();
    _builder.append(_startLine);
    _builder.append(", file=\"");
    String _platformString = this.resource.getURI().toPlatformString(true);
    _builder.append(_platformString);
    _builder.append("\", module=\"jobs.audit\")");
    return _builder;
  }
}
