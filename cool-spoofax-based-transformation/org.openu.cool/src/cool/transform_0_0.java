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

@SuppressWarnings("all") public class transform_0_0 extends Strategy 
{ 
  public static transform_0_0 instance = new transform_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("transform_0_0");
    Fail118:
    { 
      IStrategoTerm w_17 = null;
      IStrategoTerm z_17 = null;
      IStrategoTerm a_18 = null;
      w_17 = term;
      z_17 = w_17;
      a_18 = cool.constCoolTbl;
      term = parse_file_0_1.instance.invoke(context, z_17, a_18);
      if(term == null)
        break Fail118;
      term = topdown_1_0.instance.invoke(context, term, lifted4.instance);
      if(term == null)
        break Fail118;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail118;
      term = pp_aspectj_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail118;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}