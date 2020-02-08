package tk.thilinadgunasekara.algorithems;

public class EqualArray {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {1,2,3,4,5};
        int []arr3 = {1,2,4,5};

        System.out.println("Equality of array1 & array2: " + equalArray(arr1,arr2));
        System.out.println("Equality of array1 & array3: " + equalArray(arr1,arr3));
    }

    public static boolean equalArray(int []arr1,int []arr2){

        if(arr1.length==arr2.length){
            for (int i = 0; i <arr1.length-1 ; i++) {
                if(arr1[i]==arr2[i]){
                    return true;
                }else {
                    return false;
                }
            }
        }else {
            return false;
        }
        return false;
    }
}
