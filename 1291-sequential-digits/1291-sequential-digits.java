class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        String s = "123456789";

        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                String sub = s.substring(left, right + 1);
                int num = Integer.parseInt(sub);
                if (num >= low && num <= high) {
                    list.add(num);
                }
                if (num > high) break; 
            }
        }

        Collections.sort(list);
        return list;
    }
}