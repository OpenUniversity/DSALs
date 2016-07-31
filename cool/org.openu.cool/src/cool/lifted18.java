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

@SuppressWarnings("all") final class lifted18 extends Strategy 
{ 
  TermReference z_27;

  TermReference a_28;

  TermReference b_28;

  TermReference c_28;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail204:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, z_27.value, a_28.value, b_28.value, c_28.value);
      if(term == null)
        break Fail204;
      if(true)
        return term;
    }
    return null;
  }
}