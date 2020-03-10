import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws FileNotFoundException {
        ArrayList<Integer> unsorted = new ArrayList<>();
        Scanner scan = new Scanner(new File("sortedData1.txt"));
        while (scan.hasNext()) {
            unsorted.add(scan.nextInt());
        }
        return unsorted;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {
        boolean answer = false;
        int x = 0;
        for (int i = arr.size() - 1; i > 0; i--) {
            if (arr.get(i) > arr.size() - 2)
                x++;
            x--;
        }
        if (x == 7)
            answer = true;
        return answer;
    }
}

