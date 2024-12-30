import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out, false);) {
            new Main().run(scanner, out);
        }
    }

    private void run(Scanner scanner, PrintWriter out) {
    }
}

/**
 * 場合の数に関する計算クラス
 */
class Combinatorial {

    /**
     * n個の要素からr個を選び出す、組み合わせの総数を取得する
     * 
     * @param n
     * @param r
     * @return 組み合わせの総数
     */
     static long conbination(long n, long r) {
        return permutation(n, r) / factorial(r);
    }

    /**
     * n個の要素からr個を並べる、順列の総数を取得する
     * 
     * @param n
     * @param r
     * @return 順列の総数
     */
     static long permutation(long n, long r) {
        return productNtoM(n, n - r + 1);
    }

    /**
     * nの階乗を取得する
     * 
     * @param n
     * @return nの階乗
     */
     static long factorial(long n) {
        return permutation(n, n);
    }

    /**
     * nからmまでのすべての数の積を取得する
     * 
     * @param n
     * @param m
     * @return nからmまでのすべての数の積
     */
     static long productNtoM(long n, long m) {
        if (n == m) {
            return m;
        }
        return n * productNtoM(n - 1, m);
    }

}