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

@SuppressWarnings("all") public class add_condition_fields_0_1 extends Strategy 
{ 
  public static add_condition_fields_0_1 instance = new add_condition_fields_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_q_35)
  { 
    TermReference q_35 = new TermReference(ref_q_35);
    context.push("add_condition_fields_0_1");
    Fail172:
    { 
      IStrategoTerm r_35 = null;
      IStrategoTerm s_35 = null;
      IStrategoTerm v_35 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail172;
      r_35 = term.getSubterm(0);
      v_35 = term;
      IStrategoTerm term130 = term;
      Success127:
      { 
        Fail173:
        { 
          term = r_35;
          lifted26 lifted260 = new lifted26();
          lifted260.q_35 = q_35;
          term = map_1_0.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail173;
          s_35 = term;
          if(true)
            break Success127;
        }
        term = term130;
        IStrategoTerm x_35 = null;
        x_35 = term;
        term = report_with_failure_0_1.instance.invoke(context, x_35, cool.const125);
        if(term == null)
          break Fail172;
      }
      term = v_35;
      if(s_35 == null)
        break Fail172;
      term = s_35;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}