      // Kevin Pullorkunnel RPG game
 import java.util.Scanner;
      
 public class TheRPGGame
{
      public static void main (String[] args)
      {
             
        int score =0;
         Scanner keyboard = new Scanner (System.in);
       
        for(int i =0; i<10; i++)
        {
               int int1 =aSingleDigitNumber();
               int  int2 =( aSingleDigitNumber());
               System.out.println("what is the answer of " + (int1 + " plus " +int2));
               int correctAnswer = int1 + int2;
              
                int yourAnswer = keyboard.nextInt();
                
                  if (yourAnswer == correctAnswer)
                  {
                    System.out.println("You are correct");
                    score = score+1;
                                        
                  }
                  
                  else
                  {
                   System.out.println("You are wrong");
                    System.out.println("The correct answer is " + correctAnswer);
                  }
              System.out.println("Your score is " +  score);

         
        }
        
        int life = score;
        
        while ( life >= 1 )
        {
            
            String theEnemy = randomEnemy();
            String theLocation = randomLocation();
            boolean escapeOrFight = runAway();
            System.out.println("You have come face to face with " + theEnemy + " in/on a " + theLocation);
            System.out.println("Do you stay? (true/false)");
            boolean choiceOne = keyboard.nextBoolean();
            
            if(choiceOne == true) // you fight
            {
                boolean victoryOrNo = winOrLose();
                System.out.println("Did you win the fight " + victoryOrNo);
                
                if(victoryOrNo)
                {
                  System.out.println("You did win the fight");
                  score = score+1;
                  
                }
                
                else
                {
                 System.out.println("You lost the fight");
                 life= life-1;
                }
            
            }
            
            else
            {
               System.out.println("Can you run away " + escapeOrFight);
               
               if(escapeOrFight)
               {
                  System.out.println("You have escaped \n You move on to the next enemy");
               }
               
               else
               {
                  System.out.println("You couldn't run away ");
                  boolean victoryOrNo = winOrLose();
                   System.out.println("Did you win the fight " + victoryOrNo);
                   
                      if(victoryOrNo)
                      {
                        System.out.println("You did win the fight ");
                        score = score+1;
                        
                      }
                      
                      else
                      {
                       System.out.println("You lost the fight ");
                       life= life-1;
                      }
   
                                 
               }
               
            }
             
            System.out.println("You Move on to the next fight ");
            System.out.println(" Your current life points are  " + life);
            System.out.println(" Your  current score is  " +  score);
            
        }
         System.out.println(" You have no more lives to play ");
         System.out.println(" Your final score is " + score);
      }
      
      public static int aSingleDigitNumber()
      {
        int randomNumber = (int) (Math.random() * 11);
        
        return randomNumber;     
      }
 
      public static String randomEnemy()
      {
        String[] enemyList = {" The Eye ", " Lucky Larry ", " Sassy Susan ", " Johny Smith "," legolas ", " Jerry ", " Dianite ", " Ramos "};
       
        int yourEnemy = (int)(Math.random() * 8);
      
        return enemyList [yourEnemy];
      }
      
      public static String randomLocation()
      {
        String[] locationList= {" swamp ", " Forest ", " IceBerg ", " Cave ", " Highway ", " country side " , " downtown "};
        
        int yourLocation = (int)(Math.random() * 7);
        
        return locationList [yourLocation];

      }
      
      public static boolean runAway()
      {
        int run = (int) (Math.random() * 2);
        
        if (run == 1)
        {
          return true;
        }
      
        else
        {
          return false;
        }
      
      }
      
      public static boolean winOrLose()
      {
        int win = (int) (Math.random() * 2);
        
        if (win == 1)
        {
          return true;
        }
        
        else
        {
          return false;
        }
      }
         
      
      
 
 
 
 
 
}
