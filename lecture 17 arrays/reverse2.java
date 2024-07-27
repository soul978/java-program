public class reverse2 {
    static void printarrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void swapeInArray(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void resultants(int a[]) {
        int i = 0, j = a.length - 1;

        while (i < j) {
            swapeInArray(a, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        resultants(arr);
        printarrays(arr);
    }
}
