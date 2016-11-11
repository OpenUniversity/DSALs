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

@SuppressWarnings("all") public class get_location_0_0 extends Strategy 
{ 
  public static get_location_0_0 instance = new get_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail175:
    { 
      IStrategoTerm w_33 = null;
      IStrategoList annos0 = term.getAnnotations();
      if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
        break Fail175;
      IStrategoTerm arg55 = ((IStrategoList)annos0).head();
      if(arg55.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg55).isEmpty())
        break Fail175;
      w_33 = ((IStrategoList)arg55).head();
      IStrategoTerm arg56 = ((IStrategoList)annos0).tail();
      if(arg56.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg56).isEmpty())
        break Fail175;
      term = w_33;
      if(true)
        return term;
    }
    context.push("get_location_0_0");
    context.popOnFailure();
    return null;
  }
}