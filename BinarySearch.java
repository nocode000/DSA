public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,9,100,200,250,300,350,400,444,448};
        int target=444;
        System.out.println(binarySearch(arr,target));

    }
    static int binarySearch(int[] arr,int target){
        int start=0,end=arr.length,mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(arr[mid]<target)
                start=mid+1;
            else
                end=mid;
        }
        return -1;
    }
}
