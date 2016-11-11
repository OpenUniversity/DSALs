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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_34)
  { 
    TermReference k_34 = new TermReference(ref_k_34);
    context.push("add_condition_fields_0_1");
    Fail165:
    { 
      IStrategoTerm l_34 = null;
      IStrategoTerm m_34 = null;
      IStrategoTerm p_34 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail165;
      l_34 = term.getSubterm(0);
      p_34 = term;
      IStrategoTerm term130 = term;
      Success127:
      { 
        Fail166:
        { 
          term = l_34;
          lifted26 lifted260 = new lifted26();
          lifted260.k_34 = k_34;
          term = map_1_0.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail166;
          m_34 = term;
          if(true)
            break Success127;
        }
        term = term130;
        IStrategoTerm r_34 = null;
        r_34 = term;
        term = report_with_failure_0_1.instance.invoke(context, r_34, cool.const117);
        if(term == null)
          break Fail165;
      }
      term = p_34;
      if(m_34 == null)
        break Fail165;
      term = m_34;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}