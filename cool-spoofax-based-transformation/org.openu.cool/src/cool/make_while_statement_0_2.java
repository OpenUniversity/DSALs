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

@SuppressWarnings("all") public class make_while_statement_0_2 extends Strategy 
{ 
  public static make_while_statement_0_2 instance = new make_while_statement_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_20, IStrategoTerm d_20)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail129:
    { 
      term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{c_20, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{d_20})});
      if(true)
        return term;
    }
    context.push("make_while_statement_0_2");
    context.popOnFailure();
    return null;
  }
}