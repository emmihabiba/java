package interfaces;

    class MyClass implements MyInterface {
        public void showMessage() { 
            System.out.println("Hello from MyClass!");
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass();
            obj.showMessage();
        }
    }
    

