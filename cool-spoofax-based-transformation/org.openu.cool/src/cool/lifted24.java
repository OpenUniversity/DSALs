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

@SuppressWarnings("all") final class lifted24 extends Strategy 
{ 
  TermReference o_31;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail185:
    { 
      term = equal_0_1.instance.invoke(context, term, o_31.value);
      if(term == null)
        break Fail185;
      if(true)
        return term;
    }
    return null;
  }
}