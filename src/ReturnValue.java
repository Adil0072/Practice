import java.util.Scanner;
public class ReturnValue {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum;
        sum = a + b;
        return(sum);
    }
}
