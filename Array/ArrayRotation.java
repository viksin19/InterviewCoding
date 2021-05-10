class ArrayRotation {
    static void rotate(int[] arr, int k) {

        int size = arr.length;
        for (int i = 1; i <= k; i++) {
            int temp = arr[0];
            for (int j = 1; j < size; j++)
                arr[j - 1] = arr[j];

            arr[size - 1] = temp;
        }

    }

    static void printTestCase(int number, String color, boolean result) {
        if (result)
            System.out.println("\u001B[32m" + " Test case " + number + ": Passed." + " \u001B[0m");
        else
            System.out.println("\u001B[31m" + " Test case " + number + ": Failed." + " \u001B[0m");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        String green = "\u001B[32m";
        String red = "\u001B[31m";
        // Calling rotate function
        rotate(arr, 2);
        System.out.println("Test case 1: " + ((arr[0] == 3) ? green : red));
        rotate(arr, 2);
        System.out.println("Test case 2: " + (arr[0] == 5 && arr[1] == 6));

    }
}