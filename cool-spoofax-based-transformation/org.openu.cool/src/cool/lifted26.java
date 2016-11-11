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
  TermReference g_32;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail185:
    { 
      IStrategoTerm j_32 = null;
      IStrategoTerm k_32 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      IStrategoTerm arg51 = term.getSubterm(0);
      if(arg51.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg51).getConstructor())
        break Fail185;
      j_32 = arg51.getSubterm(0);
      k_32 = term.getSubterm(1);
      if(g_32.value == null)
        break Fail185;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{cool.constCons25, cool.constBoolean0, g_32.value, cool.constNone0, termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{j_32, k_32})});
      if(true)
        return term;
    }
    return null;
  }
}