import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {
    private static Scanner scan = new Scanner(System.in);
    public static ArrayList<String> getStates(){
        System.out.println("Enter states you would like to visit: ");
        String x = scan.next();
        
        while(x != "stop") {
            System.out.println("Enter states you would like to visit: ");
            x = scan.next();
        }




    }
}
