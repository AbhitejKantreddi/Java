import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        
        int min = Math.min(c, Math.min(a, b));
        
        
        System.out.println(min);
        
        in.close(); 
    }
}
