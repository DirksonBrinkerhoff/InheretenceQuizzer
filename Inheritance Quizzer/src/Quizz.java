import java.util.Scanner;
public class Quizz
	{	
		// creating a counter to show right answers
		public static int counter;
		
		// make scanner 
		public static Scanner questions = new Scanner(System.in);
				
		
	public static void question1()
	{
		// start quiz
		System.out.println("(1) start quiz");
		
		// first question
		int startQuizz = questions.nextInt();
		if(startQuizz == 1)
			{
				System.out.println("SnowRider x = new SnowRider();");
				System.out.println("x.speed();");
				System.out.println();
				System.out.println("What will be printed?");
				System.out.println("(1) Straight shreddin man. 60 MPH!");
				System.out.println("(2) *throws tripple cork 12");
				System.out.println("(3) Fly like the wind!");
				System.out.println("(4) Error!");
				
				
				int questionOne = questions.nextInt();
				if(questionOne == 3)
					{
						counter++;
						System.out.println("You have " + counter + " right answer");
						System.out.println();
					}
				else
					{
						System.out.println("You have " + counter + " right answer");
						System.out.println();
					}
			}
		
	}
	public static void question2()
	{
		// Print second question
		System.out.println("SnowRider x = new Skier();");
		System.out.println("x.hygene();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Smells like baby Jesus!");
		System.out.println("(2) **drools aggressively");
		System.out.println("(3) average for a human being");
		System.out.println("(4) Error!");
		
		int questionTwo = questions.nextInt();
		
		// if statement for second question
		if(questionTwo == 1)
			{
				counter++;
				System.out.println("You have " + counter + " right answers");
				System.out.println();
			}
		else 
			{
				System.out.println("You have " + counter + " right answers");
				System.out.println();
			}
		
	}
	public static void question3()
	{
		// Print third question
		System.out.println("SnowRider x = new Snowboarder();");
		System.out.println("x.hygene();");
		System.out.println("x.speed();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Smells like baby Jesus! and Fly like the wind!");
		System.out.println("(2) Oh man! I'm so darn slow! and **drools aggressively");
		System.out.println("(3) **drools aggressively and Oh man! I'm so darn slow!");
		System.out.println("(4) Error!");
				
			int questionThree = questions.nextInt();
				
			// if statement for second question
			if(questionThree == 3)
				{
					counter++;
					System.out.println("You have " + counter + " right answers");
				}
			else 
				{
					System.out.println("You have " + counter + " right answers");
				}
		
	}
	public static void question4()
	{
		// Print fourth question
		System.out.println("Snowboarder x = new SnowRider();");
		System.out.println("x.tricks();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Bunny hop mannn!");
		System.out.println("(2) 360!");
		System.out.println("(3) *throws tripple cork 12");
		System.out.println("(4) Error!");
						
			int questionFour = questions.nextInt();
						
			// if statement for fourth question
			if(questionFour == 4)
				{
					counter++;
					System.out.println("You have " + counter + " right answers");
					System.out.println();
				}
			else 
				{
					System.out.println("You have " + counter + " right answers");
					System.out.println();
				}
	}
	public static void question5()
	{
		// Print fifth question
		System.out.println("SnowRider x = new Skier();");
		System.out.println("x.rideLifts();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) The SnowBoarder is gonna ride that chairr mann");
		System.out.println("(2) The Skier is gonna ride that chairr mann");
		System.out.println("(3) The SnowRider is gonna ride that chairr mann");
		System.out.println("(4) *throws tripple cork 12");
		System.out.println("(5) Error!");
								
				int questionFive = questions.nextInt();
								
				// if statement for fifth question
				if(questionFive == 2)
					{
						counter++;
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
				else 
					{
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
		
	}
	public static void question6()
	{
		// Print sixth question
		System.out.println("Snowboarder x = new Snowboarder();");
		System.out.println("x.tricks();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Bunny hop");
		System.out.println("(2) **throws tripples cork 12");
		System.out.println("(3) Bunny hop mannn!");
		System.out.println("(4) The SnowBoarder is gonna ride that chairr mann");
		System.out.println("(5) Error!");
										
				int questionSix = questions.nextInt();
										
				// if statement for sixth question
				if(questionSix == 3)
					{
						counter++;
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
				else 
					{
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
	}
	public static void question7()
	{
		// Print sixth question
		System.out.println("Skier x = new Skier();");
		System.out.println("x.tricks();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) 360!");
		System.out.println("(2) **throws tripples cork 12");
		System.out.println("(3) Bunny hop mannn!");
		System.out.println("(4) Oh man! I'm so darn slow!");
		System.out.println("(5) Error!");
												
				int questionSeven = questions.nextInt();
												
				// if statement for sixth question
				if(questionSeven == 2)
					{
						counter++;
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
				else 
					{
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
		
		
	}
	public static void question8()
	{
		// Print sixth question
				System.out.println("Skier x = new SnowRider();");
				System.out.println("x.hygene();");
				System.out.println("x.tricks();");
				System.out.println();
				System.out.println("What will be printed?");
				System.out.println("(1) 360!");
				System.out.println("(2) **throws tripples cork 12");
				System.out.println("(3) Bunny hop mannn!");
				System.out.println("(4) Oh man! I'm so darn slow!");
				System.out.println("(5) Error!");
														
						int questionEight = questions.nextInt();
														
						// if statement for Eighth question
						if(questionEight == 5)
							{
								counter++;
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
						else 
							{
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
	}
	public static void question9()
	{
		// Print sixth question
				System.out.println("SnowRider x = new SnowRider();");
				System.out.println("x.RideLifts();");
				System.out.println("x.tricks();");
				System.out.println();
				System.out.println("What will be printed?");
				System.out.println("(1) The SnowRider is gonna ride that chairrr mann and 360!");
				System.out.println("(2) **throws tripples cork 12 and The SnowRider is gonna ride that chairrr mann");
				System.out.println("(3) Bunny hop mannn!");
				System.out.println("(4) 360! and The Snowboarder is gonna ride that chairr mann");
				System.out.println("(5) Error!");
														
						int questionNine = questions.nextInt();
														
						// if statement for sixth question
						if(questionNine == 1)
							{
								counter++;
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
						else 
							{
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
		
	}
	public static void question10()
	{
		// Print sixth question
		System.out.println("Skier x = new SnowRider();");
		System.out.println("x.tricks();");
		System.out.println("x.speed();");
		System.out.println("x.rideLifts();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) 360!, Straight shreddin man. 60 MPH, and The Skier is gonna ride that chair mann");
		System.out.println("(2) **throws tripples cork 12");
		System.out.println("(3) Bunny hop mannn!");
		System.out.println("(4) Oh man! I'm so darn slow!");
		System.out.println("(5) Error!");
														
				int questionTen = questions.nextInt();
														
				// if statement for sixth question
				if(questionTen == 5)
					{
						counter++;
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
				else 
					{
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
	}
	public static void question11()
	{
		// Print sixth question
		System.out.println("SnowRider x = new SnowBoarder();");
		System.out.println("x.speed();");
		System.out.println("x.hygene();");
		System.out.println("x.rideLifts();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Oh man! I'm so darn slow!, Smells like baby Jesus!, and The SnowRider is gonna ride that chair mann");
		System.out.println("(2) Oh man! I'm so darn slow!, **drools agressively, and The SnowBoarder is gonna ride that chair mann");
		System.out.println("(3) Oh man! I'm so darn slow!, **drools agressively, and The SnowRider is gonna ride that chair mann");
		System.out.println("(4) Oh man! I'm so darn slow!");
		System.out.println("(5) Error!");
														
				int questionEleven = questions.nextInt();
													
				// if statement for eleventh question question
				if(questionEleven == 2)
					{
						counter++;
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
				else 
					{
						System.out.println("You have " + counter + " right answers");
						System.out.println();
					}
			
		
	}
	public static void question12()
	{
		
		// Print sixth question
		System.out.println("SnowRider x = new SnowRider();");
		System.out.println("x.speed();");
		System.out.println("x.hygene();");
		System.out.println();
		System.out.println("What will be printed?");
		System.out.println("(1) Straight shreddin man. 60 MPH and Smells like baby Jesus!");
		System.out.println("(2) Oh man! I'm so darn slow! and **drools aggressively");
		System.out.println("(3) Fly like the wind! and average for a human being");
		System.out.println("(4) Oh man! I'm so darn slow!");
		System.out.println("(5) Error!");
														
						int questionTwelve = questions.nextInt();
														
						// if statement for twelfth question
						if(questionTwelve == 3)
							{
								counter++;
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
						else 
							{
								System.out.println("You have " + counter + " right answers");
								System.out.println();
							}
				
		
		
	}
}
