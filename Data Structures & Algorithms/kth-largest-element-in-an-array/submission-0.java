class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int n = nums.length;

        buildHeap(nums, n);

        for (int i = n - 1; i>=0; i--){
            if (k == 1){
                return nums[0];
            }
            swap (nums, 0, i);
            Heapify(nums, 0, i);
            k--;
        }
        return -1;
    }

    private void buildHeap(int[] arr, int len){
        for (int i = (len - 2) / 2; i>=0; i--){
            Heapify(arr, i,len);
        }
    }

    private void Heapify(int[] arr, int start, int end){

        int largest = start;
        int left = left(start);
        int right = right(start);

        if (left < end && arr[left] > arr[largest]){
            largest = left;
        }

         if (right < end && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != start){
            swap(arr, largest, start);

            Heapify(arr, largest, end);
        }

    }

    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    private int left(int index){
        return (2 * index) + 1;
    }

    private int right(int index){
        return (2 * index) + 2;
    }

}
