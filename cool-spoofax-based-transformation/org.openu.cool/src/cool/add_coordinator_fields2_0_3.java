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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_f_33, IStrategoTerm ref_g_33, IStrategoTerm ref_h_33)
  { 
    TermReference f_33 = new TermReference(ref_f_33);
    TermReference g_33 = new TermReference(ref_g_33);
    TermReference h_33 = new TermReference(ref_h_33);
    context.push("add_coordinator_fields2_0_3");
    Fail170:
    { 
      lifted32 lifted320 = new lifted32();
      lifted320.h_33 = h_33;
      lifted320.g_33 = g_33;
      lifted320.f_33 = f_33;
      term = map_1_0.instance.invoke(context, term, lifted320);
      if(term == null)
        break Fail170;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}