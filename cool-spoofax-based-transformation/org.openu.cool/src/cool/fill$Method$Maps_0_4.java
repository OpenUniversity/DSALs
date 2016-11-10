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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm r_34, IStrategoTerm s_34, IStrategoTerm t_34, IStrategoTerm u_34)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fillMethodMaps_0_4");
    Fail164:
    { 
      IStrategoTerm v_34 = null;
      IStrategoTerm w_34 = null;
      IStrategoTerm x_34 = null;
      IStrategoTerm y_34 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
        break Fail164;
      x_34 = term.getSubterm(0);
      v_34 = term.getSubterm(1);
      w_34 = term.getSubterm(2);
      y_34 = term.getSubterm(3);
      IStrategoTerm term123 = term;
      Success120:
      { 
        Fail165:
        { 
          IStrategoTerm term124 = term;
          Success121:
          { 
            Fail166:
            { 
              IStrategoTerm z_34 = null;
              z_34 = term;
              IStrategoTerm term125 = term;
              Success122:
              { 
                Fail167:
                { 
                  term = termFactory.makeTuple(v_34, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail167;
                  { 
                    if(true)
                      break Fail166;
                    if(true)
                      break Success122;
                  }
                }
                term = term125;
              }
              term = z_34;
              { 
                IStrategoTerm h_35 = null;
                IStrategoTerm a_35 = null;
                h_35 = r_34;
                term = v_34;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail165;
                IStrategoTerm arg66 = term.getSubterm(0);
                if(arg66.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg66).getConstructor())
                  break Fail165;
                a_35 = arg66.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, h_35, x_34, a_35);
                if(term == null)
                  break Fail165;
                if(true)
                  break Success121;
              }
            }
            term = term124;
          }
          IStrategoTerm term126 = term;
          Success123:
          { 
            Fail168:
            { 
              IStrategoTerm b_35 = null;
              b_35 = term;
              IStrategoTerm term127 = term;
              Success124:
              { 
                Fail169:
                { 
                  term = termFactory.makeTuple(w_34, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail169;
                  { 
                    if(true)
                      break Fail168;
                    if(true)
                      break Success124;
                  }
                }
                term = term127;
              }
              term = b_35;
              { 
                IStrategoTerm j_35 = null;
                IStrategoTerm c_35 = null;
                j_35 = t_34;
                term = w_34;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail165;
                IStrategoTerm arg67 = term.getSubterm(0);
                if(arg67.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg67).getConstructor())
                  break Fail165;
                c_35 = arg67.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, j_35, x_34, c_35);
                if(term == null)
                  break Fail165;
                if(true)
                  break Success123;
              }
            }
            term = term126;
          }
          IStrategoTerm term128 = term;
          Success125:
          { 
            Fail170:
            { 
              IStrategoTerm d_35 = null;
              d_35 = term;
              IStrategoTerm term129 = term;
              Success126:
              { 
                Fail171:
                { 
                  term = termFactory.makeTuple(y_34, cool.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail171;
                  { 
                    if(true)
                      break Fail170;
                    if(true)
                      break Success126;
                  }
                }
                term = term129;
              }
              term = d_35;
              { 
                IStrategoTerm l_35 = null;
                IStrategoTerm e_35 = null;
                l_35 = s_34;
                term = y_34;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail165;
                IStrategoTerm arg68 = term.getSubterm(0);
                if(arg68.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg68).getConstructor())
                  break Fail165;
                e_35 = arg68.getSubterm(0);
                term = hashtable_put_0_2.instance.invoke(context, l_35, x_34, e_35);
                if(term == null)
                  break Fail165;
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
        IStrategoTerm n_35 = null;
        n_35 = term;
        term = report_with_failure_0_1.instance.invoke(context, n_35, cool.const124);
        if(term == null)
          break Fail164;
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