package CJP;

import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.services.MetaFileLanguageValidator;

public class CjpValidator extends MetaFileLanguageValidator 
{ 
  @Override public Descriptor getDescriptor()
  { 
    return CjpParseController.getDescriptor();
  }
}