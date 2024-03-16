package Recursion;
import java.io.*;
import java.util.*;
public class CountDigi {
    public static int countDigits(int n){
        if (n < 10) {
           return 1;
       }
       // Recursively divide n by 10 and count the digits
       return 1 + countDigits(n / 10);
   }


public class Runner {
    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        String nextL() throws IOException {
            return br.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t;
    private static int []n;

    private static void takeInput() throws IOException {
        t = 1;
        n = new int[t];
        for (int i = 0; i < t; ++i) {
            n[i] = sc.nextInt();
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            int ans = CountDigi.countDigits(n[i]);
            System.out.println(ans);
        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }
}
}
