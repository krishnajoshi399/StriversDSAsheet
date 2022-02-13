/*

Bruteforce -> MergeSort O(log(n))
Optimal -> CountingSort logic O(n)
Best -> DNF Algorithm / 3-way partitioning O(n) {single pass solution}

*/

import java.util.Arrays;
import java.util.Scanner;

class Sort012{
    public static void countingSort(int[] a, int n){
        int c0 = 0, c1 = 0, c2 = 0, j=0;
        for(int i=0;i<n;i++){
            if(a[i] == 0)
                c0++;
            else if(a[i] == 1)
                c1++;
            else
                c2++;
        }
        while(c0-->0)
            a[j++] = 0;
        while(c1-->0)
            a[j++] = 1;
        while(c2-->0)
            a[j++] = 2;
    }
    public static void DNF(int[] a, int n){
        int l = 0, m =0, h = n-1;
        while(m<=h){
            switch(a[m]){
                case 0: int t1 = a[l];
                        a[l++] = a[m];
                        a[m++] = t1;
                        break;
                case 1: m++;
                        break;
                case 2: int t2 = a[h];
                        a[h--] = a[m];
                        a[m] = t2;
                        break;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        System.out.println(Arrays.toString(a));
//      countingSort(a, n);
        DNF(a, n);
        System.out.println(Arrays.toString(a));        
    }
}