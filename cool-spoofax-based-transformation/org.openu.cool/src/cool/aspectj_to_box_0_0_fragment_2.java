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
            IStrategoTerm i_13 = null;
            IStrategoTerm j_13 = null;
            IStrategoTerm k_13 = null;
            IStrategoTerm l_13 = null;
            IStrategoTerm m_13 = null;
            IStrategoTerm arg5 = term.getSubterm(0);
            if(arg5.getTermType() != IStrategoTerm.APPL || transform._consAnnoPattern_1 != ((IStrategoAppl)arg5).getConstructor())
              break Fail48;
            k_13 = arg5.getSubterm(0);
            IStrategoTerm arg6 = term.getSubterm(1);
            if(arg6.getTermType() != IStrategoTerm.APPL || transform._consModPattern_1 != ((IStrategoAppl)arg6).getConstructor())
              break Fail48;
            l_13 = arg6.getSubterm(0);
            i_13 = term.getSubterm(2);
            j_13 = term.getSubterm(3);
            term = termFactory.makeTuple(k_13, l_13);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail48;
            m_13 = term;
            term = termFactory.makeTuple(m_13, (IStrategoTerm)termFactory.makeListCons(i_13, termFactory.makeListCons(j_13, (IStrategoList)cool.constNil0)));
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
              IStrategoTerm h_13 = null;
              h_13 = term.getSubterm(0);
              term = termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{h_13});
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
                IStrategoTerm f_13 = null;
                IStrategoTerm g_13 = null;
                f_13 = term.getSubterm(0);
                g_13 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(f_13, termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{g_13}), (IStrategoList)cool.constNil0)))});
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
                  IStrategoTerm d_13 = null;
                  IStrategoTerm e_13 = null;
                  d_13 = term.getSubterm(0);
                  e_13 = term.getSubterm(1);
                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(d_13, termFactory.makeListCons(cool.constS28, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{e_13}), (IStrategoList)cool.constNil0)))});
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
                      IStrategoTerm c_13 = null;
                      c_13 = term.getSubterm(0);
                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(c_13, (IStrategoList)cool.constCons9)});
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
                        IStrategoTerm b_13 = null;
                        b_13 = term.getSubterm(0);
                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(b_13, (IStrategoList)cool.constCons10)});
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
                          IStrategoTerm a_13 = null;
                          a_13 = term.getSubterm(0);
                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(a_13, (IStrategoList)cool.constNil0))});
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
                            IStrategoTerm z_12 = null;
                            z_12 = term.getSubterm(0);
                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, z_12});
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
                              IStrategoTerm w_12 = null;
                              w_12 = term.getSubterm(0);
                              term = separate_by_comma_0_0.instance.invoke(context, w_12);
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
                                IStrategoTerm v_12 = null;
                                v_12 = term.getSubterm(0);
                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(v_12, (IStrategoList)cool.constNil0))});
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
                                  IStrategoTerm t_12 = null;
                                  t_12 = term.getSubterm(0);
                                  term = has_leftmost_not_0_0.instance.invoke(context, t_12);
                                  if(term == null)
                                    break Fail59;
                                  term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS1, termFactory.makeListCons(t_12, (IStrategoList)cool.constCons1))});
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
                                    IStrategoTerm r_12 = null;
                                    r_12 = term.getSubterm(0);
                                    term = r_12;
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
                                    term = r_12;
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
                                      IStrategoTerm q_12 = null;
                                      q_12 = term.getSubterm(0);
                                      term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(q_12, (IStrategoList)cool.constNil0))});
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
                                        IStrategoTerm p_12 = null;
                                        p_12 = term.getSubterm(0);
                                        term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(p_12, (IStrategoList)cool.constCons1)))});
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
                                          IStrategoTerm n_12 = null;
                                          IStrategoTerm o_12 = null;
                                          n_12 = term.getSubterm(0);
                                          o_12 = term.getSubterm(1);
                                          term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS34, termFactory.makeListCons(n_12, termFactory.makeListCons(cool.constS1, termFactory.makeListCons(o_12, (IStrategoList)cool.constCons1))))});
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
                                            IStrategoTerm m_12 = null;
                                            m_12 = term.getSubterm(0);
                                            term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(cool.constS32, termFactory.makeListCons(m_12, (IStrategoList)cool.constNil0))});
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
                                              IStrategoTerm k_12 = null;
                                              IStrategoTerm l_12 = null;
                                              k_12 = term.getSubterm(0);
                                              l_12 = term.getSubterm(1);
                                              term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(k_12, termFactory.makeListCons(cool.constS35, termFactory.makeListCons(l_12, (IStrategoList)cool.constNil0)))});
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
                                                IStrategoTerm i_12 = null;
                                                IStrategoTerm j_12 = null;
                                                i_12 = term.getSubterm(0);
                                                j_12 = term.getSubterm(1);
                                                term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons4, (IStrategoTerm)termFactory.makeListCons(i_12, termFactory.makeListCons(cool.constS36, termFactory.makeListCons(j_12, (IStrategoList)cool.constNil0)))});
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
                                                  IStrategoTerm g_12 = null;
                                                  IStrategoTerm h_12 = null;
                                                  g_12 = term.getSubterm(0);
                                                  IStrategoTerm arg7 = term.getSubterm(1);
                                                  h_12 = arg7;
                                                  if(arg7.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)arg7).getConstructor())
                                                    break Fail68;
                                                  term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(g_12, termFactory.makeListCons(h_12, (IStrategoList)cool.constNil0))});
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
                                                    IStrategoTerm f_12 = null;
                                                    f_12 = term.getSubterm(0);
                                                    IStrategoTerm arg9 = term.getSubterm(1);
                                                    if(arg9.getTermType() != IStrategoTerm.APPL || transform._consNoMethodBody_0 != ((IStrategoAppl)arg9).getConstructor())
                                                      break Fail69;
                                                    term = termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(f_12, (IStrategoList)cool.constCons5)});
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
                                                      IStrategoTerm n_11 = null;
                                                      IStrategoTerm o_11 = null;
                                                      IStrategoTerm p_11 = null;
                                                      IStrategoTerm q_11 = null;
                                                      IStrategoTerm r_11 = null;
                                                      IStrategoTerm s_11 = null;
                                                      IStrategoTerm t_11 = null;
                                                      IStrategoTerm u_11 = null;
                                                      IStrategoTerm v_11 = null;
                                                      IStrategoTerm w_11 = null;
                                                      IStrategoTerm x_11 = null;
                                                      IStrategoTerm y_11 = null;
                                                      IStrategoTerm z_11 = null;
                                                      IStrategoTerm a_12 = null;
                                                      IStrategoTerm d_12 = null;
                                                      IStrategoTerm e_12 = null;
                                                      x_11 = term.getSubterm(0);
                                                      s_11 = term.getSubterm(1);
                                                      n_11 = term.getSubterm(2);
                                                      o_11 = term.getSubterm(3);
                                                      t_11 = term.getSubterm(4);
                                                      IStrategoTerm arg10 = term.getSubterm(5);
                                                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                                                        break Fail70;
                                                      p_11 = arg10.getSubterm(0);
                                                      q_11 = term.getSubterm(6);
                                                      v_11 = term.getSubterm(7);
                                                      a_12 = term;
                                                      term = list_to_args_0_0.instance.invoke(context, q_11);
                                                      if(term == null)
                                                        break Fail70;
                                                      r_11 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, s_11);
                                                      if(term == null)
                                                        break Fail70;
                                                      y_11 = term;
                                                      term = type_params_to_boxes_0_0.instance.invoke(context, t_11);
                                                      if(term == null)
                                                        break Fail70;
                                                      u_11 = term;
                                                      term = option_to_boxes_0_0.instance.invoke(context, v_11);
                                                      if(term == null)
                                                        break Fail70;
                                                      w_11 = term;
                                                      term = termFactory.makeTuple(x_11, y_11);
                                                      term = conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      z_11 = term;
                                                      term = a_12;
                                                      e_12 = term;
                                                      term = termFactory.makeTuple(u_11, (IStrategoTerm)termFactory.makeListCons(cool.constS23, termFactory.makeListCons(termFactory.makeAppl(transform._consS_1, new IStrategoTerm[]{p_11}), termFactory.makeListCons(r_11, (IStrategoList)cool.constNil0))));
                                                      term = make$Conc_0_0.instance.invoke(context, term);
                                                      if(term == null)
                                                        break Fail70;
                                                      d_12 = term;
                                                      term = e_12;
                                                      IStrategoList list2;
                                                      IStrategoList list1;
                                                      list1 = checkListTail(w_11);
                                                      if(list1 == null)
                                                        break Fail70;
                                                      list2 = checkListTail(d_12);
                                                      if(list2 == null)
                                                        break Fail70;
                                                      term = termFactory.makeTuple(z_11, (IStrategoTerm)termFactory.makeListCons(n_11, termFactory.makeListCons(termFactory.makeAppl(transform._consH_2, new IStrategoTerm[]{cool.constCons0, (IStrategoTerm)termFactory.makeListCons(o_11, list2)}), list1)));
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
                                                        IStrategoTerm l_11 = null;
                                                        IStrategoTerm m_11 = null;
                                                        l_11 = term.getSubterm(0);
                                                        m_11 = term.getSubterm(1);
                                                        term = termFactory.makeAppl(transform._consV_2, new IStrategoTerm[]{cool.constCons11, (IStrategoTerm)termFactory.makeListCons(l_11, termFactory.makeListCons(m_11, (IStrategoList)cool.constNil0))});
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