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

@SuppressWarnings("all") public class gen_method_state_name_0_1 extends Strategy 
{ 
  public static gen_method_state_name_0_1 instance = new gen_method_state_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_method_state_name_0_1");
    Fail125:
    { 
      IStrategoTerm b_19 = null;
      IStrategoTerm c_19 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      IStrategoTerm arg20 = term.getSubterm(0);
      if(arg20.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg20).getConstructor())
        break Fail125;
      b_19 = arg20.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail125;
      c_19 = term;
      term = hashtable_get_0_1.instance.invoke(context, a_19, c_19);
      if(term == null)
        break Fail125;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail125;
      term = (IStrategoTerm)termFactory.makeListCons(b_19, termFactory.makeListCons(term, (IStrategoList)cool.constCons27));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail125;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}