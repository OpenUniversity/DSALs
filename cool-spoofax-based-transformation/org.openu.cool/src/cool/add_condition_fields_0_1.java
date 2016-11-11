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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_g_32)
  { 
    TermReference g_32 = new TermReference(ref_g_32);
    context.push("add_condition_fields_0_1");
    Fail166:
    { 
      IStrategoTerm h_32 = null;
      IStrategoTerm i_32 = null;
      IStrategoTerm l_32 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail166;
      h_32 = term.getSubterm(0);
      l_32 = term;
      IStrategoTerm term130 = term;
      Success127:
      { 
        Fail167:
        { 
          term = h_32;
          lifted26 lifted260 = new lifted26();
          lifted260.g_32 = g_32;
          term = map_1_0.instance.invoke(context, term, lifted260);
          if(term == null)
            break Fail167;
          i_32 = term;
          if(true)
            break Success127;
        }
        term = term130;
        IStrategoTerm n_32 = null;
        n_32 = term;
        term = report_with_failure_0_1.instance.invoke(context, n_32, cool.const115);
        if(term == null)
          break Fail166;
      }
      term = l_32;
      if(i_32 == null)
        break Fail166;
      term = i_32;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}