import java.util.ArrayList;

public class ShellSort {

    public void sort(ArrayList<Double> data) {
        int n = data.size();
    
        for (int gap = n / 2; gap > 0; gap /= 2) {// Start with a big gap, then reduce the gap
            
            for (int i = gap; i < n; i++) {   // Perform a gapped insertion sort for this gap size
                Double temp = data.get(i);
                int j;
                
                for (j = i; j >= gap && data.get(j - gap) > temp; j -= gap) {  // Shift earlier gap-sorted elements up until the correct location for data[i] is found
                    data.set(j, data.get(j - gap));
                }
                
                data.set(j, temp); // Put temp in its correct location
            }
        }
    }
}
