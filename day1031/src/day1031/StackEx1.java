package day1031;

import java.util.Stack;

public class StackEx1 {
	public static void main(String[] args) {
		
		// 검사식의 괄호가 정확한지 확인하기
		
        String expression = "((5+6)*(3-2))";

        Stack<Character> stack = new Stack<>();

        boolean isVal = true; 

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                // 여는 괄호면 스택에 push
                stack.push(ch);
            } else if (ch == ')') {
                // 닫는 괄호면 스택에서 하나 꺼냄
                if (stack.isEmpty()) {
                    // 닫는 괄호가 더 많으면 오류
                    isVal = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            isVal = false;
        }

        // 결과 출력
        if (isVal) {
            System.out.println("✅ 괄호가 올바릅니다: " + expression);
        } else {
            System.out.println("❌ 괄호 오류! : " + expression);
        }
    }
}