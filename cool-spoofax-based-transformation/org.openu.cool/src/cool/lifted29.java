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
  TermReference q_32;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail184:
    { 
      IStrategoTerm v_32 = null;
      IStrategoTerm w_32 = null;
      IStrategoTerm x_32 = null;
      IStrategoTerm b_33 = null;
      IStrategoTerm d_33 = null;
      IStrategoTerm e_33 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail184;
      v_32 = term.getSubterm(0);
      w_32 = term.getSubterm(1);
      x_32 = term.getSubterm(2);
      term = x_32;
      d_33 = x_32;
      if(q_32.value == null)
        break Fail184;
      term = topdown_1_0.instance.invoke(context, q_32.value, strip_annos_0_0.instance);
      if(term == null)
        break Fail184;
      b_33 = term;
      e_33 = d_33;
      term = topdown_1_0.instance.invoke(context, w_32, strip_annos_0_0.instance);
      if(term == null)
        break Fail184;
      term = add_coordinator_fields2_0_3.instance.invoke(context, e_33, b_33, term, v_32);
      if(term == null)
        break Fail184;
      if(true)
        return term;
    }
    return null;
  }
}