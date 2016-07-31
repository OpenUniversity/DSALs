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

@SuppressWarnings("all") public class gen_source_location_ann_0_1 extends Strategy 
{ 
  public static gen_source_location_ann_0_1 instance = new gen_source_location_ann_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_24)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("gen_source_location_ann_0_1");
    Fail134:
    { 
      IStrategoTerm e_24 = null;
      IStrategoTerm f_24 = null;
      IStrategoTerm g_24 = null;
      IStrategoTerm h_24 = null;
      IStrategoTerm i_24 = null;
      e_24 = term;
      term = get_file_0_0.instance.invoke(context, e_24);
      if(term == null)
        break Fail134;
      f_24 = term;
      term = get_location_0_0.instance.invoke(context, e_24);
      if(term == null)
        break Fail134;
      term = get_start_line_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      g_24 = term;
      term = get_location_0_0.instance.invoke(context, e_24);
      if(term == null)
        break Fail134;
      term = get_end_line_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      h_24 = term;
      term = get_location_0_0.instance.invoke(context, e_24);
      if(term == null)
        break Fail134;
      term = get_column_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      i_24 = term;
      term = get_location_0_0.instance.invoke(context, e_24);
      if(term == null)
        break Fail134;
      term = get_offset_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail134;
      term = termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{d_24})}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId17, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{f_24}), (IStrategoList)cool.constNil0)})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId16, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{g_24})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId15, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{h_24})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId14, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{i_24})})}), termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{cool.constId13, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{term})})}), (IStrategoList)cool.constNil0)))))});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}