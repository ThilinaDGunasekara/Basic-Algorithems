package tk.thilinadgunasekara.algorithems;

public class ElementExistInArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,66,77,44,78};
        System.out.println("Number existence of 12 is : "+ exist(arr,12));
        System.out.println("Number existence of 77 is : "+ exist(arr,77));
    }

    public static boolean exist(int []arr,int number){
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==number){
                return true;
            }
        }
        return false;
    }
}
