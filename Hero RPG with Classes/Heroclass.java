public class Heroclass
{

   
   private String name;
   
   public Heroclass()
   {
      name = "Bob";
      generateTraits();
      
   }
   
   public Heroclass(String newName)
   {
      name = newName;
      generateTraits();
   }
   
     
   private int hitPoints;
   
   private int agility; 
   
   private int strength;
   
   private void generateTraits()
   {
      int  randomHitPoints = (int)(Math.random()*6 + 5);
      hitPoints = randomHitPoints;
      
      int randomAgility = (int)(Math.random()*5 + 3);
      agility = randomAgility;
      
      int randomStrength = (int)(Math.random()*7 + 3);
      strength = randomStrength;
      
   }
   
   public void loseHitPoints()
   {
      hitPoints--;
   }
   
   public int getHitPoints()
   {
      return hitPoints;
   }
   
   public int getAgility()
   {
      return agility;
   }
   
   public int getStrength()
   {
      return strength;
   }
   
   public String getName()
   {
      return name;
   }
   

}