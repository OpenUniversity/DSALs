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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_30, IStrategoTerm v_30, IStrategoTerm w_30, IStrategoTerm x_30, IStrategoTerm y_30, IStrategoTerm ref_z_30, IStrategoTerm a_31, IStrategoTerm b_31, IStrategoTerm c_31)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_30 = new TermReference(ref_z_30);
    context.push("make_lock_method_0_9");
    Fail150:
    { 
      IStrategoTerm e_31 = null;
      IStrategoTerm f_31 = null;
      IStrategoTerm g_31 = null;
      IStrategoTerm h_31 = null;
      IStrategoTerm i_31 = null;
      IStrategoTerm j_31 = null;
      IStrategoTerm k_31 = null;
      IStrategoTerm m_31 = null;
      IStrategoTerm n_31 = null;
      TermReference o_31 = new TermReference();
      IStrategoTerm p_31 = null;
      IStrategoTerm q_31 = null;
      IStrategoTerm r_31 = null;
      IStrategoTerm s_31 = null;
      IStrategoTerm c_32 = null;
      IStrategoTerm h_33 = null;
      IStrategoTerm i_33 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      IStrategoTerm arg47 = term.getSubterm(0);
      if(arg47.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg47).getConstructor())
        break Fail150;
      q_31 = arg47.getSubterm(0);
      c_32 = term;
      IStrategoTerm term117 = term;
      Success114:
      { 
        Fail151:
        { 
          IStrategoTerm q_32 = null;
          IStrategoTerm x_32 = null;
          IStrategoTerm z_32 = null;
          IStrategoTerm a_33 = null;
          IStrategoTerm g_177 = null;
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(o_31.value == null)
            o_31.value = term;
          else
            if(o_31.value != term && !o_31.value.match(term))
              break Fail151;
          Success115:
          { 
            Fail152:
            { 
              IStrategoTerm t_31 = null;
              t_31 = term;
              if(o_31.value == null)
                break Fail152;
              term = termFactory.makeTuple(o_31.value, y_30);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail152;
              term = t_31;
              { 
                term = y_30;
                lifted24 lifted240 = new lifted24();
                lifted240.o_31 = o_31;
                term = remove_all_1_0.instance.invoke(context, term, lifted240);
                if(term == null)
                  break Fail151;
                e_31 = term;
                term = hashtable_get_0_1.instance.invoke(context, b_31, o_31.value);
                if(term == null)
                  break Fail151;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0);
                f_31 = term;
                if(true)
                  break Success115;
              }
            }
            e_31 = cool.constNil0;
            term = cool.constNil0;
            f_31 = cool.constNil0;
          }
          Success116:
          { 
            Fail153:
            { 
              IStrategoTerm u_31 = null;
              u_31 = term;
              if(o_31.value == null)
                break Fail153;
              term = termFactory.makeTuple(o_31.value, x_30);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail153;
              term = u_31;
              { 
                if(o_31.value == null)
                  break Fail151;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(o_31.value, (IStrategoList)cool.constNil0), e_31);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                g_31 = term;
                term = hashtable_get_0_1.instance.invoke(context, a_31, o_31.value);
                if(term == null)
                  break Fail151;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), f_31);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                k_31 = term;
                if(true)
                  break Success116;
              }
            }
            g_31 = e_31;
            term = f_31;
            k_31 = f_31;
          }
          term = g_31;
          lifted25 lifted250 = new lifted25();
          lifted250.z_30 = z_30;
          term = map_1_0.instance.invoke(context, term, lifted250);
          if(term == null)
            break Fail151;
          i_31 = term;
          Success117:
          { 
            Fail154:
            { 
              IStrategoTerm w_31 = null;
              IStrategoTerm l_32 = null;
              IStrategoTerm m_32 = null;
              w_31 = term;
              m_32 = term;
              term = hashtable_keys_0_0.instance.invoke(context, v_30);
              if(term == null)
                break Fail154;
              l_32 = term;
              term = m_32;
              if(o_31.value == null)
                break Fail154;
              term = termFactory.makeTuple(o_31.value, l_32);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail154;
              term = w_31;
              { 
                term = hashtable_get_0_1.instance.invoke(context, v_30, o_31.value);
                if(term == null)
                  break Fail151;
                term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0});
                term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                h_31 = term;
                IStrategoList list8;
                list8 = checkListTail(i_31);
                if(list8 == null)
                  break Fail151;
                term = (IStrategoTerm)termFactory.makeListCons(h_31, list8);
                j_31 = term;
                if(true)
                  break Success117;
              }
            }
            term = i_31;
            j_31 = i_31;
          }
          q_32 = term;
          term = reverse_0_0.instance.invoke(context, j_31);
          if(term == null)
            break Fail151;
          term = make_while_condition_0_1.instance.invoke(context, q_32, term);
          if(term == null)
            break Fail151;
          m_31 = term;
          Success118:
          { 
            Fail155:
            { 
              IStrategoTerm z_31 = null;
              IStrategoTerm r_32 = null;
              IStrategoTerm s_32 = null;
              z_31 = term;
              s_32 = term;
              term = hashtable_keys_0_0.instance.invoke(context, w_30);
              if(term == null)
                break Fail155;
              r_32 = term;
              term = s_32;
              if(o_31.value == null)
                break Fail155;
              term = termFactory.makeTuple(o_31.value, r_32);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail155;
              term = z_31;
              { 
                term = hashtable_get_0_1.instance.invoke(context, w_30, o_31.value);
                if(term == null)
                  break Fail151;
                term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{cool.constAmbName3, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), cool.constNil0})});
                n_31 = term;
                if(true)
                  break Success118;
              }
            }
            term = cool.constNone0;
            n_31 = cool.constNone0;
          }
          Success119:
          { 
            Fail156:
            { 
              IStrategoTerm b_32 = null;
              IStrategoTerm t_32 = null;
              IStrategoTerm u_32 = null;
              b_32 = term;
              u_32 = term;
              term = hashtable_keys_0_0.instance.invoke(context, c_31);
              if(term == null)
                break Fail156;
              t_32 = term;
              term = u_32;
              if(o_31.value == null)
                break Fail156;
              term = termFactory.makeTuple(o_31.value, t_32);
              term = elem_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail156;
              term = b_32;
              { 
                term = hashtable_get_0_1.instance.invoke(context, c_31, o_31.value);
                if(term == null)
                  break Fail151;
                term = gen_source_location_ann_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0), k_31);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail151;
                if(true)
                  break Success119;
              }
            }
            term = k_31;
          }
          z_32 = term;
          a_33 = cool.constCons50;
          g_177 = m_31;
          term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{g_177, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{a_33})});
          x_32 = term;
          term = z_32;
          if(o_31.value == null)
            break Fail151;
          term = gen_method_state_name_0_1.instance.invoke(context, o_31.value, z_30.value);
          if(term == null)
            break Fail151;
          term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(x_32, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(n_31, (IStrategoList)cool.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), cool.constId27})}), cool.constCons23})}), (IStrategoList)cool.constNil0));
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          p_31 = term;
          term = (IStrategoTerm)termFactory.makeListCons(cool.const101, termFactory.makeListCons(q_31, (IStrategoList)cool.constCons43));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          r_31 = term;
          term = gen_source_location_ann_0_0.instance.invoke(context, u_30);
          if(term == null)
            break Fail151;
          term = (IStrategoTerm)termFactory.makeListCons(cool.constMarkerAnno0, termFactory.makeListCons(term, termFactory.makeListCons(termFactory.makeAppl(transform._consSingleElemAnno_2, new IStrategoTerm[]{cool.constTypeName5, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{r_31}), (IStrategoList)cool.constNil0)})})}), (IStrategoList)cool.constCons45)));
          s_31 = term;
          if(true)
            break Success114;
        }
        term = term117;
        IStrategoTerm g_33 = null;
        g_33 = term;
        term = report_with_failure_0_1.instance.invoke(context, g_33, cool.const114);
        if(term == null)
          break Fail150;
      }
      i_33 = c_32;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const115, termFactory.makeListCons(q_31, (IStrategoList)cool.constNil0));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail150;
      h_33 = term;
      term = i_33;
      if(s_31 == null || p_31 == null)
        break Fail150;
      term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{s_31, cool.constNone0, cool.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_33}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{cool.constNil0, u_30, cool.constId20}), (IStrategoList)cool.constNil0), cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{p_31})});
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