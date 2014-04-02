package aspects.cool;

import base.BoundedStack;
import java.util.*;
import cool.runtime.*;

@COOLAspect(className = "base.BoundedStack") public class BoundedStackCoord  
{ 
  private @COOLConditionField boolean full = false;

  private @COOLConditionField boolean empty = true;

  private @COOLCoordinatorField int top = 0;

  private List push0State = Collections.synchronizedList(new Vector());

  private List pop1State = Collections.synchronizedList(new Vector());

  private static boolean isRunByOthers(List methState)
  { 
    return !methState.contains(Thread.currentThread());
  }

  @COOLRequires(methodName = "push", className = "", parameterTypes = {"java.lang.Object"}) private boolean requires_push0()
  { 
    return !full;
  }

  @COOLRequires(methodName = "pop", className = "", parameterTypes = {}) private boolean requires_pop1()
  { 
    return !empty;
  }

  @COOLOnEntry(methodName = "push", className = "", parameterTypes = {"java.lang.Object"}) private void on_entry_push0(BoundedStack target)
  { 
    top = top + 2;
  }

  @COOLOnEntry(methodName = "pop", className = "", parameterTypes = {}) private void on_entry_pop1(BoundedStack target)
  { 
    top = top - 1;
  }

  @COOLOnExit(methodName = "push", className = "", parameterTypes = {"java.lang.Object"}) private void on_exit_push0(BoundedStack target)
  { 
    empty = false;
    if(top == _ref1(target))
      full = true;
  }

  @COOLOnExit(methodName = "pop", className = "", parameterTypes = {}) private void on_exit_pop1(BoundedStack target)
  { 
    full = false;
    if(top == 0)
      empty = true;
  }

  @COOLLock(methodName = "push", className = "", parameterTypes = {"java.lang.Object"}) public synchronized void lock_push(BoundedStack target)
  { 
    while(!requires_push0() || isRunByOthers(push0State) || isRunByOthers(pop1State))
    { 
      try
      { 
        wait();
      }
      catch(InterruptedException e)
      { 
        return;
      }
    }
    on_entry_push0(target);
    push0State.add(Thread.currentThread());
  }

  @COOLUnlock(methodName = "push", className = "", parameterTypes = {"java.lang.Object"}) public synchronized void unlock_push(BoundedStack target)
  { 
    push0State.remove(Thread.currentThread());
    on_exit_push0(target);
    notifyAll();
  }

  @COOLLock(methodName = "pop", className = "", parameterTypes = {}) public synchronized void lock_pop(BoundedStack target)
  { 
    while(!requires_pop1() || isRunByOthers(pop1State) || isRunByOthers(push0State))
    { 
      try
      { 
        wait();
      }
      catch(InterruptedException e)
      { 
        return;
      }
    }
    on_entry_pop1(target);
    pop1State.add(Thread.currentThread());
  }

  @COOLUnlock(methodName = "pop", className = "", parameterTypes = {}) public synchronized void unlock_pop(BoundedStack target)
  { 
    pop1State.remove(Thread.currentThread());
    on_exit_pop1(target);
    notifyAll();
  }

  @COOLExternalRef(expr = "buffer.length") private double _ref1(BoundedStack thiz)
  { 
    return 0.0;
  }
}