import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int n = 6;
        List<Integer> Divisors = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                Divisors.add(i);
            }
        }
        System.out.print(Divisors);
    }
}