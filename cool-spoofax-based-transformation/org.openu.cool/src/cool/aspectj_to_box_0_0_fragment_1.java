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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_1 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_1 instance = new aspectj_to_box_0_0_fragment_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_1");
    Fail72:
    { 
      IStrategoTerm term69 = term;
      IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success69:
      { 
        if(cons3 == transform._consIntertypeConstrDecHead_6)
        { 
          Fail73:
          { 
            IStrategoTerm v_10 = null;
            IStrategoTerm w_10 = null;
            IStrategoTerm x_10 = null;
            IStrategoTerm y_10 = null;
            IStrategoTerm z_10 = null;
            IStrategoTerm a_11 = null;
            IStrategoTerm b_11 = null;
            IStrategoTerm c_11 = null;
            IStrategoTerm d_11 = null;
            IStrategoTerm e_11 = null;
            IStrategoTerm f_11 = null;
            IStrategoTerm g_11 = null;
            IStrategoTerm j_11 = null;
            IStrategoTerm k_11 = null;
            d_11 = term.getSubterm(0);
            y_10 = term.getSubterm(1);
            v_10 = term.getSubterm(2);
            z_10 = term.getSubterm(3);
            w_10 = term.getSubterm(4);
            b_11 = term.getSubterm(5);
            g_11 = term;
            term = list_to_args_0_0.instance.invoke(context, w_10);
            if(term == null)
              break Fail73;
            x_10 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, y_10);
            if(term == null)
              break Fail73;
            e_11 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, z_10);
            if(term == null)
              break Fail73;
            a_11 = term;
            term = option_to_boxes_0_0.instance.invoke(context, b_11);
            if(term == null)
              break Fail73;
            c_11 = term;
            term = termFactory.makeTuple(d_11, e_11);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            f_11 = term;
            term = g_11;
            k_11 = term;
            term = termFactory.makeTuple(a_11, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(cool.constFBOX19, termFactory.makeListCons(x_10, (IStrategoList)cool.constNil0))));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            j_11 = term;
            term = k_11;
            IStrategoList list4;
            IStrategoList list3;
            list3 = checkListTail(c_11);
            if(list3 == null)
              break Fail73;
            list4 = checkListTail(j_11);
            if(list4 == null)
              break Fail73;
            term = termFactory.makeTuple(f_11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(v_10, list4)}), list3));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
            if(true)
              break Success69;
          }
          term = term69;
        }
        Success70:
        { 
          if(cons3 == transform._consIntertypeFieldDec_5)
          { 
            Fail74:
            { 
              IStrategoTerm k_10 = null;
              IStrategoTerm l_10 = null;
              IStrategoTerm m_10 = null;
              IStrategoTerm n_10 = null;
              IStrategoTerm o_10 = null;
              IStrategoTerm p_10 = null;
              IStrategoTerm q_10 = null;
              IStrategoTerm t_10 = null;
              IStrategoTerm u_10 = null;
              k_10 = term.getSubterm(0);
              l_10 = term.getSubterm(1);
              m_10 = term.getSubterm(2);
              o_10 = term.getSubterm(3);
              n_10 = term.getSubterm(4);
              q_10 = term;
              term = option_to_boxes_0_0.instance.invoke(context, o_10);
              if(term == null)
                break Fail74;
              p_10 = term;
              term = q_10;
              u_10 = term;
              term = termFactory.makeTuple(p_10, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(n_10, (IStrategoList)cool.constCons5)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              t_10 = term;
              term = u_10;
              IStrategoList list5;
              list5 = checkListTail(t_10);
              if(list5 == null)
                break Fail74;
              term = termFactory.makeTuple(k_10, (IStrategoTerm)termFactory.makeListCons(l_10, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(m_10, list5)}), (IStrategoList)cool.constNil0)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
              if(true)
                break Success70;
            }
            term = term69;
          }
          Success71:
          { 
            if(cons3 == transform._consAdviceDec_5)
            { 
              Fail75:
              { 
                IStrategoTerm z_9 = null;
                IStrategoTerm a_10 = null;
                IStrategoTerm b_10 = null;
                IStrategoTerm c_10 = null;
                IStrategoTerm d_10 = null;
                IStrategoTerm e_10 = null;
                IStrategoTerm f_10 = null;
                IStrategoTerm i_10 = null;
                IStrategoTerm j_10 = null;
                z_9 = term.getSubterm(0);
                a_10 = term.getSubterm(1);
                d_10 = term.getSubterm(2);
                b_10 = term.getSubterm(3);
                c_10 = term.getSubterm(4);
                f_10 = term;
                term = option_to_boxes_0_0.instance.invoke(context, d_10);
                if(term == null)
                  break Fail75;
                e_10 = term;
                term = f_10;
                j_10 = term;
                term = termFactory.makeTuple(e_10, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(b_10, (IStrategoList)cool.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                i_10 = term;
                term = j_10;
                IStrategoList list6;
                list6 = checkListTail(i_10);
                if(list6 == null)
                  break Fail75;
                term = termFactory.makeTuple(z_9, (IStrategoTerm)termFactory.makeListCons(a_10, list6));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term}), termFactory.makeListCons(c_10, (IStrategoList)cool.constNil0))});
                if(true)
                  break Success71;
              }
              term = term69;
            }
            Success72:
            { 
              if(cons3 == transform._consBefore_1)
              { 
                Fail76:
                { 
                  IStrategoTerm w_9 = null;
                  w_9 = term.getSubterm(0);
                  term = separate_by_comma_0_0.instance.invoke(context, w_9);
                  if(term == null)
                    break Fail76;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX24, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))});
                  if(true)
                    break Success72;
                }
                term = term69;
              }
              Success73:
              { 
                if(cons3 == transform._consAfter_2)
                { 
                  Fail77:
                  { 
                    IStrategoTerm s_9 = null;
                    IStrategoTerm t_9 = null;
                    t_9 = term.getSubterm(0);
                    s_9 = term.getSubterm(1);
                    term = separate_by_comma_0_0.instance.invoke(context, t_9);
                    if(term == null)
                      break Fail77;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX25, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), termFactory.makeListCons(s_9, (IStrategoList)cool.constNil0))});
                    if(true)
                      break Success73;
                  }
                  term = term69;
                }
                Success74:
                { 
                  if(cons3 == transform._consAround_2)
                  { 
                    Fail78:
                    { 
                      IStrategoTerm o_9 = null;
                      IStrategoTerm p_9 = null;
                      o_9 = term.getSubterm(0);
                      p_9 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, p_9);
                      if(term == null)
                        break Fail78;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(o_9, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX26, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), (IStrategoList)cool.constNil0))});
                      if(true)
                        break Success74;
                    }
                    term = term69;
                  }
                  Success75:
                  { 
                    if(cons3 == transform._consReturning_0)
                    { 
                      Fail79:
                      { 
                        term = cool.constFBOX27;
                        if(true)
                          break Success75;
                      }
                      term = term69;
                    }
                    Success76:
                    { 
                      if(cons3 == transform._consReturning_1)
                      { 
                        Fail80:
                        { 
                          IStrategoTerm n_9 = null;
                          n_9 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX27, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(n_9, (IStrategoList)cool.constCons12)))});
                          if(true)
                            break Success76;
                        }
                        term = term69;
                      }
                      Success77:
                      { 
                        if(cons3 == transform._consThrowing_0)
                        { 
                          Fail81:
                          { 
                            term = cool.constFBOX28;
                            if(true)
                              break Success77;
                          }
                          term = term69;
                        }
                        Success78:
                        { 
                          if(cons3 == transform._consThrowing_1)
                          { 
                            Fail82:
                            { 
                              IStrategoTerm m_9 = null;
                              m_9 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX28, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(m_9, (IStrategoList)cool.constCons12)))});
                              if(true)
                                break Success78;
                            }
                            term = term69;
                          }
                          Success79:
                          { 
                            if(cons3 == transform._consDecParent_3)
                            { 
                              Fail83:
                              { 
                                IStrategoTerm h_9 = null;
                                IStrategoTerm i_9 = null;
                                IStrategoTerm j_9 = null;
                                h_9 = term.getSubterm(0);
                                i_9 = term.getSubterm(1);
                                j_9 = term.getSubterm(2);
                                term = termFactory.makeTuple(h_9, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX29, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(i_9, termFactory.makeListCons(j_9, (IStrategoList)cool.constCons13))))));
                                term = make$Conc_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail83;
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                if(true)
                                  break Success79;
                              }
                              term = term69;
                            }
                            Success80:
                            { 
                              if(cons3 == transform._consDecWarning_3)
                              { 
                                Fail84:
                                { 
                                  IStrategoTerm c_9 = null;
                                  IStrategoTerm d_9 = null;
                                  IStrategoTerm e_9 = null;
                                  c_9 = term.getSubterm(0);
                                  d_9 = term.getSubterm(1);
                                  e_9 = term.getSubterm(2);
                                  term = termFactory.makeTuple(c_9, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX31, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(d_9, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(e_9, (IStrategoList)cool.constCons13)))))));
                                  term = make$Conc_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail84;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                  if(true)
                                    break Success80;
                                }
                                term = term69;
                              }
                              term = aspectj_to_box_0_0_fragment_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail72;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
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