public class linearSearch {

    public static void main(String[] args) {
        int[] arr = { 10, 50, 40, 25, 70, 20, 89 };
        int target = 20;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}