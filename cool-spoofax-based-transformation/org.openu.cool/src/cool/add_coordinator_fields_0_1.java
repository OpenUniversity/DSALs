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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_36)
  { 
    TermReference a_36 = new TermReference(ref_a_36);
    context.push("add_coordinator_fields_0_1");
    Fail174:
    { 
      IStrategoTerm d_36 = null;
      IStrategoTerm e_36 = null;
      IStrategoTerm i_36 = null;
      d_36 = term;
      i_36 = term;
      IStrategoTerm term131 = term;
      Success128:
      { 
        Fail175:
        { 
          term = retain_all_1_0.instance.invoke(context, d_36, lifted27.instance);
          if(term == null)
            break Fail175;
          term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
          if(term == null)
            break Fail175;
          e_36 = term;
          if(true)
            break Success128;
        }
        term = term131;
        IStrategoTerm k_36 = null;
        k_36 = term;
        term = report_with_failure_0_1.instance.invoke(context, k_36, cool.const126);
        if(term == null)
          break Fail174;
      }
      term = i_36;
      if(e_36 == null)
        break Fail174;
      term = e_36;
      lifted29 lifted290 = new lifted29();
      lifted290.a_36 = a_36;
      term = map_1_0.instance.invoke(context, term, lifted290);
      if(term == null)
        break Fail174;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}