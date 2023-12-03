import java.util.*;

public  class PickSixGame extends LottoTicket
{
   public PickSixGame(int newTicketID, int newNumOfBalls)
   {
      super(newTicketID,newNumOfBalls);
      
   }
   
   public PickSixGame(int newTicketID, ArrayList <Integer> numCollection)
   {
      super( newTicketID,  numCollection);
      
   }

   @Override 
   public void quickPick(int numOfNumbers)// randomly picking numbers for the lottory
   {
      ArrayList <Integer> temp =  new ArrayList<Integer>();
      int i;

      for (i= 0;i < numOfNumbers;i++)
      {
         int tempor = (int)((Math.random() * 40)+1);
      }
     
      setLottoNumbers(temp);
   }
   
   @Override 
   public void manualPick(ArrayList <Integer> numCollection)
   {
      setLottoNumbers(numCollection);
      
   }

}