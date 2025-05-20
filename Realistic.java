public class Realistic {
    /**
     * Scan the array to find its smallest value
     * @param arr int[] array to explore
     * @return int with the sma;eest value in array arr
     */
    public static int getSmallest(int[] arr) {
        //assume first element is the smallest
        int index_smallest = 0;
        for (int i = 1; i < arr.length; i++) {
            //check if current element at pos [i] is smaller
            if (arr[i] < arr[index_smallest]){
                index_smallest = i;
            }
        }
        return arr[index_smallest];
    } //method getSmallest
}