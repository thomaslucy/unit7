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
        for (int i = 0; i < list.size(); i++){
            int next = i;
            for (int j = i + 1; j < list.size(); j++){
                if (list.get(next).getAmount()<list.get(j).getAmount())
                    next = j;
            }
            Donor temp = list.get(i);
            list.set(i, list.get(next));
            list.set(next, temp);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Donor> donors = readFile();
        donorSort(donors);
        System.out.println(donors);
    }
}
