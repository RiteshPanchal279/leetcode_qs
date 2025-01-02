import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str="{[()]}";
        boolean ans = isValid(str);
        if(ans){
            System.out.println("String is Valid");
        }else{
            System.out.println("String is Not Valid");
        }
    }
    public static boolean isValid(String s){
//        creating the stack
        Stack<Character> stack = new Stack<>();
//        Iteration of string
        for(char c: s.toCharArray()){
//            Pushing opening bracket in to stack
            if(c=='(' || c=='['||c=='{'){
                stack.push((c));
            }
            else{
//                check if stack is empty
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if((c==')' && top != '(') || (c=='}' && top != '{')|| (c==']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}