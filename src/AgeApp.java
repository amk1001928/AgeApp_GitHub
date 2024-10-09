public class AgeApp {
    public static void main(String[] args) throws Exception {
    
        int age = 0;
        
        if (age >= 0 && age < 18) {
            System.out.println("You are underage");
        }
        else if (age >= 65) {
            System.out.println("You are an retired");
        }
        else {
        System.out.println("You are an adult");  
        }

}
}
