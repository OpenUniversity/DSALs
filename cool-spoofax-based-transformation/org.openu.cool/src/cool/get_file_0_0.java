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

@SuppressWarnings("all") public class get_file_0_0 extends Strategy 
{ 
  public static get_file_0_0 instance = new get_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail176:
    { 
      IStrategoTerm z_33 = null;
      IStrategoList annos1 = term.getAnnotations();
      if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
        break Fail176;
      IStrategoTerm arg57 = ((IStrategoList)annos1).head();
      if(arg57.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg57).isEmpty())
        break Fail176;
      IStrategoTerm arg58 = ((IStrategoList)arg57).tail();
      if(arg58.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg58).isEmpty())
        break Fail176;
      z_33 = ((IStrategoList)arg58).head();
      IStrategoTerm arg59 = ((IStrategoList)arg58).tail();
      if(arg59.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg59).isEmpty())
        break Fail176;
      IStrategoTerm arg60 = ((IStrategoList)annos1).tail();
      if(arg60.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg60).isEmpty())
        break Fail176;
      term = z_33;
      if(true)
        return term;
    }
    context.push("get_file_0_0");
    context.popOnFailure();
    return null;
  }
}