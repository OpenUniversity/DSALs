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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_37, Strategy k_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("AndComp_2_0");
    Fail178:
    { 
      IStrategoTerm b_163 = null;
      IStrategoTerm z_162 = null;
      IStrategoTerm a_163 = null;
      IStrategoTerm c_163 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAndComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail178;
      z_162 = term.getSubterm(0);
      a_163 = term.getSubterm(1);
      IStrategoList annos3 = term.getAnnotations();
      b_163 = annos3;
      term = j_37.invoke(context, z_162);
      if(term == null)
        break Fail178;
      c_163 = term;
      term = k_37.invoke(context, a_163);
      if(term == null)
        break Fail178;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consAndComp_2, new IStrategoTerm[]{c_163, term}), checkListAnnos(termFactory, b_163));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}