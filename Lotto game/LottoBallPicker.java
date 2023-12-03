import java.util.*;

public class LottoBallPicker implements WinningNumberGenerator
{
   @Override
   public  ArrayList <Integer> pickRandomNumbers(int numOfBalls)// It is picking random numbers for the 6 balls used
   {
      ArrayList <Integer> temp =  new ArrayList<Integer>();
      int i;

      for (i= 0;i < numOfBalls;i++)
      {
         temp.add(1);//(A rig)
         //int tempor = (int)((Math.random() * 40)+1);
         //temp.add(tempor);
      }
      
      return temp;
 
   }

}