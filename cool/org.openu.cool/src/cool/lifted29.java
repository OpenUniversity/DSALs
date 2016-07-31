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

@SuppressWarnings("all") final class lifted29 extends Strategy 
{ 
  TermReference a_36;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail185:
    { 
      IStrategoTerm f_36 = null;
      IStrategoTerm g_36 = null;
      IStrategoTerm h_36 = null;
      IStrategoTerm l_36 = null;
      IStrategoTerm n_36 = null;
      IStrategoTerm o_36 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail185;
      f_36 = term.getSubterm(0);
      g_36 = term.getSubterm(1);
      h_36 = term.getSubterm(2);
      term = h_36;
      n_36 = h_36;
      if(a_36.value == null)
        break Fail185;
      term = topdown_1_0.instance.invoke(context, a_36.value, strip_annos_0_0.instance);
      if(term == null)
        break Fail185;
      l_36 = term;
      o_36 = n_36;
      term = topdown_1_0.instance.invoke(context, g_36, strip_annos_0_0.instance);
      if(term == null)
        break Fail185;
      term = add_coordinator_fields2_0_3.instance.invoke(context, o_36, l_36, term, f_36);
      if(term == null)
        break Fail185;
      if(true)
        return term;
    }
    return null;
  }
}