import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {
    public static ArrayList<Donor> readFile() throws FileNotFoundException {
        ArrayList<Donor> donors = new ArrayList<>();
        Scanner scan = new Scanner(new File("donors.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            String name = line.substring(0, line.indexOf(" "));
            String lin = line.substring(line.indexOf(" "));
            double amount = Double.parseDouble(lin);
            donors.add(new Donor(amount, name));
        }
        return donors;
    }

    public static void donorSort(ArrayList<Donor> list){
        for (int next = 0; next < list.size() - 1; next --){}
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(readFile());
    }
}
