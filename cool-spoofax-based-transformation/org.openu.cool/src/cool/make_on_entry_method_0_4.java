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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_23, IStrategoTerm s_23, IStrategoTerm t_23, IStrategoTerm u_23)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("make_on_entry_method_0_4");
    Fail134:
    { 
      IStrategoTerm x_23 = null;
      IStrategoTerm y_23 = null;
      IStrategoTerm z_23 = null;
      IStrategoTerm c_24 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail134;
      IStrategoTerm arg30 = term.getSubterm(0);
      if(arg30.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg30).getConstructor())
        break Fail134;
      z_23 = term;
      y_23 = term;
      term = gen_on_entry_method_name_0_1.instance.invoke(context, z_23, u_23);
      if(term == null)
        break Fail134;
      x_23 = term;
      c_24 = t_23;
      term = strip_annos_0_0.instance.invoke(context, y_23);
      if(term == null)
        break Fail134;
      term = hashtable_put_0_2.instance.invoke(context, c_24, term, x_23);
      if(term == null)
        break Fail134;
      term = hashtable_get_0_1.instance.invoke(context, s_23, y_23);
      if(term == null)
        break Fail134;
      term = termFactory.makeAppl(transform._consIntertypeMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consIntertypeMethodDecHead_8, new IStrategoTerm[]{cool.constCons34, cool.constNone0, cool.constVoid0, r_23, cool.constNone0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{x_23}), cool.constNil0, cool.constNone0}), term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}