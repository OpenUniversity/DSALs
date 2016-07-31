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

@SuppressWarnings("all") public class convert_0_0 extends Strategy 
{ 
  public static convert_0_0 instance = new convert_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("convert_0_0");
    Fail143:
    { 
      IStrategoTerm b_26 = null;
      IStrategoTerm c_26 = null;
      IStrategoTerm d_26 = null;
      IStrategoTerm e_26 = null;
      IStrategoTerm f_26 = null;
      IStrategoTerm g_26 = null;
      IStrategoTerm h_26 = null;
      IStrategoTerm i_26 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail143;
      d_26 = term.getSubterm(0);
      e_26 = term.getSubterm(1);
      c_26 = term.getSubterm(2);
      i_26 = term;
      Success108:
      { 
        Fail144:
        { 
          IStrategoTerm j_26 = null;
          j_26 = term;
          term = get_coordinator_0_1.instance.invoke(context, i_26, c_26);
          if(term == null)
            break Fail144;
          b_26 = term;
          term = j_26;
          { 
            IStrategoTerm m_26 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, b_26);
            if(term == null)
              break Fail143;
            f_26 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, b_26, term);
            if(term == null)
              break Fail143;
            g_26 = term;
            term = remove_all_1_0.instance.invoke(context, c_26, lifted6.instance);
            if(term == null)
              break Fail143;
            h_26 = term;
            term = generate_imports_0_2.instance.invoke(context, term, e_26, f_26);
            if(term == null)
              break Fail143;
            m_26 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(g_26, (IStrategoList)cool.constNil0), h_26);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail143;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{d_26, m_26, term});
            if(true)
              break Success108;
          }
        }
        term = i_26;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}