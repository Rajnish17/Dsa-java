public class ceiling {

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[end]){
            return -1;
        }
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end =mid-1;
            }else{
                start =mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
           int[] arr ={4,8,10,12};
           int target =9;
          int result = search(arr, target);
        System.out.println(result);  
        }
}