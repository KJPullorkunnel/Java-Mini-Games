import java.util.*;

public abstract class LottoTicket
{
   private int ticketID;// creating an ID for the ticket owner
   
   private List <Integer> lottoNumbers = new ArrayList<Integer>();
   
   public LottoTicket(int newTicketID, int newNumOfBalls)
   {
      ticketID = newTicketID;
      quickPick(newNumOfBalls);
   }
   
   public LottoTicket(int newTicketID, ArrayList <Integer> numCollection)
   {
      ticketID = newTicketID;
      manualPick(numCollection);
   }
   
   public int getTicketID()
   {
      return ticketID;   
   }
   
   public List <Integer> getLottoNumbers()
   {
      return lottoNumbers;
   }
   
   public void  setLottoNumbers(ArrayList <Integer> luckyNumbers)
   {
      lottoNumbers = luckyNumbers;
   }
   
   public abstract void quickPick (int numOfNumbers);
   
   public abstract void manualPick (ArrayList <Integer> numCollection);
   
   




}