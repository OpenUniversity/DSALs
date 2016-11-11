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

@SuppressWarnings("all") public class pp_aspectj_string_0_0 extends Strategy 
{ 
  public static pp_aspectj_string_0_0 instance = new pp_aspectj_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pp_aspectj_string_0_0");
    Fail111:
    { 
      IStrategoTerm b_17 = null;
      term = pp_aspectj_box_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail111;
      b_17 = term;
      term = box2text_string_0_1.instance.invoke(context, b_17, cool.const68);
      if(term == null)
        break Fail111;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}