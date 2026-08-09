package TOP60;

import java.util.*;

public class KeChengBiao {
    public static boolean canFinish(int numCourses, int[][] prerequisites){
        int [] intDegree=new int[numCourses];
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] per:prerequisites){
            int course=per[0];
            int perCouse=per[1];
            intDegree[course]++;
            adjList.get(perCouse).add(course);
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(intDegree[i]==0){
                queue.add(i);
            }
        }
        int count=0;
        while(!queue.isEmpty()){
            int select=queue.poll();
            count++;
            List<Integer> nextCourse=adjList.get(select);
            for(int next:nextCourse){
                intDegree[next]--;
                if(intDegree[next]==0){
                    queue.add(next);
                }
            }
        }
        return count==numCourses;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int hang=sc.nextInt();
        int lei=sc.nextInt();
        int[][] per=new int[hang][lei];
        for(int i=0;i<hang;i++){
            for(int j=0;j<lei;j++){
                per[i][j]= sc.nextInt();
            }
        }
        System.out.println(canFinish(num,per));
    }
}
