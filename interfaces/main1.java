package interfaces;


    interface Animal {
        void makeSound();
    }
    
    
    class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof! Woof!");
        }
    }
    
   
    class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow! Meow!");
        }
    }
    public class main1 {
        public static void main(String[] args) {
           
            Animal myDog = new Dog();
            Animal myCat = new Cat();
    
            // Call the makeSound method for each animal
            myDog.makeSound(); // Output: Woof! Woof!
            myCat.makeSound(); // Output: Meow! Meow!
        }
    }
    
    
