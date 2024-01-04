import java.util.TreeSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        TreeSet<Integer> A = new TreeSet<>();
        for (int i = 0; i < n1; i++) {
            A.add(sc.nextInt());
        }
        int n2 = sc.nextInt();
        TreeSet<Integer> B = new TreeSet<>();
        for (int i = 0; i < n2; i++) {
            B.add(sc.nextInt());
        }
        for (int x : A) {
            if (B.contains(x)) {
                System.out.print(x + " ");
            }
        }
    }
}
