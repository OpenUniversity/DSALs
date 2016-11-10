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

@SuppressWarnings("all") public class $Not$Comp_1_0 extends Strategy 
{ 
  public static $Not$Comp_1_0 instance = new $Not$Comp_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_38)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("NotComp_1_0");
    Fail182:
    { 
      IStrategoTerm x_163 = null;
      IStrategoTerm w_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consNotComp_1 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      w_163 = term.getSubterm(0);
      IStrategoList annos4 = term.getAnnotations();
      x_163 = annos4;
      term = d_38.invoke(context, w_163);
      if(term == null)
        break Fail182;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consNotComp_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}