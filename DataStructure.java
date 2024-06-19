public class DataStructure {
    public static int binarySearch(int[] myArray, int a) {
        int low = 0;
        int high = myArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (myArray[mid] == a) {
                return mid;
            } else if (myArray[mid] < a) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Element not found
    }
    public static void copy(int[] myArray, int[] myNewArray) {
        myArray = new int[7];
        myNewArray = new int[6];
        for(int i=0;i<myArray.length;i++){
            myNewArray[i] = myArray[i];
        }
    }

    public static void main(String[] args) {
        int[] myArray = {0, 10, 23, 33, 45, 52, 51};
        int[] myNewArray = new int[6];
        int a = 33;
        int result = binarySearch(myArray, a);
        System.out.println("Index of " + a + ": " + result);
    }
}
