import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static int numberNeeded(String first, String second) {
        HashMap<Character, Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<first.length();i++){
            if(!hm.containsKey(first.charAt(i))){
                hm.put(first.charAt(i), 1);
            }else{
                hm.put(first.charAt(i),hm.get(first.charAt(i))+1);
            }
        }
        for(int i=0;i<second.length();i++){
            if(!hm.containsKey(second.charAt(i))){
                count++;
            }else{
                hm.put(second.charAt(i),hm.get(second.charAt(i))-1);
            }
        }
        for(char c: hm.keySet()){
            if(hm.get(c)!=0){
                count+=Math.abs(hm.get(c));
            }
        }
        return count;
    }
    
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

