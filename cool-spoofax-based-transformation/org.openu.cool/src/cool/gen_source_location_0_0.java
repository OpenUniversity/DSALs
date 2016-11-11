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

@SuppressWarnings("all") public class gen_source_location_0_0 extends Strategy 
{ 
  public static gen_source_location_0_0 instance = new gen_source_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_source_location_0_0");
    Fail120:
    { 
      IStrategoTerm g_18 = null;
      IStrategoTerm h_18 = null;
      g_18 = term;
      term = origin_location_0_0.instance.invoke(context, g_18);
      if(term == null)
        break Fail120;
      h_18 = term;
      term = origin_file_0_0.instance.invoke(context, g_18);
      if(term == null)
        break Fail120;
      term = (IStrategoTerm)termFactory.makeListCons(h_18, termFactory.makeListCons(term, (IStrategoList)cool.constNil0));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}