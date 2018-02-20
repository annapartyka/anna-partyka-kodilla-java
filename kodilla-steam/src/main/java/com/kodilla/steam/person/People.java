package com.kodilla.steam.person;

import java.util.ArrayList;
import java.util.List;

public class People {
    //klasa people posiada statyczną metodę getList(), która tworzy przykładową
    //listę imion i nazwisk a następnie tę listę zwraca
    public static List<String> getList(){
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        return new ArrayList<String>(theList);

    }

}
