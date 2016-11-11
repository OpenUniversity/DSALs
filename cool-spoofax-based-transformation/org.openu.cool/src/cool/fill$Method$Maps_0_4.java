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

@SuppressWarnings("all") public class fill$Method$Maps_0_4 extends Strategy 
{ 
  public static fill$Method$Maps_0_4 instance = new fill$Method$Maps_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_33, IStrategoTerm m_33, IStrategoTerm n_33, IStrategoTerm o_33)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail157:
    { 
      IStrategoTerm p_33 = null;
      IStrategoTerm q_33 = null;
      IStrategoTerm r_33 = null;
      IStrategoTerm s_33 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail157;
      r_33 = term.getSubterm(0);
      p_33 = term.getSubterm(1);
      q_33 = term.getSubterm(2);
      s_33 = term.getSubterm(3);
      IStrategoTerm term123 = term;
      Success120:
      { 
        Fail158:
        { 
          IStrategoTerm term124 = term;
          Success121:
          { 
            Fail159:
            { 
              IStrategoTerm t_33 = null;
              t_33 = term;
              IStrategoTerm term125 = term;
              Success122:
              { 
                Fail160:
                { 
                  term = termFactory.makeTuple(p_33, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail160;
                  { 
                    if(true)
                      break Fail159;
                    if(true)
                      break Success122;
                  }
                }
                term = term125;
              }
              term = t_33;
              { 
                IStrategoTerm b_34 = null;
                IStrategoTerm u_33 = null;
                b_34 = l_33;
                term = p_33;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail158;
                IStrategoTerm arg48 = term.getSubterm(0);
                if(arg48.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg48).getConstructor())
                  break Fail158;
                u_33 = arg48.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, b_34, r_33, u_33);
                if(term == null)
                  break Fail158;
                if(true)
                  break Success121;
              }
            }
            term = term124;
          }
          IStrategoTerm term126 = term;
          Success123:
          { 
            Fail161:
            { 
              IStrategoTerm v_33 = null;
              v_33 = term;
              IStrategoTerm term127 = term;
              Success124:
              { 
                Fail162:
                { 
                  term = termFactory.makeTuple(q_33, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail162;
                  { 
                    if(true)
                      break Fail161;
                    if(true)
                      break Success124;
                  }
                }
                term = term127;
              }
              term = v_33;
              { 
                IStrategoTerm d_34 = null;
                IStrategoTerm w_33 = null;
                d_34 = n_33;
                term = q_33;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail158;
                IStrategoTerm arg49 = term.getSubterm(0);
                if(arg49.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg49).getConstructor())
                  break Fail158;
                w_33 = arg49.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, d_34, r_33, w_33);
                if(term == null)
                  break Fail158;
                if(true)
                  break Success123;
              }
            }
            term = term126;
          }
          IStrategoTerm term128 = term;
          Success125:
          { 
            Fail163:
            { 
              IStrategoTerm x_33 = null;
              x_33 = term;
              IStrategoTerm term129 = term;
              Success126:
              { 
                Fail164:
                { 
                  term = termFactory.makeTuple(s_33, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail164;
                  { 
                    if(true)
                      break Fail163;
                    if(true)
                      break Success126;
                  }
                }
                term = term129;
              }
              term = x_33;
              { 
                IStrategoTerm f_34 = null;
                IStrategoTerm y_33 = null;
                f_34 = m_33;
                term = s_33;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail158;
                IStrategoTerm arg50 = term.getSubterm(0);
                if(arg50.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg50).getConstructor())
                  break Fail158;
                y_33 = arg50.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, f_34, r_33, y_33);
                if(term == null)
                  break Fail158;
                if(true)
                  break Success125;
              }
            }
            term = term128;
          }
          if(true)
            break Success120;
        }
        term = term123;
        IStrategoTerm h_34 = null;
        h_34 = term;
        term = report_with_failure_0_1.instance.invoke(context, h_34, cool.const116);
        if(term == null)
          break Fail157;
      }
      term = cool.constNone0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}