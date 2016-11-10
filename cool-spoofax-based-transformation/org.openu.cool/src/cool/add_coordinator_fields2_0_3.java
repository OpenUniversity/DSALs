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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_36, IStrategoTerm ref_q_36, IStrategoTerm ref_r_36)
  { 
    TermReference p_36 = new TermReference(ref_p_36);
    TermReference q_36 = new TermReference(ref_q_36);
    TermReference r_36 = new TermReference(ref_r_36);
    context.push("add_coordinator_fields2_0_3");
    Fail176:
    { 
      lifted32 lifted320 = new lifted32();
      lifted320.r_36 = r_36;
      lifted320.q_36 = q_36;
      lifted320.p_36 = p_36;
      term = map_1_0.instance.invoke(context, term, lifted320);
      if(term == null)
        break Fail176;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}