package com.lbg;
import java.util.*;

public class DataStorage {
    private ArrayList<String> items;

    public DataStorage(){
        this.items = new ArrayList<>();
        this.populateContainer();
    }

    private String populateContainer()
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

    public int getSize(){
        return items.size();
    }

    public int getItemIndex(String item){
        return items.indexOf(item);
    }

}
