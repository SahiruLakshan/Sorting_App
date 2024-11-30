import java.util.ArrayList;

public class HeapSort {

    public void sort(ArrayList<Double> data) {
        int n = data.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(data, n, i);
        }

        for (int i = n - 1; i > 0; i--) {        // Extract elements from heap one by one
            Double temp = data.get(0);              // Move current root to end
            data.set(0, data.get(i));
            data.set(i, temp);

            heapify(data, i, 0); // Call max heapify on the reduced heap
        }
    }

    // To heapify a subtree rooted at node i, which is an index in data[], n is the size of the heap
    private void heapify(ArrayList<Double> data, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        if (left < n && data.get(left) > data.get(largest)) {  // If left child is larger than root
            largest = left;
        }

        if (right < n && data.get(right) > data.get(largest)) {   // If right child is larger than largest so far
            largest = right;
        }

        if (largest != i) {          // If largest is not root
            Double swap = data.get(i);
            data.set(i, data.get(largest));
            data.set(largest, swap);

            heapify(data, n, largest);  // Recursively heapify the affected subtree
        }
    }
}
