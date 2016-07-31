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
  TermReference x_27;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail194:
    { 
      IStrategoTerm i_28 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail194;
      i_28 = term.getSubterm(0);
      if(x_27.value == null)
        break Fail194;
      term = hashtable_put_0_2.instance.invoke(context, x_27.value, i_28, i_28);
      if(term == null)
        break Fail194;
      if(true)
        return term;
    }
    return null;
  }
}