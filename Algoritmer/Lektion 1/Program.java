public class Program {


    int recursion(int[] A, int n) {
        if (n == 0) {
            return 0;
        } else
            return recursion(A, n - 1) + A[n - 1];
    }

    int iterativ(int n) {

        int A[] = new int[n];
        int x = 0;

        for (int i = 0; i < n; i++) {

            x += A[i];
        }

        return x;

    }

    public static void main(String[] args) {
        int[] tal = {2,1,3,2,3,11,1,5,7,10};
        it(tal, 0,9);

    }

    static int it(int A[], int i, int j) {

        boolean max = true;



        //int m = ((i + j) / 2);
        int m = 4;

        while (max) {


            if (A[m] >= A[m - 1] && A[m] >= A[m + 1]) {


                max = false;


            } else if (A[m - 1] > A[m]) {
                System.out.println("hej");
                m = ((i + A[m-1])/2);
                continue;

            } else if(A[m] < A[m+1]){
                System.out.println("hej");
                m=(A[m+1]+j/2);
                continue;

            }


        }
        System.out.println(m);
        System.out.println(A[m]);
        return m;
    }

}



