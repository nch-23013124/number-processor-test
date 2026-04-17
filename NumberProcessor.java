public class NumberProcessor {

    public static int processNumbers(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result += arr[i];
            } else {
                result -= arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(processNumbers(arr));
    }
}
