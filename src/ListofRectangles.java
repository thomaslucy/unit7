import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListofRectangles {
    public static ArrayList<Rectangle> getRectangles() throws FileNotFoundException {
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        Scanner scan = new Scanner(new File("Rectangle.txt"));
        while (scan.hasNext()) {
            String line = scan.nextLine();
            String linelength = line.substring(0, line.indexOf(" "));
            String linewidth = line.substring((line.indexOf(" ")));
            double length = Double.parseDouble(linelength);
            double width = Double.parseDouble(linewidth);
            list.add(new Rectangle(length, width));
        }
        return list;
    }
    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double num = 0.0;
        for (int i = 0; i < rectangles.size(); i++)
            num += rectangles.get(i).getArea();
        double average = num/rectangles.size();
        average = average*100;
        average = (int)(average);
        average = average/100;
        return average;
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("The average area would be " + findAverage(getRectangles()));
    }
}
