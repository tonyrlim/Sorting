package sorting;

/**
 *
 * @author Tony Lim
 */
public class bubbleSort 
{
    public static void bubbleSort(int []array)
    {
        int temp;
        
        for(int i=array.length - 1; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(array[j]>array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
