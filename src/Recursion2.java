public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }

    public static int power(int base, int exponent){
        if (exponent == 0){
            return 1;
        } else {
            return base * power(base, exponent -1);
        }

    }
}
