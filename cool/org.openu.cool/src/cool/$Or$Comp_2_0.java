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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_37, Strategy a_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail180:
    { 
      IStrategoTerm o_163 = null;
      IStrategoTerm m_163 = null;
      IStrategoTerm n_163 = null;
      IStrategoTerm p_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      m_163 = term.getSubterm(0);
      n_163 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      o_163 = annos2;
      term = z_37.invoke(context, m_163);
      if(term == null)
        break Fail180;
      p_163 = term;
      term = a_38.invoke(context, n_163);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{p_163, term}), checkListAnnos(termFactory, o_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}