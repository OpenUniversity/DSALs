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

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  public static final lifted16 instance = new lifted16();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail195:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail195;
      if(true)
        return term;
    }
    return null;
  }
}