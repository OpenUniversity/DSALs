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

@SuppressWarnings("all") public class aspectj_to_box_0_0 extends Strategy 
{ 
  public static aspectj_to_box_0_0 instance = new aspectj_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0");
    Fail104:
    { 
      IStrategoTerm term99 = term;
      IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success99:
      { 
        if(cons5 == transform._consCall_1)
        { 
          Fail105:
          { 
            IStrategoTerm f_17 = null;
            f_17 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX46, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(f_17, (IStrategoList)cool.constCons1)))});
            if(true)
              break Success99;
          }
          term = term99;
        }
        Success100:
        { 
          if(cons5 == transform._consExec_1)
          { 
            Fail106:
            { 
              IStrategoTerm e_17 = null;
              e_17 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX47, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(e_17, (IStrategoList)cool.constCons1)))});
              if(true)
                break Success100;
            }
            term = term99;
          }
          term = aspectj_to_box_0_0_fragment_4.instance.invoke(context, term);
          if(term == null)
            break Fail104;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}