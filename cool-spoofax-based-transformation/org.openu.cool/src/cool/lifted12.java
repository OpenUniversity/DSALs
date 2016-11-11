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
  TermReference e_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail198:
    { 
      IStrategoTerm s_24 = null;
      IStrategoTerm v_25 = null;
      s_24 = term;
      if(e_24.value == null)
        break Fail198;
      v_25 = e_24.value;
      term = strip_annos_0_0.instance.invoke(context, s_24);
      if(term == null)
        break Fail198;
      term = hashtable_put_0_2.instance.invoke(context, v_25, term, s_24);
      if(term == null)
        break Fail198;
      if(true)
        return term;
    }
    return null;
  }
}