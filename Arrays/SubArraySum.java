public class SubArraySum {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int key = 10;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j]; // keep adding current element
                if (sum == key) {
                    found = true;
                    System.out.print("Yes, subarray: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (!found) {
            System.out.println("No subarray with sum " + key);
        }
    }
}

