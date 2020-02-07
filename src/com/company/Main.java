package com.company;


import java.util.Arrays;

class BinarySearch{
    private int[] arr;
    private int size, position;

    public BinarySearch(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        this.position = 0;
    }

    public int findIndByEl(int el){
        int median = (position+size)/2;
        while (arr[median] != el){
            if (arr[median] < el)
                position = median;
            else
                size = median;

            median = (position+size)/2;
        }
        return median;
    }
}
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 0, 2, 4, 7};
        Arrays.sort(arr);
        BinarySearch bs = new BinarySearch(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bs.findIndByEl(3));
    }
}
