import java.util.PriorityQueue;
import java.util.Collections;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(15);
        maxHeap.add(20);
        maxHeap.add(25);

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
