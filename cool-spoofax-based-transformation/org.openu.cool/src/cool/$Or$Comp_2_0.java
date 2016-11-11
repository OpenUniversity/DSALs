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

@SuppressWarnings("all") public class $Or$Comp_2_0 extends Strategy 
{ 
  public static $Or$Comp_2_0 instance = new $Or$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_35, Strategy e_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail179:
    { 
      IStrategoTerm s_160 = null;
      IStrategoTerm q_160 = null;
      IStrategoTerm r_160 = null;
      IStrategoTerm t_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail179;
      q_160 = term.getSubterm(0);
      r_160 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      s_160 = annos2;
      term = d_35.invoke(context, q_160);
      if(term == null)
        break Fail179;
      t_160 = term;
      term = e_35.invoke(context, r_160);
      if(term == null)
        break Fail179;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{t_160, term}), checkListAnnos(termFactory, s_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}