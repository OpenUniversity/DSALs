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
  TermReference c_26;

  TermReference e_26;

  TermReference d_26;

  TermReference f_26;

  TermReference l_26;

  TermReference m_26;

  TermReference u_26;

  TermReference h_26;

  TermReference i_26;

  TermReference p_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail186:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_26.value, e_26.value, d_26.value, f_26.value, l_26.value, m_26.value, u_26.value, h_26.value, i_26.value, p_26.value});
      if(term == null)
        break Fail186;
      if(true)
        return term;
    }
    return null;
  }
}