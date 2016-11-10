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

@SuppressWarnings("all") final class lifted21 extends Strategy 
{ 
  TermReference k_27;

  TermReference b_28;

  TermReference n_27;

  TermReference c_28;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail191:
    { 
      term = make_on_entry_method_0_4.instance.invoke(context, term, k_27.value, b_28.value, n_27.value, c_28.value);
      if(term == null)
        break Fail191;
      if(true)
        return term;
    }
    return null;
  }
}