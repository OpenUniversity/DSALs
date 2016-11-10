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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_22)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_coordinator_head_0_1");
    Fail131:
    { 
      IStrategoTerm x_22 = null;
      IStrategoTerm y_22 = null;
      IStrategoTerm z_22 = null;
      IStrategoTerm a_23 = null;
      term = w_22;
      IStrategoTerm term110 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success107:
      { 
        if(cons8 == transform._consTypeName_2)
        { 
          Fail132:
          { 
            IStrategoTerm w_177 = null;
            IStrategoTerm arg27 = term.getSubterm(1);
            if(arg27.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg27).getConstructor())
              break Fail132;
            w_177 = arg27.getSubterm(0);
            term = w_177;
            if(true)
              break Success107;
          }
          term = term110;
        }
        if(cons8 == transform._consTypeName_1)
        { 
          IStrategoTerm x_177 = null;
          IStrategoTerm arg28 = term.getSubterm(0);
          if(arg28.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg28).getConstructor())
            break Fail131;
          x_177 = arg28.getSubterm(0);
          term = x_177;
        }
        else
        { 
          break Fail131;
        }
      }
      z_22 = term;
      term = fetch__full__class__name_0_0.instance.invoke(context, w_22);
      if(term == null)
        break Fail131;
      x_22 = term;
      y_22 = cool.constCons29;
      term = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consPerThis_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consExec_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consConstrPattern_5, new IStrategoTerm[]{cool.constAnnoPattern0, cool.constModPattern0, termFactory.makeAppl(transform._consConstrName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consRefTypePattern_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consNamePattern_1, new IStrategoTerm[]{x_22})})}), cool.constCons30, cool.constNone0})})})});
      a_23 = term;
      term = (IStrategoTerm)termFactory.makeListCons(z_22, (IStrategoList)cool.constCons18);
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail131;
      term = termFactory.makeAppl(transform._consAspectDecHead_6, new IStrategoTerm[]{y_22, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), cool.constNone0, cool.constNone0, cool.constNone0, a_23});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}