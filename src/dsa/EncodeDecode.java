package src.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("abc","def");
        encodeStr(s);
        decodeStr(encodeStr(s));
    }

    private static String encodeStr(List<String> s) {
      StringBuilder sb = new StringBuilder();
      for (String str : s){
          sb.append(str.length()).append("#").append(str);
      }
        System.out.println(sb);
      return sb.toString();
    }
    private static void decodeStr(String s) {
      int i = 0;
      List<String> str = new ArrayList<>();
      while(i<s.length()){
          int hashIdx = s.indexOf("#",i);
          int length = Integer.valueOf(s.substring(i,hashIdx));
          i = hashIdx+1;
          String temp = s.substring(i,i+length);
          str.add(temp);
          i = i+length;
      }
        System.out.println(str);
    }
}
