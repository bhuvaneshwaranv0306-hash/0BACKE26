import java.util.Scanner;

public class EvenNumberValidator1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;

        do
        {
            System.out.print("Please enter an even number: ");
            num = sc.nextInt();

            if (num % 2 != 0)
            {
                System.out.println("That's not an even number. Please try again.");
            }
        }
        while (num % 2 != 0);

        System.out.println("Thank you! You entered an even number.");

        sc.close();
    }
}