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

@SuppressWarnings("all") final class lifted18 extends Strategy 
{ 
  TermReference n_24;

  TermReference o_24;

  TermReference p_24;

  TermReference q_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail203:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, n_24.value, o_24.value, p_24.value, q_24.value);
      if(term == null)
        break Fail203;
      if(true)
        return term;
    }
    return null;
  }
}