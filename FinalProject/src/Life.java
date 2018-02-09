import java.util.ArrayList;
import java.util.Scanner;

public class Life
	{

		public static void main(String[] args)
			{
				//methods
				greetUser();
				startGame();
				getMarried();
				makeBabyOrCat();
				continueGame();
				continueGame2();
				continueGame3();
				continueGame4();
				retire();
			}

		private static void greetUser()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();	
				System.out.println("Hello, " + name + "! Are you ready to play the Game of Life?");
				String answer = userInput.nextLine();
				
				if (answer.equals("yes") || answer.equals("Yes"))
					{
						System.out.println("Excellent! Let's begin!");
					}
				
				if (answer.equals("no") || answer.equals("No"))
					{
						System.out.println("Too bad! Let's begin!");
						
					}
			}
		private static void startGame()
			{
				System.out.println("Welcome to Life! You are starting as a young adult! And your career is...");
				String [] career = new String [3];
				career[0] = "Teacher";
				career[1] = "Doctor";	
				career[2] = "McDonald's Worker";	
				
				int careerRandom = (int) (Math.random( ) * career.length);
				
				if (careerRandom == 0)
					{
						System.out.println("A teacher! You make $55,000 a year. With that salary you can move into a nice, cozy apartment.");
					}
				if (careerRandom == 1)
					{
						System.out.println("A doctor! You make $200,000 a year. With that salary you can move into a nice, roomy house.");
					}
				if (careerRandom == 2)
					{
						System.out.println("A McDonald's Worker! You make $18,000 a year. With that salary you can move into a nice... dumpster?");
					}
			
			}
		private static void getMarried()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.print("Would you like to get married?");
			String answer = userInput.nextLine();
			if (answer.equals("yes") || answer.equals("Yes"))
				{
					Scanner userInput1 = new Scanner(System.in);
					String [] spouse = new String [6];
					spouse[0] = "Police Officer";
					spouse[1] = "Janitor";	
					spouse[2] = "Therapist";
					spouse[3] = "Surgeon";	
					spouse[4] = "Karate Master";	
					spouse[5] = "Journalist";	


					
					int spouseRandom = (int) (Math.random( ) * spouse.length);
				
							System.out.println("Congrats! You married a " + spouse[spouseRandom] + "!");
						
				}
			
			if (answer.equals("no") || answer.equals("No"))
				{
					System.out.println("Okay! Enjoy being a single pringle! I certainly do... ;)");
					
				}
		}
		
		private static void makeBabyOrCat()
		{
			String [] babyGender = new String [2];
			babyGender[0] = "girl";
			babyGender[1] = "boy";	
			
			int pickGender = (int) (Math.random( ) * babyGender.length);
			
			String [] babyHair = new String [4];
			babyHair[0] = "blond";
			babyHair[1] = "black";	
			babyHair[2] = "red";	
			babyHair[3] = "brown";

			
			int pickHair = (int) (Math.random( ) * babyHair.length);
			
			String [] babyEyes = new String [4];
			babyEyes[0] = "green";
			babyEyes[1] = "brown";	
			babyEyes[2] = "blue";	
			babyEyes[3] = "hazel";	
			
			int pickEyes = (int) (Math.random( ) * babyEyes.length);
			
			Scanner userInput2 = new Scanner(System.in);
			System.out.println("Do you want to have/adopt a baby?");
			String answer2 = userInput2.nextLine();

				if (answer2.equals("yes") || answer2.equals("Yes"))
					{
					ArrayList <Baby> family = new ArrayList<Baby>();
					family.add(new Baby(babyGender[pickGender], babyHair[pickHair], babyEyes[pickEyes], 7));
						
							Scanner userInput3 = new Scanner(System.in);
							System.out.println("You have a baby "+ babyGender[pickGender] + " with " + babyHair[pickHair] + " hair and " + babyEyes[pickEyes] + " eyes! Congratulations! What would you like to name your child?");							
							String name2 = userInput2.nextLine();
							System.out.println(name2 + " it is!");
					}

				if (answer2.equals("No") || answer2.equals("no"))
					{
						Scanner userInput4 = new Scanner(System.in);
						System.out.println("Alright. You adopted a cat instead. What would you like to name your cat?");
						String catName = userInput2.nextLine();
						System.out.println(catName + " it is! What a lovely family!");

					}
		}
		
		private static void continueGame()
			{
						Scanner userInput3 = new Scanner(System.in);
						String [] event = new String [3];
						event[0] = "Baby square";
						event[1] = "Sickness";	
						event[2] = "Fired";
						
						int eventRandom = (int) (Math.random( ) * event.length);
					
						if (eventRandom == 0)
							{
								System.out.println("You landed on a baby square!");
								makeBabyOrCat();
							}
						if (eventRandom == 1)
							{
								System.out.println("Oh no! Your whole family is sick! You pay 2,000 for medical bills.");
							}
						if (eventRandom == 2)
							{
								System.out.println("You got fired! Luckily, your friend pulled some strings and got you a back-up job. You are now a sushi delivery person.");
							}			}
		private static void continueGame2()
			{
						Scanner userInput3 = new Scanner(System.in);
						String [] event2 = new String [3];
						event2[0] = "Baby square";
						event2[1] = "Vacation";	
						event2[2] = "Fire";
						
						int event2Random = (int) (Math.random( ) * event2.length);
					
						if (event2Random == 0)
							{
								System.out.println("You landed on another baby square!");
								makeBabyOrCat();
							}
						if (event2Random == 1)
							{
								System.out.println("You and your family take a leisurely vacation to the beach. Ahhh...");
							}
						if (event2Random == 2)
							{
								System.out.println("Your home burned down! No one was hurt, but you will miss your Justin Bieber throw pillows. :(");
							}			}

		private static void continueGame3()
			{
						Scanner userInput3 = new Scanner(System.in);
						String [] event3 = new String [3];
						event3[0] = "Baby square";
						event3[1] = "Lottery";	
						event3[2] = "Bills";
						
						int event3Random = (int) (Math.random( ) * event3.length);
					
						if (event3Random == 0)
							{
								System.out.println("You landed on another baby square!");
								makeBabyOrCat();
							}
						if (event3Random == 1)
							{
								System.out.println("YOU WON THE LOTTERY! (Can you sneak me some?)");
							}
						if (event3Random == 2)
							{
								System.out.println("It's been a tough month for bills. You and the fam spend the night at grandma's house.");
							}			}

		private static void continueGame4()
			{
						Scanner userInput4 = new Scanner(System.in);
						String [] event4 = new String [3];
						event4[0] = "Baby square";
						event4[1] = "Pay Raise";	
						event4[2] = "School";
						
						int event4Random = (int) (Math.random( ) * event4.length);
					
						if (event4Random == 0)
							{
								System.out.println("You landed on another baby square!");
								makeBabyOrCat();
							}
						if (event4Random == 1)
							{
								System.out.println("You got a pay raise!");
							}
						if (event4Random == 2)
							{
								System.out.println("Your love of learning has spurred you to return to school for a little. You pay 50,000 dollars.");
							}			}
		
		private static void retire()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("It's been a good life, but  you're getting older. Would you like to retire?");
				String answer = userInput.nextLine();
				
				if (answer.equals("yes") || answer.equals("Yes"))
					{
						System.out.println("You retire to a nice, quiet house by the lake, content to live in peace and tranquility.");
						Scanner userInput5 = new Scanner(System.in);
						String [] event = new String [3];
						event[0] = "Death 1";
						event[1] = "Death 2";	
						event[2] = "Death 3";
						
						int eventRandom = (int) (Math.random( ) * event.length);
					
						if (eventRandom == 0)
							{
								System.out.println("You end up dying peacefully in your sleep, surrounded by family (and or cats). End of life.");
								makeBabyOrCat();
							}
						if (eventRandom == 1)
							{
								System.out.println("One day you accidentally fall into the lake and drown. End of life.");
							}
						if (eventRandom == 2)
							{
								System.out.println("One day you trip over your grandbaby (and or cat) and fall, splitting your head open. End of life.");
							}
					}
				
				
				if (answer.equals("no") || answer.equals("No"))
					{
								System.out.println("You suck it up and grind out several more painful years of work, earning a nice amount of money.");
								Scanner userInput5 = new Scanner(System.in);
								String [] event = new String [3];
								event[0] = "Death 1";
								event[1] = "Death 2";	
								event[2] = "Death 3";
								
								int eventRandom = (int) (Math.random( ) * event.length);
							
								if (eventRandom == 0)
									{
										System.out.println("You end up dying peacefully in your sleep, surrounded by family (and or cats). End of life.");
										makeBabyOrCat();
									}
								if (eventRandom == 1)
									{
										System.out.println("The strain of work eventually gives you a heart attack. End of life.");
									}
								if (eventRandom == 2)
									{
										System.out.println("One day you trip over your grandbaby (and or cat) and fall, splitting your head open. End of life.");
									}
							}
					}
			

	}
