class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0 ;
        int n = arr.length;

        int left = 0;
         int sum = 0;

        for(int right = 0; right < n; right++){
            sum += arr[right];

            if(right >= k - 1){
                double avg = (double) (sum/k);
                if(avg >= threshold){
                    count++;
                } 
                sum -= arr[left];
                left++;
            }
        }
        return count;
    }
}