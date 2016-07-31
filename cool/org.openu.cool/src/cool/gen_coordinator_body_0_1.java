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

@SuppressWarnings("all") public class gen_coordinator_body_0_1 extends Strategy 
{ 
  public static gen_coordinator_body_0_1 instance = new gen_coordinator_body_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_27)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference k_27 = new TermReference(ref_k_27);
    context.push("gen_coordinator_body_0_1");
    Fail150:
    { 
      TermReference l_27 = new TermReference();
      TermReference m_27 = new TermReference();
      TermReference n_27 = new TermReference();
      IStrategoTerm o_27 = null;
      TermReference p_27 = new TermReference();
      TermReference q_27 = new TermReference();
      IStrategoTerm r_27 = null;
      IStrategoTerm s_27 = null;
      TermReference t_27 = new TermReference();
      TermReference u_27 = new TermReference();
      IStrategoTerm v_27 = null;
      IStrategoTerm w_27 = null;
      TermReference x_27 = new TermReference();
      IStrategoTerm y_27 = null;
      TermReference z_27 = new TermReference();
      TermReference a_28 = new TermReference();
      TermReference b_28 = new TermReference();
      TermReference c_28 = new TermReference();
      IStrategoTerm j_28 = null;
      IStrategoTerm o_29 = null;
      IStrategoTerm w_29 = null;
      IStrategoTerm p_29 = null;
      IStrategoTerm x_29 = null;
      IStrategoTerm q_29 = null;
      IStrategoTerm y_29 = null;
      IStrategoTerm r_29 = null;
      IStrategoTerm z_29 = null;
      IStrategoTerm s_29 = null;
      IStrategoTerm a_30 = null;
      IStrategoTerm t_29 = null;
      IStrategoTerm b_30 = null;
      IStrategoTerm u_29 = null;
      IStrategoTerm c_30 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail150;
      w_27 = term.getSubterm(0);
      j_28 = term;
      IStrategoTerm term113 = term;
      Success110:
      { 
        Fail151:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(z_27.value == null)
            z_27.value = term;
          else
            if(z_27.value != term && !z_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(a_28.value == null)
            a_28.value = term;
          else
            if(a_28.value != term && !a_28.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(b_28.value == null)
            b_28.value = term;
          else
            if(b_28.value != term && !b_28.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(l_27.value == null)
            l_27.value = term;
          else
            if(l_27.value != term && !l_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(m_27.value == null)
            m_27.value = term;
          else
            if(m_27.value != term && !m_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(n_27.value == null)
            n_27.value = term;
          else
            if(n_27.value != term && !n_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(c_28.value == null)
            c_28.value = term;
          else
            if(c_28.value != term && !c_28.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(x_27.value == null)
            x_27.value = term;
          else
            if(x_27.value != term && !x_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(p_27.value == null)
            p_27.value = term;
          else
            if(p_27.value != term && !p_27.value.match(term))
              break Fail151;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          if(q_27.value == null)
            q_27.value = term;
          else
            if(q_27.value != term && !q_27.value.match(term))
              break Fail151;
          term = getfirst_1_0.instance.invoke(context, w_27, lifted8.instance);
          if(term == null)
            break Fail151;
          o_27 = term;
          term = getfirst_1_0.instance.invoke(context, w_27, lifted9.instance);
          if(term == null)
            break Fail151;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          r_27 = term;
          term = getfirst_1_0.instance.invoke(context, w_27, lifted10.instance);
          if(term == null)
            break Fail151;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          s_27 = term;
          term = r_27;
          lifted11 lifted110 = new lifted11();
          lifted110.p_27 = p_27;
          term = map_1_0.instance.invoke(context, term, lifted110);
          if(term == null)
            break Fail151;
          term = s_27;
          lifted12 lifted120 = new lifted12();
          lifted120.q_27 = q_27;
          term = map_1_0.instance.invoke(context, term, lifted120);
          if(term == null)
            break Fail151;
          term = map_1_0.instance.invoke(context, r_27, lifted13.instance);
          if(term == null)
            break Fail151;
          if(t_27.value == null)
            t_27.value = term;
          else
            if(t_27.value != term && !t_27.value.match(term))
              break Fail151;
          term = map_1_0.instance.invoke(context, s_27, lifted14.instance);
          if(term == null)
            break Fail151;
          if(u_27.value == null)
            u_27.value = term;
          else
            if(u_27.value != term && !u_27.value.match(term))
              break Fail151;
          if(t_27.value == null || u_27.value == null)
            break Fail151;
          term = termFactory.makeTuple(t_27.value, u_27.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail151;
          v_27 = term;
          lifted15 lifted150 = new lifted15();
          lifted150.c_28 = c_28;
          term = map_1_0.instance.invoke(context, term, lifted150);
          if(term == null)
            break Fail151;
          term = retain_all_1_0.instance.invoke(context, w_27, lifted16.instance);
          if(term == null)
            break Fail151;
          y_27 = term;
          lifted17 lifted170 = new lifted17();
          lifted170.x_27 = x_27;
          term = map_1_0.instance.invoke(context, term, lifted170);
          if(term == null)
            break Fail151;
          term = y_27;
          lifted18 lifted180 = new lifted18();
          lifted180.z_27 = z_27;
          lifted180.a_28 = a_28;
          lifted180.b_28 = b_28;
          lifted180.c_28 = c_28;
          term = map_1_0.instance.invoke(context, term, lifted180);
          if(term == null)
            break Fail151;
          if(true)
            break Success110;
        }
        term = term113;
        IStrategoTerm l_29 = null;
        l_29 = term;
        term = report_with_failure_0_1.instance.invoke(context, l_29, cool.const99);
        if(term == null)
          break Fail150;
      }
      term = j_28;
      w_29 = term;
      if(o_27 == null)
        break Fail150;
      term = add_condition_fields_0_1.instance.invoke(context, o_27, k_27.value);
      if(term == null)
        break Fail150;
      o_29 = term;
      x_29 = w_29;
      term = add_coordinator_fields_0_1.instance.invoke(context, w_27, k_27.value);
      if(term == null)
        break Fail150;
      p_29 = term;
      term = x_29;
      y_29 = x_29;
      if(v_27 == null)
        break Fail150;
      term = v_27;
      lifted19 lifted190 = new lifted19();
      lifted190.c_28 = c_28;
      term = map_1_0.instance.invoke(context, term, lifted190);
      if(term == null)
        break Fail150;
      q_29 = term;
      term = y_29;
      z_29 = y_29;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail150;
      r_29 = term;
      term = z_29;
      a_30 = z_29;
      if(z_27.value == null)
        break Fail150;
      term = hashtable_keys_0_0.instance.invoke(context, z_27.value);
      if(term == null)
        break Fail150;
      lifted20 lifted200 = new lifted20();
      lifted200.k_27 = k_27;
      lifted200.z_27 = z_27;
      lifted200.l_27 = l_27;
      lifted200.c_28 = c_28;
      term = map_1_0.instance.invoke(context, term, lifted200);
      if(term == null)
        break Fail150;
      s_29 = term;
      term = a_30;
      b_30 = a_30;
      if(b_28.value == null)
        break Fail150;
      term = hashtable_keys_0_0.instance.invoke(context, b_28.value);
      if(term == null)
        break Fail150;
      lifted21 lifted210 = new lifted21();
      lifted210.k_27 = k_27;
      lifted210.b_28 = b_28;
      lifted210.n_27 = n_27;
      lifted210.c_28 = c_28;
      term = map_1_0.instance.invoke(context, term, lifted210);
      if(term == null)
        break Fail150;
      t_29 = term;
      term = b_30;
      c_30 = b_30;
      if(a_28.value == null)
        break Fail150;
      term = hashtable_keys_0_0.instance.invoke(context, a_28.value);
      if(term == null)
        break Fail150;
      lifted22 lifted220 = new lifted22();
      lifted220.k_27 = k_27;
      lifted220.a_28 = a_28;
      lifted220.m_27 = m_27;
      lifted220.c_28 = c_28;
      term = map_1_0.instance.invoke(context, term, lifted220);
      if(term == null)
        break Fail150;
      u_29 = term;
      term = c_30;
      if(v_27 == null)
        break Fail150;
      term = v_27;
      lifted23 lifted230 = new lifted23();
      lifted230.k_27 = k_27;
      lifted230.m_27 = m_27;
      lifted230.l_27 = l_27;
      lifted230.n_27 = n_27;
      lifted230.t_27 = t_27;
      lifted230.u_27 = u_27;
      lifted230.c_28 = c_28;
      lifted230.p_27 = p_27;
      lifted230.q_27 = q_27;
      lifted230.x_27 = x_27;
      term = map_1_0.instance.invoke(context, term, lifted230);
      if(term == null)
        break Fail150;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail150;
      term = termFactory.makeTuple(o_29, p_29, q_29, (IStrategoTerm)termFactory.makeListCons(r_29, (IStrategoList)cool.constNil0), s_29, t_29, u_29, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail150;
      term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}