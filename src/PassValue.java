public class PassValue {
    public static void main(String[] args) {
//        int ans = sum(10,10);
//        System.out.println(ans);
        String new = mygreet("Adil");
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
