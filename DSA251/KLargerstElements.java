import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargerstElements {

    public static ArrayList<Integer> kLargest(int input[], int k) {
        ArrayList<Integer> Klargest = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minHeap.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {

            if (input[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(input[i]);
            }
        }
        while (!minHeap.isEmpty()) {
            Klargest.add(minHeap.poll());
        }
        return Klargest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 4, 54, 32, 21, 23, 53, 54 };
        ArrayList<Integer> klargest = kLargest(arr, 3);
        System.out.println(klargest);
        System.out.println(klargest.get(0));
    }
}
