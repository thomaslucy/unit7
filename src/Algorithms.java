import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws FileNotFoundException {
        ArrayList<Integer> duplicate = new ArrayList<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        Scanner scan = new Scanner(new File("file1.txt"));
        Scanner scanner = new Scanner(new File("file2.txt"));
        while (scan.hasNext())
            duplicate.add(scan.nextInt());
        while (scanner.hasNext())
            duplicates.add(scanner.nextInt());
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++){
            for (int a = 0; a < 20; a++){
                if (duplicate.get(i)==duplicates.get(a)){
                    list.add(duplicates.get(a));
                }
            }
        }
        return list;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(new File("Names.txt"));
        String names = scan.nextLine();
        int length = 0;
        while(names.indexOf(" ", length) > -1){
            String word = names.substring(length, names.indexOf(" ", length) + 1);
            list.add(word);
            length += word.length();
        }
        for (int i = 0; i < list.size(); i++){
            for (int a = i+1; a< list.size(); a++){
                if (list.get(i).equals(list.get(a))){
                    list.remove(a);
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> orderedList() throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(new File("file1.txt"));
        list.add(scan.nextInt());
        while (scan.hasNext()){
            int val = scan.nextInt();
            for (int i = list.size()-1; i >= 0; i--){
                if (val > list.get(i)){
                    list.add(i + 1,val);
                    break;
                }
                else if (val > list.get(0))
                    list.add(0, val);
            }
        }
        return list;
    }

    public static void main(String[] args) throws FileNotFoundException{
        System.out.println(fileDuplicates());
        System.out.println(fileDuplicatesTwo());
        System.out.println(orderedList());
}
}
