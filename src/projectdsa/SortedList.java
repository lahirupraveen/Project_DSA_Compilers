package projectdsa;

import java.util.*;

public class SortedList extends ListHouse {

    public static ArrayList<ListHouse> list = new ArrayList<ListHouse>();
    HouseFile hf = new HouseFile();

    public void copyList() {
        try {
            list = hf.getFromFile();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void addList(ListHouse lh) {
        try {
            list.add(lh);
            //sort before save in file
            sort();
            hf.saveToFile(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void resetArrayList() {
        try {
            list.clear();
            hf.saveToFile(list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean isThere(int no) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLotno() == no) {
                return true;
            }
        }
        return false;
    }

    //function to sort arraylist using bubble sort
    public void sort() {

        //to print the unsorted array
        System.out.println("UnSorted---------------------");
        for (int c = 0; c < list.size(); c++) {
            System.out.println(list.get(c).getLotno());
        }
        System.out.println("---------------------------");
        //end of print

        //begin of sort
        for (int i = list.size() - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (list.get(j).getLotno() > list.get(j + 1).getLotno()) {
                    ListHouse listTemp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, listTemp);
                }
            }
        }
        //end of sort

        //to print the sorted array
        System.out.println("Sorted---------------------");
        for (int c = 0; c < list.size(); c++) {
            System.out.println(list.get(c).getLotno());
        }
        System.out.println("---------------------------");
        //end of priint
    }
}
