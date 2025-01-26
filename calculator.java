import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Enter the operator: ");
        Scanner in = new Scanner(System.in);
        char op = in.next().trim().charAt(0);
        System.out.println("Enter the numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int num=0;

        if(op == '+'){
            num = a+b;
        }
        else if(op =='-'){
            num = a-b;
        }
        else if(op == '*'){
            num = a*b;        }
        else {
          System.out.println("invalid");  
        }
        System.out.println(num);
        in.close();

    }
    
}
