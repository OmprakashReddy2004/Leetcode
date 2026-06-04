class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int wickets = 0;

        for(String event : events){
              if(wickets ==10) break;

              if(event.equals("W")){
                    wickets++;
              }else if(event.equals("WD") || event.equals("NB")){
                    score++;
              }else{
                score += event.charAt(0) - '0';
              }
        }
        return new int[]{score,wickets};
    }
}