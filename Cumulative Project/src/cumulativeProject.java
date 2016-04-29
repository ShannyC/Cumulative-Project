import java.util.Scanner;

public class cumulativeProject
	{

		public static void main(String[] args)
			{
				meetPerson();

			}
		public static void meetPerson()
		{
			Scanner userlnput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userlnput.nextLine();
			System.out.println("Hello," + name + "!");
			String meetPerson [] = {"You look nice today!", "I love your personality!", "I love you!"};
			int compliment = (int)(Math.random() * 3);
			System.out.println(meetPerson [compliment]);
		}

	}
