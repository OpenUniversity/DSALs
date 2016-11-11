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
    Fail141:
    { 
      IStrategoTerm i_23 = null;
      IStrategoTerm j_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      i_23 = term.getSubterm(0);
      term = i_23;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      j_23 = term.getSubterm(0);
      term = j_23;
      if(true)
        return term;
    }
    context.push("fetch_coordinator_type_0_0");
    context.popOnFailure();
    return null;
  }
}