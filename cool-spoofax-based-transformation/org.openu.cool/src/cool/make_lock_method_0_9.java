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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_28, IStrategoTerm r_28, IStrategoTerm s_28, IStrategoTerm t_28, IStrategoTerm u_28, IStrategoTerm ref_v_28, IStrategoTerm w_28, IStrategoTerm x_28, IStrategoTerm y_28)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference v_28 = new TermReference(ref_v_28);
    context.push("make_lock_method_0_9");
    Fail151:
    { 
      IStrategoTerm a_29 = null;
      IStrategoTerm b_29 = null;
      IStrategoTerm c_29 = null;
      IStrategoTerm d_29 = null;
      IStrategoTerm e_29 = null;
      IStrategoTerm f_29 = null;
      IStrategoTerm g_29 = null;
      IStrategoTerm i_29 = null;
      IStrategoTerm j_29 = null;
      TermReference k_29 = new TermReference();
      IStrategoTerm l_29 = null;
      IStrategoTerm m_29 = null;
      IStrategoTerm n_29 = null;
      IStrategoTerm o_29 = null;
      IStrategoTerm y_29 = null;
      IStrategoTerm d_31 = null;
      IStrategoTerm e_31 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail151;
      IStrategoTerm arg47 = term.getSubterm(0);
      if(arg47.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg47).getConstructor())
        break Fail151;
      m_29 = arg47.getSubterm(0);
      y_29 = term;
      IStrategoTerm term117 = term;
      Success114:
      { 
        Fail152:
        { 
          IStrategoTerm m_30 = null;
          IStrategoTerm t_30 = null;
          IStrategoTerm v_30 = null;
          IStrategoTerm x_30 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail152;
          if(k_29.value == null)
            k_29.value = term;
          else
            if(k_29.value != term && !k_29.value.match(term))
              break Fail152;
          Success115:
          { 
            Fail153:
            { 
              IStrategoTerm p_29 = null;
              p_29 = term;
              if(k_29.value == null)
                break Fail153;
              term = termFactory.makeTuple(k_29.value, u_28);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail153;
              term = p_29;
              { 
                term = u_28;
                lifted24 lifted240 = new lifted24();
                lifted240.k_29 = k_29;
                term = remove_all_1_0.instance.invoke(context, term, lifted240);
                if(term == null)
                  break Fail152;
                a_29 = term;
                term = hashtable_get_0_1.instance.invoke(context, x_28, k_29.value);
                if(term == null)
                  break Fail152;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                b_29 = term;
                if(true)
                  break Success115;
              }
            }
            a_29 = cool.constNil0;
            term = cool.constNil0;
            b_29 = cool.constNil0;
          }
          Success116:
          { 
            Fail154:
            { 
              IStrategoTerm q_29 = null;
              q_29 = term;
              if(k_29.value == null)
                break Fail154;
              term = termFactory.makeTuple(k_29.value, t_28);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail154;
              term = q_29;
              { 
                if(k_29.value == null)
                  break Fail152;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(k_29.value, (IStrategoList)cool.constNil0), a_29);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                c_29 = term;
                term = hashtable_get_0_1.instance.invoke(context, w_28, k_29.value);
                if(term == null)
                  break Fail152;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), b_29);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                g_29 = term;
                if(true)
                  break Success116;
              }
            }
            c_29 = a_29;
            term = b_29;
            g_29 = b_29;
          }
          term = c_29;
          lifted25 lifted250 = new lifted25();
          lifted250.v_28 = v_28;
          term = map_1_0.instance.invoke(context, term, lifted250);
          if(term == null)
            break Fail152;
          e_29 = term;
          Success117:
          { 
            Fail155:
            { 
              IStrategoTerm s_29 = null;
              IStrategoTerm h_30 = null;
              IStrategoTerm i_30 = null;
              s_29 = term;
              i_30 = term;
              term = hashtable_keys_0_0.instance.invoke(context, r_28);
              if(term == null)
                break Fail155;
              h_30 = term;
              term = i_30;
              if(k_29.value == null)
                break Fail155;
              term = termFactory.makeTuple(k_29.value, h_30);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail155;
              term = s_29;
              { 
                term = hashtable_get_0_1.instance.invoke(context, r_28, k_29.value);
                if(term == null)
                  break Fail152;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                d_29 = term;
                IStrategoList list8;
                list8 = checkListTail(e_29);
                if(list8 == null)
                  break Fail152;
                term = (IStrategoTerm)termFactory.makeListCons(d_29, list8);
                f_29 = term;
                if(true)
                  break Success117;
              }
            }
            term = e_29;
            f_29 = e_29;
          }
          m_30 = term;
          term = reverse_0_0.instance.invoke(context, f_29);
          if(term == null)
            break Fail152;
          term = make_while_condition_0_1.instance.invoke(context, m_30, term);
          if(term == null)
            break Fail152;
          i_29 = term;
          Success118:
          { 
            Fail156:
            { 
              IStrategoTerm v_29 = null;
              IStrategoTerm n_30 = null;
              IStrategoTerm o_30 = null;
              v_29 = term;
              o_30 = term;
              term = hashtable_keys_0_0.instance.invoke(context, s_28);
              if(term == null)
                break Fail156;
              n_30 = term;
              term = o_30;
              if(k_29.value == null)
                break Fail156;
              term = termFactory.makeTuple(k_29.value, n_30);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail156;
              term = v_29;
              { 
                term = hashtable_get_0_1.instance.invoke(context, s_28, k_29.value);
                if(term == null)
                  break Fail152;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                j_29 = term;
                if(true)
                  break Success118;
              }
            }
            term = cool.constNone0;
            j_29 = cool.constNone0;
          }
          Success119:
          { 
            Fail157:
            { 
              IStrategoTerm x_29 = null;
              IStrategoTerm p_30 = null;
              IStrategoTerm q_30 = null;
              x_29 = term;
              q_30 = term;
              term = hashtable_keys_0_0.instance.invoke(context, y_28);
              if(term == null)
                break Fail157;
              p_30 = term;
              term = q_30;
              if(k_29.value == null)
                break Fail157;
              term = termFactory.makeTuple(k_29.value, p_30);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail157;
              term = x_29;
              { 
                term = hashtable_get_0_1.instance.invoke(context, y_28, k_29.value);
                if(term == null)
                  break Fail152;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), g_29);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail152;
                if(true)
                  break Success119;
              }
            }
            term = g_29;
          }
          v_30 = term;
          x_30 = term;
          term = make_while_statement_0_2.instance.invoke(context, x_30, i_29, cool.constCons50);
          if(term == null)
            break Fail152;
          t_30 = term;
          term = v_30;
          if(k_29.value == null)
            break Fail152;
          term = gen_method_state_name_0_1.instance.invoke(context, k_29.value, v_28.value);
          if(term == null)
            break Fail152;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(t_30, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(j_29, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId27})}), cool.constCons22})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail152;
          l_29 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const99, termFactory.makeListCons(m_29, (IStrategoList)cool.constCons43));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail152;
          n_29 = term;
          term = gen_source_location_ann_0_0.instance.invoke(context, q_28);
          if(term == null)
            break Fail152;
          term = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, termFactory.makeListCons(term, termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{n_29}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons45)));
          o_29 = term;
          if(true)
            break Success114;
        }
        term = term117;
        IStrategoTerm c_31 = null;
        c_31 = term;
        term = report_with_failure_0_1.instance.invoke(context, c_31, cool.const112);
        if(term == null)
          break Fail151;
      }
      e_31 = y_29;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const113, termFactory.makeListCons(m_29, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail151;
      d_31 = term;
      term = e_31;
      if(o_29 == null || l_29 == null)
        break Fail151;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{o_29, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_31}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, q_28, cool.constId20}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{l_29})});
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