package src.dsa.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfFlowingStream {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // lower half, max at top
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // upper half, min at top

    // Add a number into the data structure
    public void addNum(int num) {
        if(maxHeap.isEmpty() || maxHeap.peek() >= num) // adding to left heap
             maxHeap.add(num);
        else
            minHeap.add(num); // adding to right heap

        // Balance the sizes so that difference is at most 1
        if(maxHeap.size() > minHeap.size()+1)
            minHeap.add(maxHeap.poll());
        else if(maxHeap.size() < minHeap.size())
            maxHeap.add(minHeap.poll());
    }

    // Find the median of current data stream
    public double findMedian() {
       if(maxHeap.size() == minHeap.size())
           return (maxHeap.peek() + minHeap.peek())/2.0;
       else
           return maxHeap.peek();
    }

    // Main method with test case
    public static void main(String[] args) {
        MedianOfFlowingStream mf = new MedianOfFlowingStream();

        mf.addNum(1);
        System.out.println("Median: " + mf.findMedian()); // 1.0

        mf.addNum(2);
        System.out.println("Median: " + mf.findMedian()); // (1 + 2)/2 = 1.5

        mf.addNum(3);
        System.out.println("Median: " + mf.findMedian()); // 2.0

        mf.addNum(4);
        mf.addNum(5);
        System.out.println("Median after adding 4 and 5: " + mf.findMedian()); // 3.0

        mf.addNum(6);
        System.out.println("Median after adding 6: " + mf.findMedian()); // 3.5
    }
}
