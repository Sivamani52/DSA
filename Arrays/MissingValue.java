// check missing values in a sequence in an array

public class MissingValue {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6};

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];

            while (current + 1 < next) {
                current++;
                System.out.println("Missing: " + current);
            }
        }
    }
}

