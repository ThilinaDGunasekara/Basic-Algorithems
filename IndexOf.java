package tk.thilinadgunasekara.algorithems;

public class IndexOf {
    public static void main(String[] args) {
        int arr[] ={1,3,47,6,56,45,7,44,76,100};

        System.out.println("Index of 44 : "+ indexOf(arr,44) );

    }

    public static int indexOf(int []arr, int number){
        int index = -1;

        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]==number){
                index=i;
            }
        }
        return index;
    }
}
