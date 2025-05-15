
import java.util.ArrayList;

class Player extends Person {

  
   String savedHostage = "N/A";
  
  private ArrayList<String> inventory; // Inventory list
  private ArrayList<String> savedHostages; // Saved Hostage list
  
    public Player(String name) {
    super(name); // Calls Person's constructor
    System.out.println("Player name: " + name);
    
    
    inventory = new ArrayList<>();
    savedHostages = new ArrayList<>();
}
  
  public void lookAround(String floor) {

    if (floor.equals("bottom")) {
      System.out.println("You see a door to a room(1), you hear some shuffling. Theres a desk with something inside another room(2).");
      
    }

    if (floor.equals("middle")) {
      System.out.println("There's a room(1) guarded by a thug. Theres a supply closet(2) with materials inside");
      
    }

    if (floor.equals("top")) {
      System.out.println("There are three rooms labels as such (1, 2, 3) The first one has a lock on it. Which do I go in? You ask yourself");
      
    }
    
  }
  public void inspectRoom(String floor, int room){
    
    if ((floor.equals("bottom")) && (room == 1)) {
      System.out.println("Going into the room you see someone tied up, quickly you free them");
      savedHostages.add("Bobby Joe");
    }
    if ((floor.equals("bottom")) && (room == 2)) {
      System.out.println("In room two you see a gun in the desk, this could prove useful");
      inventory.add("Gun");
    }
    if ((floor.equals("middle")) && (room == 1)) {

      if (inventory.contains("Gun")) {
      System.out.println("Using the Gun, you killed the thug and went into the room.");
      
      System.out.println("In the room, you see the floor plans for the buliding. You see the top floor has 3 rooms. The second one is the biggest room, that must the boss's room!");
     } else{
      System.out.println("There no way you can go in that room without a weapon!");
      }
  }
     if ((floor.equals("middle")) && (room == 2)) {

      System.out.println("Inside the supply closet you see a lockpick. You grab it, it could prove useful");
       
      inventory.add("Lockpick");

      System.out.println("You also free someone trapped inside the closet");

      savedHostages.add("Sue Parker");
     }

    if ((floor.equals("top")) && (room == 1)) {

  if (inventory.contains("Lockpick")) {

    System.out.println("Going in the room, it seems to be a kitchen, you find a knife, a deadly weapon. A guard was in there, so you had to use it and you got blood all over it");
    System.out.println("You lost your Lockpick during the fight");
    inventory.remove("Lockpick");
    inventory.add("Bloody Knife");
    
  } else{
     System.out.println("You can't manage to get in the room without a Lockpick");
    
  }

    }

    if ((floor.equals("top")) && (room == 3)) {
       System.out.println("Room 3 is a single private restroom, it has a gold-plated toilet bowl. Weird.");
      System.out.println("Shuffling through the drawers, you find a toilet brush, gross but times are desperate.");
      inventory.add("Toilet Brush");
    }

     if ((floor.equals("top")) && (room == 2)) {
       System.out.println("Going in the final room, you see the boss behind it all. Sitting towards a window away from you.");
       System.out.println("You can get the jump on him, using what?");
       showInventory();
       // This sets up the end of the game, Thats why I put it last.
       
  }

  
  
  }
  
  public boolean doBossFight(String item){
     if (item.equals("gun")) {
System.out.println("You shoot the chair he was sitting in. His body collapsed on to the floor. You are free!");
       return true;
     } else if (item.equals("bloody knife")) {
System.out.println("You try to stealthily sneak up on him from behind, but the wooden floor makes a sound that alearts him of your presence. He pulls out a gun and shoots you before you could process.");
       return true;
     } else if (item.equals("toilet brush")) {
System.out.println("You throw the toilet brush at the chair and it flips it around. Startling the boss, he pulles out his gun sloppily. You take advantage and grab the gun from his hand and shoot him. You are free!");
       return true;
     } else {
       System.out.println("try again");
     return false;
     }
  }
   public String advanceFloor(String floor){
     if (floor.equals("top")) {
        System.out.println("You are at the very top of the building, you can't go up on the roof.");
       return floor;
     }
     
     if (floor.equals("middle")) {
       System.out.println("You head up the stairs to the next floor, you are at the top");
       return "top";
     }
     
     if (floor.equals("bottom")) {
       System.out.println("You head up the stairs to the next floor, you've reached the middle");
       return "middle";
     }
      return "";
   }
  
  // Add an item to inventory
    //public void addItem(String item) {
        //inventory.add(item);
      // System.out.println(name + " added " + item + " to their inventory.");
   // }

    // Remove an item from inventory
   // public void removeItem(String item) {
       // if (inventory.contains(item)) {
       //     inventory.remove(item);
         //   System.out.println(name + " removed " + item + " from their inventory.");
       // } else {
          //  System.out.println(item + " is not in the inventory.");
        //}
  //  }

    // displays all items in inventory
    private void showInventory() {
        System.out.println(name + "'s Inventory: " + inventory);
    }

   
}
