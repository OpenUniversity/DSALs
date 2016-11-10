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

@SuppressWarnings("all") public class make_lock_method_0_9 extends Strategy 
{ 
  public static make_lock_method_0_9 instance = new make_lock_method_0_9();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_32, IStrategoTerm d_32, IStrategoTerm e_32, IStrategoTerm f_32, IStrategoTerm g_32, IStrategoTerm ref_h_32, IStrategoTerm i_32, IStrategoTerm j_32, IStrategoTerm k_32)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference h_32 = new TermReference(ref_h_32);
    context.push("make_lock_method_0_9");
    Fail157:
    { 
      IStrategoTerm m_32 = null;
      IStrategoTerm n_32 = null;
      IStrategoTerm o_32 = null;
      IStrategoTerm p_32 = null;
      IStrategoTerm q_32 = null;
      IStrategoTerm r_32 = null;
      IStrategoTerm s_32 = null;
      IStrategoTerm u_32 = null;
      IStrategoTerm v_32 = null;
      TermReference w_32 = new TermReference();
      IStrategoTerm x_32 = null;
      IStrategoTerm y_32 = null;
      IStrategoTerm a_33 = null;
      IStrategoTerm k_33 = null;
      IStrategoTerm n_34 = null;
      IStrategoTerm o_34 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      IStrategoTerm arg65 = term.getSubterm(0);
      if(arg65.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg65).getConstructor())
        break Fail157;
      y_32 = arg65.getSubterm(0);
      k_33 = term;
      IStrategoTerm term117 = term;
      Success114:
      { 
        Fail158:
        { 
          IStrategoTerm y_33 = null;
          IStrategoTerm f_34 = null;
          IStrategoTerm h_34 = null;
          IStrategoTerm i_34 = null;
          IStrategoTerm k_178 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail158;
          if(w_32.value == null)
            w_32.value = term;
          else
            if(w_32.value != term && !w_32.value.match(term))
              break Fail158;
          Success115:
          { 
            Fail159:
            { 
              IStrategoTerm b_33 = null;
              b_33 = term;
              if(w_32.value == null)
                break Fail159;
              term = termFactory.makeTuple(w_32.value, g_32);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail159;
              term = b_33;
              { 
                IStrategoTerm b_178 = null;
                term = g_32;
                lifted24 lifted240 = new lifted24();
                lifted240.w_32 = w_32;
                term = remove_all_1_0.instance.invoke(context, term, lifted240);
                if(term == null)
                  break Fail158;
                m_32 = term;
                term = hashtable_get_0_1.instance.invoke(context, j_32, w_32.value);
                if(term == null)
                  break Fail158;
                b_178 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, b_178, cool.const113);
                if(term == null)
                  break Fail158;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                n_32 = term;
                if(true)
                  break Success115;
              }
            }
            m_32 = cool.constNil0;
            term = cool.constNil0;
            n_32 = cool.constNil0;
          }
          Success116:
          { 
            Fail160:
            { 
              IStrategoTerm c_33 = null;
              c_33 = term;
              if(w_32.value == null)
                break Fail160;
              term = termFactory.makeTuple(w_32.value, f_32);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail160;
              term = c_33;
              { 
                IStrategoTerm f_178 = null;
                if(w_32.value == null)
                  break Fail158;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(w_32.value, (IStrategoList)cool.constNil0), m_32);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail158;
                o_32 = term;
                term = hashtable_get_0_1.instance.invoke(context, i_32, w_32.value);
                if(term == null)
                  break Fail158;
                f_178 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, f_178, cool.const114);
                if(term == null)
                  break Fail158;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), n_32);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail158;
                s_32 = term;
                if(true)
                  break Success116;
              }
            }
            o_32 = m_32;
            term = n_32;
            s_32 = n_32;
          }
          term = o_32;
          lifted25 lifted250 = new lifted25();
          lifted250.h_32 = h_32;
          term = map_1_0.instance.invoke(context, term, lifted250);
          if(term == null)
            break Fail158;
          q_32 = term;
          Success117:
          { 
            Fail161:
            { 
              IStrategoTerm e_33 = null;
              IStrategoTerm t_33 = null;
              IStrategoTerm u_33 = null;
              e_33 = term;
              u_33 = term;
              term = hashtable_keys_0_0.instance.invoke(context, d_32);
              if(term == null)
                break Fail161;
              t_33 = term;
              term = u_33;
              if(w_32.value == null)
                break Fail161;
              term = termFactory.makeTuple(w_32.value, t_33);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail161;
              term = e_33;
              { 
                term = hashtable_get_0_1.instance.invoke(context, d_32, w_32.value);
                if(term == null)
                  break Fail158;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                p_32 = term;
                IStrategoList list8;
                list8 = checkListTail(q_32);
                if(list8 == null)
                  break Fail158;
                term = (IStrategoTerm)termFactory.makeListCons(p_32, list8);
                r_32 = term;
                if(true)
                  break Success117;
              }
            }
            term = q_32;
            r_32 = q_32;
          }
          y_33 = term;
          term = reverse_0_0.instance.invoke(context, r_32);
          if(term == null)
            break Fail158;
          term = make_while_condition_0_1.instance.invoke(context, y_33, term);
          if(term == null)
            break Fail158;
          u_32 = term;
          Success118:
          { 
            Fail162:
            { 
              IStrategoTerm h_33 = null;
              IStrategoTerm z_33 = null;
              IStrategoTerm a_34 = null;
              h_33 = term;
              a_34 = term;
              term = hashtable_keys_0_0.instance.invoke(context, e_32);
              if(term == null)
                break Fail162;
              z_33 = term;
              term = a_34;
              if(w_32.value == null)
                break Fail162;
              term = termFactory.makeTuple(w_32.value, z_33);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail162;
              term = h_33;
              { 
                term = hashtable_get_0_1.instance.invoke(context, e_32, w_32.value);
                if(term == null)
                  break Fail158;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                v_32 = term;
                if(true)
                  break Success118;
              }
            }
            term = cool.constNone0;
            v_32 = cool.constNone0;
          }
          Success119:
          { 
            Fail163:
            { 
              IStrategoTerm j_33 = null;
              IStrategoTerm b_34 = null;
              IStrategoTerm c_34 = null;
              j_33 = term;
              c_34 = term;
              term = hashtable_keys_0_0.instance.invoke(context, k_32);
              if(term == null)
                break Fail163;
              b_34 = term;
              term = c_34;
              if(w_32.value == null)
                break Fail163;
              term = termFactory.makeTuple(w_32.value, b_34);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail163;
              term = j_33;
              { 
                IStrategoTerm j_178 = null;
                term = hashtable_get_0_1.instance.invoke(context, k_32, w_32.value);
                if(term == null)
                  break Fail158;
                j_178 = term;
                term = gen_source_location_ann_0_1.instance.invoke(context, j_178, cool.const115);
                if(term == null)
                  break Fail158;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), s_32);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail158;
                if(true)
                  break Success119;
              }
            }
            term = s_32;
          }
          h_34 = term;
          i_34 = cool.constCons42;
          k_178 = u_32;
          term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{k_178, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{i_34})});
          f_34 = term;
          term = h_34;
          if(w_32.value == null)
            break Fail158;
          term = gen_method_state_name_0_1.instance.invoke(context, w_32.value, h_32.value);
          if(term == null)
            break Fail158;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(f_34, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(v_32, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId32})}), cool.constCons22})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail158;
          x_32 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const102, termFactory.makeListCons(y_32, (IStrategoList)cool.constCons35));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail158;
          term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName6, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons37);
          a_33 = term;
          if(true)
            break Success114;
        }
        term = term117;
        IStrategoTerm m_34 = null;
        m_34 = term;
        term = report_with_failure_0_1.instance.invoke(context, m_34, cool.const122);
        if(term == null)
          break Fail157;
      }
      o_34 = k_33;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const123, termFactory.makeListCons(y_32, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail157;
      n_34 = term;
      term = o_34;
      if(a_33 == null || x_32 == null)
        break Fail157;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{a_33, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_34}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, c_32, cool.constId25}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{x_32})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 9)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8]);
  }
}