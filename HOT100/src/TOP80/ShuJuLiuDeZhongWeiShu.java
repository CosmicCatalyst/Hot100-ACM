package TOP80;

import java.util.PriorityQueue;

public class ShuJuLiuDeZhongWeiShu {
    public static PriorityQueue<Integer> left=new PriorityQueue<>((a,b)->b-a);
    public static PriorityQueue<Integer> right=new PriorityQueue<>();
   static class MedianFinder{
        public MedianFinder(){

        }
        public void addNum(int num){
            if(left.size()==right.size()){
                right.offer(num);
                left.offer(right.poll());
            }else{
                left.offer(num);
                right.offer(left.poll());
            }
        }
        public double findMedian(){
            if(left.size()>right.size()){
                return left.peek();
            }
            return (left.peek()+right.peek())/2.0;
        }
    }
    public static void main(String[] args){
       MedianFinder medianFinder=new MedianFinder();
       medianFinder.addNum(1);
       medianFinder.addNum(2);
       System.out.println(medianFinder.findMedian());
       medianFinder.addNum(3);
       System.out.println(medianFinder.findMedian());
    }
}
