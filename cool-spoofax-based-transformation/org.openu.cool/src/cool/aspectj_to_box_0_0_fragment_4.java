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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_4 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_4 instance = new aspectj_to_box_0_0_fragment_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_4");
    Fail0:
    { 
      IStrategoTerm term0 = term;
      IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success0:
      { 
        if(cons0 == transform._consInitExec_1)
        { 
          Fail1:
          { 
            IStrategoTerm t_16 = null;
            t_16 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX0, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(t_16, (IStrategoList)cool.constCons1)))});
            if(true)
              break Success0;
          }
          term = term0;
        }
        Success1:
        { 
          if(cons0 == transform._consPreInitExec_1)
          { 
            Fail2:
            { 
              IStrategoTerm s_16 = null;
              s_16 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX1, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(s_16, (IStrategoList)cool.constCons1)))});
              if(true)
                break Success1;
            }
            term = term0;
          }
          Success2:
          { 
            if(cons0 == transform._consStaticInitExec_1)
            { 
              Fail3:
              { 
                IStrategoTerm r_16 = null;
                r_16 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX2, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(r_16, (IStrategoList)cool.constCons1)))});
                if(true)
                  break Success2;
              }
              term = term0;
            }
            Success3:
            { 
              if(cons0 == transform._consGetField_1)
              { 
                Fail4:
                { 
                  IStrategoTerm q_16 = null;
                  q_16 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX3, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(q_16, (IStrategoList)cool.constCons1)))});
                  if(true)
                    break Success3;
                }
                term = term0;
              }
              Success4:
              { 
                if(cons0 == transform._consSetField_1)
                { 
                  Fail5:
                  { 
                    IStrategoTerm p_16 = null;
                    p_16 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX4, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(p_16, (IStrategoList)cool.constCons1)))});
                    if(true)
                      break Success4;
                  }
                  term = term0;
                }
                Success5:
                { 
                  if(cons0 == transform._consHandler_1)
                  { 
                    Fail6:
                    { 
                      IStrategoTerm o_16 = null;
                      o_16 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX5, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(o_16, (IStrategoList)cool.constCons1)))});
                      if(true)
                        break Success5;
                    }
                    term = term0;
                  }
                  Success6:
                  { 
                    if(cons0 == transform._consAdviceExec_0)
                    { 
                      Fail7:
                      { 
                        term = cool.constH0;
                        if(true)
                          break Success6;
                      }
                      term = term0;
                    }
                    Success7:
                    { 
                      if(cons0 == transform._consWithin_1)
                      { 
                        Fail8:
                        { 
                          IStrategoTerm n_16 = null;
                          n_16 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX7, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(n_16, (IStrategoList)cool.constCons1)))});
                          if(true)
                            break Success7;
                        }
                        term = term0;
                      }
                      Success8:
                      { 
                        if(cons0 == transform._consWithinCode_1)
                        { 
                          Fail9:
                          { 
                            IStrategoTerm m_16 = null;
                            m_16 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX8, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(m_16, (IStrategoList)cool.constCons1)))});
                            if(true)
                              break Success8;
                          }
                          term = term0;
                        }
                        Success9:
                        { 
                          if(cons0 == transform._consCFlow_1)
                          { 
                            Fail10:
                            { 
                              IStrategoTerm l_16 = null;
                              l_16 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX9, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(l_16, (IStrategoList)cool.constCons1)))});
                              if(true)
                                break Success9;
                            }
                            term = term0;
                          }
                          Success10:
                          { 
                            if(cons0 == transform._consCFlowBelow_1)
                            { 
                              Fail11:
                              { 
                                IStrategoTerm k_16 = null;
                                k_16 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX10, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(k_16, (IStrategoList)cool.constCons1)))});
                                if(true)
                                  break Success10;
                              }
                              term = term0;
                            }
                            Success11:
                            { 
                              if(cons0 == transform._consIf_1)
                              { 
                                Fail12:
                                { 
                                  IStrategoTerm j_16 = null;
                                  j_16 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX11, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(j_16, (IStrategoList)cool.constCons1)))});
                                  if(true)
                                    break Success11;
                                }
                                term = term0;
                              }
                              Success12:
                              { 
                                if(cons0 == transform._consThis_1)
                                { 
                                  Fail13:
                                  { 
                                    IStrategoTerm i_16 = null;
                                    i_16 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX12, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(i_16, (IStrategoList)cool.constCons1)))});
                                    if(true)
                                      break Success12;
                                  }
                                  term = term0;
                                }
                                Success13:
                                { 
                                  if(cons0 == transform._consTarget_1)
                                  { 
                                    Fail14:
                                    { 
                                      IStrategoTerm h_16 = null;
                                      h_16 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX13, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(h_16, (IStrategoList)cool.constCons1)))});
                                      if(true)
                                        break Success13;
                                    }
                                    term = term0;
                                  }
                                  Success14:
                                  { 
                                    if(cons0 == transform._consArgs_1)
                                    { 
                                      Fail15:
                                      { 
                                        IStrategoTerm e_16 = null;
                                        e_16 = term.getSubterm(0);
                                        term = list_to_args_0_0.instance.invoke(context, e_16);
                                        if(term == null)
                                          break Fail15;
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX14, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
                                        if(true)
                                          break Success14;
                                      }
                                      term = term0;
                                    }
                                    Success15:
                                    { 
                                      if(cons0 == transform._consNamedPointcut_2)
                                      { 
                                        Fail16:
                                        { 
                                          IStrategoTerm a_16 = null;
                                          IStrategoTerm b_16 = null;
                                          a_16 = term.getSubterm(0);
                                          b_16 = term.getSubterm(1);
                                          term = list_to_args_0_0.instance.invoke(context, b_16);
                                          if(term == null)
                                            break Fail16;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(a_16, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
                                          if(true)
                                            break Success15;
                                        }
                                        term = term0;
                                      }
                                      Success16:
                                      { 
                                        if(cons0 == transform._consAtThis_1)
                                        { 
                                          Fail17:
                                          { 
                                            IStrategoTerm z_15 = null;
                                            z_15 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS17, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(z_15, (IStrategoList)cool.constCons1)))});
                                            if(true)
                                              break Success16;
                                          }
                                          term = term0;
                                        }
                                        Success17:
                                        { 
                                          if(cons0 == transform._consAtTarget_1)
                                          { 
                                            Fail18:
                                            { 
                                              IStrategoTerm y_15 = null;
                                              y_15 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS18, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(y_15, (IStrategoList)cool.constCons1)))});
                                              if(true)
                                                break Success17;
                                            }
                                            term = term0;
                                          }
                                          term = aspectj_to_box_0_0_fragment_3.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail0;
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