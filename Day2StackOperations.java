import java.util.*;
public class Day2StackOperations{
    public static void main(String[] args) {
        Stack<Object> s = new Stack <>();
        s.push(3);
        s.push("Hello");
        s.isEmpty();
        s.pop();
        s.peek();
        for(Object i : s){
            System.out.println(i);
        }
    }
} 
//no Null values are allowed in Stack. If we try to add null value, 
// it will throw NullPointerException.
