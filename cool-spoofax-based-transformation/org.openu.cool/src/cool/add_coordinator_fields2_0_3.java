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

@SuppressWarnings("all") public class add_coordinator_fields2_0_3 extends Strategy 
{ 
  public static add_coordinator_fields2_0_3 instance = new add_coordinator_fields2_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_35, IStrategoTerm ref_k_35, IStrategoTerm ref_l_35)
  { 
    TermReference j_35 = new TermReference(ref_j_35);
    TermReference k_35 = new TermReference(ref_k_35);
    TermReference l_35 = new TermReference(ref_l_35);
    context.push("add_coordinator_fields2_0_3");
    Fail169:
    { 
      lifted32 lifted320 = new lifted32();
      lifted320.l_35 = l_35;
      lifted320.k_35 = k_35;
      lifted320.j_35 = j_35;
      term = map_1_0.instance.invoke(context, term, lifted320);
      if(term == null)
        break Fail169;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}