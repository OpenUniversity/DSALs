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

@SuppressWarnings("all") final class lifted20 extends Strategy 
{ 
  TermReference k_27;

  TermReference z_27;

  TermReference l_27;

  TermReference c_28;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail192:
    { 
      term = make_requires_method_0_4.instance.invoke(context, term, k_27.value, z_27.value, l_27.value, c_28.value);
      if(term == null)
        break Fail192;
      if(true)
        return term;
    }
    return null;
  }
}