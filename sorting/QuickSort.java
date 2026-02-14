import java.util.*;
public class QuickSort {


    private static void swap(int i,int j,int[] arr)
    {
        int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }

     private static int partion(int arr[],int low,int high)
     {

        int i=low;
        int j=high;
        int pivot=arr[low];

        while(i<j)
        {
            while(pivot>=arr[i] && i<=high)
            {
                i++;

            }

            while(arr[j]>pivot && j>=low)
            {
                j--;
            }

            if(i<j)
            {
                swap(i,j,arr);
            }



        }

        swap(low,j,arr);

        return j;

     }
    public static void Quick(int arr[],int low,int high)
    {
       if(low<high)
       {

         int PartionIndex=partion(arr,low,high);

        Quick(arr, low, PartionIndex-1);
        Quick(arr,PartionIndex+1, high);

       }
    }
    public static void main(String args[])
    {
        int arr[]={4,9,2,8,3,2,1};

        Quick(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
    
}
