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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_22, IStrategoTerm c_22, IStrategoTerm d_22, IStrategoTerm e_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_exit_method_0_4");
    Fail136:
    { 
      IStrategoTerm h_22 = null;
      IStrategoTerm i_22 = null;
      IStrategoTerm j_22 = null;
      IStrategoTerm m_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail136;
      IStrategoTerm arg31 = term.getSubterm(0);
      if(arg31.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg31).getConstructor())
        break Fail136;
      j_22 = term;
      i_22 = term;
      term = gen_on_exit_method_name_0_1.instance.invoke(context, j_22, e_22);
      if(term == null)
        break Fail136;
      h_22 = term;
      m_22 = d_22;
      term = strip_annos_0_0.instance.invoke(context, i_22);
      if(term == null)
        break Fail136;
      term = hashtable_put_0_2.instance.invoke(context, m_22, term, h_22);
      if(term == null)
        break Fail136;
      term = hashtable_get_0_1.instance.invoke(context, c_22, i_22);
      if(term == null)
        break Fail136;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons34, cool.constNone0, cool.constVoid0, b_22, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_22}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}