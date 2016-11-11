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

@SuppressWarnings("all") public class gen_requires_method_name_0_1 extends Strategy 
{ 
  public static gen_requires_method_name_0_1 instance = new gen_requires_method_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_19)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_requires_method_name_0_1");
    Fail126:
    { 
      IStrategoTerm i_19 = null;
      IStrategoTerm j_19 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail126;
      IStrategoTerm arg22 = term.getSubterm(0);
      if(arg22.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg22).getConstructor())
        break Fail126;
      i_19 = arg22.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail126;
      j_19 = term;
      term = hashtable_get_0_1.instance.invoke(context, h_19, j_19);
      if(term == null)
        break Fail126;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail126;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const82, termFactory.makeListCons(i_19, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail126;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}