import java.util.Scanner;
public class functionString {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);

    }

    static String myGreet(String name){
        String message = "Namaste " + name;
        return message;
    }
}
