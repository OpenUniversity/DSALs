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

@SuppressWarnings("all") final class lifted26 extends Strategy 
{ 
  TermReference q_35;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail186:
    { 
      IStrategoTerm t_35 = null;
      IStrategoTerm u_35 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail186;
      IStrategoTerm arg69 = term.getSubterm(0);
      if(arg69.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg69).getConstructor())
        break Fail186;
      t_35 = arg69.getSubterm(0);
      u_35 = term.getSubterm(1);
      if(q_35.value == null)
        break Fail186;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{cool.constCons24, cool.constBoolean0, q_35.value, cool.constNone0, termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{t_35, u_35})});
      if(true)
        return term;
    }
    return null;
  }
}