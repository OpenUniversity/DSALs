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

@SuppressWarnings("all") final class lifted17 extends Strategy 
{ 
  TermReference l_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail193:
    { 
      IStrategoTerm w_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail193;
      w_24 = term.getSubterm(0);
      if(l_24.value == null)
        break Fail193;
      term = hashtable_put_0_2.instance.invoke(context, l_24.value, w_24, w_24);
      if(term == null)
        break Fail193;
      if(true)
        return term;
    }
    return null;
  }
}