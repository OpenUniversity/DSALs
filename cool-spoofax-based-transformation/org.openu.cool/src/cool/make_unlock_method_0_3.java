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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_29, IStrategoTerm w_29, IStrategoTerm x_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_unlock_method_0_3");
    Fail147:
    { 
      IStrategoTerm z_29 = null;
      IStrategoTerm b_30 = null;
      IStrategoTerm c_30 = null;
      IStrategoTerm d_30 = null;
      IStrategoTerm e_30 = null;
      IStrategoTerm h_30 = null;
      IStrategoTerm q_30 = null;
      IStrategoTerm r_30 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail147;
      IStrategoTerm arg46 = term.getSubterm(0);
      if(arg46.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg46).getConstructor())
        break Fail147;
      z_29 = arg46.getSubterm(0);
      h_30 = term;
      IStrategoTerm term115 = term;
      Success112:
      { 
        Fail148:
        { 
          c_30 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const101, termFactory.makeListCons(z_29, (IStrategoList)cool.constCons43));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail148;
          term = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName2, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons45));
          b_30 = term;
          Success113:
          { 
            Fail149:
            { 
              IStrategoTerm f_30 = null;
              f_30 = term;
              term = hashtable_keys_0_0.instance.invoke(context, w_29);
              if(term == null)
                break Fail149;
              term = termFactory.makeTuple(c_30, term);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail149;
              term = f_30;
              { 
                term = hashtable_get_0_1.instance.invoke(context, w_29, c_30);
                if(term == null)
                  break Fail148;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                d_30 = term;
                if(true)
                  break Success113;
              }
            }
            term = cool.constNone0;
            d_30 = cool.constNone0;
          }
          term = gen_method_state_name_0_1.instance.invoke(context, c_30, x_29);
          if(term == null)
            break Fail148;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId21})}), cool.constCons23})}), (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(d_30, (IStrategoList)cool.constNil0), cool.constCons46);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail148;
          e_30 = term;
          if(true)
            break Success112;
        }
        term = term115;
        IStrategoTerm p_30 = null;
        p_30 = term;
        term = report_with_failure_0_1.instance.invoke(context, p_30, cool.const106);
        if(term == null)
          break Fail147;
      }
      r_30 = h_30;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const107, termFactory.makeListCons(z_29, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail147;
      q_30 = term;
      term = r_30;
      if(b_30 == null || e_30 == null)
        break Fail147;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{b_30, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{q_30}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, v_29, cool.constId20}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{e_30})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}