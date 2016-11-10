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

@SuppressWarnings("all") final class lifted22 extends Strategy 
{ 
  TermReference k_27;

  TermReference a_28;

  TermReference m_27;

  TermReference c_28;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail190:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, k_27.value, a_28.value, m_27.value, c_28.value);
      if(term == null)
        break Fail190;
      if(true)
        return term;
    }
    return null;
  }
}