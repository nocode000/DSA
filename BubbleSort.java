
public class BubbleSort{
    public static void main(String[] args) {
        int[] arr={-1,32,7,-89};
        int n=arr.length;
        bubbleSort(arr,n);
        for (int ele:arr) {
            System.out.print(ele+" ");
        }

    }
    static void bubbleSort(int[] arr,int n){
        for (int i = 0; i < n-1 ; i++) {
            boolean flag=false;
            for (int j = i; j <n ; j++)
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            if(flag==false)
                break;
        }
    }
}