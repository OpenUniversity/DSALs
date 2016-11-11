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

@SuppressWarnings("all") public class gen_on_exit_method_name_0_1 extends Strategy 
{ 
  public static gen_on_exit_method_name_0_1 instance = new gen_on_exit_method_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_on_exit_method_name_0_1");
    Fail128:
    { 
      IStrategoTerm w_19 = null;
      IStrategoTerm x_19 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail128;
      IStrategoTerm arg26 = term.getSubterm(0);
      if(arg26.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg26).getConstructor())
        break Fail128;
      w_19 = arg26.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail128;
      x_19 = term;
      term = hashtable_get_0_1.instance.invoke(context, v_19, x_19);
      if(term == null)
        break Fail128;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail128;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const84, termFactory.makeListCons(w_19, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail128;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}