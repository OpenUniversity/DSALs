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

@SuppressWarnings("all") final class lifted12 extends Strategy 
{ 
  TermReference q_27;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail199:
    { 
      IStrategoTerm e_28 = null;
      IStrategoTerm h_29 = null;
      e_28 = term;
      if(q_27.value == null)
        break Fail199;
      h_29 = q_27.value;
      term = strip_annos_0_0.instance.invoke(context, e_28);
      if(term == null)
        break Fail199;
      term = hashtable_put_0_2.instance.invoke(context, h_29, term, e_28);
      if(term == null)
        break Fail199;
      if(true)
        return term;
    }
    return null;
  }
}