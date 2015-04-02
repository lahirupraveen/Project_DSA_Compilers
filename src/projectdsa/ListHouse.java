package projectdsa;

import java.io.*;

public class ListHouse implements Serializable
{
    private String fname;
    private String lname;
    private int lotNo;
    private int sqFeet;
    private int nOB;
    private int price;
    
    // getter setter methods for First name
    public void setFname(String fname)
    {
        this.fname=fname;
    }
    public String getFname()
    {
        return fname;
    }
    
    // getter setter methods for Last name
    public void setLname(String lname)
    {
        this.lname=lname;
    }
    public String getLname()
    {
        return lname;
    }
    
    // getter setter methods for Price
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
    }
    
    // getter setter methods for Lot Number
    public void setLotno(int lotNo)
    {
        this.lotNo=lotNo;
    }
    public int getLotno()
    {
        return lotNo;
    }
    
    // getter setter methods for Square Feet
    public void setSqfeet(int sqFeet)
    {
        this.sqFeet=sqFeet;
    }
    public int getSqfeet()
    {
        return sqFeet;
    }
    
    // getter setter methods for Number of bedrooms
    public void setNob(int nOB)
    {
        this.nOB=nOB;
    }
    public int getNob()
    {
        return nOB;
    }
      
}
