package Fundamentals.Data_Structures;

public class Sorting {
    public int[] swap(int[] arg, int pos1, int pos2) {
        int[] newArg = arg;

        return newArg;
    }

    public static int[] bubbleSort(int[] arg) {
        System.out.println(arg[1]);
        return arg;
    }

    public static int[] main(String arg[]) {
        int[] array = { 1, 3, 6, 2, 6, 8 };
        return bubbleSort(array);
    }
}

/*
 * Bubble sorting:
 * Bubble sorting works on the repeatedly swapping of adjacent elements until
 * are not in the intended order. is called bubble sorting because the movemnt
 * of array elements is just like the movement of air bubbles in the water.
 * Bubble in the water rise up to the surface
 * 
 * Worse case time complexity of bubble sort is O(n^2), where n is number of
 * items in the array
 * 
 * Bubble sort is commonly used where
 * complexity doesnt matter
 * simple and short code is perferred
 */

/*
 * Workings of Bubble sorting
 * 
 * The function takes an unsorted array and then
 * will compare the two elements if one is bigger than the other it will swap
 * each other so the nlowest one will move down the array
 * this process will repeat till no swaps are required.
 * 
 * 
 * Time COmplexity:
 * Best case: O(n)
 * Avg Case: O(n^2)
 * Worse Case: O(n^2)
 * 
 * Space Complexity:
 * Stable: O(1)
 */