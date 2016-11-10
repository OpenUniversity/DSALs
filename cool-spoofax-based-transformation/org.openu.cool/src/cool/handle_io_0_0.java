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

@SuppressWarnings("all") public class handle_io_0_0 extends Strategy 
{ 
  public static handle_io_0_0 instance = new handle_io_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_io_0_0");
    Fail116:
    { 
      IStrategoTerm c_19 = null;
      IStrategoTerm d_19 = null;
      IStrategoTerm f_19 = null;
      IStrategoTerm k_19 = null;
      IStrategoTerm l_19 = null;
      IStrategoTerm n_19 = null;
      IStrategoTerm s_19 = null;
      IStrategoTerm p_19 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail116;
      c_19 = ((IStrategoList)term).tail();
      term = debug_0_0.instance.invoke(context, cool.const69);
      if(term == null)
        break Fail116;
      term = debug_0_0.instance.invoke(context, c_19);
      if(term == null)
        break Fail116;
      term = c_19;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail116;
      n_19 = ((IStrategoList)term).head();
      term = n_19;
      f_19 = n_19;
      term = $Read$From$File_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      d_19 = term;
      term = c_19;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail116;
      s_19 = ((IStrategoList)term).tail();
      term = s_19;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail116;
      p_19 = ((IStrategoList)term).head();
      k_19 = p_19;
      term = transform_0_0.instance.invoke(context, d_19);
      if(term == null)
        break Fail116;
      l_19 = term;
      term = dirname_0_0.instance.invoke(context, f_19);
      if(term == null)
        break Fail116;
      term = base_filename_0_0.instance.invoke(context, f_19);
      if(term == null)
        break Fail116;
      term = remove_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constCons18);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      term = termFactory.makeTuple(term, cool.const71);
      term = add_extension_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      term = termFactory.makeTuple(k_19, cool.const72);
      term = fopen_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      term = termFactory.makeTuple(l_19, term);
      term = fputs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      term = fclose_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail116;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}