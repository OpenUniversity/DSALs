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

@SuppressWarnings("all") public class make_on_entry_method_0_4 extends Strategy 
{ 
  public static make_on_entry_method_0_4 instance = new make_on_entry_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_21, IStrategoTerm o_21, IStrategoTerm p_21, IStrategoTerm q_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail135:
    { 
      IStrategoTerm t_21 = null;
      IStrategoTerm u_21 = null;
      IStrategoTerm v_21 = null;
      IStrategoTerm y_21 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      IStrategoTerm arg30 = term.getSubterm(0);
      if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
        break Fail135;
      v_21 = term;
      u_21 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, v_21, q_21);
      if(term == null)
        break Fail135;
      t_21 = term;
      y_21 = p_21;
      term = strip_annos_0_0.instance.invoke(context, u_21);
      if(term == null)
        break Fail135;
      term = hashtable_put_0_2.instance.invoke(context, y_21, term, t_21);
      if(term == null)
        break Fail135;
      term = hashtable_get_0_1.instance.invoke(context, o_21, u_21);
      if(term == null)
        break Fail135;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons34, cool.constNone0, cool.constVoid0, n_21, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{t_21}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}