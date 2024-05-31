
import java.util.Scanner;

public class calculate {
    public static void main(String [] arguments)
    {           
        int operator ,num1,num2;
        System.out.println("1-add  \n 2-substrac  \n 3-multiply  \n 4-divide");
        System.out.println("choose the operator:");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter the first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:");
        num2=sc.nextInt();
        
        int result = 0;
        switch(operator)
        {
            case 1:
                result=num1+num2;
                break;
            
            case 2:
                result=num1-num2;
                break;
             
            case 3:
                result=num1*num2;
                break;
            
            case 4:
                result=num1/num2;
                break;
            
            default:
                System.out.println("Enterend operator is not valid!");
                
                
        
        }
        System.out.println("result is:");
        System.out.println(result);
    }
    
    
    
}
