public class floor{

    static int floorSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // if(target < arr[start]){
        //     return -1;
        // }
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
        return end;
    }

    public static void main(String[] args) {
           int[] arr ={4,8,10,12};
           int target =19;
          int result = floorSearch(arr, target);
        System.out.println(result);  
        }
}