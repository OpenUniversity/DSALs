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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_26)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_26 = new TermReference(ref_c_26);
    context.push("gen_coordinator_body_0_1");
    Fail143:
    { 
      TermReference d_26 = new TermReference();
      TermReference e_26 = new TermReference();
      TermReference f_26 = new TermReference();
      IStrategoTerm g_26 = null;
      TermReference h_26 = new TermReference();
      TermReference i_26 = new TermReference();
      IStrategoTerm j_26 = null;
      IStrategoTerm k_26 = null;
      TermReference l_26 = new TermReference();
      TermReference m_26 = new TermReference();
      IStrategoTerm n_26 = null;
      IStrategoTerm o_26 = null;
      TermReference p_26 = new TermReference();
      IStrategoTerm q_26 = null;
      TermReference r_26 = new TermReference();
      TermReference s_26 = new TermReference();
      TermReference t_26 = new TermReference();
      TermReference u_26 = new TermReference();
      IStrategoTerm b_27 = null;
      IStrategoTerm g_28 = null;
      IStrategoTerm o_28 = null;
      IStrategoTerm h_28 = null;
      IStrategoTerm p_28 = null;
      IStrategoTerm i_28 = null;
      IStrategoTerm q_28 = null;
      IStrategoTerm j_28 = null;
      IStrategoTerm r_28 = null;
      IStrategoTerm k_28 = null;
      IStrategoTerm s_28 = null;
      IStrategoTerm l_28 = null;
      IStrategoTerm t_28 = null;
      IStrategoTerm m_28 = null;
      IStrategoTerm u_28 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      o_26 = term.getSubterm(0);
      b_27 = term;
      IStrategoTerm term113 = term;
      Success110:
      { 
        Fail144:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(r_26.value == null)
            r_26.value = term;
          else
            if(r_26.value != term && !r_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(s_26.value == null)
            s_26.value = term;
          else
            if(s_26.value != term && !s_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(t_26.value == null)
            t_26.value = term;
          else
            if(t_26.value != term && !t_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(d_26.value == null)
            d_26.value = term;
          else
            if(d_26.value != term && !d_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(e_26.value == null)
            e_26.value = term;
          else
            if(e_26.value != term && !e_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(f_26.value == null)
            f_26.value = term;
          else
            if(f_26.value != term && !f_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(u_26.value == null)
            u_26.value = term;
          else
            if(u_26.value != term && !u_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(p_26.value == null)
            p_26.value = term;
          else
            if(p_26.value != term && !p_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(h_26.value == null)
            h_26.value = term;
          else
            if(h_26.value != term && !h_26.value.match(term))
              break Fail144;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          if(i_26.value == null)
            i_26.value = term;
          else
            if(i_26.value != term && !i_26.value.match(term))
              break Fail144;
          term = getfirst_1_0.instance.invoke(context, o_26, lifted8.instance);
          if(term == null)
            break Fail144;
          g_26 = term;
          term = getfirst_1_0.instance.invoke(context, o_26, lifted9.instance);
          if(term == null)
            break Fail144;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          j_26 = term;
          term = getfirst_1_0.instance.invoke(context, o_26, lifted10.instance);
          if(term == null)
            break Fail144;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          k_26 = term;
          term = j_26;
          lifted11 lifted110 = new lifted11();
          lifted110.h_26 = h_26;
          term = map_1_0.instance.invoke(context, term, lifted110);
          if(term == null)
            break Fail144;
          term = k_26;
          lifted12 lifted120 = new lifted12();
          lifted120.i_26 = i_26;
          term = map_1_0.instance.invoke(context, term, lifted120);
          if(term == null)
            break Fail144;
          term = map_1_0.instance.invoke(context, j_26, lifted13.instance);
          if(term == null)
            break Fail144;
          if(l_26.value == null)
            l_26.value = term;
          else
            if(l_26.value != term && !l_26.value.match(term))
              break Fail144;
          term = map_1_0.instance.invoke(context, k_26, lifted14.instance);
          if(term == null)
            break Fail144;
          if(m_26.value == null)
            m_26.value = term;
          else
            if(m_26.value != term && !m_26.value.match(term))
              break Fail144;
          if(l_26.value == null || m_26.value == null)
            break Fail144;
          term = termFactory.makeTuple(l_26.value, m_26.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail144;
          n_26 = term;
          lifted15 lifted150 = new lifted15();
          lifted150.u_26 = u_26;
          term = map_1_0.instance.invoke(context, term, lifted150);
          if(term == null)
            break Fail144;
          term = retain_all_1_0.instance.invoke(context, o_26, lifted16.instance);
          if(term == null)
            break Fail144;
          q_26 = term;
          lifted17 lifted170 = new lifted17();
          lifted170.p_26 = p_26;
          term = map_1_0.instance.invoke(context, term, lifted170);
          if(term == null)
            break Fail144;
          term = q_26;
          lifted18 lifted180 = new lifted18();
          lifted180.r_26 = r_26;
          lifted180.s_26 = s_26;
          lifted180.t_26 = t_26;
          lifted180.u_26 = u_26;
          term = map_1_0.instance.invoke(context, term, lifted180);
          if(term == null)
            break Fail144;
          if(true)
            break Success110;
        }
        term = term113;
        IStrategoTerm d_28 = null;
        d_28 = term;
        term = report_with_failure_0_1.instance.invoke(context, d_28, cool.const98);
        if(term == null)
          break Fail143;
      }
      term = b_27;
      o_28 = term;
      if(g_26 == null)
        break Fail143;
      term = add_condition_fields_0_1.instance.invoke(context, g_26, c_26.value);
      if(term == null)
        break Fail143;
      g_28 = term;
      p_28 = o_28;
      term = add_coordinator_fields_0_1.instance.invoke(context, o_26, c_26.value);
      if(term == null)
        break Fail143;
      h_28 = term;
      term = p_28;
      q_28 = p_28;
      if(n_26 == null)
        break Fail143;
      term = n_26;
      lifted19 lifted190 = new lifted19();
      lifted190.u_26 = u_26;
      term = map_1_0.instance.invoke(context, term, lifted190);
      if(term == null)
        break Fail143;
      i_28 = term;
      term = q_28;
      r_28 = q_28;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail143;
      j_28 = term;
      term = r_28;
      s_28 = r_28;
      if(r_26.value == null)
        break Fail143;
      term = hashtable_keys_0_0.instance.invoke(context, r_26.value);
      if(term == null)
        break Fail143;
      lifted20 lifted200 = new lifted20();
      lifted200.c_26 = c_26;
      lifted200.r_26 = r_26;
      lifted200.d_26 = d_26;
      lifted200.u_26 = u_26;
      term = map_1_0.instance.invoke(context, term, lifted200);
      if(term == null)
        break Fail143;
      k_28 = term;
      term = s_28;
      t_28 = s_28;
      if(t_26.value == null)
        break Fail143;
      term = hashtable_keys_0_0.instance.invoke(context, t_26.value);
      if(term == null)
        break Fail143;
      lifted21 lifted210 = new lifted21();
      lifted210.c_26 = c_26;
      lifted210.t_26 = t_26;
      lifted210.f_26 = f_26;
      lifted210.u_26 = u_26;
      term = map_1_0.instance.invoke(context, term, lifted210);
      if(term == null)
        break Fail143;
      l_28 = term;
      term = t_28;
      u_28 = t_28;
      if(s_26.value == null)
        break Fail143;
      term = hashtable_keys_0_0.instance.invoke(context, s_26.value);
      if(term == null)
        break Fail143;
      lifted22 lifted220 = new lifted22();
      lifted220.c_26 = c_26;
      lifted220.s_26 = s_26;
      lifted220.e_26 = e_26;
      lifted220.u_26 = u_26;
      term = map_1_0.instance.invoke(context, term, lifted220);
      if(term == null)
        break Fail143;
      m_28 = term;
      term = u_28;
      if(n_26 == null)
        break Fail143;
      term = n_26;
      lifted23 lifted230 = new lifted23();
      lifted230.c_26 = c_26;
      lifted230.e_26 = e_26;
      lifted230.d_26 = d_26;
      lifted230.f_26 = f_26;
      lifted230.l_26 = l_26;
      lifted230.m_26 = m_26;
      lifted230.u_26 = u_26;
      lifted230.h_26 = h_26;
      lifted230.i_26 = i_26;
      lifted230.p_26 = p_26;
      term = map_1_0.instance.invoke(context, term, lifted230);
      if(term == null)
        break Fail143;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail143;
      term = termFactory.makeTuple(g_28, h_28, i_28, (IStrategoTerm)termFactory.makeListCons(j_28, (IStrategoList)cool.constNil0), k_28, l_28, m_28, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail143;
      term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}