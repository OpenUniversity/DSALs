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

  public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_28, IStrategoTerm z_28, IStrategoTerm a_29, IStrategoTerm b_29, IStrategoTerm c_29, IStrategoTerm d_29, IStrategoTerm e_29, IStrategoTerm f_29, IStrategoTerm g_29, IStrategoTerm h_29)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_lock_and_unlock_methods_0_10");
    Fail145:
    { 
      IStrategoTerm j_29 = null;
      IStrategoTerm k_29 = null;
      IStrategoTerm p_29 = null;
      IStrategoTerm r_29 = null;
      k_29 = term;
      IStrategoTerm term114 = term;
      Success111:
      { 
        Fail146:
        { 
          term = strip_annos_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail146;
          j_29 = term;
          if(true)
            break Success111;
        }
        term = term114;
        IStrategoTerm o_29 = null;
        o_29 = term;
        term = report_with_failure_0_1.instance.invoke(context, o_29, cool.const99);
        if(term == null)
          break Fail145;
      }
      term = k_29;
      r_29 = k_29;
      if(j_29 == null)
        break Fail145;
      term = make_lock_method_0_9.instance.invokeDynamic(context, j_29, NO_STRATEGIES, new IStrategoTerm[]{y_28, a_29, b_29, c_29, d_29, e_29, f_29, g_29, h_29});
      if(term == null)
        break Fail145;
      p_29 = term;
      term = r_29;
      if(j_29 == null)
        break Fail145;
      term = make_unlock_method_0_3.instance.invoke(context, j_29, y_28, z_28, e_29);
      if(term == null)
        break Fail145;
      term = (IStrategoTerm)termFactory.makeListCons(p_29, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
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