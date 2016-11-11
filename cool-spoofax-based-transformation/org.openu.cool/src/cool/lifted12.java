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
  TermReference i_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail196:
    { 
      IStrategoTerm w_26 = null;
      IStrategoTerm z_27 = null;
      w_26 = term;
      if(i_26.value == null)
        break Fail196;
      z_27 = i_26.value;
      term = strip_annos_0_0.instance.invoke(context, w_26);
      if(term == null)
        break Fail196;
      term = hashtable_put_0_2.instance.invoke(context, z_27, term, w_26);
      if(term == null)
        break Fail196;
      if(true)
        return term;
    }
    return null;
  }
}