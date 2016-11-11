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
  TermReference y_23;

  TermReference o_24;

  TermReference a_24;

  TermReference q_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail189:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, y_23.value, o_24.value, a_24.value, q_24.value);
      if(term == null)
        break Fail189;
      if(true)
        return term;
    }
    return null;
  }
}