package projectdsa;

import java.util.*;

public class SortedList extends ListHouse {
    
    public static ArrayList<ListHouse> list=new ArrayList<ListHouse>();
    
    public void addList(ListHouse lh)
    {
        try {
            list.add(lh);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    public void resetArrayList()
    {
        try {
            list.clear();
        }
        catch(Exception e) {
            System.out.println(e); 
        }
    }
    
    public boolean isThere(int no)
    {
        for(int i=0;i<list.size();i++) {
            if(list.get(i).getLotno()==no)
                return true;
        }
        return false;
    }
}
