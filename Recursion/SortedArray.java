//The problem here is to check if the array is sorted or not. This can be easily done using a loop but here we are using recursive function.

//The time and space complexity of this solution is O(n) each, which is not better than the iteration approach which takes only the time complexity to be O(n), SC = O(1).
public class SortedArray {
    public static boolean checkSorted (int arr[], int n){
        if (n == arr.length - 1) {
            return true;
        }
        if (arr[n] > arr [n+1]) {
            return false;
        }
        
        return checkSorted(arr, n+1);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int numss[] = {1,2,2,3,1};

        System.out.println(checkSorted(nums, 0));
        System.out.println(checkSorted(numss, 0));
    }
}
