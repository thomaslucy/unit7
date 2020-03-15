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

    public static ArrayList<Donor> donorSort(ArrayList<Donor> list){
        ArrayList<Donor> donors = new ArrayList<>();
        for (int next = 0; next < list.size() - 1; next --){
            donors.add(next, new Donor(1.0, "Billy"));
        }
        int next = 0;
        for (int i = 0; i < donors.size(); i++){
            for (int j = 0; j < donors.size(); j++){
                if (donors.get(i).getAmount()>donors.get(j).getAmount())
                    next++;
            }
            donors.set((donors.size()-1)-next, donors.get(i));
        }
        for (Donor a: donors)
            System.out.println(a);
        return donors;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Donor> donors = readFile();
        donorSort(donors);
    }
}
