import java.util.Scanner;


public class Game
{

private static Map aMaze = new Map();


 public static void main(String[] args)
 {
  while( true )
  {
   System.out.println("Which direction would you like to move to?");
   
   printMaze();
      
   Scanner keyboard = new Scanner (System.in);
   
   String playerMoves = keyboard.next();
   
   aMaze.playerMoves (playerMoves);
   
   }
 }

   public static void printMaze()
   {
   
      
      String[][] laMap = aMaze.getMyMaze();
      
      for( String[] tempMaze : laMap)
      {
         for(String tempValue : tempMaze)
         {
            System.out.print(tempValue);
         }
         System.out.println();
      
      }
     
   }


}