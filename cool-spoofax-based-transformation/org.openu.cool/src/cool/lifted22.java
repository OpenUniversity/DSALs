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

@SuppressWarnings("all") final class lifted22 extends Strategy 
{ 
  TermReference c_26;

  TermReference s_26;

  TermReference e_26;

  TermReference u_26;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail187:
    { 
      term = make_on_exit_method_0_4.instance.invoke(context, term, c_26.value, s_26.value, e_26.value, u_26.value);
      if(term == null)
        break Fail187;
      if(true)
        return term;
    }
    return null;
  }
}