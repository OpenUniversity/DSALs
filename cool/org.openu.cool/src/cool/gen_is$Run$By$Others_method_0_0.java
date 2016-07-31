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

@SuppressWarnings("all") public class gen_is$Run$By$Others_method_0_0 extends Strategy 
{ 
  public static gen_is$Run$By$Others_method_0_0 instance = new gen_is$Run$By$Others_method_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail122:
    { 
      term = cool.constMethodDec0;
      if(true)
        return term;
    }
    context.push("gen_isRunByOthers_method_0_0");
    context.popOnFailure();
    return null;
  }
}