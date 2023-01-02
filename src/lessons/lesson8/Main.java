package lessons.lesson8;

public class Main {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }


    public static int fact(int n) {
        int answer = 0;
        if (n == 0) {
            return 1;
        } else {

            for (int i = 1; i <= n; i++) {

                answer = n * fact(n - 1);
            }
            return answer;
        }
    }
}
