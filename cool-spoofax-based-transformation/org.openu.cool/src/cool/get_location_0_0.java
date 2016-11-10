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
    Fail135:
    { 
      IStrategoTerm r_24 = null;
      IStrategoList annos0 = term.getAnnotations();
      if(annos0.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos0).isEmpty())
        break Fail135;
      IStrategoTerm arg30 = ((IStrategoList)annos0).head();
      if(arg30.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg30).isEmpty())
        break Fail135;
      r_24 = ((IStrategoList)arg30).head();
      IStrategoTerm arg31 = ((IStrategoList)annos0).tail();
      if(arg31.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg31).isEmpty())
        break Fail135;
      term = r_24;
      if(true)
        return term;
    }
    context.push("get_location_0_0");
    context.popOnFailure();
    return null;
  }
}