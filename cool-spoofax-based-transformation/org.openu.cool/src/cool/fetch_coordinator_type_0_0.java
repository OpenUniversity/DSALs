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

@SuppressWarnings("all") public class fetch_coordinator_type_0_0 extends Strategy 
{ 
  public static fetch_coordinator_type_0_0 instance = new fetch_coordinator_type_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail140:
    { 
      IStrategoTerm m_25 = null;
      IStrategoTerm n_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      m_25 = term.getSubterm(0);
      term = m_25;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail140;
      n_25 = term.getSubterm(0);
      term = n_25;
      if(true)
        return term;
    }
    context.push("fetch_coordinator_type_0_0");
    context.popOnFailure();
    return null;
  }
}