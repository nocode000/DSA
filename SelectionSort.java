public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={};
        int n=arr.length;
        selectionSort(arr,n);
        for (int ele:arr) {
            System.out.print(ele+" ");
        }

    }
    static int  getMax(int[] arr,int start,int size){
        int max=start;
        for (int i = start; i <= size; i++) {
            if(arr[max]<arr[i])
                max=i;
        }
        return max;
    }
    static void swap(int[] arr ,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void selectionSort(int[] arr,int n){
        for (int i = 0; i < n; i++) {
            int lastIndex=n-i-1;
            int maxElement=getMax(arr,0,lastIndex);
            swap(arr,maxElement,lastIndex);
        }
    }
}
