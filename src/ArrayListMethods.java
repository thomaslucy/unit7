import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
    public static Scanner scan = new Scanner(System.in);
        public static ArrayList<Integer> numberList(){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(-5);
            list.add(7);
            list.add(12);
            list.add(-1);
            System.out.println(list);
            list.add(3, 10);
            list.set(1, 9);
            System.out.println(list);
            list.remove(4);
            System.out.println(list);
            return list;
        }

    public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> list = new ArrayList<Double>();
        System.out.println("Enter a decimal: ");
        double dec = scan.nextDouble();
        list.add(dec);
        while (dec != 0) {
            System.out.println("Enter a decimal: ");
            dec = scan.nextDouble();
            list.add(dec);
            if (dec == 0)
                break;
        }
        return list;
    }

    public static ArrayList<Double> getNumbers(){
            ArrayList<Double> list = new ArrayList<Double>();
            double dec = 0;
            for (int i = 0; i >= 3; i++){
               dec = scan.nextDouble();
               list.add(dec);
           }
            for (int i = 0; i < list.size(); i++){

            }
    }

        public static void main(String[] args){

        }
}

