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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_3 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_3 instance = new aspectj_to_box_0_0_fragment_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_3");
    Fail19:
    { 
      IStrategoTerm term18 = term;
      IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success18:
      { 
        if(cons1 == transform._consAtWithin_1)
        { 
          Fail20:
          { 
            IStrategoTerm h_16 = null;
            h_16 = term.getSubterm(0);
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS19, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(h_16, (IStrategoList)cool.constCons1)))});
            if(true)
              break Success18;
          }
          term = term18;
        }
        Success19:
        { 
          if(cons1 == transform._consAtWithinCode_1)
          { 
            Fail21:
            { 
              IStrategoTerm g_16 = null;
              g_16 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS20, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(g_16, (IStrategoList)cool.constCons1)))});
              if(true)
                break Success19;
            }
            term = term18;
          }
          Success20:
          { 
            if(cons1 == transform._consAtAnno_1)
            { 
              Fail22:
              { 
                IStrategoTerm f_16 = null;
                f_16 = term.getSubterm(0);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS21, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(f_16, (IStrategoList)cool.constCons1)))});
                if(true)
                  break Success20;
              }
              term = term18;
            }
            Success21:
            { 
              if(cons1 == transform._consAtArgs_1)
              { 
                Fail23:
                { 
                  IStrategoTerm c_16 = null;
                  c_16 = term.getSubterm(0);
                  term = list_to_args_0_0.instance.invoke(context, c_16);
                  if(term == null)
                    break Fail23;
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS22, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
                  if(true)
                    break Success21;
                }
                term = term18;
              }
              Success22:
              { 
                if(cons1 == transform._consPointcutName_1)
                { 
                  Fail24:
                  { 
                    IStrategoTerm b_16 = null;
                    b_16 = term.getSubterm(0);
                    term = b_16;
                    if(true)
                      break Success22;
                  }
                  term = term18;
                }
                Success23:
                { 
                  if(cons1 == transform._consPointcutName_2)
                  { 
                    Fail25:
                    { 
                      IStrategoTerm z_15 = null;
                      IStrategoTerm a_16 = null;
                      z_15 = term.getSubterm(0);
                      a_16 = term.getSubterm(1);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(z_15, termFactory.makeListCons(cool.constS23, termFactory.makeListCons(a_16, (IStrategoList)cool.constNil0)))});
                      if(true)
                        break Success23;
                    }
                    term = term18;
                  }
                  Success24:
                  { 
                    if(cons1 == transform._consPointcutDec_2)
                    { 
                      Fail26:
                      { 
                        IStrategoTerm x_15 = null;
                        IStrategoTerm y_15 = null;
                        x_15 = term.getSubterm(0);
                        y_15 = term.getSubterm(1);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(x_15, termFactory.makeListCons(y_15, (IStrategoList)cool.constNil0))});
                        if(true)
                          break Success24;
                      }
                      term = term18;
                    }
                    Success25:
                    { 
                      if(cons1 == transform._consPointcutDecHead_3)
                      { 
                        Fail27:
                        { 
                          IStrategoTerm q_15 = null;
                          IStrategoTerm r_15 = null;
                          IStrategoTerm s_15 = null;
                          IStrategoTerm t_15 = null;
                          q_15 = term.getSubterm(0);
                          r_15 = term.getSubterm(1);
                          s_15 = term.getSubterm(2);
                          term = list_to_args_0_0.instance.invoke(context, s_15);
                          if(term == null)
                            break Fail27;
                          t_15 = term;
                          term = termFactory.makeTuple(q_15, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX15, termFactory.makeListCons(r_15, termFactory.makeListCons(t_15, (IStrategoList)cool.constNil0))));
                          term = make$Conc_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail27;
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                          if(true)
                            break Success25;
                        }
                        term = term18;
                      }
                      Success26:
                      { 
                        if(cons1 == transform._consPointcutBody_1)
                        { 
                          Fail28:
                          { 
                            IStrategoTerm p_15 = null;
                            p_15 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS26, termFactory.makeListCons(p_15, (IStrategoList)cool.constCons5))});
                            if(true)
                              break Success26;
                          }
                          term = term18;
                        }
                        Success27:
                        { 
                          if(cons1 == transform._consNoPointcutBody_0)
                          { 
                            Fail29:
                            { 
                              term = cool.constFBOX16;
                              if(true)
                                break Success27;
                            }
                            term = term18;
                          }
                          Success28:
                          { 
                            if(cons1 == transform._consRefTypePattern_1)
                            { 
                              Fail30:
                              { 
                                IStrategoTerm o_15 = null;
                                o_15 = term.getSubterm(0);
                                term = o_15;
                                if(true)
                                  break Success28;
                              }
                              term = term18;
                            }
                            Success29:
                            { 
                              if(cons1 == transform._consPrimTypePattern_1)
                              { 
                                Fail31:
                                { 
                                  IStrategoTerm n_15 = null;
                                  n_15 = term.getSubterm(0);
                                  term = n_15;
                                  if(true)
                                    break Success29;
                                }
                                term = term18;
                              }
                              Success30:
                              { 
                                if(cons1 == transform._consSubtype_1)
                                { 
                                  Fail32:
                                  { 
                                    IStrategoTerm m_15 = null;
                                    m_15 = term.getSubterm(0);
                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(m_15, (IStrategoList)cool.constCons6)});
                                    if(true)
                                      break Success30;
                                  }
                                  term = term18;
                                }
                                Success31:
                                { 
                                  if(cons1 == transform._consGenericTypePattern_2)
                                  { 
                                    Fail33:
                                    { 
                                      IStrategoTerm k_15 = null;
                                      IStrategoTerm l_15 = null;
                                      k_15 = term.getSubterm(0);
                                      l_15 = term.getSubterm(1);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(k_15, termFactory.makeListCons(l_15, (IStrategoList)cool.constNil0))});
                                      if(true)
                                        break Success31;
                                    }
                                    term = term18;
                                  }
                                  Success32:
                                  { 
                                    if(cons1 == transform._consGenericSubtypePattern_2)
                                    { 
                                      Fail34:
                                      { 
                                        IStrategoTerm i_15 = null;
                                        IStrategoTerm j_15 = null;
                                        i_15 = term.getSubterm(0);
                                        j_15 = term.getSubterm(1);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(i_15, termFactory.makeListCons(j_15, (IStrategoList)cool.constCons6))});
                                        if(true)
                                          break Success32;
                                      }
                                      term = term18;
                                    }
                                    Success33:
                                    { 
                                      if(cons1 == transform._consAnnoTypePattern_2)
                                      { 
                                        Fail35:
                                        { 
                                          IStrategoTerm e_15 = null;
                                          IStrategoTerm f_15 = null;
                                          IStrategoTerm arg0 = term.getSubterm(0);
                                          if(arg0.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg0).getConstructor())
                                            break Fail35;
                                          e_15 = arg0.getSubterm(0);
                                          f_15 = term.getSubterm(1);
                                          term = termFactory.makeTuple(e_15, (IStrategoTerm)termFactory.makeListCons(f_15, (IStrategoList)cool.constNil0));
                                          term = make$Conc_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail35;
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term}), (IStrategoList)cool.constNil0)});
                                          if(true)
                                            break Success33;
                                        }
                                        term = term18;
                                      }
                                      Success34:
                                      { 
                                        if(cons1 == transform._consNamePattern_1)
                                        { 
                                          Fail36:
                                          { 
                                            IStrategoTerm d_15 = null;
                                            d_15 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{d_15}), (IStrategoList)cool.constNil0)});
                                            if(true)
                                              break Success34;
                                          }
                                          term = term18;
                                        }
                                        Success35:
                                        { 
                                          if(cons1 == transform._consNamePattern_2)
                                          { 
                                            Fail37:
                                            { 
                                              IStrategoTerm b_15 = null;
                                              IStrategoTerm c_15 = null;
                                              b_15 = term.getSubterm(0);
                                              c_15 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(b_15, termFactory.makeListCons(cool.constFBOX17, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{c_15}), (IStrategoList)cool.constNil0)))});
                                              if(true)
                                                break Success35;
                                            }
                                            term = term18;
                                          }
                                          Success36:
                                          { 
                                            if(cons1 == transform._consWildcardNamePattern_2)
                                            { 
                                              Fail38:
                                              { 
                                                IStrategoTerm z_14 = null;
                                                IStrategoTerm a_15 = null;
                                                z_14 = term.getSubterm(0);
                                                a_15 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(z_14, termFactory.makeListCons(cool.constFBOX18, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{a_15}), (IStrategoList)cool.constNil0)))});
                                                if(true)
                                                  break Success36;
                                              }
                                              term = term18;
                                            }
                                            Success37:
                                            { 
                                              if(cons1 == transform._consFormalWildcard_0)
                                              { 
                                                Fail39:
                                                { 
                                                  term = cool.constS28;
                                                  if(true)
                                                    break Success37;
                                                }
                                                term = term18;
                                              }
                                              Success38:
                                              { 
                                                if(cons1 == transform._consVarArityParamPattern_1)
                                                { 
                                                  Fail40:
                                                  { 
                                                    IStrategoTerm y_14 = null;
                                                    y_14 = term.getSubterm(0);
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(y_14, (IStrategoList)cool.constCons7)});
                                                    if(true)
                                                      break Success38;
                                                  }
                                                  term = term18;
                                                }
                                                Success39:
                                                { 
                                                  if(cons1 == transform._consRegularTypePattern_1)
                                                  { 
                                                    Fail41:
                                                    { 
                                                      IStrategoTerm x_14 = null;
                                                      x_14 = term.getSubterm(0);
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(x_14, (IStrategoList)cool.constNil0)});
                                                      if(true)
                                                        break Success39;
                                                    }
                                                    term = term18;
                                                  }
                                                  Success40:
                                                  { 
                                                    if(cons1 == transform._consWildcard_0)
                                                    { 
                                                      Fail42:
                                                      { 
                                                        term = cool.constS30;
                                                        if(true)
                                                          break Success40;
                                                      }
                                                      term = term18;
                                                    }
                                                    Success41:
                                                    { 
                                                      if(cons1 == transform._consDotWildcard_0)
                                                      { 
                                                        Fail43:
                                                        { 
                                                          term = cool.constS28;
                                                          if(true)
                                                            break Success41;
                                                        }
                                                        term = term18;
                                                      }
                                                      Success42:
                                                      { 
                                                        if(cons1 == transform._consSimpleNamePattern_1)
                                                        { 
                                                          Fail44:
                                                          { 
                                                            IStrategoTerm w_14 = null;
                                                            w_14 = term.getSubterm(0);
                                                            term = w_14;
                                                            if(true)
                                                              break Success42;
                                                          }
                                                          term = term18;
                                                        }
                                                        Success43:
                                                        { 
                                                          if(cons1 == transform._consMethodPattern_6)
                                                          { 
                                                            Fail45:
                                                            { 
                                                              IStrategoTerm k_14 = null;
                                                              IStrategoTerm l_14 = null;
                                                              IStrategoTerm m_14 = null;
                                                              IStrategoTerm n_14 = null;
                                                              IStrategoTerm o_14 = null;
                                                              IStrategoTerm p_14 = null;
                                                              IStrategoTerm q_14 = null;
                                                              IStrategoTerm r_14 = null;
                                                              IStrategoTerm s_14 = null;
                                                              IStrategoTerm t_14 = null;
                                                              IStrategoTerm arg1 = term.getSubterm(0);
                                                              if(arg1.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg1).getConstructor())
                                                                break Fail45;
                                                              m_14 = arg1.getSubterm(0);
                                                              IStrategoTerm arg2 = term.getSubterm(1);
                                                              if(arg2.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg2).getConstructor())
                                                                break Fail45;
                                                              n_14 = arg2.getSubterm(0);
                                                              k_14 = term.getSubterm(2);
                                                              l_14 = term.getSubterm(3);
                                                              p_14 = term.getSubterm(4);
                                                              r_14 = term.getSubterm(5);
                                                              t_14 = term;
                                                              term = termFactory.makeTuple(m_14, n_14);
                                                              term = conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              o_14 = term;
                                                              term = list_to_args_0_0.instance.invoke(context, p_14);
                                                              if(term == null)
                                                                break Fail45;
                                                              q_14 = term;
                                                              term = option_to_boxes_0_0.instance.invoke(context, r_14);
                                                              if(term == null)
                                                                break Fail45;
                                                              s_14 = term;
                                                              term = t_14;
                                                              IStrategoList list0;
                                                              list0 = checkListTail(s_14);
                                                              if(list0 == null)
                                                                break Fail45;
                                                              term = termFactory.makeTuple(o_14, (IStrategoTerm)termFactory.makeListCons(k_14, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(l_14, termFactory.makeListCons(q_14, (IStrategoList)cool.constNil0))}), list0)));
                                                              term = make$Conc_0_0.instance.invoke(context, term);
                                                              if(term == null)
                                                                break Fail45;
                                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                                              if(true)
                                                                break Success43;
                                                            }
                                                            term = term18;
                                                          }
                                                          Success44:
                                                          { 
                                                            if(cons1 == transform._consConstrPattern_5)
                                                            { 
                                                              Fail46:
                                                              { 
                                                                IStrategoTerm a_14 = null;
                                                                IStrategoTerm b_14 = null;
                                                                IStrategoTerm c_14 = null;
                                                                IStrategoTerm d_14 = null;
                                                                IStrategoTerm e_14 = null;
                                                                IStrategoTerm f_14 = null;
                                                                IStrategoTerm g_14 = null;
                                                                IStrategoTerm arg3 = term.getSubterm(0);
                                                                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg3).getConstructor())
                                                                  break Fail46;
                                                                c_14 = arg3.getSubterm(0);
                                                                IStrategoTerm arg4 = term.getSubterm(1);
                                                                if(arg4.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg4).getConstructor())
                                                                  break Fail46;
                                                                d_14 = arg4.getSubterm(0);
                                                                a_14 = term.getSubterm(2);
                                                                f_14 = term.getSubterm(3);
                                                                b_14 = term.getSubterm(4);
                                                                term = termFactory.makeTuple(c_14, d_14);
                                                                term = conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                e_14 = term;
                                                                term = list_to_args_0_0.instance.invoke(context, f_14);
                                                                if(term == null)
                                                                  break Fail46;
                                                                g_14 = term;
                                                                term = termFactory.makeTuple(e_14, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(a_14, termFactory.makeListCons(g_14, (IStrategoList)cool.constNil0))}), termFactory.makeListCons(b_14, (IStrategoList)cool.constNil0)));
                                                                term = make$Conc_0_0.instance.invoke(context, term);
                                                                if(term == null)
                                                                  break Fail46;
                                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                                                if(true)
                                                                  break Success44;
                                                              }
                                                              term = term18;
                                                            }
                                                            term = aspectj_to_box_0_0_fragment_2.instance.invoke(context, term);
                                                            if(term == null)
                                                              break Fail19;
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