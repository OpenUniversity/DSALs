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

@SuppressWarnings("all") final class g_17 extends Strategy 
{ 
  public static final g_17 instance = new g_17();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail210:
    { 
      IStrategoTerm term101 = term;
      Success132:
      { 
        Fail211:
        { 
          term = $Not$Comp_1_0.instance.invoke(context, term, _Id.instance);
          if(term == null)
            break Fail211;
          if(true)
            break Success132;
        }
        term = term101;
        IStrategoTerm term102 = term;
        Success133:
        { 
          Fail212:
          { 
            term = $And$Comp_2_0.instance.invoke(context, term, this, _Id.instance);
            if(term == null)
              break Fail212;
            if(true)
              break Success133;
          }
          term = $Or$Comp_2_0.instance.invoke(context, term102, this, _Id.instance);
          if(term == null)
            break Fail210;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}