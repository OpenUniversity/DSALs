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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_34)
  { 
    TermReference u_34 = new TermReference(ref_u_34);
    context.push("add_coordinator_fields_0_1");
    Fail167:
    { 
      IStrategoTerm x_34 = null;
      IStrategoTerm y_34 = null;
      IStrategoTerm c_35 = null;
      x_34 = term;
      c_35 = term;
      IStrategoTerm term131 = term;
      Success128:
      { 
        Fail168:
        { 
          term = retain_all_1_0.instance.invoke(context, x_34, lifted27.instance);
          if(term == null)
            break Fail168;
          term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
          if(term == null)
            break Fail168;
          y_34 = term;
          if(true)
            break Success128;
        }
        term = term131;
        IStrategoTerm e_35 = null;
        e_35 = term;
        term = report_with_failure_0_1.instance.invoke(context, e_35, cool.const118);
        if(term == null)
          break Fail167;
      }
      term = c_35;
      if(y_34 == null)
        break Fail167;
      term = y_34;
      lifted29 lifted290 = new lifted29();
      lifted290.u_34 = u_34;
      term = map_1_0.instance.invoke(context, term, lifted290);
      if(term == null)
        break Fail167;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}