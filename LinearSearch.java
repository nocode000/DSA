import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target=s.nextInt();
        int[] arr={1,2,3,5,0,-1,-8,-9};
        System.out.println(linearSearch(arr,target));
    }
    static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==target)
                return i;
        }
        return -1;
    }
}
