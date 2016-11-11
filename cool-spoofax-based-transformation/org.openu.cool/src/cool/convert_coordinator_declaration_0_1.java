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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail142:
    { 
      IStrategoTerm o_23 = null;
      IStrategoTerm p_23 = null;
      IStrategoTerm q_23 = null;
      IStrategoTerm r_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      p_23 = term.getSubterm(1);
      r_23 = term;
      IStrategoTerm term112 = term;
      Success109:
      { 
        Fail143:
        { 
          term = gen_coordinator_head_0_1.instance.invoke(context, term, m_23);
          if(term == null)
            break Fail143;
          o_23 = term;
          term = gen_coordinator_body_0_1.instance.invoke(context, p_23, m_23);
          if(term == null)
            break Fail143;
          q_23 = term;
          if(true)
            break Success109;
        }
        term = term112;
        IStrategoTerm v_23 = null;
        v_23 = term;
        term = report_with_failure_0_1.instance.invoke(context, v_23, cool.const95);
        if(term == null)
          break Fail142;
      }
      term = r_23;
      if(o_23 == null || q_23 == null)
        break Fail142;
      term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{o_23, q_23});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}