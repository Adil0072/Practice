import java.util.Scanner;

public class PassValue {
    public static void main(String[] args) {
//        int ans = sum(10,10);
//        System.out.println(ans);
        Scanner in == new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String new = mygreet(name);
        System.out.println(new);
    }
    static String mygreet(String name){
        String msg = "Hello " + name;
        return msg;
    }
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
