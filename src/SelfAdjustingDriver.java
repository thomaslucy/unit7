import java.util.ArrayList;

public class SelfAdjustingDriver {
    public static void main(String[] args){
        ArrayList<Integer> test = new ArrayList<>();
        test.add(12);
        test.add(14);
        test.add(8);
        test.add(2);
        test.add(0);
        SelfAdjusting one = new SelfAdjusting(test);
        System.out.println("Input: " + one.getList());
        one.adjustList();
        System.out.println("Output: " + one.getList());
        System.out.println();
        ArrayList<Integer> test2 = new ArrayList<>();
        test2.add(11);
        test2.add(14);
        test2.add(11);
        test2.add(8);
        test2.add(13);
        test2.add(0);
        SelfAdjusting two = new SelfAdjusting(test2);
        System.out.println("Input: " + two.getList());
        two.adjustList();
        System.out.println("Output: " + two.getList());
    }
}
