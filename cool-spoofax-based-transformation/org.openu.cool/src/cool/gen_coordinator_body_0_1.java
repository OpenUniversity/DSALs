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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_y_23)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference y_23 = new TermReference(ref_y_23);
    context.push("gen_coordinator_body_0_1");
    Fail144:
    { 
      TermReference z_23 = new TermReference();
      TermReference a_24 = new TermReference();
      TermReference b_24 = new TermReference();
      IStrategoTerm c_24 = null;
      TermReference d_24 = new TermReference();
      TermReference e_24 = new TermReference();
      IStrategoTerm f_24 = null;
      IStrategoTerm g_24 = null;
      TermReference h_24 = new TermReference();
      TermReference i_24 = new TermReference();
      IStrategoTerm j_24 = null;
      IStrategoTerm k_24 = null;
      TermReference l_24 = new TermReference();
      IStrategoTerm m_24 = null;
      TermReference n_24 = new TermReference();
      TermReference o_24 = new TermReference();
      TermReference p_24 = new TermReference();
      TermReference q_24 = new TermReference();
      IStrategoTerm x_24 = null;
      IStrategoTerm c_26 = null;
      IStrategoTerm k_26 = null;
      IStrategoTerm d_26 = null;
      IStrategoTerm l_26 = null;
      IStrategoTerm e_26 = null;
      IStrategoTerm m_26 = null;
      IStrategoTerm f_26 = null;
      IStrategoTerm n_26 = null;
      IStrategoTerm g_26 = null;
      IStrategoTerm o_26 = null;
      IStrategoTerm h_26 = null;
      IStrategoTerm p_26 = null;
      IStrategoTerm i_26 = null;
      IStrategoTerm q_26 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
        break Fail144;
      k_24 = term.getSubterm(0);
      x_24 = term;
      IStrategoTerm term113 = term;
      Success110:
      { 
        Fail145:
        { 
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(n_24.value == null)
            n_24.value = term;
          else
            if(n_24.value != term && !n_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(o_24.value == null)
            o_24.value = term;
          else
            if(o_24.value != term && !o_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(p_24.value == null)
            p_24.value = term;
          else
            if(p_24.value != term && !p_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(z_23.value == null)
            z_23.value = term;
          else
            if(z_23.value != term && !z_23.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(a_24.value == null)
            a_24.value = term;
          else
            if(a_24.value != term && !a_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(b_24.value == null)
            b_24.value = term;
          else
            if(b_24.value != term && !b_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(q_24.value == null)
            q_24.value = term;
          else
            if(q_24.value != term && !q_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(l_24.value == null)
            l_24.value = term;
          else
            if(l_24.value != term && !l_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(d_24.value == null)
            d_24.value = term;
          else
            if(d_24.value != term && !d_24.value.match(term))
              break Fail145;
          term = new_hashtable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          if(e_24.value == null)
            e_24.value = term;
          else
            if(e_24.value != term && !e_24.value.match(term))
              break Fail145;
          term = getfirst_1_0.instance.invoke(context, k_24, lifted8.instance);
          if(term == null)
            break Fail145;
          c_24 = term;
          term = getfirst_1_0.instance.invoke(context, k_24, lifted9.instance);
          if(term == null)
            break Fail145;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          f_24 = term;
          term = getfirst_1_0.instance.invoke(context, k_24, lifted10.instance);
          if(term == null)
            break Fail145;
          term = get_methods_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          g_24 = term;
          term = f_24;
          lifted11 lifted110 = new lifted11();
          lifted110.d_24 = d_24;
          term = map_1_0.instance.invoke(context, term, lifted110);
          if(term == null)
            break Fail145;
          term = g_24;
          lifted12 lifted120 = new lifted12();
          lifted120.e_24 = e_24;
          term = map_1_0.instance.invoke(context, term, lifted120);
          if(term == null)
            break Fail145;
          term = map_1_0.instance.invoke(context, f_24, lifted13.instance);
          if(term == null)
            break Fail145;
          if(h_24.value == null)
            h_24.value = term;
          else
            if(h_24.value != term && !h_24.value.match(term))
              break Fail145;
          term = map_1_0.instance.invoke(context, g_24, lifted14.instance);
          if(term == null)
            break Fail145;
          if(i_24.value == null)
            i_24.value = term;
          else
            if(i_24.value != term && !i_24.value.match(term))
              break Fail145;
          if(h_24.value == null || i_24.value == null)
            break Fail145;
          term = termFactory.makeTuple(h_24.value, i_24.value);
          term = union_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail145;
          j_24 = term;
          lifted15 lifted150 = new lifted15();
          lifted150.q_24 = q_24;
          term = map_1_0.instance.invoke(context, term, lifted150);
          if(term == null)
            break Fail145;
          term = retain_all_1_0.instance.invoke(context, k_24, lifted16.instance);
          if(term == null)
            break Fail145;
          m_24 = term;
          lifted17 lifted170 = new lifted17();
          lifted170.l_24 = l_24;
          term = map_1_0.instance.invoke(context, term, lifted170);
          if(term == null)
            break Fail145;
          term = m_24;
          lifted18 lifted180 = new lifted18();
          lifted180.n_24 = n_24;
          lifted180.o_24 = o_24;
          lifted180.p_24 = p_24;
          lifted180.q_24 = q_24;
          term = map_1_0.instance.invoke(context, term, lifted180);
          if(term == null)
            break Fail145;
          if(true)
            break Success110;
        }
        term = term113;
        IStrategoTerm z_25 = null;
        z_25 = term;
        term = report_with_failure_0_1.instance.invoke(context, z_25, cool.const96);
        if(term == null)
          break Fail144;
      }
      term = x_24;
      k_26 = term;
      if(c_24 == null)
        break Fail144;
      term = add_condition_fields_0_1.instance.invoke(context, c_24, y_23.value);
      if(term == null)
        break Fail144;
      c_26 = term;
      l_26 = k_26;
      term = add_coordinator_fields_0_1.instance.invoke(context, k_24, y_23.value);
      if(term == null)
        break Fail144;
      d_26 = term;
      term = l_26;
      m_26 = l_26;
      if(j_24 == null)
        break Fail144;
      term = j_24;
      lifted19 lifted190 = new lifted19();
      lifted190.q_24 = q_24;
      term = map_1_0.instance.invoke(context, term, lifted190);
      if(term == null)
        break Fail144;
      e_26 = term;
      term = m_26;
      n_26 = m_26;
      term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail144;
      f_26 = term;
      term = n_26;
      o_26 = n_26;
      if(n_24.value == null)
        break Fail144;
      term = hashtable_keys_0_0.instance.invoke(context, n_24.value);
      if(term == null)
        break Fail144;
      lifted20 lifted200 = new lifted20();
      lifted200.y_23 = y_23;
      lifted200.n_24 = n_24;
      lifted200.z_23 = z_23;
      lifted200.q_24 = q_24;
      term = map_1_0.instance.invoke(context, term, lifted200);
      if(term == null)
        break Fail144;
      g_26 = term;
      term = o_26;
      p_26 = o_26;
      if(p_24.value == null)
        break Fail144;
      term = hashtable_keys_0_0.instance.invoke(context, p_24.value);
      if(term == null)
        break Fail144;
      lifted21 lifted210 = new lifted21();
      lifted210.y_23 = y_23;
      lifted210.p_24 = p_24;
      lifted210.b_24 = b_24;
      lifted210.q_24 = q_24;
      term = map_1_0.instance.invoke(context, term, lifted210);
      if(term == null)
        break Fail144;
      h_26 = term;
      term = p_26;
      q_26 = p_26;
      if(o_24.value == null)
        break Fail144;
      term = hashtable_keys_0_0.instance.invoke(context, o_24.value);
      if(term == null)
        break Fail144;
      lifted22 lifted220 = new lifted22();
      lifted220.y_23 = y_23;
      lifted220.o_24 = o_24;
      lifted220.a_24 = a_24;
      lifted220.q_24 = q_24;
      term = map_1_0.instance.invoke(context, term, lifted220);
      if(term == null)
        break Fail144;
      i_26 = term;
      term = q_26;
      if(j_24 == null)
        break Fail144;
      term = j_24;
      lifted23 lifted230 = new lifted23();
      lifted230.y_23 = y_23;
      lifted230.a_24 = a_24;
      lifted230.z_23 = z_23;
      lifted230.b_24 = b_24;
      lifted230.h_24 = h_24;
      lifted230.i_24 = i_24;
      lifted230.q_24 = q_24;
      lifted230.d_24 = d_24;
      lifted230.e_24 = e_24;
      lifted230.l_24 = l_24;
      term = map_1_0.instance.invoke(context, term, lifted230);
      if(term == null)
        break Fail144;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail144;
      term = termFactory.makeTuple(c_26, d_26, e_26, (IStrategoTerm)termFactory.makeListCons(f_26, (IStrategoList)cool.constNil0), g_26, h_26, i_26, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail144;
      term = termFactory.makeAppl(transform._consAspectBody_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}