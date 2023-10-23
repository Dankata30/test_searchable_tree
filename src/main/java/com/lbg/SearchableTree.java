package com.lbg;
import java.util.ArrayList;

public class SearchableTree
{
    private ArrayList<String> items = new ArrayList<>();
    public String populateContainer()
    {
        String str= new String("selvyn");
        items.add(str);
        items.add("trains");
        items.add("lecture");
        items.add("graduate");
        items.add("company");
        items.add("taxes");
        return str;
    }
    public int find( String key )
    {
        return items.indexOf(key);
    }
    public boolean  findIfLastItem( String key )
    {
        boolean result = false;
        int length = items.size();
        return length-1 == items.indexOf(key);
    }
    public boolean  findIfFirstItem( String key )
    {
        boolean result = false;
        return 0 == items.indexOf(key);
    }
}
