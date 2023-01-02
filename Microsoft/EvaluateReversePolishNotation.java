class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int b = st.peek();
                st.pop();

                int a = st.peek();
                st.pop();

                int ans = operation(a, b, tokens[i]);

                st.push(ans);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }

        return st.peek();
    }

    public static int operation(int v1, int v2, String op) {
        if (op.equals("+")) return v1 + v2; else if (op.equals("-")) return v1 - v2; else if (op.equals("*")) return v1 * v2; else return v1 / v2;
    }
}