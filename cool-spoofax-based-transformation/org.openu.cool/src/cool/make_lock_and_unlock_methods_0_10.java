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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_30, IStrategoTerm h_30, IStrategoTerm i_30, IStrategoTerm j_30, IStrategoTerm k_30, IStrategoTerm l_30, IStrategoTerm m_30, IStrategoTerm n_30, IStrategoTerm o_30, IStrategoTerm p_30)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail152:
    { 
      IStrategoTerm r_30 = null;
      IStrategoTerm s_30 = null;
      IStrategoTerm x_30 = null;
      IStrategoTerm z_30 = null;
      s_30 = term;
      IStrategoTerm term114 = term;
      Success111:
      { 
        Fail153:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail153;
          r_30 = term;
          if(true)
            break Success111;
        }
        term = term114;
        IStrategoTerm w_30 = null;
        w_30 = term;
        term = report_with_failure_0_1.instance.invoke(context, w_30, cool.const100);
        if(term == null)
          break Fail152;
      }
      term = s_30;
      z_30 = s_30;
      if(r_30 == null)
        break Fail152;
      term = make_lock_method_0_9.instance.invokeDynamic(context, r_30, NO_STRATEGIES, new IStrategoTerm[]{g_30, i_30, j_30, k_30, l_30, m_30, n_30, o_30, p_30});
      if(term == null)
        break Fail152;
      x_30 = term;
      term = z_30;
      if(r_30 == null)
        break Fail152;
      term = make_unlock_method_0_3.instance.invoke(context, r_30, g_30, h_30, m_30);
      if(term == null)
        break Fail152;
      term = (IStrategoTerm)termFactory.makeListCons(x_30, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
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