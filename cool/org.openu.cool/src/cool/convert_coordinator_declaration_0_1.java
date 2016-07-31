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

@SuppressWarnings("all") public class convert_coordinator_declaration_0_1 extends Strategy 
{ 
  public static convert_coordinator_declaration_0_1 instance = new convert_coordinator_declaration_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_26)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail148:
    { 
      IStrategoTerm a_27 = null;
      IStrategoTerm b_27 = null;
      IStrategoTerm c_27 = null;
      IStrategoTerm d_27 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      b_27 = term.getSubterm(1);
      d_27 = term;
      IStrategoTerm term112 = term;
      Success109:
      { 
        Fail149:
        { 
          term = gen_coordinator_head_0_1.instance.invoke(context, term, y_26);
          if(term == null)
            break Fail149;
          a_27 = term;
          term = gen_coordinator_body_0_1.instance.invoke(context, b_27, y_26);
          if(term == null)
            break Fail149;
          c_27 = term;
          if(true)
            break Success109;
        }
        term = term112;
        IStrategoTerm h_27 = null;
        h_27 = term;
        term = report_with_failure_0_1.instance.invoke(context, h_27, cool.const98);
        if(term == null)
          break Fail148;
      }
      term = d_27;
      if(a_27 == null || c_27 == null)
        break Fail148;
      term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{a_27, c_27});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}