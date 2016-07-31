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
  TermReference c_28;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail196:
    { 
      IStrategoTerm h_28 = null;
      IStrategoTerm j_29 = null;
      h_28 = term;
      if(c_28.value == null)
        break Fail196;
      term = c_28.value;
      j_29 = c_28.value;
      if(c_28.value == null)
        break Fail196;
      term = hashtable_keys_0_0.instance.invoke(context, c_28.value);
      if(term == null)
        break Fail196;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail196;
      term = hashtable_put_0_2.instance.invoke(context, j_29, h_28, term);
      if(term == null)
        break Fail196;
      if(true)
        return term;
    }
    return null;
  }
}