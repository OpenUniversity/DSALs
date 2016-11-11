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

@SuppressWarnings("all") public class add_coordinator_fields_0_1 extends Strategy 
{ 
  public static add_coordinator_fields_0_1 instance = new add_coordinator_fields_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_32)
  { 
    TermReference q_32 = new TermReference(ref_q_32);
    context.push("add_coordinator_fields_0_1");
    Fail168:
    { 
      IStrategoTerm t_32 = null;
      IStrategoTerm u_32 = null;
      IStrategoTerm y_32 = null;
      t_32 = term;
      y_32 = term;
      IStrategoTerm term131 = term;
      Success128:
      { 
        Fail169:
        { 
          term = retain_all_1_0.instance.invoke(context, t_32, lifted27.instance);
          if(term == null)
            break Fail169;
          term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
          if(term == null)
            break Fail169;
          u_32 = term;
          if(true)
            break Success128;
        }
        term = term131;
        IStrategoTerm a_33 = null;
        a_33 = term;
        term = report_with_failure_0_1.instance.invoke(context, a_33, cool.const116);
        if(term == null)
          break Fail168;
      }
      term = y_32;
      if(u_32 == null)
        break Fail168;
      term = u_32;
      lifted29 lifted290 = new lifted29();
      lifted290.q_32 = q_32;
      term = map_1_0.instance.invoke(context, term, lifted290);
      if(term == null)
        break Fail168;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}