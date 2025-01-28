public class overloading {
    public static void main(String[] args) {
        fun(42);
        fun("hjg");
        int sum = sum(4,5);
        System.out.println(sum);
        sum = sum(5,6,3);
        System.out.println(sum);
        
        
    }

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b,int c){
        return a+b-c;}

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
    
}
