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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_coordinator_declaration_0_1");
    Fail141:
    { 
      IStrategoTerm s_25 = null;
      IStrategoTerm t_25 = null;
      IStrategoTerm u_25 = null;
      IStrategoTerm v_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      t_25 = term.getSubterm(1);
      v_25 = term;
      IStrategoTerm term112 = term;
      Success109:
      { 
        Fail142:
        { 
          term = gen_coordinator_head_0_1.instance.invoke(context, term, q_25);
          if(term == null)
            break Fail142;
          s_25 = term;
          term = gen_coordinator_body_0_1.instance.invoke(context, t_25, q_25);
          if(term == null)
            break Fail142;
          u_25 = term;
          if(true)
            break Success109;
        }
        term = term112;
        IStrategoTerm z_25 = null;
        z_25 = term;
        term = report_with_failure_0_1.instance.invoke(context, z_25, cool.const97);
        if(term == null)
          break Fail141;
      }
      term = v_25;
      if(s_25 == null || u_25 == null)
        break Fail141;
      term = termFactory.makeAppl(transform._consAspectDec_2, new IStrategoTerm[]{s_25, u_25});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}