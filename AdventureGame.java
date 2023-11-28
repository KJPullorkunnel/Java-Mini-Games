/*
Name; Kevin Pullorkunnel
Project na,e; Adventure game
A Solution;[ false,1,4,1.5,false,1 ]
*/

 
import java.util.Scanner;


public class AdventureGame
{
    public static void main(String[] args)
    {
       Scanner keyboard = new Scanner (System.in);
       
       System.out.println("You find an abandoned classic ferrari near the woods with the key inside, \n Do you want to get in and start it (true/false)");
       boolean choiceOne = keyboard.nextBoolean();
       
       if(choiceOne == true) //start it
       {
          System.out.println(" You turn the key on and the car's engine explodes with you getting burnt alive");
       }
       
       else //walk away from it
            {
                 System.out.println("You walk away and find a path in the woods,");
                 System.out.println("DO you take the left path (1) or the right path(2) or do you stay put");
                 int choiceTwo = keyboard.nextInt(); 
                 
                    if(choiceTwo == 1)// take the left path
                    {
                        System.out.println("You take the left path and continue on for a while untill you come within 15feet of a \"large\" bear, \n Do you run away (3) or do you stand your ground (4)");
                        int choiceThree = keyboard.nextInt();
                           
                         if(choiceThree == 4)// you attempt to stand your ground
                         {
                             System.out.println(" You calmly make yourself big and stand your ground till the bear goes away");
                             System.out.println(" you then continue on the path and have an oppurtunity to hitch a ride \n Do you ask for a ride (1.5) or do let it leave (2.5)");
                             double choiceFour = keyboard.nextDouble();
                             
                             
                                if (choiceFour == 1.5)//ask for a ride
                                {
                                     System.out.println("You ask for a ride home and they take you but on the way the engine stalls");
                                     System.out.println(" Do you go out to fix it or do you call AAA (true\\false)");
                                     boolean choiceFive = keyboard.nextBoolean();
                                     
                                        if (choiceFive == true) //You go out to fix the car
                                        {
                                             System.out.println(" You get out of the car to try and fix it \n but then the bear you saw earlier comes and attacks you from behind.");
                                        }
                                        
                                        else // you stay inside and call AAA
                                        {
                                             System.out.println(" You stay inside the car and try calling AAA,butunfortunately for you, your phone has no signal ");
                                             System.out.println("Do you look for any other type of phone service in the vehicle(1) \n or do you try restarting the car (2) ");
                                             int choiceSix = keyboard.nextInt();
                                             
                                                if (choiceSix ==1)// you look inside the car
                                                {
                                                     System.out.println("You and the driver look inside the car untill you find a sattelite phone");
                                                     System.out.println("You call AAA and they pick up, they say they will come find you in  a couple of hours");
                                                     System.out.println(" They find you and take you to the nearest taxi place to take you home");
                                                     System.out.println("the end");
                                                }
                                                else //You try restarting the car
                                                {
                                                     System.out.println("You try restarting the car and boom the engine roars to life ");
                                                     System.out.println("Your companion starts driving awayand stops in a couple of miles at a gas station for gas");
                                                     System.out.println("To pump gas in the car would you keep the engine running in fear of it not starting if turned off(1.5) \n or Do you try your luck and switch the ignition off to pump gas (2.5)");
                                                     double choiceSeven = keyboard.nextDouble();
                                                     
                                                     
                                                         if (choiceSeven == 1.5)// You leave the car running
                                                         {
                                                              System.out.println("You pump in gas and soon start to leave the gas station, with no problems at all");
                                                              System.out.println("You now find the nearest entrance ramp and take it");
                                                              System.out.println("You only have around 2 miles to go to get to downtown but all of a sudden the tire blows out");
                                                              System.out.println("You pull over and unfortunately there is no spare, Do you drive on flat tires to downtown(6) or do you call Roadside assistance(2) "); 
                                                              int choiceEight = keyboard.nextInt();
                                                                 
                                                                 if (choiceEight == 2)// you call
                                                                 {
                                                                     System.out.println("You call Roadside assistance, and luckily for you they are only 3 minutes away");
                                                                     System.out.println("When they get over there they fix your tire and mention they are heading back to the city you live in");
                                                                     System.out.println("Do you ask if they can take you home or do you go to the nearest  taxi place and hitch a ride home (true\\false)");
                                                                     boolean choiceNine = keyboard.nextBoolean();
                                                                     
                                                                       if (choiceNine == true)//take you home 
                                                                       {
                                                                          System.out.println("They take you home to your hometown and you  hitch an uber home");
                                                                          System.out.println("The end");
;                                                                      }
                                                                       
                                                                       else // nearest taxi place
                                                                       {
                                                                          System.out.println("you ask them to drop you off at the nearest taxi place");
                                                                          System.out.println("You take a taxi home");
                                                                          System.out.println("The end");
                                                                       }
                                                                 } 
                                                                 
                                                                 else //you drive
                                                                 {
                                                                     System.out.println("You decide to drive to the nearest workshop");
                                                                     System.out.println(" After a while you need to change lanes but you dont want to take a risk");
                                                                     System.out.println("Do you change your lane(2) or do you keep going(3)");
                                                                     int choiceTen = keyboard.nextInt();
                                                                     
                                                                       if (choiceTen == 2)//change lane
                                                                       {
                                                                            System.out.println("You change your lane but you lose control");
                                                                            System.out.println("You hit the barrier and the car along with you explodes away");
                                                                            System.out.println("The End");
                                                                       }
                                                                       
                                                                       else // keep going
                                                                       {
                                                                            System.out.println("You decide to keep going straight in that lane");
                                                                            System.out.println("After a while your car cant take it anymore and loses control");
                                                                            System.out.println("You try to regain control but its to no use for you have already veered and flipped on the other side of the highway");
                                                                            System.out.println("THe End");
                                                                       }
                                                                       
                                                                 }    
                                                              
                                                         }
                                                         
                                                         else// You turn off the car
                                                         {
                                                              System.out.println("You decide to turn off the car \n but once  you fill the gas in , you can not start the vehicle");
                                                              System.out.println(" suddenly you see a large SUV getting into the gas station.");
                                                              System.out.println("They pull out guns and command you to give everything you have");
                                                              System.out.println("Do you decide to give everything(1) or do you try to negotiate a deal with them (3)");
                                                              int ChoiceEleven = keyboard.nextInt();
                                                              
                                                                 if (ChoiceEleven == 1)//give evrything
                                                                 {
                                                                     System.out.println(" You give everything away");
                                                                     System.out.println("they leave you and after a while a police car casually comes along"); 
                                                                     System.out.println("The police asks what happened and you tell him everything");
                                                                     System.out.println("The police asks if you can help him(1.0) or if you and your companion would rather go home(2.0)"); 
                                                                     double choiceTwelve = keyboard.nextDouble();
                                                                        
                                                                         if (choiceTwelve == 1.0)// you help the officer
                                                                         {
                                                                            System.out.println("You say that you will help him");
                                                                            System.out.println("The officer brings you along and you and your companion recognize the stolen car after going a couple of blocks down the road");
                                                                            System.out.println(" The police pulls that car over and arrests him");
                                                                            System.out.println("The police drops you and your companion off at the nearest taxi place");
                                                                            System.out.println("You leave in a taxi and your companion heads back in their car");
                                                                            System.out.println("the end");
                                                                            
                                                                         }
                                                                         
                                                                         else// You go home
                                                                         {
                                                                            System.out.println("The officer drops you off to the nearest taxi place");
                                                                            System.out.println("you go home and your companion heads home in their car");
                                                                            System.out.println("The end");
                                                                         }
                                                                         
                                                                 }
                                                                 else // negotiate a deal
                                                                 {
                                                                     System.out.println("You try to negotiate a deal with them but it goes in vain, \n for they decide to instead now ask where you live so they can steal more things and hurt your family");
                                                                     System.out.println("Do you tell them where your house(1.0) is or do you resist(2.0)");
                                                                     double choiceThirteen = keyboard.nextDouble();
                                                                     
                                                                         if (choiceThirteen ==1.0)// tell them
                                                                         {
                                                                            System.out.println("You tell them where your house is but luckily  a couple of police officers come");
                                                                            System.out.println("The police officers free you and take you and your companion home");
                                                                            System.out.println("The end");
                                                                         }
                                                                         
                                                                         else
                                                                         {
                                                                            System.out.println("You resist to tell them and they torture you");
                                                                            System.out.println("luckily for you  a few police officers come around and save you");
                                                                            System.out.println("You are taken home");
                                                                            System.out.println("The end");
                                                                         }
                                                                     
                                                                 }
                                                              
                                                         }
                                                         
                                                }
                                                
                                        }   
                                          
                                }
                                
                                else // let it leave you
                                {
                                     System.out.println(" You let it leave but watch it crash a few feet up the road");
                                     System.out.println("do you  go and help them (true/false)");
                                     boolean choiceFourteen = keyboard.nextBoolean();
                                     
                                       if (choiceFourteen ==true)//help them
                                       {
                                          System.out.println("You go out to help them");
                                          System.out.println("You call 911 and an ambulence comes");
                                          System.out.println("You are taken to the hospital and from there you are given a taxi ride home");
                                          System.out.println("The end");
                                       }
                                       
                                       else// decide to do nothing
                                       {
                                          System.out.println("You try to ignore it but your conscience is tooo strong");
                                          System.out.println("so you go and help them");
                                          System.out.println("you call 911 and they are taken to a hospital along with you");
                                          System.out.println("from the hospital you are given a ride home");
                                          System.out.println("before you leave the family of the driver offers you a gift for helping them do you recieve it(true/false)");
                                          boolean choiceFifteen = keyboard.nextBoolean();
                                             
                                             if (choiceFifteen == true)//recieved
                                             {
                                                System.out.println("you recieve it and go home");
                                                System.out.println("The end");
                                             }
                                             
                                             else// not recieved
                                             {
                                                System.out.println("You do not recieve it and go home");
                                                System.out.println("The end");
                                             }

                                          
                                       }
                                       
                                }
                                           
                         }
                         
                         else // You attempt to run away
                         {
                             System.out.println("You start to run away but you trip over your shoe laces \n and the bear catches you");
                             System.out.println("the bear shows no mercy");
                             System.out.println("The end");
                         
                         
                         }
                    
                            
                    }
                         
                    else if(choiceTwo ==2)  // right path
                    {
                        System.out.println(" You go through the right path but immediatley realize that something is following you \n but you realized too late because it comes from behind and attacks you, afterwards leaving you to die");
                        System.out.println("The end");
                    }
                    
                    else // you stay
                    {
                        System.out.println ("You stay and soon hitch a ride from a fellow traveller and are brought back home");
                        System.out.println("The end");
                    }
                 
                
            }     
         
           
    }

}
