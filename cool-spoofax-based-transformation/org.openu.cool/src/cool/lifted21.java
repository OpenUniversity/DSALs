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

@SuppressWarnings("all") final class lifted21 extends Strategy 
{ 
  TermReference y_23;

  TermReference p_24;

  TermReference b_24;

  TermReference q_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail190:
    { 
      term = make_on_entry_method_0_4.instance.invoke(context, term, y_23.value, p_24.value, b_24.value, q_24.value);
      if(term == null)
        break Fail190;
      if(true)
        return term;
    }
    return null;
  }
}