import java.util.Scanner;

public class minimum{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int min = a;
        if(b<min){
            b=min;
        }
        else if (c<min){
            c=min;

        }
        

        System.out.println("Among The three numbers :" + a+" "+ b+" "+ c+" " );
        System.out.println(min +"is minimum");
        in.close();

    }

    }
