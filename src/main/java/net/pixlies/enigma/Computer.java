package net.pixlies.enigma;

import lombok.Data;

import java.util.List;

@Data
public class Computer {

    //TODO
    private List<String> output;

    public void printLine(String s) {
        output.add(s);
    }

}
