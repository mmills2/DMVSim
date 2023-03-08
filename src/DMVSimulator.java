import java.util.Random;

public class DMVSimulator {
    public static void main(String[] args) {

         // instance variables
         Random randoTron9001 = new Random();
         int randNum = randoTron9001.nextInt(100) + 1; // +1 so its 1-100 not 0-99

         // welcome message and assigned number
         System.out.println("Welcome to the happiest place on earth.\nYour number is " + randNum + ".");

         // calling out assigned number after all others
         for(int i = 1; i <= 100; i++){
            if(randNum < 100){
                randNum += 1;
            }
            else{
                randNum = 1;
            }
            System.out.println("Now serving number " + randNum + ".");
         }

         // depart message
         System.out.println("It looks like you are missing the signed letter from the doctor that birthed you.");
         System.out.println("Please come back when you have everything requested.");
    }
}
