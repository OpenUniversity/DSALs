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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_21)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_requires_method_name_0_1");
    Fail125:
    { 
      IStrategoTerm m_21 = null;
      IStrategoTerm n_21 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
        break Fail125;
      IStrategoTerm arg19 = term.getSubterm(0);
      if(arg19.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg19).getConstructor())
        break Fail125;
      m_21 = arg19.getSubterm(0);
      term = strip_annos_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail125;
      n_21 = term;
      term = hashtable_get_0_1.instance.invoke(context, l_21, n_21);
      if(term == null)
        break Fail125;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail125;
      term = (IStrategoTerm)termFactory.makeListCons(cool.const84, termFactory.makeListCons(m_21, termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
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