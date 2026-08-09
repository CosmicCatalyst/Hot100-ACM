package TOP90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YangHuiSanJiao {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(List.of(1));
        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(generate(n));
    }
}
