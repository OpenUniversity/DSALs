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
            IStrategoTerm f_11 = null;
            IStrategoTerm g_11 = null;
            IStrategoTerm h_11 = null;
            IStrategoTerm i_11 = null;
            IStrategoTerm j_11 = null;
            IStrategoTerm k_11 = null;
            IStrategoTerm l_11 = null;
            IStrategoTerm m_11 = null;
            IStrategoTerm n_11 = null;
            IStrategoTerm o_11 = null;
            IStrategoTerm p_11 = null;
            IStrategoTerm q_11 = null;
            IStrategoTerm t_11 = null;
            IStrategoTerm u_11 = null;
            n_11 = term.getSubterm(0);
            i_11 = term.getSubterm(1);
            f_11 = term.getSubterm(2);
            j_11 = term.getSubterm(3);
            g_11 = term.getSubterm(4);
            l_11 = term.getSubterm(5);
            q_11 = term;
            term = list_to_args_0_0.instance.invoke(context, g_11);
            if(term == null)
              break Fail73;
            h_11 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, i_11);
            if(term == null)
              break Fail73;
            o_11 = term;
            term = type_params_to_boxes_0_0.instance.invoke(context, j_11);
            if(term == null)
              break Fail73;
            k_11 = term;
            term = option_to_boxes_0_0.instance.invoke(context, l_11);
            if(term == null)
              break Fail73;
            m_11 = term;
            term = termFactory.makeTuple(n_11, o_11);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            p_11 = term;
            term = q_11;
            u_11 = term;
            term = termFactory.makeTuple(k_11, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(cool.constFBOX19, termFactory.makeListCons(h_11, (IStrategoList)cool.constNil0))));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail73;
            t_11 = term;
            term = u_11;
            IStrategoList list4;
            IStrategoList list3;
            list3 = checkListTail(m_11);
            if(list3 == null)
              break Fail73;
            list4 = checkListTail(t_11);
            if(list4 == null)
              break Fail73;
            term = termFactory.makeTuple(p_11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(f_11, list4)}), list3));
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
              IStrategoTerm u_10 = null;
              IStrategoTerm v_10 = null;
              IStrategoTerm w_10 = null;
              IStrategoTerm x_10 = null;
              IStrategoTerm y_10 = null;
              IStrategoTerm z_10 = null;
              IStrategoTerm a_11 = null;
              IStrategoTerm d_11 = null;
              IStrategoTerm e_11 = null;
              u_10 = term.getSubterm(0);
              v_10 = term.getSubterm(1);
              w_10 = term.getSubterm(2);
              y_10 = term.getSubterm(3);
              x_10 = term.getSubterm(4);
              a_11 = term;
              term = option_to_boxes_0_0.instance.invoke(context, y_10);
              if(term == null)
                break Fail74;
              z_10 = term;
              term = a_11;
              e_11 = term;
              term = termFactory.makeTuple(z_10, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(x_10, (IStrategoList)cool.constCons5)));
              term = make$Conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail74;
              d_11 = term;
              term = e_11;
              IStrategoList list5;
              list5 = checkListTail(d_11);
              if(list5 == null)
                break Fail74;
              term = termFactory.makeTuple(u_10, (IStrategoTerm)termFactory.makeListCons(v_10, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(w_10, list5)}), (IStrategoList)cool.constNil0)));
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
                IStrategoTerm j_10 = null;
                IStrategoTerm k_10 = null;
                IStrategoTerm l_10 = null;
                IStrategoTerm m_10 = null;
                IStrategoTerm n_10 = null;
                IStrategoTerm o_10 = null;
                IStrategoTerm p_10 = null;
                IStrategoTerm s_10 = null;
                IStrategoTerm t_10 = null;
                j_10 = term.getSubterm(0);
                k_10 = term.getSubterm(1);
                n_10 = term.getSubterm(2);
                l_10 = term.getSubterm(3);
                m_10 = term.getSubterm(4);
                p_10 = term;
                term = option_to_boxes_0_0.instance.invoke(context, n_10);
                if(term == null)
                  break Fail75;
                o_10 = term;
                term = p_10;
                t_10 = term;
                term = termFactory.makeTuple(o_10, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(l_10, (IStrategoList)cool.constNil0)));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                s_10 = term;
                term = t_10;
                IStrategoList list6;
                list6 = checkListTail(s_10);
                if(list6 == null)
                  break Fail75;
                term = termFactory.makeTuple(j_10, (IStrategoTerm)termFactory.makeListCons(k_10, list6));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75;
                term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term}), termFactory.makeListCons(m_10, (IStrategoList)cool.constNil0))});
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
                  IStrategoTerm g_10 = null;
                  g_10 = term.getSubterm(0);
                  term = separate_by_comma_0_0.instance.invoke(context, g_10);
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
                    IStrategoTerm c_10 = null;
                    IStrategoTerm d_10 = null;
                    d_10 = term.getSubterm(0);
                    c_10 = term.getSubterm(1);
                    term = separate_by_comma_0_0.instance.invoke(context, d_10);
                    if(term == null)
                      break Fail77;
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX25, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), termFactory.makeListCons(c_10, (IStrategoList)cool.constNil0))});
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
                      IStrategoTerm y_9 = null;
                      IStrategoTerm z_9 = null;
                      y_9 = term.getSubterm(0);
                      z_9 = term.getSubterm(1);
                      term = separate_by_comma_0_0.instance.invoke(context, z_9);
                      if(term == null)
                        break Fail78;
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(y_9, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX26, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(term, (IStrategoList)cool.constCons12)))}), (IStrategoList)cool.constNil0))});
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
                          IStrategoTerm x_9 = null;
                          x_9 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX27, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(x_9, (IStrategoList)cool.constCons12)))});
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
                              IStrategoTerm w_9 = null;
                              w_9 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX28, termFactory.makeListCons(cool.constFBOX23, termFactory.makeListCons(w_9, (IStrategoList)cool.constCons12)))});
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
                                IStrategoTerm r_9 = null;
                                IStrategoTerm s_9 = null;
                                IStrategoTerm t_9 = null;
                                r_9 = term.getSubterm(0);
                                s_9 = term.getSubterm(1);
                                t_9 = term.getSubterm(2);
                                term = termFactory.makeTuple(r_9, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX29, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(s_9, termFactory.makeListCons(t_9, (IStrategoList)cool.constCons13))))));
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
                                  IStrategoTerm m_9 = null;
                                  IStrategoTerm n_9 = null;
                                  IStrategoTerm o_9 = null;
                                  m_9 = term.getSubterm(0);
                                  n_9 = term.getSubterm(1);
                                  o_9 = term.getSubterm(2);
                                  term = termFactory.makeTuple(m_9, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX31, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(n_9, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(o_9, (IStrategoList)cool.constCons13)))))));
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