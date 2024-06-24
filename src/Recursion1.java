public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(fac(5)); //5! = 5 * 4 * 3 * 2 * 1 = 120;
    }

    public static int fac(int n){
        if (n == 0){
            return 1;
        } else { //재귀
            return  n * fac(n-1); // int n 자신을 다시 호출해 사용.
        }
    }
}
