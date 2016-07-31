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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_23, IStrategoTerm e_23, IStrategoTerm f_23, IStrategoTerm g_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_requires_method_0_4");
    Fail133:
    { 
      IStrategoTerm j_23 = null;
      IStrategoTerm k_23 = null;
      IStrategoTerm l_23 = null;
      IStrategoTerm o_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail133;
      IStrategoTerm arg29 = term.getSubterm(0);
      if(arg29.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg29).getConstructor())
        break Fail133;
      l_23 = term;
      k_23 = term;
      term = gen_requires_method_name_0_1.instance.invoke(context, l_23, g_23);
      if(term == null)
        break Fail133;
      j_23 = term;
      o_23 = f_23;
      term = strip_annos_0_0.instance.invoke(context, k_23);
      if(term == null)
        break Fail133;
      term = hashtable_put_0_2.instance.invoke(context, o_23, term, j_23);
      if(term == null)
        break Fail133;
      term = hashtable_get_0_1.instance.invoke(context, e_23, k_23);
      if(term == null)
        break Fail133;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons31, cool.constNone0, cool.constBoolean0, d_23, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{j_23}), cool.constNil0, cool.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)cool.constNil0)})});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}