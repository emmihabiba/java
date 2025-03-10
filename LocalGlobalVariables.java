public class LocalGlobalVariables {
    int a = 45;
    void localVariable() {
     
        int a = 55;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
        LocalGlobalVariables obj = new LocalGlobalVariables();
        System.out.println("Instance variable a : " + obj.a);
        
        obj.localVariable();
    }
    
}
