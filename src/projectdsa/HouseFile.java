package projectdsa;

import java.util.*;
import java.io.*;

public class HouseFile {
    private String filePath="D:\\HouseFile.txt";
    
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
   
}
