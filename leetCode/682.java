class Solution {
  public int calPoints(String[] operations) {

    Stack<Integer> stack = new Stack<>();

    for (String s : operations) {

      if (s.equals("+")) {
        int top = stack.pop();
        int result = top + stack.peek();
        stack.push(top);
        stack.push(result);
      } else if (s.equals("D")) {
        int result = 2 * stack.peek();
        stack.push(result);
      } else if (s.equals("C")) {
        stack.pop();
      } else {
        stack.push(Integer.valueOf(s));
      }

    }
    int total = 0;

    while (!stack.isEmpty()) {
      total += stack.pop();
    }
    return total;

  }
}