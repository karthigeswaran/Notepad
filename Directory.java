package Notepad;

import java.util.ArrayList;

public class Directory<T> {
    private ArrayList<T> arrl; 
    private String name;

    public Directory(String name){
        arrl = new ArrayList<T>(); 
        this.name = name;
    }

    void add(Object j){
        arrl.add((T)j);
    }

    void remove(String name){
        arrl.remove()
    }

    
    
}