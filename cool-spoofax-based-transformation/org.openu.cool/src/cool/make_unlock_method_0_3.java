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

@SuppressWarnings("all") public class make_unlock_method_0_3 extends Strategy 
{ 
  public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_31, IStrategoTerm e_31, IStrategoTerm f_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail154:
    { 
      IStrategoTerm h_31 = null;
      IStrategoTerm j_31 = null;
      IStrategoTerm k_31 = null;
      IStrategoTerm l_31 = null;
      IStrategoTerm m_31 = null;
      IStrategoTerm p_31 = null;
      IStrategoTerm y_31 = null;
      IStrategoTerm z_31 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail154;
      IStrategoTerm arg64 = term.getSubterm(0);
      if(arg64.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg64).getConstructor())
        break Fail154;
      h_31 = arg64.getSubterm(0);
      p_31 = term;
      IStrategoTerm term115 = term;
      Success112:
      { 
        Fail155:
        { 
          k_31 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const102, termFactory.makeListCons(h_31, (IStrategoList)cool.constCons35));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail155;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons37);
          j_31 = term;
          Success113:
          { 
            Fail156:
            { 
              IStrategoTerm n_31 = null;
              n_31 = term;
              term = hashtable_keys_0_0.instance.invoke(context, e_31);
              if(term == null)
                break Fail156;
              term = termFactory.makeTuple(k_31, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail156;
              term = n_31;
              { 
                term = hashtable_get_0_1.instance.invoke(context, e_31, k_31);
                if(term == null)
                  break Fail155;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                l_31 = term;
                if(true)
                  break Success113;
              }
            }
            term = cool.constNone0;
            l_31 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, k_31, f_31);
          if(term == null)
            break Fail155;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId26})}), cool.constCons22})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(l_31, (IStrategoList)cool.constNil0), cool.constCons38);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail155;
          m_31 = term;
          if(true)
            break Success112;
        }
        term = term115;
        IStrategoTerm x_31 = null;
        x_31 = term;
        term = report_with_failure_0_1.instance.invoke(context, x_31, cool.const111);
        if(term == null)
          break Fail154;
      }
      z_31 = p_31;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const112, termFactory.makeListCons(h_31, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail154;
      y_31 = term;
      term = z_31;
      if(j_31 == null || m_31 == null)
        break Fail154;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{j_31, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_31}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, d_31, cool.constId25}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{m_31})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}