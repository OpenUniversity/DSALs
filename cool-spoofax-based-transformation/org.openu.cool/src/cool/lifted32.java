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

@SuppressWarnings("all") final class lifted32 extends Strategy 
{ 
  TermReference l_35;

  TermReference k_35;

  TermReference j_35;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail180:
    { 
      IStrategoTerm m_35 = null;
      IStrategoTerm p_35 = null;
      IStrategoTerm q_35 = null;
      m_35 = term;
      q_35 = term;
      if(l_35.value == null)
        break Fail180;
      term = termFactory.makeTuple(cool.constCons26, l_35.value);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail180;
      p_35 = term;
      term = q_35;
      if(k_35.value == null || j_35.value == null)
        break Fail180;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{p_35, k_35.value, j_35.value, cool.constNone0, m_35});
      if(true)
        return term;
    }
    return null;
  }
}