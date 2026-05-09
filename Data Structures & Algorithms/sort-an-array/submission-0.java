class Solution {
    public int[] sortArray(int[] nums) {

        int n = nums.length;

        for (int i = (n - 2)/2; i >= 0; i--){

            maxHeapify(nums, i, n);
        }

        for (int i= n-1; i>= 1; i--){
            swap (nums, i, 0);
            maxHeapify(nums, 0, i);
        }
        return nums;
        
    }

    private void maxHeapify(int[] arr, int index, int end){
        
        int largest = index;
        int left = left(index);
        int right = right(index);

        if (left < end && arr[left] > arr[largest]){
            largest = left;
        }

        if (right < end && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != index){
            swap(arr, largest, index);
            maxHeapify(arr, largest, end);
        }
    }

    private void swap(int[] arr, int i  , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int left(int index){
        return (2 * index) + 1;

    }

    private int right(int index){
        return (2 * index) + 2;
    }
}