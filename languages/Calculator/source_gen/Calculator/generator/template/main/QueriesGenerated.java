package Calculator.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_308658663626062648(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("i", null);
  }

  public static Object propertyMacro_GetPropertyValue_308658663626058268(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("inputField", null);
  }

  public static Object propertyMacro_GetPropertyValue_308658663626058361(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("outputField", null);
  }

  public static Object propertyMacro_GetPropertyValue_308658663626058205(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_308658663626062031(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_308658663625947513(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_308658663626065774(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "inputField", false), "LocalVariable");
  }

  public static Object referenceMacro_GetReferent_308658663626066868(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InputFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_308658663626066827(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "LocalVariable");
  }

  public static Object referenceMacro_GetReferent_308658663626065504(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "OutputFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_308658663626062051(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InputFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_308658663626062087(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "InputFieldDeclaration");
  }

  public static Object referenceMacro_GetReferent_308658663626062574(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "OutputFieldDeclaration");
  }

  public static SNode sourceNodeQuery_308658663626065670(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static Iterable sourceNodesQuery_308658663626062637(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626066814(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626065491(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "outputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626058261(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626058354(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "outputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626062022(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "inputField", true);
  }

  public static Iterable sourceNodesQuery_308658663626062556(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "outputField", true);
  }
}