import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        double result = Factorial(n)/(Factorial(r)*Factorial(n-r));
        System.out.println(result);
        sc.close();
    }
    public static int Factorial(int a){
        int total = 1;
        for (int i = 2; i<=a; i++) {
            total*=i;
        }
        return total;
    }            
}