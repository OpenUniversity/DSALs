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
  TermReference d_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail199:
    { 
      IStrategoTerm r_24 = null;
      IStrategoTerm t_25 = null;
      r_24 = term;
      if(d_24.value == null)
        break Fail199;
      t_25 = d_24.value;
      term = strip_annos_0_0.instance.invoke(context, r_24);
      if(term == null)
        break Fail199;
      term = hashtable_put_0_2.instance.invoke(context, t_25, term, r_24);
      if(term == null)
        break Fail199;
      if(true)
        return term;
    }
    return null;
  }
}