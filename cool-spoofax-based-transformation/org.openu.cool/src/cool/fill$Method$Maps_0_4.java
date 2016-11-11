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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_31, IStrategoTerm i_31, IStrategoTerm j_31, IStrategoTerm k_31)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail158:
    { 
      IStrategoTerm l_31 = null;
      IStrategoTerm m_31 = null;
      IStrategoTerm n_31 = null;
      IStrategoTerm o_31 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail158;
      n_31 = term.getSubterm(0);
      l_31 = term.getSubterm(1);
      m_31 = term.getSubterm(2);
      o_31 = term.getSubterm(3);
      IStrategoTerm term123 = term;
      Success120:
      { 
        Fail159:
        { 
          IStrategoTerm term124 = term;
          Success121:
          { 
            Fail160:
            { 
              IStrategoTerm p_31 = null;
              p_31 = term;
              IStrategoTerm term125 = term;
              Success122:
              { 
                Fail161:
                { 
                  term = termFactory.makeTuple(l_31, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail161;
                  { 
                    if(true)
                      break Fail160;
                    if(true)
                      break Success122;
                  }
                }
                term = term125;
              }
              term = p_31;
              { 
                IStrategoTerm x_31 = null;
                IStrategoTerm q_31 = null;
                x_31 = h_31;
                term = l_31;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail159;
                IStrategoTerm arg48 = term.getSubterm(0);
                if(arg48.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg48).getConstructor())
                  break Fail159;
                q_31 = arg48.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, x_31, n_31, q_31);
                if(term == null)
                  break Fail159;
                if(true)
                  break Success121;
              }
            }
            term = term124;
          }
          IStrategoTerm term126 = term;
          Success123:
          { 
            Fail162:
            { 
              IStrategoTerm r_31 = null;
              r_31 = term;
              IStrategoTerm term127 = term;
              Success124:
              { 
                Fail163:
                { 
                  term = termFactory.makeTuple(m_31, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail163;
                  { 
                    if(true)
                      break Fail162;
                    if(true)
                      break Success124;
                  }
                }
                term = term127;
              }
              term = r_31;
              { 
                IStrategoTerm z_31 = null;
                IStrategoTerm s_31 = null;
                z_31 = j_31;
                term = m_31;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail159;
                IStrategoTerm arg49 = term.getSubterm(0);
                if(arg49.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg49).getConstructor())
                  break Fail159;
                s_31 = arg49.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, z_31, n_31, s_31);
                if(term == null)
                  break Fail159;
                if(true)
                  break Success123;
              }
            }
            term = term126;
          }
          IStrategoTerm term128 = term;
          Success125:
          { 
            Fail164:
            { 
              IStrategoTerm t_31 = null;
              t_31 = term;
              IStrategoTerm term129 = term;
              Success126:
              { 
                Fail165:
                { 
                  term = termFactory.makeTuple(o_31, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail165;
                  { 
                    if(true)
                      break Fail164;
                    if(true)
                      break Success126;
                  }
                }
                term = term129;
              }
              term = t_31;
              { 
                IStrategoTerm b_32 = null;
                IStrategoTerm u_31 = null;
                b_32 = i_31;
                term = o_31;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail159;
                IStrategoTerm arg50 = term.getSubterm(0);
                if(arg50.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg50).getConstructor())
                  break Fail159;
                u_31 = arg50.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, b_32, n_31, u_31);
                if(term == null)
                  break Fail159;
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
        IStrategoTerm d_32 = null;
        d_32 = term;
        term = report_with_failure_0_1.instance.invoke(context, d_32, cool.const114);
        if(term == null)
          break Fail158;
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