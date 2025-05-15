import java.util.Scanner;
import java.util.ArrayList;


public class Runner {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // Scanner for user input
      
        Player John = new Player("John McClane"); 
        Person Bob = new Person("Bobby Joe"); 

      String floor = "bottom";
      //int room = 1;
      boolean gameEnd = false;
    

 System.out.println("You are trapped in a building! On the top floor is the evil person holding people hostage!\nFind lost people in the building and collect objects to defeat the evil boss!");
 while (!gameEnd) {

      
   System.out.println("\nChoose an action:");
  String action = scanner.nextLine().toLowerCase(); // Convert input to lowercase

   if (action.equals("look around")){
     John.lookAround(floor);
   }

   if (action.equals("room")){
     System.out.println("Which room?");
     String roomNum = scanner.nextLine();
     John.inspectRoom(floor, Integer.valueOf(roomNum));
     
     if ((floor.equals("top")) && (Integer.valueOf(roomNum) == 2)) {
    
     //String bossItem = scanner.nextLine().toLowerCase();
       
       while (true) {
        String bossItem = scanner.nextLine().toLowerCase(); // Convert input to lowercase
         boolean isBossItemOkay = John.doBossFight(bossItem);
         if (isBossItemOkay = true){
          gameEnd = true;
          break;
         }
         
       }
       
      }
     }
   

   if (action.equals("next floor")){

     floor = John.advanceFloor(floor);
     
   }
     
 }
      
    



    


    
    
    
  }
}
