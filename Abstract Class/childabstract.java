abstract class Animal {  
  
    public abstract void makeSound();  
 
    public void eat() {  
        System.out.println("Animal is eating.");  
    }  
}  

class Dog extends Animal {  
 
    @Override  
    public void makeSound() {  
        System.out.println("Woof!");  
    }  

   
    public void demonstrateCallFromChild() {  
        Dog anotherDog = new Dog(); 
        anotherDog.makeSound();  
        anotherDog.eat(); 
    }  
}  

public class childabstract {  
    public static void main(String[] args) {  
       
        Dog myDog = new Dog();  

        
        myDog.demonstrateCallFromChild();   
    }  
}
