package Inheritance;
public class Override{


class A {
    
    public void methodA1() {
        System.out.println("Method A1 in Class A");
    }

 
    public void methodA2() {
        System.out.println("Method A2 in Class A");
    }


    public void methodOverride() {
        System.out.println("Method Override in Class A");
    }
}


class B extends A {
    
    public void methodB1() {
        System.out.println("Method B1 in Class B");
    }

  
    public void methodB2() {
        System.out.println("Method B2 in Class B");
    }

   
    public void methodOverride() {
        System.out.println("Method Override in Class B");
    }
}

class C extends B {

    public void methodC1() {
        System.out.println("Method C1 in Class C");
    }

    public void methodC2() {
        System.out.println("Method C2 in Class C");
    }

   
   
    public void methodOverride() {
        System.out.println("Method Override in Class C");
    }



    public static void main(String[] args) {
        A a = new A();
        a.methodA1();
        a.methodA2();
        a.methodOverride();

        System.out.println();

        B b = new B();
        b.methodA1(); 
        b.methodA2(); 
        b.methodB1();
        b.methodB2();
        b.methodOverride(); 
        System.out.println();

        C c = new C();
        c.methodA1(); 
        c.methodA2();  
        c.methodB1();  
        c.methodB2();  
        c.methodC1();
        c.methodC2();
        c.methodOverride();  
    }
}

}


    

