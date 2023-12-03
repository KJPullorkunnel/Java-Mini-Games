public class MonsterClass
{
   public MonsterClass()
   {
       int  randomAgility = (int)(Math.random()*5 + 2);
       agility = randomAgility;
       
       int  randomStrength = (int)(Math.random()*6 + 1);
       strength = randomStrength;
       
       String[] SpeciesList= {" orc ", " Goblin ", " vampire ", " dragon ", " Frankenstein "}; 
       int randomSpecies = (int)(Math.random() * 5);
       species = SpeciesList[randomSpecies];
   }
   
  
   private  String species;
  
   
   private  int agility; 
   
   private int strength;
   
   public int getAgility()
   {
      return agility;
   }
   
   public int getStrength()
   {
      return strength;
   }
   
   public String getSpecies()
   {
      return species;
   }

}