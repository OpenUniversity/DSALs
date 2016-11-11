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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_24, IStrategoTerm g_24, IStrategoTerm h_24, IStrategoTerm i_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail135:
    { 
      IStrategoTerm l_24 = null;
      IStrategoTerm m_24 = null;
      IStrategoTerm n_24 = null;
      IStrategoTerm q_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail135;
      IStrategoTerm arg31 = term.getSubterm(0);
      if(arg31.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg31).getConstructor())
        break Fail135;
      n_24 = term;
      m_24 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, n_24, i_24);
      if(term == null)
        break Fail135;
      l_24 = term;
      q_24 = h_24;
      term = strip_annos_0_0.instance.invoke(context, m_24);
      if(term == null)
        break Fail135;
      term = hashtable_put_0_2.instance.invoke(context, q_24, term, l_24);
      if(term == null)
        break Fail135;
      term = hashtable_get_0_1.instance.invoke(context, g_24, m_24);
      if(term == null)
        break Fail135;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons34, cool.constNone0, cool.constVoid0, f_24, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_24}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}