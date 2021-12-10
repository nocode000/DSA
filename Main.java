package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr={5,6,9,3,7,8,2};
        int n=arr.length;
        bubbleSort(arr,n);
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
    }
    static void bubbleSort(int[] arr,int n){
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
}
