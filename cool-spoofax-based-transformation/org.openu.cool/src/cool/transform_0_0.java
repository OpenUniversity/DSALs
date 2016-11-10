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
    Fail117:
    { 
      IStrategoTerm a_20 = null;
      IStrategoTerm d_20 = null;
      IStrategoTerm e_20 = null;
      a_20 = term;
      d_20 = a_20;
      e_20 = cool.constCoolTbl;
      term = parse_file_0_1.instance.invoke(context, d_20, e_20);
      if(term == null)
        break Fail117;
      term = topdown_1_0.instance.invoke(context, term, lifted4.instance);
      if(term == null)
        break Fail117;
      term = transform_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail117;
      term = pp_aspectj_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail117;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}