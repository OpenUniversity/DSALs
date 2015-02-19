package ex_base;

import org.aspectj.lang.reflect.*;
import org.aspectj.lang.annotation.Before;

public aspect Aspect {
 
  public scoped joinpoint void sjp(int a, int b);

  public joinpoint void jp(int a, int b);
  
  before(): call(ejp(ex_base.Aspect.jp)) {
	 System.out.println("before calling jp");
  }

  before(): call(ejp(ex_base.Aspect.sjp)) {
         System.out.println("before calling sjp");
  }

  after(): call(ejpscope(ex_base.Aspect.sjp)) {
	System.out.println("after calling scoped sjp");
  }
}

