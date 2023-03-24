public class newbinarysearch {

 static int search(int[] arr,int target){
    int start=0;
    int end =arr.length-1;
    while(start<=end){
        int mid =(start+(end-start)/2);
        if(arr[mid] >target){
            end =mid-1;
        }else if(arr[mid]<target){
            start =mid+1;
        }else{
            return mid;
        }
    }
    return -1;
 };

 public static void main(String[] args) {
    int[] arr ={10,20,23,24,25,89,98,100};
    int target =10;
    System.out.println(search(arr, target));
 }  
}
