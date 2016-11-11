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

@SuppressWarnings("all") final class lifted15 extends Strategy 
{ 
  TermReference q_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail195:
    { 
      IStrategoTerm v_24 = null;
      IStrategoTerm x_25 = null;
      v_24 = term;
      if(q_24.value == null)
        break Fail195;
      term = q_24.value;
      x_25 = q_24.value;
      if(q_24.value == null)
        break Fail195;
      term = hashtable_keys_0_0.instance.invoke(context, q_24.value);
      if(term == null)
        break Fail195;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail195;
      term = hashtable_put_0_2.instance.invoke(context, x_25, v_24, term);
      if(term == null)
        break Fail195;
      if(true)
        return term;
    }
    return null;
  }
}