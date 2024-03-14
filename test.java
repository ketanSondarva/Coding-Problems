import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println(new Date());


        // int num1;
		// int num2;
		// if ((num1 / num2 == 5) && (num1 + num2) > 5) {
		// 	System.out.println("1");
		// } else if ((num1 - num2) >= 1 || (num1 % num2) == 0) {
		// 	System.out.println("2");
		// } else {
		// 	System.out.println("3");
		// }


        // float f = 12;
		// switch (f) { // Line 1
		// case 10 + 1: // Line 2
		// 	System.out.println("Twelve");
		// case 0: // Line 3
		// 	System.out.println("Zero");
		// case (int) 12.0:
		// 	System.out.println("Decimal");
		// default:
		// 	System.out.println("Default");




            // double i;
            // char j = 'b';
    
            // switch (j) {
            // default:
            //     i = 0.5;
            // case 'a':
            // case 'A':
            //     i = 7.5;
            //     break;
            // case 'b':
            // case 'B':
            //     i = 5.5;
            //     break;
    
            // case 'c':
            // case 'C':
            //     i = 2.5;
            //     break;
    
            

            // }
            // System.out.println(i);


        // int k = 1;
		// switch (k) {
		// default:
		// 	System.out.println("Have");
		// case 'a':
		// 	System.out.println("A");
		// case 'b':
		// 	System.out.println("Good Day");
		// }


        // int i = 1;
		// int j = 0;
		// switch (i) {
		// case 1:
		// 	j = j + 2;
		// case 2:
		// 	++j;
		// 	break;
		// case 3:
		// 	j++;
		// default:
		// 	j = 5;
		// 	break;
		// }
		// System.out.println(j);


        // int sum = 0;
		// for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1) {
		// 	sum += i;
		// }
		// System.out.println(sum);


		// int i = 0;
		// for (; i <= 3; i++) {
		// 	if (i++ % 2 == 0) {
		// 		System.out.println("i = " + i);
		// 	}
		// }


		// int num1 = 0;
		// int num2 = 0;
		// for (int i = 0; i < 5; i++) {
		// 	if ((++num1 > 2) && (++num2 > 2)) {
		// 		num1++;
		// 	}
		// }
		// System.out.println(num1 + " and " + num2);



		// for (int i = 2; i >= i % 2; i--) 
		// 	System.out.println(i);


		// int counter = 0;
		// while (counter <= 7) {
		// 	if (counter % 2 == 0) {
		// 		counter += 1;
		// 		continue;
		// 	} else {
		// 		counter += 1;
		// 	}
		// 	System.out.println(counter);
		// }


		// Selection Control Structure - Assignment 6:
		// int $one = 2;
		// int $five = 6;
		
		// int purchaseAmount = 21;

		// while($five * 5 > purchaseAmount) {
		// 	$five--;
		// }

		// // int $oneCount = 0;
		// // int $fiveCount = 0;

		// purchaseAmount -= ($five * 5);
		// $one = purchaseAmount;
		
		// System.out.println("$1 notes needed = "+$one);
		// System.out.println("$5 notes needed = "+$five);

		
		// must do :
		// Selection Control Structure - Assignment 7
		// Iteration Control Structure - Assignment 2

		// sum of digit:
		// int num = 546;

		// int sum = 0;
		// while(num != 0) {
		// 	sum += num % 10;
		// 	num /= 10;
		// }

		// System.out.println(sum);


		// // arm strong number:

		// int num = 371;

		// int digits = 0;
		// int temp = 371;

		// while(temp != 0) {
		// 	digits++;
		// 	temp /= 10;
		// }

		// temp = num;
		// int sum = 0;
		// for(int i= 0; i < digits; i++) {
		// 	int last = temp % 10;
		// 	sum += Math.pow(last, digits);
		// 	temp /= 10;
		// }

		// if(sum == num) {
		// 	System.out.println("it is an armstrong number !");
		// } else {
		// 	System.out.println("it is not an armstrong number !");
		// }

		String s1 = "dsk-879009l";

		String s3 = "IPH-879009l";
		String s2 = "^(DSK|LTP|IPH)-\\d{6}[HLhl]$";
						
		String regex = "(?i)(DSK|LTP|IPH)-\\d{6}[HL]";

		String regex2 = "^[A-Z][a-zA-Z]+(?:\\s[A-Z][a-zA-Z]+)+$";


		System.out.println(s1.matches(s2));
		System.out.println(s3.matches(s2));
		System.out.println("Harry".matches(regex2));

    }
}
