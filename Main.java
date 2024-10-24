import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
         //1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
        System.out.println("Q1) Please enter two number ");
        System.out.print("Enter the first number: ");
        int num1=input.nextInt();
        System.out.print("Enter the second number: ");
        int num2=input.nextInt();

        System.out.println(num1+" + "+num2 +" = "+(num1+num2));
        System.out.println(num1+" - "+num2 +" = "+(num1-num2));
        System.out.println(num1+" x "+num2 +" = "+(num1*num2));
        System.out.println(num1+" / "+num2 +" = "+(num1/num2));
        System.out.println(num1+" mod "+num2 +" = "+(num1%num2));

        System.out.println("*************************************");

        //2. Write a Java program that takes a number as input and prints its multiplication table up to 10
//        System.out.println("Q2) Please enter number to display multiplication table ");
        System.out.print("Enter number to prints its multiplication: ");
        int multiplication_num=input.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(multiplication_num+" x "+i +" = "+(i*multiplication_num));
        }
        System.out.println("*************************************");

        //3. Write a Java program to print the area and perimeter of a circle.
//        System.out.println("Q3) Please enter Radius to calculate area and perimeter of the circle. ");
        System.out.print("Enter Radius: ");
         double radius=input.nextDouble();
         System.out.println("perimeter is: "+(2*3.14)*radius);
        System.out.println("Area is: "+(radius*radius)*(3.14));
        System.out.println("*************************************");

        //4.Java program to find out the average of a set of integers
        System.out.println("Q4) Please enter number to find out the average ");
        int count_of_number=input.nextInt();
        double sum_of_integer=0;
        for (int i=0;i<count_of_number;i++){
            System.out.println("Enter an integer ");
            sum_of_integer= sum_of_integer+input.nextInt();
        }
        System.out.println("The average is: "+(sum_of_integer/count_of_number));

        System.out.println("*************************************");



        //5 Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
//        System.out.println("Q5) Please enter there integer ");
        System.out.println("determines whether the sum is equal to the third integer:");
        System.out.print("first_integer:");
        int first_integer=input.nextInt();
        System.out.print("second_integer:");
        int second_integer=input.nextInt();
        System.out.print("third_integer:");
        int third_integer=input.nextInt();

        boolean equal =false;
        if((first_integer+second_integer)==third_integer) {
            equal = true;
        }System.out.println("he result is: "+equal);
        System.out.println("*************************************");
 input.nextLine();
        //6). Write a Java program to reverse a word.
        System.out.println("Q6) Write a Java program to reverse a word");
        System.out.println("please enter any string to create a Reverse:");
        System.out.print("Input a word: ");
        String normal_string= input.nextLine();
        String reverse="";

        for (int i=normal_string.length()-1 ;i>=0;i--){
            reverse+=normal_string.charAt(i);
        }
        System.out.println("Reverse word: "+reverse);
        System.out.println("********************");

        //.7) Java program to check whether the given number is even or odd
        System.out.println("Q7)Enter a number ot check it it odd or even:");
        int odd_or_even=input.nextInt();
        System.out.println(odd_or_even%2==0  ? "The number is even" : "The number is odd");

        System.out.println("********************");

        //8)Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("Q8)Enter temperature in Centigrade:");
        double Centigrade=input.nextDouble();
        System.out.println("Temperature in Fahrenheit is: "+( (Centigrade * 1.8) + 32));
