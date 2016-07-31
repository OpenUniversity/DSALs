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
  TermReference k_27;

  TermReference m_27;

  TermReference l_27;

  TermReference n_27;

  TermReference t_27;

  TermReference u_27;

  TermReference c_28;

  TermReference p_27;

  TermReference q_27;

  TermReference x_27;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail189:
    { 
      term = make_lock_and_unlock_methods_0_10.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{k_27.value, m_27.value, l_27.value, n_27.value, t_27.value, u_27.value, c_28.value, p_27.value, q_27.value, x_27.value});
      if(term == null)
        break Fail189;
      if(true)
        return term;
    }
    return null;
  }
}