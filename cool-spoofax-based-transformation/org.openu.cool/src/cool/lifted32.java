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

@SuppressWarnings("all") final class lifted32 extends Strategy 
{ 
  TermReference r_36;

  TermReference q_36;

  TermReference p_36;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail183:
    { 
      IStrategoTerm s_36 = null;
      s_36 = term;
      if(r_36.value == null || (q_36.value == null || p_36.value == null))
        break Fail183;
      IStrategoList list9;
      list9 = checkListTail(r_36.value);
      if(list9 == null)
        break Fail183;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(cool.constPrivate0, list9), q_36.value, p_36.value, cool.constNone0, s_36});
      if(true)
        return term;
    }
    return null;
  }
}