import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    private static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> getStates(){
        ArrayList<String> states = new ArrayList<String>();
        boolean stop = false;
        System.out.println("Next state or \"Stop\": ");
        String x = scan.next();

        if (x.equals("Stop"))
            stop = true;
        else
            states.add(x);


        while(!stop) {
            System.out.println("Next state or \"Stop\": ");
            String y = scan.next();
            if (y.equals("Stop"))
                stop = true;
            else
                states.add(y);
        }
        return states;
    }

    public static String createList(ArrayList<String> states){
        String arrow = "";
        for (int i = 0; i < states.size()-1; i++){
            arrow += states.get(i) + " -> ";
        }
        arrow += states.get(states.size()-1);
        return arrow;
    }
    public static ArrayList<Integer> largestAndSmallest() throws IOException{
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(new File("numbers.txt"));
        while (scan.hasNext()) {
            list.add(scan.nextInt());
        }
        int s = list.get(0);
        int b = list.get(0);
        for (int x = 0; x < list.size(); x++)
            System.out.print(list.get(x) + " ");
        for(int x = 0; x < list.size(); x++){
            if(list.get(x) < s)
                s = list.get(x);
            else if(list.get(x) > b)
                b = list.get(x);
        }
        list.remove(list.indexOf(b));
        list.add(b);
        list.remove(list.indexOf(s));
        list.add(0, s);
        for (int x = 0; x < list.size(); x++)
            System.out.print(list.get(x) + " ");
        return list;

    }


    public static void main(String[] args) throws IOException{
        System.out.println(getStates());
        System.out.println(largestAndSmallest());
    }
}
