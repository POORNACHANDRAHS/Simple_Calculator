import java.util.*;
public class Calculator
{
    public static void main(String[] args) 
    {

        System.out.println("This is a Simple calculator");
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("Enter The two Numbers");
        
           float a=sc.nextFloat();
           float b=sc.nextFloat();
           System.out.println("Enter the Operator\n +\t - \t * \t / \t % \n\n Enter 0 To exit\n");
           char op=sc.next().charAt(0);

            switch(op)
            {
                case '+':
                         System.out.println("The Sum of  "+a+"  "+b+" is  "+(a+b));
                         break;
        
                case '-':
                        System.out.println("The Subtraction of  " +a+"  "+ b+ " is "+(a-b));
                        break;
                
                case '*':
                        System.out.println("The Multiplication of  " + a + "  " + b + " is  " + (a*b));
                        break;

                case '/':
                         if(b==0)
                         {
                            System.out.println("Divide By Zero Error");
                            break;
                         }
                         else
                         {
                            System.out.println("The Division of  " + a + "  " + b + " is  " + (a/b));
                            break;

                         }
                        
                case '%':
                        if(b==0)
                        {
                          System.out.println("Divide By Zero Error");
                          break;
                        }
                        else
                        {
                         System.out.println("The Modulo of  " + a + "  " + b + " is  " + (a%b));
                         break;

                        }
                
                case '0':
                         System.exit(0);
                         
                default:
                        System.out.println("Invalid Operator\n");
                        break;
                         
            }
        }
        
        
    }
    
    
}