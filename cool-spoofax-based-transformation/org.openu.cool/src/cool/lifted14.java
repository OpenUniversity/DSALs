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

@SuppressWarnings("all") final class lifted14 extends Strategy 
{ 
  public static final lifted14 instance = new lifted14();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail197:
    { 
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail197;
      if(true)
        return term;
    }
    return null;
  }
}