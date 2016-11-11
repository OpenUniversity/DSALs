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
  TermReference k_34;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail183:
    { 
      IStrategoTerm n_34 = null;
      IStrategoTerm o_34 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail183;
      IStrategoTerm arg51 = term.getSubterm(0);
      if(arg51.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg51).getConstructor())
        break Fail183;
      n_34 = arg51.getSubterm(0);
      o_34 = term.getSubterm(1);
      if(k_34.value == null)
        break Fail183;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{cool.constCons26, cool.constBoolean0, k_34.value, cool.constNone0, termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{n_34, o_34})});
      if(true)
        return term;
    }
    return null;
  }
}