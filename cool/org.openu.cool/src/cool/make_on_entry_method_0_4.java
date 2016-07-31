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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_24, IStrategoTerm a_25, IStrategoTerm b_25, IStrategoTerm c_25)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail141:
    { 
      IStrategoTerm f_25 = null;
      IStrategoTerm g_25 = null;
      IStrategoTerm h_25 = null;
      IStrategoTerm k_25 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail141;
      IStrategoTerm arg48 = term.getSubterm(0);
      if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
        break Fail141;
      h_25 = term;
      g_25 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, h_25, c_25);
      if(term == null)
        break Fail141;
      f_25 = term;
      k_25 = b_25;
      term = strip_annos_0_0.instance.invoke(context, g_25);
      if(term == null)
        break Fail141;
      term = hashtable_put_0_2.instance.invoke(context, k_25, term, f_25);
      if(term == null)
        break Fail141;
      term = hashtable_get_0_1.instance.invoke(context, a_25, g_25);
      if(term == null)
        break Fail141;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons31, cool.constNone0, cool.constVoid0, z_24, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_25}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}