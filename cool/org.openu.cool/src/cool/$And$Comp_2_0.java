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

@SuppressWarnings("all") public class $And$Comp_2_0 extends Strategy 
{ 
  public static $And$Comp_2_0 instance = new $And$Comp_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_38, Strategy c_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail181:
    { 
      IStrategoTerm t_163 = null;
      IStrategoTerm r_163 = null;
      IStrategoTerm s_163 = null;
      IStrategoTerm u_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail181;
      r_163 = term.getSubterm(0);
      s_163 = term.getSubterm(1);
      IStrategoList annos3 = term.getAnnotations();
      t_163 = annos3;
      term = b_38.invoke(context, r_163);
      if(term == null)
        break Fail181;
      u_163 = term;
      term = c_38.invoke(context, s_163);
      if(term == null)
        break Fail181;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{u_163, term}), checkListAnnos(termFactory, t_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}