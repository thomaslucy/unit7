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
        public static void main(String[] args){

        }
}

