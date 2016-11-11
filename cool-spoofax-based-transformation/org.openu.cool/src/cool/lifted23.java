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

@SuppressWarnings("all") final class lifted23 extends Strategy 
{ 
  TermReference y_23;

  TermReference a_24;

  TermReference z_23;

  TermReference b_24;

  TermReference h_24;

  TermReference i_24;

  TermReference q_24;

  TermReference d_24;

  TermReference e_24;

  TermReference l_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail188:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{y_23.value, a_24.value, z_23.value, b_24.value, h_24.value, i_24.value, q_24.value, d_24.value, e_24.value, l_24.value});
      if(term == null)
        break Fail188;
      if(true)
        return term;
    }
    return null;
  }
}