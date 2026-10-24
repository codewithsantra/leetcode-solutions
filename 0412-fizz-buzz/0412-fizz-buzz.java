class Solution {
    public List<String> fizzBuzz(int n) {

        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int val = i + 1;

            if (val % 3 == 0 && val % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (val % 3 == 0) {
                answer.add("Fizz");
            } else if (val % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(val));
            }
        }

        return answer;
    }
}