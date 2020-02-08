package tk.thilinadgunasekara.algorithems;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int []arr = {1,3,2,66,45,89,54,32,20,90};

        System.out.println(Arrays.toString(arr));

        System.out.println("Sorted Array:\n"+ Arrays.toString(sort(arr)));
    }

    public static int[] sort(int []arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
