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
  TermReference h_33;

  TermReference g_33;

  TermReference f_33;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail182:
    { 
      IStrategoTerm i_33 = null;
      IStrategoTerm l_33 = null;
      IStrategoTerm m_33 = null;
      i_33 = term;
      m_33 = term;
      if(h_33.value == null)
        break Fail182;
      term = termFactory.makeTuple(cool.constCons25, h_33.value);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail182;
      l_33 = term;
      term = m_33;
      if(g_33.value == null || f_33.value == null)
        break Fail182;
      term = termFactory.makeAppl(transform._consIntertypeFieldDec_5, new IStrategoTerm[]{l_33, g_33.value, f_33.value, cool.constNone0, i_33});
      if(true)
        return term;
    }
    return null;
  }
}