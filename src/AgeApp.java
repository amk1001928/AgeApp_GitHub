public class AgeApp {
    public static void main(String[] args) throws Exception {
    
        int age = 18;
             
        if (age >= 0 && age < 14) {
            System.out.println("You are underage");
        }

        if (age >= 15) {
            System.out.println("You can drive a moped");
        }
        else if (age >= 65) {
            System.out.println("You are an retired");
        }
        else {
        System.out.println("You are an adult");  
        }
        if (age == 18) {
            System.out.println("You can drive a car");
        }
        if (age % 10 == 0) {
            System.out.println("Aniiversary party!!");
        }
        if (age == 100) {
            System.out.println("Congratulations!");
        
        }if (age >= 40 && age <= 50) {
            System.out.println("Happy mid life!");
        }
}
}
