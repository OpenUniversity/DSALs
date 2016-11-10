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
            IStrategoTerm k_9 = null;
            IStrategoTerm l_9 = null;
            k_9 = term.getSubterm(0);
            l_9 = term.getSubterm(1);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX32, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(k_9, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(l_9, (IStrategoList)cool.constCons13))))))});
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
              IStrategoTerm i_9 = null;
              IStrategoTerm j_9 = null;
              i_9 = term.getSubterm(0);
              j_9 = term.getSubterm(1);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX33, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(i_9, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(j_9, (IStrategoList)cool.constCons13))))))});
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
                IStrategoTerm c_9 = null;
                IStrategoTerm d_9 = null;
                IStrategoTerm e_9 = null;
                c_9 = term.getSubterm(0);
                d_9 = term.getSubterm(1);
                term = separate_by_comma_0_0.instance.invoke(context, d_9);
                if(term == null)
                  break Fail88;
                e_9 = term;
                term = termFactory.makeTuple(c_9, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(cool.constFBOX34, termFactory.makeListCons(cool.constFBOX21, termFactory.makeListCons(e_9, (IStrategoList)cool.constCons13)))));
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
                  IStrategoTerm w_8 = null;
                  IStrategoTerm x_8 = null;
                  IStrategoTerm y_8 = null;
                  IStrategoTerm z_8 = null;
                  w_8 = term.getSubterm(0);
                  x_8 = term.getSubterm(1);
                  y_8 = term.getSubterm(2);
                  z_8 = term.getSubterm(3);
                  term = termFactory.makeTuple(w_8, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX30, termFactory.makeListCons(x_8, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(y_8, termFactory.makeListCons(cool.constS26, termFactory.makeListCons(z_8, (IStrategoList)cool.constCons5)))))));
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
                            IStrategoTerm u_8 = null;
                            IStrategoTerm v_8 = null;
                            u_8 = term.getSubterm(0);
                            v_8 = term.getSubterm(1);
                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(u_8, termFactory.makeListCons(v_8, (IStrategoList)cool.constNil0))});
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
                              IStrategoTerm b_8 = null;
                              IStrategoTerm c_8 = null;
                              IStrategoTerm d_8 = null;
                              IStrategoTerm e_8 = null;
                              IStrategoTerm f_8 = null;
                              IStrategoTerm g_8 = null;
                              IStrategoTerm h_8 = null;
                              IStrategoTerm i_8 = null;
                              IStrategoTerm j_8 = null;
                              IStrategoTerm k_8 = null;
                              IStrategoTerm l_8 = null;
                              IStrategoTerm o_8 = null;
                              IStrategoTerm p_8 = null;
                              b_8 = term.getSubterm(0);
                              c_8 = term.getSubterm(1);
                              d_8 = term.getSubterm(2);
                              f_8 = term.getSubterm(3);
                              h_8 = term.getSubterm(4);
                              j_8 = term.getSubterm(5);
                              l_8 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, d_8);
                              if(term == null)
                                break Fail95;
                              e_8 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, f_8);
                              if(term == null)
                                break Fail95;
                              g_8 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, h_8);
                              if(term == null)
                                break Fail95;
                              i_8 = term;
                              term = option_to_boxes_0_0.instance.invoke(context, j_8);
                              if(term == null)
                                break Fail95;
                              k_8 = term;
                              term = l_8;
                              p_8 = term;
                              term = termFactory.makeTuple(i_8, k_8);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(g_8, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              term = termFactory.makeTuple(e_8, term);
                              term = make$Conc_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail95;
                              o_8 = term;
                              term = p_8;
                              IStrategoList list7;
                              list7 = checkListTail(o_8);
                              if(list7 == null)
                                break Fail95;
                              term = termFactory.makeTuple(b_8, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX35, termFactory.makeListCons(c_8, list7)));
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
                                IStrategoTerm a_8 = null;
                                a_8 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX36, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(a_8, (IStrategoList)cool.constCons1)))});
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
                                  IStrategoTerm z_7 = null;
                                  z_7 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX37, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(z_7, (IStrategoList)cool.constCons1)))});
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
                                    IStrategoTerm y_7 = null;
                                    y_7 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX38, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(y_7, (IStrategoList)cool.constCons1)))});
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
                                      IStrategoTerm x_7 = null;
                                      x_7 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX39, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(x_7, (IStrategoList)cool.constCons1)))});
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
                                        IStrategoTerm w_7 = null;
                                        w_7 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX40, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(w_7, (IStrategoList)cool.constCons1)))});
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
                                            IStrategoTerm v_7 = null;
                                            v_7 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constNil0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons16, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX43, termFactory.makeListCons(termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons17, v_7}), (IStrategoList)cool.constNil0))}), (IStrategoList)cool.constCons14)});
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