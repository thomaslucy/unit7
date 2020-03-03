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
            double dec = scan.nextDouble();
        if (dec == 0)
                break;
        list.add(dec); }
        ArrayList<Double> list2 = new ArrayList<Double>();
        list2.add((double)list.size());
        list2.add(list.get(0));
        list2.add(list.get(list.size()-1));
        return list2;
    }

    public static ArrayList<Double> getNumbers(){
        ArrayList<Double> list = new ArrayList<Double>();

        int y = 0;

        while(y < 3) {
            System.out.println("Enter a decimal number: ");
            double x = scan.nextDouble();
            list.add(x);
            y++;
        }
        return list;
    }
    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers){
       double biggest = 0;
       double smallest = 0;
       double middle = 0;
       if(numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)){
           biggest = numbers.get(0);
       numbers.remove(0);}
       else if (numbers.get(1) > numbers.get(0) && numbers.get(1) > numbers.get(2)){
           biggest = numbers.get(1);
           numbers.remove(1);}
        else {
            biggest = numbers.get(2);
           numbers.remove(2);}
        if (numbers.get(0) > numbers.get(1)){
            middle = numbers.get(0);
            smallest = numbers.get(1);
           numbers.remove(0);}
        else{
            middle = numbers.get(1);
            smallest = numbers.get(0);
       }
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(smallest);
        list.add(middle);
        list.add(biggest);

        return list;
       }

    public static void main(String[] args){
            ArrayList<Double> list = getNumbers();
            System.out.println(arrangeList(list));
        }
}

