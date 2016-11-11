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

@SuppressWarnings("all") public class make_lock_and_unlock_methods_0_10 extends Strategy 
{ 
  public static make_lock_and_unlock_methods_0_10 instance = new make_lock_and_unlock_methods_0_10();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm u_26, IStrategoTerm v_26, IStrategoTerm w_26, IStrategoTerm x_26, IStrategoTerm y_26, IStrategoTerm z_26, IStrategoTerm a_27, IStrategoTerm b_27, IStrategoTerm c_27, IStrategoTerm d_27)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail146:
    { 
      IStrategoTerm f_27 = null;
      IStrategoTerm g_27 = null;
      IStrategoTerm l_27 = null;
      IStrategoTerm n_27 = null;
      g_27 = term;
      IStrategoTerm term114 = term;
      Success111:
      { 
        Fail147:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail147;
          f_27 = term;
          if(true)
            break Success111;
        }
        term = term114;
        IStrategoTerm k_27 = null;
        k_27 = term;
        term = report_with_failure_0_1.instance.invoke(context, k_27, cool.const97);
        if(term == null)
          break Fail146;
      }
      term = g_27;
      n_27 = g_27;
      if(f_27 == null)
        break Fail146;
      term = make_lock_method_0_9.instance.invokeDynamic(context, f_27, NO_STRATEGIES, new IStrategoTerm[]{u_26, w_26, x_26, y_26, z_26, a_27, b_27, c_27, d_27});
      if(term == null)
        break Fail146;
      l_27 = term;
      term = n_27;
      if(f_27 == null)
        break Fail146;
      term = make_unlock_method_0_3.instance.invoke(context, f_27, u_26, v_26, a_27);
      if(term == null)
        break Fail146;
      term = (IStrategoTerm)termFactory.makeListCons(l_27, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 0 || targs.length != 10)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8], targs[9]);
  }
}