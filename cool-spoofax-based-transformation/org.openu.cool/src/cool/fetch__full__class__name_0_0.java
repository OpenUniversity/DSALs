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
    Fail114:
    { 
      IStrategoTerm term106 = term;
      IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success103:
      { 
        if(cons8 == transform._consTypeName_2)
        { 
          Fail115:
          { 
            IStrategoTerm n_17 = null;
            IStrategoTerm o_17 = null;
            n_17 = term.getSubterm(0);
            IStrategoTerm arg14 = term.getSubterm(1);
            if(arg14.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg14).getConstructor())
              break Fail115;
            o_17 = arg14.getSubterm(0);
            term = this.invoke(context, n_17);
            if(term == null)
              break Fail115;
            term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(o_17, (IStrategoList)cool.constNil0)));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail115;
            if(true)
              break Success103;
          }
          term = term106;
        }
        Success104:
        { 
          if(cons8 == transform._consTypeName_1)
          { 
            Fail116:
            { 
              IStrategoTerm m_17 = null;
              IStrategoTerm arg15 = term.getSubterm(0);
              if(arg15.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg15).getConstructor())
                break Fail116;
              m_17 = arg15.getSubterm(0);
              term = m_17;
              if(true)
                break Success104;
            }
            term = term106;
          }
          Success105:
          { 
            if(cons8 == transform._consPackageOrTypeName_1)
            { 
              Fail117:
              { 
                IStrategoTerm l_17 = null;
                IStrategoTerm arg16 = term.getSubterm(0);
                if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                  break Fail117;
                l_17 = arg16.getSubterm(0);
                term = l_17;
                if(true)
                  break Success105;
              }
              term = term106;
            }
            if(cons8 == transform._consPackageOrTypeName_2)
            { 
              IStrategoTerm h_17 = null;
              IStrategoTerm i_17 = null;
              h_17 = term.getSubterm(0);
              IStrategoTerm arg17 = term.getSubterm(1);
              if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                break Fail114;
              i_17 = arg17.getSubterm(0);
              term = this.invoke(context, h_17);
              if(term == null)
                break Fail114;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(cool.const24, termFactory.makeListCons(i_17, (IStrategoList)cool.constNil0)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail114;
            }
            else
            { 
              break Fail114;
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