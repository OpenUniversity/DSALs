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

@SuppressWarnings("all") public class option_to_boxes_0_0 extends Strategy 
{ 
  public static option_to_boxes_0_0 instance = new option_to_boxes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail108:
    { 
      IStrategoTerm term103 = term;
      IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success101:
      { 
        if(cons6 == transform._consSome_1)
        { 
          Fail109:
          { 
            IStrategoTerm h_17 = null;
            h_17 = term.getSubterm(0);
            term = h_17;
            term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
            if(true)
              break Success101;
          }
          term = term103;
        }
        if(cons6 == transform._consNone_0)
        { 
          term = cool.constNil0;
        }
        else
        { 
          break Fail108;
        }
      }
      if(true)
        return term;
    }
    context.push("option_to_boxes_0_0");
    context.popOnFailure();
    return null;
  }
}