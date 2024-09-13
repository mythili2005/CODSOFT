import java.util.Random;
import java.util.Scanner;
class Demo
{
	static void time(int n)
		{
		try {
            Thread.sleep(n);
        }
        catch (Exception e) {
            System.out.println(e);
        }
		}
		static int round()
		{
			Random random = new Random();
			int x = random.nextInt(100);
			return x;
		}
		static void print(int attempt,int generated)
		{
			if(generated>attempt)
			{	
				if((generated-10)>attempt)
				{
					System.out.println("Too low to generated number give a try");
				}
				else{
					System.out.println("Your prediction is nearer to the generated number");
					System.out.println("Here is your bonous : Your prediction is low");
				}
			}
			else{
				if((generated+10)<attempt)
				{
					System.out.println("Too high to generated number give a try");
				}
				else{
					System.out.println("Your prediction is nearer to the generated number");
					System.out.println("Here is your bonous : Your prediction is high");
				}
			}
		}		
	public static void main(String args[]){
		int score = 0;
		System.out.println("Welocme...This is an Number Game");
		time(2000);
		System.out.println("You have to find the generated number between 1 and 100");
		time(2000);
		System.out.println("This game consist of 2 rounds");
		time(2000);
		System.out.println("For each round a new number is generated");
		time(2000);
		System.out.println("First round : You will have 3 attempts with scores 50,25 and 10.");
		time(2000);
		System.out.println("Second round : You will have 2 attempt with scores 50 and 25.");
		time(2000);
		System.out.println("Third round : You will have 1 attempt with score 50.");
		time(2000);
		System.out.println("Round 1");
		time(1500);
		Scanner sc = new Scanner(System.in);
		System.out.println("Attempt 1 :");
		int attempt1 = sc.nextInt();
		int generated_number =	round();
		if(attempt1 == generated_number)
		{
			score = score+50;
			System.out.println("Your guess is correct");
			return;
		}
		else
		{
			print(attempt1,generated_number);
		}
		System.out.println("Attempt 2 :");
		int attempt2 = sc.nextInt();
		if(attempt2 == generated_number)
		{
			score = score+25;
			System.out.println("Your guess is correct");
		}
		else
		{
			print(attempt2,generated_number);
		}
		System.out.println("Attempt 3 :");
		int attempt3 = sc.nextInt();
		if(attempt2 == generated_number)
		{
			score = score+10;
			System.out.println("Your guess is correct");
		}
		else
		{
			print(attempt3,generated_number);
		}
		time(1000);
		System.out.println("Round 2");
		System.out.println("Attempt 1 :");
		int generated_number_1 = round();
		int attempt4 = sc.nextInt();
		if(attempt4 == generated_number_1)
		{
			score = score+50;
			System.out.println("Your guess is correct");
		}
		else
		{	
			print(attempt4,generated_number_1);
		}
		System.out.println("Attempt 2 :");
		int attempt5 = sc.nextInt();
		if(attempt5 == generated_number_1)
		{
			score = score+25;
			System.out.println("Your guess is correct");
		}
		else
		{	
			print(attempt5,generated_number_1);
		}
		time(1000);
		System.out.println("Round 3");
		System.out.println("Attempt 1 :");
		int generated_number_2 = round();
		int attempt6 = sc.nextInt();
		if(attempt6 == generated_number_2)
		{
			score = score+50;
			System.out.println("Your guess is correct");
		}
		else
		{	
			print(attempt6,generated_number_2);
		}
		System.out.println("Your final score is " + score);
	}
}