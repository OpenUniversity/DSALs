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
  TermReference h_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail197:
    { 
      IStrategoTerm v_26 = null;
      IStrategoTerm x_27 = null;
      v_26 = term;
      if(h_26.value == null)
        break Fail197;
      x_27 = h_26.value;
      term = strip_annos_0_0.instance.invoke(context, v_26);
      if(term == null)
        break Fail197;
      term = hashtable_put_0_2.instance.invoke(context, x_27, term, v_26);
      if(term == null)
        break Fail197;
      if(true)
        return term;
    }
    return null;
  }
}