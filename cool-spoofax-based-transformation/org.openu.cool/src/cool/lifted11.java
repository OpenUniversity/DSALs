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

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  TermReference p_27;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail200:
    { 
      IStrategoTerm d_28 = null;
      IStrategoTerm f_29 = null;
      d_28 = term;
      if(p_27.value == null)
        break Fail200;
      f_29 = p_27.value;
      term = strip_annos_0_0.instance.invoke(context, d_28);
      if(term == null)
        break Fail200;
      term = hashtable_put_0_2.instance.invoke(context, f_29, term, d_28);
      if(term == null)
        break Fail200;
      if(true)
        return term;
    }
    return null;
  }
}