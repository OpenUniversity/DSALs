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

@SuppressWarnings("all") public class gen_coordinator_head_0_1 extends Strategy 
{ 
  public static gen_coordinator_head_0_1 instance = new gen_coordinator_head_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_coordinator_head_0_1");
    Fail133:
    { 
      IStrategoTerm t_20 = null;
      IStrategoTerm u_20 = null;
      IStrategoTerm v_20 = null;
      IStrategoTerm w_20 = null;
      term = fetch__class__name_0_0.instance.invoke(context, s_20);
      if(term == null)
        break Fail133;
      v_20 = term;
      term = fetch__full__class__name_0_0.instance.invoke(context, s_20);
      if(term == null)
        break Fail133;
      t_20 = term;
      u_20 = cool.constCons30;
      term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consPerThis_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consExec_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consConstrPattern_5, new IStrategoTerm[]{cool.constAnnoPattern0, cool.constModPattern0, termFactory.makeAppl(transform._consConstrName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{t_20})})}), cool.constCons31, cool.constNone0})})})});
      w_20 = term;
      term = (IStrategoTerm)termFactory.makeListCons(v_20, (IStrategoList)cool.constCons32);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail133;
      term = termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{u_20, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constNone0, cool.constNone0, cool.constNone0, w_20});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}