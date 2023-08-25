package sk.makay;

public class A5_Factorial {

    public static void main(String[] args) {
        System.out.println(iterativeFactorial(5));
        System.out.println(recursiveFactorial(5));
    }

    public static int iterativeFactorial(int x) {
        if (x == 0) return 1;

        int factorial = 1;
        for (int i = 1; i<=x;i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int recursiveFactorial(int x){
        if (x == 0) return 1;
        return x * recursiveFactorial(x - 1);

    }

}
