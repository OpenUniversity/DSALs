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
    Fail174:
    { 
      IStrategoTerm a_36 = null;
      IStrategoList annos0 = term.getAnnotations();
      if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
        break Fail174;
      IStrategoTerm arg55 = ((IStrategoList)annos0).head();
      if(arg55.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg55).isEmpty())
        break Fail174;
      a_36 = ((IStrategoList)arg55).head();
      IStrategoTerm arg56 = ((IStrategoList)annos0).tail();
      if(arg56.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg56).isEmpty())
        break Fail174;
      term = a_36;
      if(true)
        return term;
    }
    context.push("get_location_0_0");
    context.popOnFailure();
    return null;
  }
}