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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_27, IStrategoTerm s_27, IStrategoTerm t_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail148:
    { 
      IStrategoTerm v_27 = null;
      IStrategoTerm x_27 = null;
      IStrategoTerm y_27 = null;
      IStrategoTerm z_27 = null;
      IStrategoTerm a_28 = null;
      IStrategoTerm d_28 = null;
      IStrategoTerm m_28 = null;
      IStrategoTerm n_28 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail148;
      IStrategoTerm arg46 = term.getSubterm(0);
      if(arg46.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg46).getConstructor())
        break Fail148;
      v_27 = arg46.getSubterm(0);
      d_28 = term;
      IStrategoTerm term115 = term;
      Success112:
      { 
        Fail149:
        { 
          y_27 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const99, termFactory.makeListCons(v_27, (IStrategoList)cool.constCons43));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail149;
          term = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName2, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons45));
          x_27 = term;
          Success113:
          { 
            Fail150:
            { 
              IStrategoTerm b_28 = null;
              b_28 = term;
              term = hashtable_keys_0_0.instance.invoke(context, s_27);
              if(term == null)
                break Fail150;
              term = termFactory.makeTuple(y_27, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail150;
              term = b_28;
              { 
                term = hashtable_get_0_1.instance.invoke(context, s_27, y_27);
                if(term == null)
                  break Fail149;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                z_27 = term;
                if(true)
                  break Success113;
              }
            }
            term = cool.constNone0;
            z_27 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, y_27, t_27);
          if(term == null)
            break Fail149;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId21})}), cool.constCons22})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(z_27, (IStrategoList)cool.constNil0), cool.constCons46);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail149;
          a_28 = term;
          if(true)
            break Success112;
        }
        term = term115;
        IStrategoTerm l_28 = null;
        l_28 = term;
        term = report_with_failure_0_1.instance.invoke(context, l_28, cool.const104);
        if(term == null)
          break Fail148;
      }
      n_28 = d_28;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const105, termFactory.makeListCons(v_27, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail148;
      m_28 = term;
      term = n_28;
      if(x_27 == null || a_28 == null)
        break Fail148;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{x_27, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{m_28}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, r_27, cool.constId20}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{a_28})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}