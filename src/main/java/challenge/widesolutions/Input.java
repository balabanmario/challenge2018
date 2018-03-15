package challenge.widesolutions;

import challenge.widesolutions.ds.*;
import challenge.widesolutions.ds.graph.Graph;
import challenge.widesolutions.ds.graph.Link;
import challenge.widesolutions.ds.graph.Node;

import java.util.ArrayList;
import java.util.List;

public class Input {
    public final List<String> lines;

    public Input(List<String> lines) {
        //parse each line and create Input
        this.lines = lines;



    }


    private static String[] split(String line) {
        String[] strings = line.trim().split(" ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();

        }
        return strings;
    }

    private static int toInt(String value) {
        return Integer.parseInt(value);
    }


}
