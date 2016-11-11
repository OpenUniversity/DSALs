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
  TermReference r_26;

  TermReference s_26;

  TermReference t_26;

  TermReference u_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail201:
    { 
      term = fill$Method$Maps_0_4.instance.invoke(context, term, r_26.value, s_26.value, t_26.value, u_26.value);
      if(term == null)
        break Fail201;
      if(true)
        return term;
    }
    return null;
  }
}