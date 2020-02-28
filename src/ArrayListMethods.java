import java.lang.reflect.Array;
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
            list.remove(3);
            System.out.println(list);
            return list;
        }

    public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> list = new ArrayList<Double>();
        while (true) {
            System.out.println("Enter a decimal: ");
            double dec = scan.nextDouble();
        if (dec == 0)
                break;

        list.add(dec); }
        return list;
    }

    public static ArrayList<Double> getNumbers(){
            ArrayList<Double> list = new ArrayList<Double>();
            double dec = 0;
            for (int i = 0; i < 3; i++){
                System.out.println("Enter a decimal: ");
               dec = scan.nextDouble();
               list.add(dec);
           }
            return list;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
        ArrayList<Double> list = new ArrayList<Double>();
       double biggest = 0;
       double smallest = 0;
       double middle = 0;
       if(list.get(0) > list.get(1) && list.get(0) > list.get(2)){
           biggest = list.get(0);
       list.remove(0);}
       else if (list.get(1) > list.get(0) && list.get(1) > list.get(2)){
           biggest = list.get(1);
       list.remove(1);}
        else if (list.get(2) > list.get(1) && list.get(2) > list.get(0)){
            biggest = list.get(2);
        list.remove(2);}
        else if (list.get(2) > list.get(0) && list.get(1) > list.get(0)){
            smallest = list.get(0);
        list.remove(0);}
        else if (list.get(0) > list.get(1) && list.get(2) > list.get(1)){
            smallest = list.get(1);
        list.remove(1);}
        else if (list.get(0) > list.get(2) && list.get(1) > list.get(2)){
            smallest = list.get(2);
        list.remove(2);}
        else{
            middle = list.get(0);
       }
        return list;
       }

    public static void main(String[] args){
            numberList();
            System.out.println(firstAndLast());
            ArrayList<Double> list = getNumbers();
            System.out.println(arrangeList(list));
        }
}

