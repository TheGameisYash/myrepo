import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        String operator;
        int number1,number2,result;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose an operator (+,-,*,/)");
        operator = sc.nextLine();

        System.out.println("Choose num1");
        number1 = sc.nextInt();

        System.out.println("Choose num2");
        number2 = sc.nextInt();

        switch(operator){
            case "+":
            result = num1 + num2;
            System.out.println(num1+ "+" +num2+ "="+result  );
            break;

            case "-":
            result = num1 - num2;
            System.out.println(num1+ "-"+num2+ "="+result);

            case "*":
            result = num1*num2;
            System.out.println(num1+ "*"+num2+ "="+result);

            case "/":
            result = num1/num2;
            System.out.println(num1+"/"+num2+"="+result);



        }
        
    }
}
