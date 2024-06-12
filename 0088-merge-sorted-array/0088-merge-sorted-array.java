 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         
      ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<m;i++){
         list.add(nums1[i]);
       }
      for(int x : nums2){
        list.add(x);
      }
      Collections.sort(list);
      for(int i=0;i<list.size();i++){
        nums1[i]=list.get(i);
      }
 
        }
    }

