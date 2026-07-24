import java.util.*;

class priorityqueue{
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println("NUMBERS ARE: ");
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);
        pq.add(25);
    System.out.println(pq);
    System.out.println("Remove element "+ pq.poll());
    System.out.println("peek: " + pq.peek());
  }
}