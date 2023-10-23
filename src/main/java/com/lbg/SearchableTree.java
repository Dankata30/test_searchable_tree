package com.lbg;
import java.util.ArrayList;

public class SearchableTree
{
    private DataStorage items;

    public SearchableTree(DataStorage ds){
        items = ds;
    }

    public int find( String key )
    {
        return items.getItemIndex(key);
    }
    public boolean  findIfLastItem( String key )
    {
        boolean result = false;
        int length = items.getSize();
        return length-1 == items.getItemIndex(key);
    }
    public boolean  findIfFirstItem( String key )
    {
        boolean result = false;
        return 0 == items.getItemIndex(key);
    }
}
