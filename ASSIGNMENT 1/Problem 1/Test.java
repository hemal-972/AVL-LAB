import java.util.Scanner;
public class Test{
    public static void main(String[] args)
    {
        char op;
        Double num1,num2,result;
        boolean a,b;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Press 1 for logical operations or Press 2 for arithmetic operations.");
        n = input.nextInt();
        if(n==1)
        {
            System.out.println("Choose an operator: &, | or !");
            op = input.next().charAt(0);
            if(op == '!')
            {
                System.out.println("Enter a state : ");
                a = input.nextBoolean();
                System.out.print("result: ");
                System.out.println(!a);
            }
            else if(op=='&')
            {
                System.out.println("Enter first state: ");
                a = input.nextBoolean();
                System.out.println("Enter second state: ");
                b = input.nextBoolean();
                System.out.print("result: ");
                System.out.println(a&&b);
            }
            else if(op=='|')
            {
                System.out.println("Enter first state: ");
                a = input.nextBoolean();
                System.out.println("Enter second state: ");
                b = input.nextBoolean();
                System.out.print("result: ");
                System.out.println(a||b);
            }
        }
        else
        {

        System.out.println("Choose an operator: +, -, * or /");
        op = input.next().charAt(0);
        System.out.println("Enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter second number: ");
        num2 = input.nextDouble();
        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("result=" +num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("result=" +num1 + "-" + num2 + "=" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("result=" +num1 + "*" + num2 + "=" + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("result=" +num1 + "/" + num2 + "=" + result);
                break;
            default:
            System.out.println("Invalid operator.");
                break;
        }
    }
    }
}