package tk.thilinadgunasekara.algorithems;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};


        System.out.println("Search Result: "+binarySearch(arr,18));

    }

    public static boolean binarySearch(int []arr , int number){

        int left = arr[0];
        int right = arr[arr.length-1];


        while(left<=right){
            int mid = (left+right)/2;

            if(mid==number){
                return true;
            }else if(number<mid){
                right = mid;
            }else if(number>mid){
                left=mid;
            }
        }
        return false;
    }
}
