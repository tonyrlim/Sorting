package sorting;

/**
 *
 * @author Tony Lim
 */
public class heapSort 
{
    private static int n;
    private static int[] array;
    private static int left;
    private static int right;
    private static int biggestElement;
    
    //aka heapify. Uses the largest element in the and swaps heap to build the heap
    public static void buildHeap(int []array)
    {
        n = array.length-1;
        for(int i=n/2; i>=0; i--)
        {
            maxheap(array,i);
        }
    }
    
    //Swaps the two integers in the heap
    public static void swap(int i, int j)
    {
        int t = array[i];
        array[i] = array[j];
        array[j] = t; 
    }
    
    //This function swaps the biggest element in the heap
    public static void maxheap(int[] array, int i)
    { 
        left = 2*i;
        right = 2*i+1;
        if(left <= n && array[left] > array[i])
        {
            biggestElement = left;
        }
        else
        {
            biggestElement = i;
        }
        
        if(right <= n && array[right] > array[biggestElement])
        {
            biggestElement = right;
        }
        if(biggestElement != i)
        {
            swap(i,biggestElement);
            maxheap(array, biggestElement);
        }
    }
    
    //Does the actual sorting
    public static void heapSort(int []initialArray)
    {
        array = initialArray;
        buildHeap(array);
        
        for(int i=n; i>0; i--){
            swap(0, i); //swap with the last element
            n = n-1; //decreases the size of the heap so that the last value will stay in place
            maxheap(array, 0); //reset the heap to maxHeap
        }
    }
}
