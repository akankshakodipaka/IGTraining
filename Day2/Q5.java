// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Q5 {
    public static void swap(int a,int b)
    {
        System.out.println("Before Swap:");
        System.out.println(a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap:");
        System.out.println(a+" "+b);
    }
    public static void swap(int[] a,int[] b)
    {
        System.out.println("Before Swap:");
        printArray(a,b);
        System.out.println("After Swap:");
        int n=a.length;
        int temp[]=new int[n];
        temp=a;
        a=b;
        b=temp;
        printArray(a,b);
    }
    public static void printArray(int[] a,int[] b)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int a[]={2,5,7,2,8};
        int b[]={4,8,2,3,9};
        swap(4,7);
        swap(a,b);
        
        
        
        
    }
}