public class Map
{
  private static String [][] myMaze =
  {
      {"x","x","x","x","x","x","x","x","x","x"},
      {"x","x","x","x"," "," "," "," "," ","x"},
      {"x","x","x","x"," ","x","x","F","x","x"},
      {"x","x","x","x"," ","x","x","x","x","x"},
      {"x","x","x","x"," ","x","x","x","x","x"}, 
      {"x"," "," "," "," "," "," "," "," ","x"},
      {"x"," ","x","x","x","x","x","x"," ","x"},
      {"x"," ","x"," ","x","x","x","x"," ","x"},
      {"x","S","x"," "," "," "," "," "," ","x"},
      {"x","x","x","x","x","x","x","x","x","x"},
  };
  
  private static int heroRow = 8;
  
  private static int heroCol= 1;
  
  public static  String [][] getMyMaze()
  {
   return myMaze;
  }     
  
  public void playerMoves (String direction)
  {
  
         if (direction.equalsIgnoreCase("up"))
         {
            if (myMaze[heroRow-1][heroCol].equalsIgnoreCase("x"))
            {
              System.out.println("You may not move");
            
            }
            else if (myMaze[heroRow-1][heroCol].equalsIgnoreCase("f"))
            {
                System.out.println("You have finished");
            }
            else 
            {
              System.out.println("You move up by one");
              
              myMaze[heroRow][heroCol] = " ";
              heroRow-- ;
               myMaze[heroRow][heroCol] = "P";
              
              
              
            }
                  
         }
         
         else if (direction.equalsIgnoreCase("down"))
         {
            if (myMaze[heroRow + 1][heroCol].equalsIgnoreCase("x"))
            {
               System.out.println("You may not move");
            }
            else if (myMaze[heroRow + 1][heroCol].equalsIgnoreCase("f"))
            {
                System.out.println("You have finished");
            }
            else
            {
               System.out.println("You move down by one");
               
                myMaze[heroRow][heroCol] = " ";
              heroRow++ ;
               myMaze[heroRow][heroCol] = "P";
               
               
               
            }
                 
         }
         else if(direction.equalsIgnoreCase("left"))
         {
            if (myMaze[heroRow][heroCol - 1].equalsIgnoreCase("x"))
            {
               System.out.println("You may not move");
            }
            
            else if (myMaze[heroRow][heroCol - 1].equalsIgnoreCase("f"))
            {
               System.out.println("You have finished");
            }
            
             else
            {
               System.out.println("You move left by  one");
               
                myMaze[heroRow][heroCol] = " ";
                heroCol-- ;
                myMaze[heroRow][heroCol] = "P";
               
                       
            }
      
         }
         
         else if(direction.equalsIgnoreCase("right"))
         {
            if (myMaze[heroRow][heroCol + 1].equalsIgnoreCase("x"))
            {
               System.out.println("You may not move");
            }
            else if(myMaze[heroRow][heroCol + 1].equalsIgnoreCase("f"))
            {
            
            System.out.println("You have finished");
            
            }
            
             else
            {
               System.out.println("You move right by one");
            
                myMaze[heroRow][heroCol] = " ";
                heroCol++ ;
                myMaze[heroRow][heroCol] = "P";
            
            
            
            }

        }
 }
  
}