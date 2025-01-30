package Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        int[] cars = new int[5];
        cars[0]=52;
        cars[1]=25;
        cars[2]=65;
        cars[3]=56;
        cars[4]=37;

        for (int i =0;i<cars.length;i++){
            cars[i]=in.nextInt();}
/*
        for (int i =0;i<cars.length;i++){
             cars[i]=in.nextInt();
            System.out.print(cars[i]+" ");
        }
*/
        //for each
        for (int num : cars){
            System.out.print(num+" ");
        }
        
        //System.out.println(Arrays.toString(cars));

        System.out.println(cars.length);

        in.close();
    }
    
}
