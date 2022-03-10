/*
Team Three Kevins: Kevin Xiao, Kevin Li, Hamim Seam (honorary Kevin)
APCS
HW73 -- Quick Sort
2022-03-09
time spent: 1 hour

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr):
 * Partitions the array into two parts, we know the pivot point is in the right place. Now we have two unsorted regions and we're going to split both
 regions into two parts again, recursively calling this down. The base case is when there is only one element in the region, and thus we will know that
 region is sorted. 
 * 2a. Worst pivot choice and associated run time:
 * Picking the first element could possibly be the worst case scenario is the data is inversely sorted, as it will have a n^2 time complexity.
 * 2b. Best pivot choice and associated run time:
 * Picking the middle element would result in the best average amount of time, and if the data is already sorted time complexity would just be O(n)
 * 3. Approach to handling duplicate values in array:
 * We can simply ignore duplicate values by using an <= or >= sign and we can treat them as just another number within the array that needs to be sorted.
 
 **/

*/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------

   public static void partition( int arr[], int loPos, int hiPos)
  {
    int pvtPos = (loPos + hiPos) / 2;
    int v = arr[pvtPos];

    swap( pvtPos, hiPos, arr);
    int s = loPos;

    for( int i = loPos; i < hiPos; i++ ) {
      if ( arr[i] <= v) {
        swap( i, s, arr );
        s++;}
    }
    swap(s,hiPos,arr);
  }

  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    qsortHelper(d, 0, d.length-1);

  }
  
  public static void qsortHelper(int [] d, int loPos, int hiPos){
    int pvtPos = (loPos + hiPos) / 2;
    //base case
    if (hiPos == loPos + 1){
      return;
    } else {
      partition(d, loPos, hiPos);
      qsortHelper(d, loPos, pvtPos);
      qsortHelper(d, pvtPos, hiPos);
    }
  }

  //you may need a helper method...


  


  //main method for testing
  public static void main( String[] args )
  {
    
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
    System.out.println("\narrN init'd to: " );
    printArr(arrN);
    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);
    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);




    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);
    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);
    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);
    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);
    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);

  }//end main

}//end class QuickSort
