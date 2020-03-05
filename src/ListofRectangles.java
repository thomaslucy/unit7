import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListofRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        ArrayList<Double> list = new ArrayList<>();
        Scanner scan = new Scanner(new File("Rectangle.txt"));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String linelength = line.substring(0, line.indexOf(" "));
            String linewidth = line.substring((line.indexOf(" ")));
            double length = Double.parseDouble(linelength);
            double width = Double.parseDouble(linewidth);
            list.add(new Rectangle(length, width));
        }

    }
}
