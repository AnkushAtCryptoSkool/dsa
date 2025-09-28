package src.dsa.java_genz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaQuestions {
    public static void main(String[] args) {
        String ans = "abc";
        char ch[] = ans.toCharArray();
        int s = 0,e = ch.length-1;
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        System.out.println(new String(ch));
        // swap numbers
        System.out.println("-----------swap numbers--------");
        int a = 10;
        int b = 15;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a --> " + a + ", b --> " + b );
        System.out.println("----HashMap Iteration ----");
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        map.put(3,6);
        map.put(4,9);

        Iterator<Map.Entry<Integer,Integer>> iterator
                = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,Integer> next = iterator.next();
            System.out.println(next.getKey());
        }
    }
}
