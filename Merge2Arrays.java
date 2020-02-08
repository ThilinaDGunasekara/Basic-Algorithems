package tk.thilinadgunasekara.algorithems;

public class Merge2Arrays {
    public static void main(String[] args) {
        int []A = {'A','B','C','D'};
        int []a = {'a','b','c','d'};

        int []C = new int[a.length+a.length];

        for (int i = 0; i <A.length ; i++) {
            C[i]=A[i];
        }

        for (int i = 0; i <a.length ; i++) {
            C[i+A.length]= a[i];
        }

        for (int i = 0; i <C.length ; i++) {
            System.out.print((char) C[i]+",");
        }
        System.out.print("\b");
    }
}
