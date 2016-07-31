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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_while_condition_0_1");
    Fail128:
    { 
      IStrategoTerm j_22 = null;
      IStrategoTerm k_22 = null;
      IStrategoTerm l_22 = null;
      IStrategoTerm m_22 = null;
      m_22 = term;
      term = length_0_0.instance.invoke(context, i_22);
      if(term == null)
        break Fail128;
      l_22 = term;
      term = m_22;
      IStrategoTerm term108 = term;
      Success105:
      { 
        Fail129:
        { 
          IStrategoTerm n_22 = null;
          IStrategoTerm r_22 = null;
          n_22 = term;
          r_22 = l_22;
          term = equal_0_1.instance.invoke(context, r_22, cool.const87);
          if(term == null)
            break Fail129;
          term = n_22;
          { 
            term = cool.constFalse0;
            if(true)
              break Success105;
          }
        }
        term = term108;
        Success106:
        { 
          Fail130:
          { 
            IStrategoTerm o_22 = null;
            IStrategoTerm t_22 = null;
            o_22 = term;
            t_22 = l_22;
            term = equal_0_1.instance.invoke(context, t_22, cool.const88);
            if(term == null)
              break Fail130;
            term = o_22;
            { 
              IStrategoTerm p_22 = null;
              term = i_22;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail128;
              p_22 = ((IStrategoList)term).head();
              IStrategoTerm arg25 = ((IStrategoList)term).tail();
              if(arg25.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25).isEmpty())
                break Fail128;
              term = p_22;
              if(true)
                break Success106;
            }
          }
          term = i_22;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail128;
          k_22 = ((IStrategoList)term).head();
          j_22 = ((IStrategoList)term).tail();
          term = this.invoke(context, term, j_22);
          if(term == null)
            break Fail128;
          term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, k_22});
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