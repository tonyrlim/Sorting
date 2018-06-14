package sorting;

/**
 *
 * @author Tony Lim
 */
public class radixSort 
{
    //Does the actual sorting
    public static void radixSort(int []initialArray)
    {
        int i;
        int largestInteger = initialArray[0];
        int size = initialArray.length;
        int baseNumber = 1;
        
        for(i =1; i<size; i++)
        {
            if(initialArray[i] > largestInteger)
            {
                largestInteger = initialArray[i];
            }
        }
        
        
        while(largestInteger/baseNumber > 0)
        {
            int[] bucket = new int[size]; //final printable bucket
            int[] tempBucket = new int[10]; //temporary bucket for each index
            
            for(i=0; i<size; i++)
            {
                tempBucket[(initialArray[i]/baseNumber) % 10]++;
            }
            for(i=1; i<10; i++)
            {
                tempBucket[i] += tempBucket[i - 1];
            }
            for(i=size-1; i >= 0; i--)
            {
                bucket[tempBucket[(initialArray[i]/baseNumber) % 10] - 1] = initialArray[i];
                tempBucket[(initialArray[i]/baseNumber) % 10]--;
            }
            for(i=0; i<size; i++)
            {
                initialArray[i] = bucket[i];
            }
            
            baseNumber *= 10; //increase base number to divide from ( 1 to 10 to 100 etc)
        }
        
    }
}
