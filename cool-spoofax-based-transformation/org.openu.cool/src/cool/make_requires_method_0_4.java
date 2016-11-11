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

@SuppressWarnings("all") public class make_requires_method_0_4 extends Strategy 
{ 
  public static make_requires_method_0_4 instance = new make_requires_method_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_20, IStrategoTerm a_21, IStrategoTerm b_21, IStrategoTerm c_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_requires_method_0_4");
    Fail134:
    { 
      IStrategoTerm f_21 = null;
      IStrategoTerm g_21 = null;
      IStrategoTerm h_21 = null;
      IStrategoTerm k_21 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      IStrategoTerm arg29 = term.getSubterm(0);
      if(arg29.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg29).getConstructor())
        break Fail134;
      h_21 = term;
      g_21 = term;
      term = gen_requires_method_name_0_1.instance.invoke(context, h_21, c_21);
      if(term == null)
        break Fail134;
      f_21 = term;
      k_21 = b_21;
      term = strip_annos_0_0.instance.invoke(context, g_21);
      if(term == null)
        break Fail134;
      term = hashtable_put_0_2.instance.invoke(context, k_21, term, f_21);
      if(term == null)
        break Fail134;
      term = hashtable_get_0_1.instance.invoke(context, a_21, g_21);
      if(term == null)
        break Fail134;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons34, cool.constNone0, cool.constBoolean0, z_20, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{f_21}), cool.constNil0, cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}