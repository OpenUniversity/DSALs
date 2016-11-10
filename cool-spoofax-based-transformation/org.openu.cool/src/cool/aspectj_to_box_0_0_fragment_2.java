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

@SuppressWarnings("all") public class aspectj_to_box_0_0_fragment_2 extends Strategy 
{ 
  public static aspectj_to_box_0_0_fragment_2 instance = new aspectj_to_box_0_0_fragment_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("aspectj_to_box_0_0_fragment_2");
    Fail47:
    { 
      IStrategoTerm term45 = term;
      IStrategoConstructor cons2 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success45:
      { 
        if(cons2 == transform._consFieldPattern_4)
        { 
          Fail48:
          { 
            IStrategoTerm s_13 = null;
            IStrategoTerm t_13 = null;
            IStrategoTerm u_13 = null;
            IStrategoTerm v_13 = null;
            IStrategoTerm w_13 = null;
            IStrategoTerm arg5 = term.getSubterm(0);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail48;
            u_13 = arg5.getSubterm(0);
            IStrategoTerm arg6 = term.getSubterm(1);
            if(arg6.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg6).getConstructor())
              break Fail48;
            v_13 = arg6.getSubterm(0);
            s_13 = term.getSubterm(2);
            t_13 = term.getSubterm(3);
            term = termFactory.makeTuple(u_13, v_13);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            w_13 = term;
            term = termFactory.makeTuple(w_13, (IStrategoTerm)termFactory.makeListCons(s_13, termFactory.makeListCons(t_13, (IStrategoList)cool.constNil0)));
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
            if(true)
              break Success45;
          }
          term = term45;
        }
        Success46:
        { 
          if(cons2 == transform._consMemberName_1)
          { 
            Fail49:
            { 
              IStrategoTerm r_13 = null;
              r_13 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{r_13});
              if(true)
                break Success46;
            }
            term = term45;
          }
          Success47:
          { 
            if(cons2 == transform._consMemberName_2)
            { 
              Fail50:
              { 
                IStrategoTerm p_13 = null;
                IStrategoTerm q_13 = null;
                p_13 = term.getSubterm(0);
                q_13 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(p_13, termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{q_13}), (IStrategoList)cool.constNil0)))});
                if(true)
                  break Success47;
              }
              term = term45;
            }
            Success48:
            { 
              if(cons2 == transform._consWildcardMemberName_2)
              { 
                Fail51:
                { 
                  IStrategoTerm n_13 = null;
                  IStrategoTerm o_13 = null;
                  n_13 = term.getSubterm(0);
                  o_13 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(n_13, termFactory.makeListCons(cool.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{o_13}), (IStrategoList)cool.constNil0)))});
                  if(true)
                    break Success48;
                }
                term = term45;
              }
              Success49:
              { 
                if(cons2 == transform._consConstrName_0)
                { 
                  Fail52:
                  { 
                    term = cool.constFBOX19;
                    if(true)
                      break Success49;
                  }
                  term = term45;
                }
                Success50:
                { 
                  if(cons2 == transform._consConstrName_1)
                  { 
                    Fail53:
                    { 
                      IStrategoTerm m_13 = null;
                      m_13 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(m_13, (IStrategoList)cool.constCons9)});
                      if(true)
                        break Success50;
                    }
                    term = term45;
                  }
                  Success51:
                  { 
                    if(cons2 == transform._consWildcardConstrName_1)
                    { 
                      Fail54:
                      { 
                        IStrategoTerm l_13 = null;
                        l_13 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(l_13, (IStrategoList)cool.constCons10)});
                        if(true)
                          break Success51;
                      }
                      term = term45;
                    }
                    Success52:
                    { 
                      if(cons2 == transform._consNot_1)
                      { 
                        Fail55:
                        { 
                          IStrategoTerm k_13 = null;
                          k_13 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(k_13, (IStrategoList)cool.constNil0))});
                          if(true)
                            break Success52;
                        }
                        term = term45;
                      }
                      Success53:
                      { 
                        if(cons2 == transform._consModPattern_1)
                        { 
                          Fail56:
                          { 
                            IStrategoTerm j_13 = null;
                            j_13 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, j_13});
                            if(true)
                              break Success53;
                          }
                          term = term45;
                        }
                        Success54:
                        { 
                          if(cons2 == transform._consThrowsPattern_1)
                          { 
                            Fail57:
                            { 
                              IStrategoTerm g_13 = null;
                              g_13 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, g_13);
                              if(term == null)
                                break Fail57;
                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(cool.constFBOX20, termFactory.makeListCons(term, (IStrategoList)cool.constNil0))});
                              if(true)
                                break Success54;
                            }
                            term = term45;
                          }
                          Success55:
                          { 
                            if(cons2 == transform._consNotThrowsCondition_1)
                            { 
                              Fail58:
                              { 
                                IStrategoTerm f_13 = null;
                                f_13 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(f_13, (IStrategoList)cool.constNil0))});
                                if(true)
                                  break Success55;
                              }
                              term = term45;
                            }
                            Success56:
                            { 
                              if(cons2 == transform._consThrowsCondition_1)
                              { 
                                Fail59:
                                { 
                                  IStrategoTerm d_13 = null;
                                  d_13 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, d_13);
                                  if(term == null)
                                    break Fail59;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS1, termFactory.makeListCons(d_13, (IStrategoList)cool.constCons1))});
                                  if(true)
                                    break Success56;
                                }
                                term = term45;
                              }
                              Success57:
                              { 
                                if(cons2 == transform._consThrowsCondition_1)
                                { 
                                  Fail60:
                                  { 
                                    IStrategoTerm b_13 = null;
                                    b_13 = term.getSubterm(0);
                                    term = b_13;
                                    IStrategoTerm term58 = term;
                                    Success58:
                                    { 
                                      Fail61:
                                      { 
                                        term = has_leftmost_not_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail61;
                                        { 
                                          if(true)
                                            break Fail60;
                                          if(true)
                                            break Success58;
                                        }
                                      }
                                      term = term58;
                                    }
                                    term = b_13;
                                    if(true)
                                      break Success57;
                                  }
                                  term = term45;
                                }
                                Success59:
                                { 
                                  if(cons2 == transform._consSimpleAnnoPatternExact_1)
                                  { 
                                    Fail62:
                                    { 
                                      IStrategoTerm a_13 = null;
                                      a_13 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(a_13, (IStrategoList)cool.constNil0))});
                                      if(true)
                                        break Success59;
                                    }
                                    term = term45;
                                  }
                                  Success60:
                                  { 
                                    if(cons2 == transform._consSimpleAnnoPattern_1)
                                    { 
                                      Fail63:
                                      { 
                                        IStrategoTerm z_12 = null;
                                        z_12 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(z_12, (IStrategoList)cool.constCons1)))});
                                        if(true)
                                          break Success60;
                                      }
                                      term = term45;
                                    }
                                    Success61:
                                    { 
                                      if(cons2 == transform._consSimpleAnnoPatternValue_2)
                                      { 
                                        Fail64:
                                        { 
                                          IStrategoTerm x_12 = null;
                                          IStrategoTerm y_12 = null;
                                          x_12 = term.getSubterm(0);
                                          y_12 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(x_12, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(y_12, (IStrategoList)cool.constCons1))))});
                                          if(true)
                                            break Success61;
                                        }
                                        term = term45;
                                      }
                                      Success62:
                                      { 
                                        if(cons2 == transform._consNotComp_1)
                                        { 
                                          Fail65:
                                          { 
                                            IStrategoTerm w_12 = null;
                                            w_12 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(w_12, (IStrategoList)cool.constNil0))});
                                            if(true)
                                              break Success62;
                                          }
                                          term = term45;
                                        }
                                        Success63:
                                        { 
                                          if(cons2 == transform._consAndComp_2)
                                          { 
                                            Fail66:
                                            { 
                                              IStrategoTerm u_12 = null;
                                              IStrategoTerm v_12 = null;
                                              u_12 = term.getSubterm(0);
                                              v_12 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(u_12, termFactory.makeListCons(cool.constS35, termFactory.makeListCons(v_12, (IStrategoList)cool.constNil0)))});
                                              if(true)
                                                break Success63;
                                            }
                                            term = term45;
                                          }
                                          Success64:
                                          { 
                                            if(cons2 == transform._consOrComp_2)
                                            { 
                                              Fail67:
                                              { 
                                                IStrategoTerm s_12 = null;
                                                IStrategoTerm t_12 = null;
                                                s_12 = term.getSubterm(0);
                                                t_12 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(s_12, termFactory.makeListCons(cool.constS36, termFactory.makeListCons(t_12, (IStrategoList)cool.constNil0)))});
                                                if(true)
                                                  break Success64;
                                              }
                                              term = term45;
                                            }
                                            Success65:
                                            { 
                                              if(cons2 == transform._consIntertypeMethodDec_2)
                                              { 
                                                Fail68:
                                                { 
                                                  IStrategoTerm q_12 = null;
                                                  IStrategoTerm r_12 = null;
                                                  q_12 = term.getSubterm(0);
                                                  IStrategoTerm arg7 = term.getSubterm(1);
                                                  r_12 = arg7;
                                                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                                                    break Fail68;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(q_12, termFactory.makeListCons(r_12, (IStrategoList)cool.constNil0))});
                                                  if(true)
                                                    break Success65;
                                                }
                                                term = term45;
                                              }
                                              Success66:
                                              { 
                                                if(cons2 == transform._consIntertypeMethodDec_2)
                                                { 
                                                  Fail69:
                                                  { 
                                                    IStrategoTerm p_12 = null;
                                                    p_12 = term.getSubterm(0);
                                                    IStrategoTerm arg9 = term.getSubterm(1);
                                                    if(arg9.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg9).getConstructor())
                                                      break Fail69;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(p_12, (IStrategoList)cool.constCons5)});
                                                    if(true)
                                                      break Success66;
                                                  }
                                                  term = term45;
                                                }
                                                Success67:
                                                { 
                                                  if(cons2 == transform._consIntertypeMethodDecHead_8)
                                                  { 
                                                    Fail70:
                                                    { 
                                                      IStrategoTerm x_11 = null;
                                                      IStrategoTerm y_11 = null;
                                                      IStrategoTerm z_11 = null;
                                                      IStrategoTerm a_12 = null;
                                                      IStrategoTerm b_12 = null;
                                                      IStrategoTerm c_12 = null;
                                                      IStrategoTerm d_12 = null;
                                                      IStrategoTerm e_12 = null;
                                                      IStrategoTerm f_12 = null;
                                                      IStrategoTerm g_12 = null;
                                                      IStrategoTerm h_12 = null;
                                                      IStrategoTerm i_12 = null;
                                                      IStrategoTerm j_12 = null;
                                                      IStrategoTerm k_12 = null;
                                                      IStrategoTerm n_12 = null;
                                                      IStrategoTerm o_12 = null;
                                                      h_12 = term.getSubterm(0);
                                                      c_12 = term.getSubterm(1);
                                                      x_11 = term.getSubterm(2);
                                                      y_11 = term.getSubterm(3);
                                                      d_12 = term.getSubterm(4);
                                                      IStrategoTerm arg10 = term.getSubterm(5);
                                                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                                                        break Fail70;
                                                      z_11 = arg10.getSubterm(0);
                                                      a_12 = term.getSubterm(6);
                                                      f_12 = term.getSubterm(7);
                                                      k_12 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, a_12);
                                                      if(term == null)
                                                        break Fail70;
                                                      b_12 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, c_12);
                                                      if(term == null)
                                                        break Fail70;
                                                      i_12 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, d_12);
                                                      if(term == null)
                                                        break Fail70;
                                                      e_12 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, f_12);
                                                      if(term == null)
                                                        break Fail70;
                                                      g_12 = term;
                                                      term = termFactory.makeTuple(h_12, i_12);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      j_12 = term;
                                                      term = k_12;
                                                      o_12 = term;
                                                      term = termFactory.makeTuple(e_12, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{z_11}), termFactory.makeListCons(b_12, (IStrategoList)cool.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      n_12 = term;
                                                      term = o_12;
                                                      IStrategoList list2;
                                                      IStrategoList list1;
                                                      list1 = checkListTail(g_12);
                                                      if(list1 == null)
                                                        break Fail70;
                                                      list2 = checkListTail(n_12);
                                                      if(list2 == null)
                                                        break Fail70;
                                                      term = termFactory.makeTuple(j_12, (IStrategoTerm)termFactory.makeListCons(x_11, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(y_11, list2)}), list1)));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, term});
                                                      if(true)
                                                        break Success67;
                                                    }
                                                    term = term45;
                                                  }
                                                  Success68:
                                                  { 
                                                    if(cons2 == transform._consIntertypeConstrDec_2)
                                                    { 
                                                      Fail71:
                                                      { 
                                                        IStrategoTerm v_11 = null;
                                                        IStrategoTerm w_11 = null;
                                                        v_11 = term.getSubterm(0);
                                                        w_11 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(v_11, termFactory.makeListCons(w_11, (IStrategoList)cool.constNil0))});
                                                        if(true)
                                                          break Success68;
                                                      }
                                                      term = term45;
                                                    }
                                                    term = aspectj_to_box_0_0_fragment_1.instance.invoke(context, term);
                                                    if(term == null)
                                                      break Fail47;
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