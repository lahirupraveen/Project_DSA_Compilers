package projectdsa;

import java.util.*;
import java.io.*;

public class HouseFile {
    private String filePath="HouseFile.txt";
    
    public void saveToFile(ArrayList<ListHouse> list) throws IOException
    {
        try{ 
            FileOutputStream out=new FileOutputStream(new File(filePath));
            ObjectOutputStream tos=new ObjectOutputStream(out);
            tos.writeObject(list);
            tos.close();
            out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
    public ArrayList<ListHouse>  getFromFile() throws IOException
    {
        ArrayList<ListHouse> list = new ArrayList<ListHouse>();
        
        try{
            FileInputStream in=new FileInputStream(new File(filePath));
            ObjectInputStream tos=new ObjectInputStream(in);
            list = (ArrayList<ListHouse>) tos.readObject();
            tos.close();     
            in.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return list;
    }
    
}
