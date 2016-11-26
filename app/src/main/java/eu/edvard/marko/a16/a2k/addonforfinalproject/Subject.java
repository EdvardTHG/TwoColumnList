package eu.edvard.marko.a16.a2k.addonforfinalproject;

import java.util.HashMap;

/**
 * Created by user on 26.11.2016.
 */

public class Subject extends HashMap<String, String> {

    public static final String NAME = "name";
    public static final String AVG_MARK = "avgMark";

    public Subject(String name, String avgMark){
        super();
        super.put(NAME, name);
        super.put(AVG_MARK, avgMark);
    }
}

