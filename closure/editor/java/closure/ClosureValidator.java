package closure;

import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.services.MetaFileLanguageValidator;

public class ClosureValidator extends MetaFileLanguageValidator 
{ 
  @Override public Descriptor getDescriptor()
  { 
    return ClosureParseController.getDescriptor();
  }
}