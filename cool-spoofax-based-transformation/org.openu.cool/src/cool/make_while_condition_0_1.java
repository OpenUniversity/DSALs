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

@SuppressWarnings("all") public class make_while_condition_0_1 extends Strategy 
{ 
  public static make_while_condition_0_1 instance = new make_while_condition_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_while_condition_0_1");
    Fail130:
    { 
      IStrategoTerm f_20 = null;
      IStrategoTerm g_20 = null;
      IStrategoTerm h_20 = null;
      IStrategoTerm i_20 = null;
      i_20 = term;
      term = length_0_0.instance.invoke(context, e_20);
      if(term == null)
        break Fail130;
      h_20 = term;
      term = i_20;
      IStrategoTerm term109 = term;
      Success106:
      { 
        Fail131:
        { 
          IStrategoTerm j_20 = null;
          IStrategoTerm n_20 = null;
          j_20 = term;
          n_20 = h_20;
          term = equal_0_1.instance.invoke(context, n_20, cool.const85);
          if(term == null)
            break Fail131;
          term = j_20;
          { 
            term = cool.constFalse0;
            if(true)
              break Success106;
          }
        }
        term = term109;
        Success107:
        { 
          Fail132:
          { 
            IStrategoTerm k_20 = null;
            IStrategoTerm p_20 = null;
            k_20 = term;
            p_20 = h_20;
            term = equal_0_1.instance.invoke(context, p_20, cool.const86);
            if(term == null)
              break Fail132;
            term = k_20;
            { 
              IStrategoTerm l_20 = null;
              term = e_20;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail130;
              l_20 = ((IStrategoList)term).head();
              IStrategoTerm arg28 = ((IStrategoList)term).tail();
              if(arg28.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg28).isEmpty())
                break Fail130;
              term = l_20;
              if(true)
                break Success107;
            }
          }
          term = e_20;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail130;
          g_20 = ((IStrategoList)term).head();
          f_20 = ((IStrategoList)term).tail();
          term = this.invoke(context, term, f_20);
          if(term == null)
            break Fail130;
          term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, g_20});
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