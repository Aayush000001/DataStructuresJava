package com.aayush.gulia;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int length = arr.length;
        binarySearch(arr,length,82);
    }

    static void display(int x){
        if(x==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index : " + x);
        }
    }

    static void binarySearch(int [] array, int len, int key) throws ArrayIndexOutOfBoundsException{
        int l,h,mid;
        l=0;h=len;

        while(l<=h){
            mid=(l+h)/2;

            if (key==array[mid]){
                display(mid);
                return;
            }
            else if(key<array[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        display(-1);

    }
}
