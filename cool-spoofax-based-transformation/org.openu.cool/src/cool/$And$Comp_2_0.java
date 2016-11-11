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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_35, Strategy g_35)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail180:
    { 
      IStrategoTerm x_160 = null;
      IStrategoTerm v_160 = null;
      IStrategoTerm w_160 = null;
      IStrategoTerm y_160 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail180;
      v_160 = term.getSubterm(0);
      w_160 = term.getSubterm(1);
      IStrategoList annos3 = term.getAnnotations();
      x_160 = annos3;
      term = f_35.invoke(context, v_160);
      if(term == null)
        break Fail180;
      y_160 = term;
      term = g_35.invoke(context, w_160);
      if(term == null)
        break Fail180;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{y_160, term}), checkListAnnos(termFactory, x_160));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}