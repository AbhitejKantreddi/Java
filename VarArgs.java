import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        fun(64,44,6656,45956,459,0);
        multiple(654,656,"nkjkjl","jijlk");
    }

    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
