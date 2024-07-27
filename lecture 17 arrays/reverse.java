public class reverse {
    static void printarrays(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int [] reverseArryas(int arr[]) {//? int[] return types is most important otherwise ans it not returns ;
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        // ! traverse prigionla arrays in reverse dorections :

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 6, 6 };
        int ans[] = reverseArryas(arr);
        printarrays(ans);
    }
}