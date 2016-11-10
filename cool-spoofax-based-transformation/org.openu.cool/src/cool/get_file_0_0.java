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
    Fail136:
    { 
      IStrategoTerm u_24 = null;
      IStrategoList annos1 = term.getAnnotations();
      if(annos1.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos1).isEmpty())
        break Fail136;
      IStrategoTerm arg32 = ((IStrategoList)annos1).head();
      if(arg32.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg32).isEmpty())
        break Fail136;
      IStrategoTerm arg33 = ((IStrategoList)arg32).tail();
      if(arg33.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg33).isEmpty())
        break Fail136;
      u_24 = ((IStrategoList)arg33).head();
      IStrategoTerm arg34 = ((IStrategoList)arg33).tail();
      if(arg34.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg34).isEmpty())
        break Fail136;
      IStrategoTerm arg35 = ((IStrategoList)annos1).tail();
      if(arg35.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg35).isEmpty())
        break Fail136;
      term = u_24;
      if(true)
        return term;
    }
    context.push("get_file_0_0");
    context.popOnFailure();
    return null;
  }
}