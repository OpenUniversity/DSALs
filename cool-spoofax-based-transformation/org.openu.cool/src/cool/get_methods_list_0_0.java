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

@SuppressWarnings("all") public class get_methods_list_0_0 extends Strategy 
{ 
  public static get_methods_list_0_0 instance = new get_methods_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail170:
    { 
      IStrategoTerm term132 = term;
      IStrategoConstructor cons9 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success129:
      { 
        if(cons9 == transform._consSelfex_1)
        { 
          Fail171:
          { 
            IStrategoTerm s_35 = null;
            s_35 = term.getSubterm(0);
            term = s_35;
            if(true)
              break Success129;
          }
          term = term132;
        }
        Success130:
        { 
          if(cons9 == transform._consMutex_1)
          { 
            Fail172:
            { 
              IStrategoTerm r_35 = null;
              r_35 = term.getSubterm(0);
              term = r_35;
              if(true)
                break Success130;
            }
            term = term132;
          }
          if(cons9 == transform._consNone_0)
          { 
            term = cool.constNil0;
          }
          else
          { 
            break Fail170;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("get_methods_list_0_0");
    context.popOnFailure();
    return null;
  }
}