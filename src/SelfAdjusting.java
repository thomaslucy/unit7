/**
 * @author Lucy Thomas
 * @since 3/14/20
 * Makes a ArrayList from 2 through 20, searches the list, moves duplicates
 * and numbers that were not in the original list to the front.
 */

import java.util.ArrayList;

public class SelfAdjusting {

    private ArrayList<Integer> list;

    /**
     * Constructor that initializes list
     * @param list
     */
    public SelfAdjusting(ArrayList<Integer> list){
        this.list = list;
    }

    /**
     * Outputs the list
     * @return list
     */
    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * Creates a list from 2 through 20
     * It searches the list for the numbers that have been input
     * If the number is in the list, it removes it and places it at the front
     * If the number is not in the list, it places it at the front
     * At the end it sets arr as list
     */
    public void adjustList(){
        ArrayList<Integer> arr = new ArrayList<>();
        list.remove(list.size()-1);
        for (int i = 2; i <= 20; i += 2){
            arr.add(i);
        }
        boolean check = false;
        int checkList = 0;
        for (int i = 0; i < list.size(); i++) {
            checkList = list.get(i);
            for (int x = 0; x < arr.size(); x++) {
                if (checkList == arr.get(x)) {
                    arr.remove(x);
                    arr.add(0, checkList);
                    check = true;
                }
            }
            if (!check) {
                arr.add(0, checkList);
            }
            check = false;
        }
        list = arr;
    }
}
