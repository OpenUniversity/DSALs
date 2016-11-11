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
    Fail137:
    { 
      IStrategoTerm p_22 = null;
      IStrategoTerm q_22 = null;
      IStrategoTerm r_22 = null;
      IStrategoTerm s_22 = null;
      IStrategoTerm t_22 = null;
      IStrategoTerm u_22 = null;
      IStrategoTerm v_22 = null;
      IStrategoTerm w_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail137;
      r_22 = term.getSubterm(0);
      s_22 = term.getSubterm(1);
      q_22 = term.getSubterm(2);
      w_22 = term;
      Success108:
      { 
        Fail138:
        { 
          IStrategoTerm x_22 = null;
          x_22 = term;
          term = get_coordinator_0_1.instance.invoke(context, w_22, q_22);
          if(term == null)
            break Fail138;
          p_22 = term;
          term = x_22;
          { 
            IStrategoTerm a_23 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, p_22);
            if(term == null)
              break Fail137;
            t_22 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, p_22, term);
            if(term == null)
              break Fail137;
            u_22 = term;
            term = remove_all_1_0.instance.invoke(context, q_22, lifted6.instance);
            if(term == null)
              break Fail137;
            v_22 = term;
            term = generate_imports_0_2.instance.invoke(context, term, s_22, t_22);
            if(term == null)
              break Fail137;
            a_23 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(u_22, (IStrategoList)cool.constNil0), v_22);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail137;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{r_22, a_23, term});
            if(true)
              break Success108;
          }
        }
        term = w_22;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}