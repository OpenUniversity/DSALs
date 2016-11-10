package cool;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("unused") public class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
{ 
  @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    register(context, compiledContext, context.getVarScope());
  }

  @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
  { 
    registerLazy(context, compiledContext, classLoader, context.getVarScope());
  }

  private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("cool");
    cool.init(compiledContext);
    varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(aspectj_to_box_0_0_fragment_4.instance, context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(aspectj_to_box_0_0_fragment_3.instance, context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(aspectj_to_box_0_0_fragment_2.instance, context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(aspectj_to_box_0_0_fragment_1.instance, context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(aspectj_to_box_0_0_fragment_0.instance, context));
    varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(aspectj_to_box_0_0.instance, context));
    varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(has_leftmost_not_0_0.instance, context));
    varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(option_to_boxes_0_0.instance, context));
    varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(pp_aspectj_string_0_0.instance, context));
    varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(fetch__full__class__name_0_0.instance, context));
    varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
    varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(transform_ast_0_0.instance, context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(gen_source_location_0_0.instance, context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(origin_location_0_0.instance, context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(origin_file_0_0.instance, context));
    varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(gen_is$Run$By$Others_method_0_0.instance, context));
    varScope.addSVar("gen_method_state_0_1", new InteropSDefT(gen_method_state_0_1.instance, context));
    varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(gen_method_state_name_0_1.instance, context));
    varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(gen_requires_method_name_0_1.instance, context));
    varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(gen_on_entry_method_name_0_1.instance, context));
    varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(gen_on_exit_method_name_0_1.instance, context));
    varScope.addSVar("make_while_condition_0_1", new InteropSDefT(make_while_condition_0_1.instance, context));
    varScope.addSVar("gen_coordinator_head_0_1", new InteropSDefT(gen_coordinator_head_0_1.instance, context));
    varScope.addSVar("make_requires_method_0_4", new InteropSDefT(make_requires_method_0_4.instance, context));
    varScope.addSVar("gen_source_location_ann_0_1", new InteropSDefT(gen_source_location_ann_0_1.instance, context));
    varScope.addSVar("get_location_0_0", new InteropSDefT(get_location_0_0.instance, context));
    varScope.addSVar("get_file_0_0", new InteropSDefT(get_file_0_0.instance, context));
    varScope.addSVar("get_start_line_0_0", new InteropSDefT(get_start_line_0_0.instance, context));
    varScope.addSVar("get_end_line_0_0", new InteropSDefT(get_end_line_0_0.instance, context));
    varScope.addSVar("get_column_0_0", new InteropSDefT(get_column_0_0.instance, context));
    varScope.addSVar("get_offset_0_0", new InteropSDefT(get_offset_0_0.instance, context));
    varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(make_on_entry_method_0_4.instance, context));
    varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(make_on_exit_method_0_4.instance, context));
    varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
    varScope.addSVar("generate_imports_0_2", new InteropSDefT(generate_imports_0_2.instance, context));
    varScope.addSVar("get_coordinator_0_1", new InteropSDefT(get_coordinator_0_1.instance, context));
    varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(fetch_coordinator_type_0_0.instance, context));
    varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(convert_coordinator_declaration_0_1.instance, context));
    varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(gen_coordinator_body_0_1.instance, context));
    varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(make_lock_and_unlock_methods_0_10.instance, context));
    varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(make_unlock_method_0_3.instance, context));
    varScope.addSVar("make_lock_method_0_9", new InteropSDefT(make_lock_method_0_9.instance, context));
    varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(fill$Method$Maps_0_4.instance, context));
    varScope.addSVar("add_condition_fields_0_1", new InteropSDefT(add_condition_fields_0_1.instance, context));
    varScope.addSVar("add_coordinator_fields_0_1", new InteropSDefT(add_coordinator_fields_0_1.instance, context));
    varScope.addSVar("add_coordinator_fields2_0_3", new InteropSDefT(add_coordinator_fields2_0_3.instance, context));
    varScope.addSVar("get_methods_list_0_0", new InteropSDefT(get_methods_list_0_0.instance, context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT($Or$Comp_2_0.instance, context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT($And$Comp_2_0.instance, context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT($Not$Comp_1_0.instance, context));
  }

  private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
  { 
    compiledContext.registerComponent("cool");
    cool.init(compiledContext);
    varScope.addSVar("aspectj_to_box_0_0_fragment_4", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0_fragment_4", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_3", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0_fragment_3", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_2", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0_fragment_2", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_1", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0_fragment_1", context));
    varScope.addSVar("aspectj_to_box_0_0_fragment_0", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0_fragment_0", context));
    varScope.addSVar("aspectj_to_box_0_0", new InteropSDefT(classLoader, "cool.aspectj_to_box_0_0", context));
    varScope.addSVar("has_leftmost_not_0_0", new InteropSDefT(classLoader, "cool.has_leftmost_not_0_0", context));
    varScope.addSVar("option_to_boxes_0_0", new InteropSDefT(classLoader, "cool.option_to_boxes_0_0", context));
    varScope.addSVar("pp_aspectj_string_0_0", new InteropSDefT(classLoader, "cool.pp_aspectj_string_0_0", context));
    varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(classLoader, "cool.fetch__full__class__name_0_0", context));
    varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "cool.main_0_0", context));
    varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "cool.handle_io_0_0", context));
    varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "cool.transform_0_0", context));
    varScope.addSVar("transform_ast_0_0", new InteropSDefT(classLoader, "cool.transform_ast_0_0", context));
    varScope.addSVar("gen_source_location_0_0", new InteropSDefT(classLoader, "cool.gen_source_location_0_0", context));
    varScope.addSVar("origin_location_0_0", new InteropSDefT(classLoader, "cool.origin_location_0_0", context));
    varScope.addSVar("origin_file_0_0", new InteropSDefT(classLoader, "cool.origin_file_0_0", context));
    varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(classLoader, "cool.gen_is$Run$By$Others_method_0_0", context));
    varScope.addSVar("gen_method_state_0_1", new InteropSDefT(classLoader, "cool.gen_method_state_0_1", context));
    varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(classLoader, "cool.gen_method_state_name_0_1", context));
    varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_requires_method_name_0_1", context));
    varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_on_entry_method_name_0_1", context));
    varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(classLoader, "cool.gen_on_exit_method_name_0_1", context));
    varScope.addSVar("make_while_condition_0_1", new InteropSDefT(classLoader, "cool.make_while_condition_0_1", context));
    varScope.addSVar("gen_coordinator_head_0_1", new InteropSDefT(classLoader, "cool.gen_coordinator_head_0_1", context));
    varScope.addSVar("make_requires_method_0_4", new InteropSDefT(classLoader, "cool.make_requires_method_0_4", context));
    varScope.addSVar("gen_source_location_ann_0_1", new InteropSDefT(classLoader, "cool.gen_source_location_ann_0_1", context));
    varScope.addSVar("get_location_0_0", new InteropSDefT(classLoader, "cool.get_location_0_0", context));
    varScope.addSVar("get_file_0_0", new InteropSDefT(classLoader, "cool.get_file_0_0", context));
    varScope.addSVar("get_start_line_0_0", new InteropSDefT(classLoader, "cool.get_start_line_0_0", context));
    varScope.addSVar("get_end_line_0_0", new InteropSDefT(classLoader, "cool.get_end_line_0_0", context));
    varScope.addSVar("get_column_0_0", new InteropSDefT(classLoader, "cool.get_column_0_0", context));
    varScope.addSVar("get_offset_0_0", new InteropSDefT(classLoader, "cool.get_offset_0_0", context));
    varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(classLoader, "cool.make_on_entry_method_0_4", context));
    varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(classLoader, "cool.make_on_exit_method_0_4", context));
    varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "cool.convert_0_0", context));
    varScope.addSVar("generate_imports_0_2", new InteropSDefT(classLoader, "cool.generate_imports_0_2", context));
    varScope.addSVar("get_coordinator_0_1", new InteropSDefT(classLoader, "cool.get_coordinator_0_1", context));
    varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(classLoader, "cool.fetch_coordinator_type_0_0", context));
    varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(classLoader, "cool.convert_coordinator_declaration_0_1", context));
    varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(classLoader, "cool.gen_coordinator_body_0_1", context));
    varScope.addSVar("make_lock_and_unlock_methods_0_10", new InteropSDefT(classLoader, "cool.make_lock_and_unlock_methods_0_10", context));
    varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(classLoader, "cool.make_unlock_method_0_3", context));
    varScope.addSVar("make_lock_method_0_9", new InteropSDefT(classLoader, "cool.make_lock_method_0_9", context));
    varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(classLoader, "cool.fill$Method$Maps_0_4", context));
    varScope.addSVar("add_condition_fields_0_1", new InteropSDefT(classLoader, "cool.add_condition_fields_0_1", context));
    varScope.addSVar("add_coordinator_fields_0_1", new InteropSDefT(classLoader, "cool.add_coordinator_fields_0_1", context));
    varScope.addSVar("add_coordinator_fields2_0_3", new InteropSDefT(classLoader, "cool.add_coordinator_fields2_0_3", context));
    varScope.addSVar("get_methods_list_0_0", new InteropSDefT(classLoader, "cool.get_methods_list_0_0", context));
    varScope.addSVar("OrComp_2_0", new InteropSDefT(classLoader, "cool.$Or$Comp_2_0", context));
    varScope.addSVar("AndComp_2_0", new InteropSDefT(classLoader, "cool.$And$Comp_2_0", context));
    varScope.addSVar("NotComp_1_0", new InteropSDefT(classLoader, "cool.$Not$Comp_1_0", context));
  }
}