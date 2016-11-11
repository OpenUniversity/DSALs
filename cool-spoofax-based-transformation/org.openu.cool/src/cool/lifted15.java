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
  TermReference u_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail193:
    { 
      IStrategoTerm z_26 = null;
      IStrategoTerm b_28 = null;
      z_26 = term;
      if(u_26.value == null)
        break Fail193;
      term = u_26.value;
      b_28 = u_26.value;
      if(u_26.value == null)
        break Fail193;
      term = hashtable_keys_0_0.instance.invoke(context, u_26.value);
      if(term == null)
        break Fail193;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail193;
      term = hashtable_put_0_2.instance.invoke(context, b_28, z_26, term);
      if(term == null)
        break Fail193;
      if(true)
        return term;
    }
    return null;
  }
}