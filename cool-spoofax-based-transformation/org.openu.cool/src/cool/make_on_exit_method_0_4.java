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

@SuppressWarnings("all") public class make_on_exit_method_0_4 extends Strategy 
{ 
  public static make_on_exit_method_0_4 instance = new make_on_exit_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_25, IStrategoTerm o_25, IStrategoTerm p_25, IStrategoTerm q_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail142:
    { 
      IStrategoTerm t_25 = null;
      IStrategoTerm u_25 = null;
      IStrategoTerm v_25 = null;
      IStrategoTerm y_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail142;
      IStrategoTerm arg49 = term.getSubterm(0);
      if(arg49.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg49).getConstructor())
        break Fail142;
      v_25 = term;
      u_25 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, v_25, q_25);
      if(term == null)
        break Fail142;
      t_25 = term;
      y_25 = p_25;
      term = strip_annos_0_0.instance.invoke(context, u_25);
      if(term == null)
        break Fail142;
      term = hashtable_put_0_2.instance.invoke(context, y_25, term, t_25);
      if(term == null)
        break Fail142;
      term = hashtable_get_0_1.instance.invoke(context, o_25, u_25);
      if(term == null)
        break Fail142;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons31, cool.constNone0, cool.constVoid0, n_25, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_25}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}