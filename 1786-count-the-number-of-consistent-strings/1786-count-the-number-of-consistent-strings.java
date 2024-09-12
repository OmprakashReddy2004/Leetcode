class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count =0;
      for (String str : words) {
          boolean valid = true;
          for(int i=0;i<str.length();i++){
              char ch = str.charAt(i);
              if (!allowed.contains(ch + "")){
                  valid = false;
              }
          }
          if(valid){
              count++;
          }
      }
      return count;
    }
}