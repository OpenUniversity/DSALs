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
    Fail136:
    { 
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      IStrategoTerm w_24 = null;
      IStrategoTerm x_24 = null;
      IStrategoTerm y_24 = null;
      IStrategoTerm z_24 = null;
      IStrategoTerm a_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      v_24 = term.getSubterm(0);
      w_24 = term.getSubterm(1);
      u_24 = term.getSubterm(2);
      a_25 = term;
      Success108:
      { 
        Fail137:
        { 
          IStrategoTerm b_25 = null;
          b_25 = term;
          term = get_coordinator_0_1.instance.invoke(context, a_25, u_24);
          if(term == null)
            break Fail137;
          t_24 = term;
          term = b_25;
          { 
            IStrategoTerm e_25 = null;
            term = fetch_coordinator_type_0_0.instance.invoke(context, t_24);
            if(term == null)
              break Fail136;
            x_24 = term;
            term = convert_coordinator_declaration_0_1.instance.invoke(context, t_24, term);
            if(term == null)
              break Fail136;
            y_24 = term;
            term = remove_all_1_0.instance.invoke(context, u_24, lifted6.instance);
            if(term == null)
              break Fail136;
            z_24 = term;
            term = generate_imports_0_2.instance.invoke(context, term, w_24, x_24);
            if(term == null)
              break Fail136;
            e_25 = term;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(y_24, (IStrategoList)cool.constNil0), z_24);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail136;
            term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{v_24, e_25, term});
            if(true)
              break Success108;
          }
        }
        term = a_25;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}