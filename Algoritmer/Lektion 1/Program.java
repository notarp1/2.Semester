public class Program {


    int f(int[] A, int n) {
        if (n == 0) {
            return 0;
        } else
            return f(A, n - 1) + A[n - 1];
    }

    int iterativ(int n) {

        int A[] = new int[n];
        int x = 0;

        for (int i = 0; i < n; i++) {

            x += A[i];
        }

        return x;

    }

}