input.nextLine();
        //9).Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
           System.out.println("Q9)Enter an String:");
           String sentence =input.nextLine();
           System.out.print("Enter an integer number to check the index String:");
           int index= input.nextInt();

               while(index>sentence.length()) {
                   System.out.print("please enter smaller number:");
                   index=input.nextInt();
               }
        System.out.println("character in the given index is: "+sentence.charAt(index-1));

        System.out.println("********************");

        //10) Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("Q10)let's calculate area and perimeter of a rectangle:");
        System.out.print("Enter Width= ");
        double Width=input.nextDouble();
        System.out.print("Enter Height= ");
        double Height=input.nextDouble();

        System.out.println("Area is "+ Width + " * " +Height+ " = "+ (Width*Height));
        System.out.println("Perimeter is 2 * "+ "("+ Width +" + " +Height+ ") = "+ 2*(Width+Height) );

        System.out.println("********************");

        //11)Write a Java program to compare two numbers.
        System.out.println("Q11)Enter two number to compare theme");
        System.out.print("Enter First integer: ");
        int num1_compare=input.nextInt();
        System.out.print("Enter second integer: ");
        int num2_compare=input.nextInt();

        if(num1_compare!=num2_compare) {
            System.out.println(num1_compare + " != " + num2_compare);
        }else System.out.println(num1_compare + " == " + num2_compare);
        if(num1_compare<num2_compare)
            System.out.println( num1_compare+" < "+num2_compare);
        if(num1_compare>num2_compare)
            System.out.println( num1_compare+" > "+num2_compare);
        if(num1_compare>=num2_compare)
        System.out.println( num1_compare+" >= "+num2_compare);
        if(num1_compare<=num2_compare)
            System.out.println( num1_compare+" <= "+num2_compare);

        System.out.println("*******************");


       // Q12)Write a Java program to convert seconds to hours, minutes and seconds.
      System.out.println("Q12)Enter seconds to convert to hours: minutes: seconds");
      System.out.print("Enter integer seconds : ");
      int seconds=input.nextInt();
       // System.out.println("");
        System.out.printf("%02d:%02d:%02d", (seconds/3600), (seconds%3600)/60 , seconds%60);
                System.out.println("*******************");




        //Q13)13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.
        System.out.println("enter four integers from the user and prints equal or not");
        int count=0;
        boolean out=false;
        int pre=0;
        while (count<4){
            System.out.println("Enter an integers number");
            if (count==0)
            {
            pre=input.nextInt();
            }else{
                if(pre!=input.nextInt()){
             out=true;
           }} count++;
        }
        System.out.println(out ? "The Numbers are not equal!" : "Numbers are  equal!");
                System.out.println("*******************");

        //Q14) Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

        System.out.println("Q14)Enter integer number to check if whether it is negative, zero or positive");
       System.out.print("Enter integer: ");
       int check_number=input.nextInt();
       if(check_number==0){
           System.out.println("Number is zero");
       }else if(check_number<0){
           System.out.println("Number is negative");
       }else System.out.println("Number is positive");

                System.out.println("*******************");

        //Q15).Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered  (End loop use -1 ,
        //Don’t count -1).
        int zeros=0;
        int nenegative=0;
        int positive=0;
        int number;
        System.out.println("Q15 let determin the number if it 0,-,+");
         do{
             System.out.println("Enter numbers or -1 to end the game!");
             number=input.nextInt();

             if(number==0)zeros++;
             if(number>=1)positive++;
             if(number<-1)nenegative++;

         }while(number != -1);
        System.out.println(positive+" positive");
        System.out.println(zeros+" zero");
        System.out.println(nenegative+" nenegative");

                System.out.println("*******************");

        //Q16) Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
        System.out.println("Q16)please enter an integer number to revers it");
        int num =input.nextInt();
        int reversed_dighits=0;
        int d;
        while(num != 0){
            d=num%10;
            reversed_dighits=reversed_dighits*10 +d;
            num=num/10;
        }
        System.out.println("The reversed number is: "+reversed_dighits);

                System.out.println("*******************");

        //Q17) Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.
        int entered_num;
        boolean first=true;
        System.out.println("Enter numbers to largest largest and smallest or 0 to quite");
        entered_num = input.nextInt();
        int largest=entered_num;
        int smallest=entered_num;
        do{
            if(first) {
                System.out.println("Q17)Enter numbers to largest largest and smallest or 0 to quite");
                entered_num = input.nextInt();

              first=false;
              continue;
            }
            System.out.println("Enter numbers to largest largest and smallest or 0 to quite");
            entered_num = input.nextInt();
           if (entered_num>largest && entered_num !=0)
               largest=entered_num;
           if (entered_num<smallest && entered_num !=0)
               smallest=entered_num;
        }while(entered_num!= 0);
        System.out.println("The large number is: "+largest);
        System.out.println("The smallest number is: "+smallest);

        System.out.println("*******************");
        input.nextLine();

        //18) Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user
        System.out.println("Q18)please enter String to calculate number of character ‘a’");
        String sensent_a=input.nextLine();
        int a_count=0;
        char character;
        for (int i = 0; i < sensent_a.length(); i++) {

       if(sensent_a.charAt(i) == 'a'){
          a_count++;
       }
        }
        System.out.println("Number of a's: "+a_count);































    }
}