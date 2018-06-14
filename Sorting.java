package sorting;

import java.util.*;

/**
 *
 * @author Tony Lim
 */
public class Sorting 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.print("Please enter the amount of numbers you would like to sort: ");
        input = in.nextInt();
        int[] random = randomIntegers(input);
        int selection;
        System.out.println("Please choose from the following options: \n" +
                           "  1 - Perform a Heap Sort\n" +
                           "  2 - Perform a Radix Sort\n" +
                           "  3 - Perform a Bubble Sort\n"
                          );
        
        System.out.print("Please enter your option below: ");
        selection = in.nextInt();
        in.nextLine();
        
        switch(selection)
        {
            case 1:
                heap(random);
                break;
            case 2:
                radix(random);
                break;
            case 3:
                bubble(random);
                break;
            default:
                System.out.println("Error! Not a valid entry!");
        }
    }
    
    public static int[] randomIntegers(int input)
    {
        int[] userInput = new int[input];       
        for(int i = 0; i < userInput.length; i++) 
        {
            userInput[i] = (int)(Math.random()*10000 + 1);
        }//end for loop
        return userInput;
    }
    
    public static void heap(int[] input)
    {
        System.out.println("Before heap sort: " + Arrays.toString(input));
        long startTime = System.nanoTime();
        heapSort.heapSort(input);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("After heap sort: " + Arrays.toString(input));
        System.out.println("Elapsed Time: " + elapsedTime);
    }
    
    public static void radix(int[] input)
    {
        System.out.println("Before radix sort: " + Arrays.toString(input));
        long startTime = System.nanoTime();
        heapSort.heapSort(input);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("After radix sort: " + Arrays.toString(input));
        System.out.println("Elapsed Time: " + elapsedTime);
    }
    
    public static void bubble(int[] input)
    {
        System.out.println("Before bubble sort: " + Arrays.toString(input));
        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(input);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Before bubble sort: " + Arrays.toString(input));
        System.out.println("Elapsed Time: " + elapsedTime);
    }
}


