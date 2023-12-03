import java.util.Scanner;

public class Game
{
   private static Heroclass one;
   private static Heroclass two;
   private static int points;
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      
      System.out.println(" Do you want to rename your first hero? true/ false");
      boolean choiceOne = keyboard.nextBoolean();
       
      if(choiceOne == true)
      {
         System.out.println("What would you like to name the hero");
         String nameOne = keyboard.next();
         one = new Heroclass(nameOne);                                                                                                                                  
      }
      
      else
      {
         one = new Heroclass(); 
      }
      
      System.out.println(" Do you want to rename your second hero? true/ false");
      boolean choiceTwo = keyboard.nextBoolean();
       
      if(choiceTwo == true)
      {
         System.out.println("What would you like to name the hero");
         String nametwo = keyboard.next();
         two = new Heroclass(nametwo);                                                                                                                                  
      }
      
      else
      {
         two = new Heroclass(); 
      }
     
      while (one.getHitPoints() > 0 && two.getHitPoints() > 0)
      {
         System.out.println("What would you like to do?");
         System.out.println("View points(1), View character Stats(2), or fight Monsters(3)");
         int choiceFive = keyboard.nextInt();
         
         if(choiceFive == 1)
         {
            System.out.println("You have chosen to view points");
            viewPoints();
            
         }
         
         else if(choiceFive == 2)
         {
            System.out.println("You have chosen to view Stats");
            characterStatistics();
         }
         
         else
         {
            System.out.println("You have chosen to fight a monster");
            fightMonsters();
         }
      }
      System.out.println("You have lost all your lives");
      System.out.println("Your game is over");
      System.out.println("Thanks for playing");
      viewPoints();
      
      
   }
   
   public String lowerCaseAndTrim (String BOB)
   {
      BOB = BOB.toLowerCase();
      BOB = BOB.trim();
      return BOB;
   }
   
   public static void characterStatistics()
   {
      System.out.println("1. Hit Points: " + one.getHitPoints() + " Agility: " + one.getAgility() + " Strength: " + one.getStrength());
      System.out.println("2. Hit Points: " + two.getHitPoints() + " Agility: " + two.getAgility() + " Strength: " + two.getStrength());
   }
   
   public static void viewPoints()
   {
      System.out.println(points);
   }
   
   public static void fightMonsters()
   {
      Scanner keyboard = new Scanner (System.in);
      
     MonsterClass x = new MonsterClass();
     
     System.out.println("Strength: " + x.getStrength() + " agility " + x.getAgility() + "species" + x.getSpecies()); 
     
      System.out.println("Which Character should take the lead? 1 or 2");
      int choiceFour = keyboard.nextInt();
      Heroclass lead;
      
      if(choiceFour == 1)
      {
         lead = one;
      }
      
      else
      {
         lead = two;
      }
     
     System.out.println("Do You want to fight(true) or run(false)? ");
     boolean choiceThree = keyboard.nextBoolean();
     
      if(choiceThree == true) //You fight
      {
         if(lead.getStrength() >= x.getStrength()) //hero has higher strength
         {
            System.out.println("You have a 70% chance of defeating the foe");
            
            int fightFactor = (int)(Math.random()*9 + 0);
            //generate a random number between 0 and 9
            if (fightFactor <= 6)//number is 0 - 6 they win
            {
                System.out.println("You have beaten the monster");
                points++;
            }
            
            else
            {
                System.out.println("You were beaten by the monster");
                lead.loseHitPoints();
            }
            
         }
         
         else // monster has more strength
         {
            System.out.println("you have a 30% chance of defeating the foe");
            
            int fightFactor = (int)(Math.random()*9 + 0);
            //generate a random number between 0 and 9
            
            if (fightFactor <= 3) // 0-3 wll win
            {
                System.out.println("You have beaten the monster");
                points++;
            }
            
            else
            {
               System.out.println("You were beaten by the monster");
               lead.loseHitPoints();
            }

         }
         
      }
      
      else //You attempt to escape
      {
         if(lead.getAgility() >= x.getAgility())
         {
            System.out.println("You have an 80% chance of escaping");
            int escapeFactor = (int)(Math.random()*9 + 0);
            //generate a random number between 0 and 9
            if (escapeFactor <= 7)//number is 0 - 7 they escape
            {
               System.out.println("You have escaped the monster");
               System.out.println("You move on to the next monster");
            }
            
            else
            {
               System.out.println("You couldn't escape the monster");
               lead.loseHitPoints();
            }
            
         }
         
         else
         {
            System.out.println("You have an 20% chance of escaping");
            
            int escapeFactor = (int)(Math.random()*9 + 0);
            //generate a random number between 0 and 9
            if (escapeFactor <= 2)//number is 0 - 2 they escape
            {
               System.out.println("You have escaped the monster");
               System.out.println("You move on to the next monster");
            }
            
            else
            {
               System.out.println("You couldn't escape the monster");
               lead.loseHitPoints();
            }
            
         }
         
      }
     
   }

}