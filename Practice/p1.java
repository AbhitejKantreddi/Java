package Practice;

/*package Practice;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int final_result = 
        System.out.println(final_result);
        in.close();
    }

    static int cgpa(int a, int b, int c, int d){
        int calc = a+b+c+d;
        int final_result = calc/4;
        return final_result;

    }

    
}
*/



import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks = totalMarks + scanner.nextInt();//totalMarks += scanner.nextInt()
            
        }System.out.println(totalMarks);}


        //static void int(int a)
    
    
    }