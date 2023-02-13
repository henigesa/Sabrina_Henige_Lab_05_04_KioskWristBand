
//class KioskWristband
//	main ()
//		num age
//			output “Please enter your age in years.”
//			input age
//			if [ age ≥ 21 ] then
//				output “Please collect your wristband.”
//			end if
//	return
//end class
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //declare variables
        int age;
        //prompt user to enter their party
        System.out.println("Please enter your age");
        //take the user input
        age = input.nextInt();
        //if then
        if (age >= 21) {
            System.out.println("Please collect your wristband");
        }
        else {
                System.out.println("Thank you");
            }

    }
}