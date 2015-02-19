package ex_base;

public class Main {
        public void foo(int a) {
		System.out.println("at foo with a = " + a);
	}
   
        public void goo(int b) {
                System.out.println("at goo with b = " + b);
	}

	public static void main(String[] args) {
            new Main().arik();
        }

 	public void arik() {
         	ex_base.Aspect.jp(7,8);

		ex_base.Aspect.sjp(4,4) {
                     System.out.println("in scoped block");
                     foo(1);
		};
	}
}
