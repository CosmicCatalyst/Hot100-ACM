package TOP10;

import jdk.jshell.SourceCodeAnalysis;

import java.util.*;

public class ZiMuYiWeiCi {
    public static List<List<String>> group(String[] str){
        Map<String,List<String>> map=new HashMap<>();
        for(String s:str){
            char[] ca=s.toCharArray();
            Arrays.sort(ca);
            String key=String.valueOf(ca);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String temp=sc.nextLine();
        String[] strings=temp.split(" ");
        System.out.println(group(strings));

    }
}
