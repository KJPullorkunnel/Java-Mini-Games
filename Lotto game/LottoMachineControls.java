import java.util.*;

public class LottoMachineControls//controls how you want to play
{
   private static ArrayList<PickSixGame> ticketDatabase= new ArrayList<PickSixGame>();
   
   private static int currentTicketID = 1;
   
   public static void manualPickMenu()//You manually pick your lotto numbers
   {
      Scanner keyboard = new Scanner (System.in);
      ArrayList <Integer> temp =  new ArrayList<Integer>();
      System.out.println("Type in 6 random numbers between 1 and 40");
      
      int i;
      for(i = 0; i < 6;i++)
      {
         int choice = keyboard.nextInt();
         temp.add (choice);
      }
      
      PickSixGame choice = new PickSixGame(currentTicketID, temp);
      currentTicketID++;
      ticketDatabase.add (choice);
   }
   
   public static void quickPickMenu()//A quick and random lotto number is assigned to you
   {
      PickSixGame noChoice = new PickSixGame(currentTicketID,6);
      ticketDatabase.add (noChoice);
      currentTicketID++;
   }
   
   public static void lottoDrawing()// This checks to see if you or anyone else is the winner
   {
      LottoBallPicker shamrock = new LottoBallPicker();
      ArrayList <Integer> currentWinningNumber = shamrock.pickRandomNumbers(6);
      
      System.out.println(currentWinningNumber);
      
      for(PickSixGame fortunate: ticketDatabase)
      {
          List<Integer> currentTicketNumbers = fortunate.getLottoNumbers();
          
          if(currentTicketNumbers.equals (currentWinningNumber))
          {
            System.out.println(fortunate.getTicketID() + " is the winner");
            
          }
      }  
       
   }
   
   public static void printAllTickets()//it prints the ticket IDs and lotto numbers of all tickets
   {
      for(PickSixGame tempValue : ticketDatabase)
      {
         System.out.println(tempValue.getTicketID());
         System.out.println(tempValue.getLottoNumbers());   
      }
   }
   
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      
      while(true)
      {
         System.out.println("What would you like to do?");
         System.out.println("manually pick your lotto(1), do a quick pick(2),\n go to the lottory drawing menu(3), or print all tickets(4)");
         int choiceFive = keyboard.nextInt();
         
         if(choiceFive == 1)
         {
            System.out.println("You have chosen to manually pick your lotto");
            manualPickMenu();
            
         }
         
         else if(choiceFive == 2)
         {
            System.out.println("You have chosen to do a quick pick");
            quickPickMenu();
         }
         
         else if(choiceFive == 3)
         {
            System.out.println("You have chosen to go to the lottory drawing menu");
            lottoDrawing();
         }
         
         else 
         {
            System.out.println("You have chosen to print all tickets");
            printAllTickets();
         }

      }
   } 
    
}