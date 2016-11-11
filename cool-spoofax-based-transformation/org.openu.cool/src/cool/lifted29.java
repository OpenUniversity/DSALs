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
  TermReference u_34;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail182:
    { 
      IStrategoTerm z_34 = null;
      IStrategoTerm a_35 = null;
      IStrategoTerm b_35 = null;
      IStrategoTerm f_35 = null;
      IStrategoTerm h_35 = null;
      IStrategoTerm i_35 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
        break Fail182;
      z_34 = term.getSubterm(0);
      a_35 = term.getSubterm(1);
      b_35 = term.getSubterm(2);
      term = b_35;
      h_35 = b_35;
      if(u_34.value == null)
        break Fail182;
      term = topdown_1_0.instance.invoke(context, u_34.value, strip_annos_0_0.instance);
      if(term == null)
        break Fail182;
      f_35 = term;
      i_35 = h_35;
      term = topdown_1_0.instance.invoke(context, a_35, strip_annos_0_0.instance);
      if(term == null)
        break Fail182;
      term = add_coordinator_fields2_0_3.instance.invoke(context, i_35, f_35, term, z_34);
      if(term == null)
        break Fail182;
      if(true)
        return term;
    }
    return null;
  }
}