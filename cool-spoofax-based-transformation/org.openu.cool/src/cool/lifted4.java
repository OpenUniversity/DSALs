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

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  public static final lifted4 instance = new lifted4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail206:
    { 
      IStrategoTerm v_17 = null;
      v_17 = term;
      term = try_1_0.instance.invoke(context, term, gen_source_location_0_0.instance);
      if(term == null)
        break Fail206;
      term = termFactory.annotateTerm(v_17, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)cool.constNil0)));
      if(true)
        return term;
    }
    return null;
  }
}