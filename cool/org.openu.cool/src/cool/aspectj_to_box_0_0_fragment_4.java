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
            IStrategoTerm d_17 = null;
            d_17 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX0, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(d_17, (IStrategoList)cool.constCons1)))});
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
              IStrategoTerm c_17 = null;
              c_17 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX1, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(c_17, (IStrategoList)cool.constCons1)))});
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
                IStrategoTerm b_17 = null;
                b_17 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX2, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(b_17, (IStrategoList)cool.constCons1)))});
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
                  IStrategoTerm a_17 = null;
                  a_17 = term.getSubterm(0);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX3, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(a_17, (IStrategoList)cool.constCons1)))});
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
                    IStrategoTerm z_16 = null;
                    z_16 = term.getSubterm(0);
                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX4, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(z_16, (IStrategoList)cool.constCons1)))});
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
                      IStrategoTerm y_16 = null;
                      y_16 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX5, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(y_16, (IStrategoList)cool.constCons1)))});
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
                          IStrategoTerm x_16 = null;
                          x_16 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX7, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(x_16, (IStrategoList)cool.constCons1)))});
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
                            IStrategoTerm w_16 = null;
                            w_16 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX8, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(w_16, (IStrategoList)cool.constCons1)))});
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
                              IStrategoTerm v_16 = null;
                              v_16 = term.getSubterm(0);
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX9, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(v_16, (IStrategoList)cool.constCons1)))});
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
                                IStrategoTerm u_16 = null;
                                u_16 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX10, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(u_16, (IStrategoList)cool.constCons1)))});
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
                                  IStrategoTerm t_16 = null;
                                  t_16 = term.getSubterm(0);
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX11, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(t_16, (IStrategoList)cool.constCons1)))});
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
                                    IStrategoTerm s_16 = null;
                                    s_16 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX12, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(s_16, (IStrategoList)cool.constCons1)))});
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
                                      IStrategoTerm r_16 = null;
                                      r_16 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX13, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(r_16, (IStrategoList)cool.constCons1)))});
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
                                        IStrategoTerm o_16 = null;
                                        o_16 = term.getSubterm(0);
                                        term = list_to_args_0_0.instance.invoke(context, o_16);
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
                                          IStrategoTerm k_16 = null;
                                          IStrategoTerm l_16 = null;
                                          k_16 = term.getSubterm(0);
                                          l_16 = term.getSubterm(1);
                                          term = list_to_args_0_0.instance.invoke(context, l_16);
                                          if(term == null)
                                            break Fail16;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(k_16, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
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
                                            IStrategoTerm j_16 = null;
                                            j_16 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS17, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(j_16, (IStrategoList)cool.constCons1)))});
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
                                              IStrategoTerm i_16 = null;
                                              i_16 = term.getSubterm(0);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS18, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(i_16, (IStrategoList)cool.constCons1)))});
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