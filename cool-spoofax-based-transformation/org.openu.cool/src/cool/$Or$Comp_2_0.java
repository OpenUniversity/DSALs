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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_37, Strategy i_37)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OrComp_2_0");
    Fail177:
    { 
      IStrategoTerm w_162 = null;
      IStrategoTerm u_162 = null;
      IStrategoTerm v_162 = null;
      IStrategoTerm x_162 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consOrComp_2 != ((IStrategoAppl)term).getConstructor())
        break Fail177;
      u_162 = term.getSubterm(0);
      v_162 = term.getSubterm(1);
      IStrategoList annos2 = term.getAnnotations();
      w_162 = annos2;
      term = h_37.invoke(context, u_162);
      if(term == null)
        break Fail177;
      x_162 = term;
      term = i_37.invoke(context, v_162);
      if(term == null)
        break Fail177;
      term = termFactory.annotateTerm(termFactory.makeAppl(transform._consOrComp_2, new IStrategoTerm[]{x_162, term}), checkListAnnos(termFactory, w_162));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}