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

@SuppressWarnings("all") public class fetch__full__class__name_0_0 extends Strategy 
{ 
  public static fetch__full__class__name_0_0 instance = new fetch__full__class__name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch__full__class__name_0_0");
    Fail111:
    { 
      IStrategoTerm term105 = term;
      IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success102:
      { 
        if(cons7 == transform._consTypeName_2)
        { 
          Fail112:
          { 
            IStrategoTerm x_17 = null;
            IStrategoTerm y_17 = null;
            x_17 = term.getSubterm(0);
            IStrategoTerm arg11 = term.getSubterm(1);
            if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
              break Fail112;
            y_17 = arg11.getSubterm(0);
            term = this.invoke(context, x_17);
            if(term == null)
              break Fail112;
            term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(y_17, (IStrategoList)cool.constNil0)));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail112;
            if(true)
              break Success102;
          }
          term = term105;
        }
        Success103:
        { 
          if(cons7 == transform._consTypeName_1)
          { 
            Fail113:
            { 
              IStrategoTerm w_17 = null;
              IStrategoTerm arg12 = term.getSubterm(0);
              if(arg12.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg12).getConstructor())
                break Fail113;
              w_17 = arg12.getSubterm(0);
              term = w_17;
              if(true)
                break Success103;
            }
            term = term105;
          }
          Success104:
          { 
            if(cons7 == transform._consPackageOrTypeName_1)
            { 
              Fail114:
              { 
                IStrategoTerm v_17 = null;
                IStrategoTerm arg13 = term.getSubterm(0);
                if(arg13.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg13).getConstructor())
                  break Fail114;
                v_17 = arg13.getSubterm(0);
                term = v_17;
                if(true)
                  break Success104;
              }
              term = term105;
            }
            if(cons7 == transform._consPackageOrTypeName_2)
            { 
              IStrategoTerm r_17 = null;
              IStrategoTerm s_17 = null;
              r_17 = term.getSubterm(0);
              IStrategoTerm arg14 = term.getSubterm(1);
              if(arg14.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg14).getConstructor())
                break Fail111;
              s_17 = arg14.getSubterm(0);
              term = this.invoke(context, r_17);
              if(term == null)
                break Fail111;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(s_17, (IStrategoList)cool.constNil0)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail111;
            }
            else
            { 
              break Fail111;
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}