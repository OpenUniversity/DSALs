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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_0 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_0 instance = new aspectj_to_box_0_0_fragment_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_0");
    Fail85:
    { 
      IStrategoTerm term81 = term;
      IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success81:
      { 
        if(cons4 == transform._consDecError_2)
        { 
          Fail86:
          { 
            IStrategoTerm a_9 = null;
            IStrategoTerm b_9 = null;
            a_9 = term.getSubterm(0);
            b_9 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX32, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(a_9, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(b_9, (IStrategoList)cool.constCons13))))))});
            if(true)
              break Success81;
          }
          term = term81;
        }
        Success82:
        { 
          if(cons4 == transform._consDecSoft_2)
          { 
            Fail87:
            { 
              IStrategoTerm y_8 = null;
              IStrategoTerm z_8 = null;
              y_8 = term.getSubterm(0);
              z_8 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX33, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(y_8, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(z_8, (IStrategoList)cool.constCons13))))))});
              if(true)
                break Success82;
            }
            term = term81;
          }
          Success83:
          { 
            if(cons4 == transform._consDecPrecedence_2)
            { 
              Fail88:
              { 
                IStrategoTerm s_8 = null;
                IStrategoTerm t_8 = null;
                IStrategoTerm u_8 = null;
                s_8 = term.getSubterm(0);
                t_8 = term.getSubterm(1);
                term = separate_by_comma_0_0.instance.invoke(context, t_8);
                if(term == null)
                  break Fail88;
                u_8 = term;
                term = termFactory.makeTuple(s_8, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX34, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(u_8, (IStrategoList)cool.constCons13)))));
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail88;
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                if(true)
                  break Success83;
              }
              term = term81;
            }
            Success84:
            { 
              if(cons4 == transform._consDecAnno_4)
              { 
                Fail89:
                { 
                  IStrategoTerm m_8 = null;
                  IStrategoTerm n_8 = null;
                  IStrategoTerm o_8 = null;
                  IStrategoTerm p_8 = null;
                  m_8 = term.getSubterm(0);
                  n_8 = term.getSubterm(1);
                  o_8 = term.getSubterm(2);
                  p_8 = term.getSubterm(3);
                  term = termFactory.makeTuple(m_8, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(n_8, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(o_8, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(p_8, (IStrategoList)cool.constCons5)))))));
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail89;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                  if(true)
                    break Success84;
                }
                term = term81;
              }
              Success85:
              { 
                if(cons4 == transform._consDecAnnoType_0)
                { 
                  Fail90:
                  { 
                    term = cool.constS48;
                    if(true)
                      break Success85;
                  }
                  term = term81;
                }
                Success86:
                { 
                  if(cons4 == transform._consDecAnnoConstructor_0)
                  { 
                    Fail91:
                    { 
                      term = cool.constS49;
                      if(true)
                        break Success86;
                    }
                    term = term81;
                  }
                  Success87:
                  { 
                    if(cons4 == transform._consDecAnnoMethod_0)
                    { 
                      Fail92:
                      { 
                        term = cool.constS50;
                        if(true)
                          break Success87;
                      }
                      term = term81;
                    }
                    Success88:
                    { 
                      if(cons4 == transform._consDecAnnoField_0)
                      { 
                        Fail93:
                        { 
                          term = cool.constS51;
                          if(true)
                            break Success88;
                        }
                        term = term81;
                      }
                      Success89:
                      { 
                        if(cons4 == transform._consAspectDec_2)
                        { 
                          Fail94:
                          { 
                            IStrategoTerm k_8 = null;
                            IStrategoTerm l_8 = null;
                            k_8 = term.getSubterm(0);
                            l_8 = term.getSubterm(1);
                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(k_8, termFactory.makeListCons(l_8, (IStrategoList)cool.constNil0))});
                            if(true)
                              break Success89;
                          }
                          term = term81;
                        }
                        Success90:
                        { 
                          if(cons4 == transform._consAspectDecHead_6)
                          { 
                            Fail95:
                            { 
                              IStrategoTerm r_7 = null;
                              IStrategoTerm s_7 = null;
                              IStrategoTerm t_7 = null;
                              IStrategoTerm u_7 = null;
                              IStrategoTerm v_7 = null;
                              IStrategoTerm w_7 = null;
                              IStrategoTerm x_7 = null;
                              IStrategoTerm y_7 = null;
                              IStrategoTerm z_7 = null;
                              IStrategoTerm a_8 = null;
                              IStrategoTerm b_8 = null;
                              IStrategoTerm e_8 = null;
                              IStrategoTerm f_8 = null;
                              r_7 = term.getSubterm(0);
                              s_7 = term.getSubterm(1);
                              t_7 = term.getSubterm(2);
                              v_7 = term.getSubterm(3);
                              x_7 = term.getSubterm(4);
                              z_7 = term.getSubterm(5);
                              b_8 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, t_7);
                              if(term == null)
                                break Fail95;
                              u_7 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, v_7);
                              if(term == null)
                                break Fail95;
                              w_7 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, x_7);
                              if(term == null)
                                break Fail95;
                              y_7 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, z_7);
                              if(term == null)
                                break Fail95;
                              a_8 = term;
                              term = b_8;
                              f_8 = term;
                              term = termFactory.makeTuple(y_7, a_8);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(w_7, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(u_7, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              e_8 = term;
                              term = f_8;
                              IStrategoList list7;
                              list7 = checkListTail(e_8);
                              if(list7 == null)
                                break Fail95;
                              term = termFactory.makeTuple(r_7, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX35, termFactory.makeListCons(s_7, list7)));
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                              if(true)
                                break Success90;
                            }
                            term = term81;
                          }
                          Success91:
                          { 
                            if(cons4 == transform._consPerTarget_1)
                            { 
                              Fail96:
                              { 
                                IStrategoTerm q_7 = null;
                                q_7 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX36, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(q_7, (IStrategoList)cool.constCons1)))});
                                if(true)
                                  break Success91;
                              }
                              term = term81;
                            }
                            Success92:
                            { 
                              if(cons4 == transform._consPerThis_1)
                              { 
                                Fail97:
                                { 
                                  IStrategoTerm p_7 = null;
                                  p_7 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX37, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(p_7, (IStrategoList)cool.constCons1)))});
                                  if(true)
                                    break Success92;
                                }
                                term = term81;
                              }
                              Success93:
                              { 
                                if(cons4 == transform._consPerCFlow_1)
                                { 
                                  Fail98:
                                  { 
                                    IStrategoTerm o_7 = null;
                                    o_7 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX38, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(o_7, (IStrategoList)cool.constCons1)))});
                                    if(true)
                                      break Success93;
                                  }
                                  term = term81;
                                }
                                Success94:
                                { 
                                  if(cons4 == transform._consPerCFlowBelow_1)
                                  { 
                                    Fail99:
                                    { 
                                      IStrategoTerm n_7 = null;
                                      n_7 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX39, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(n_7, (IStrategoList)cool.constCons1)))});
                                      if(true)
                                        break Success94;
                                    }
                                    term = term81;
                                  }
                                  Success95:
                                  { 
                                    if(cons4 == transform._consPerTypeWithin_1)
                                    { 
                                      Fail100:
                                      { 
                                        IStrategoTerm m_7 = null;
                                        m_7 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX40, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(m_7, (IStrategoList)cool.constCons1)))});
                                        if(true)
                                          break Success95;
                                      }
                                      term = term81;
                                    }
                                    Success96:
                                    { 
                                      if(cons4 == transform._consIsSingleton_0)
                                      { 
                                        Fail101:
                                        { 
                                          term = cool.constFBOX41;
                                          if(true)
                                            break Success96;
                                        }
                                        term = term81;
                                      }
                                      Success97:
                                      { 
                                        if(cons4 == transform._consAspectBody_1)
                                        { 
                                          Fail102:
                                          { 
                                            IStrategoTerm l_7 = null;
                                            l_7 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons16, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons17, l_7}), (IStrategoList)cool.constNil0))}), (IStrategoList)cool.constCons14)});
                                            if(true)
                                              break Success97;
                                          }
                                          term = term81;
                                        }
                                        Success98:
                                        { 
                                          if(cons4 == transform._consPrivileged_0)
                                          { 
                                            Fail103:
                                            { 
                                              term = cool.constFBOX44;
                                              if(true)
                                                break Success98;
                                            }
                                            term = term81;
                                          }
                                          if(cons4 == transform._consProceed_0)
                                          { 
                                            term = cool.constFBOX45;
                                          }
                                          else
                                          { 
                                            break Fail85;
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