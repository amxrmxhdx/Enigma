package net.pixlies.enigma.holyc;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.pixlies.enigma.Computer;

import java.io.PrintStream;
import java.util.List;
import java.util.function.BiConsumer;

@Getter
@AllArgsConstructor
public enum Methods {

    PRINTLINE("printLine", (params, computer) -> computer.printLine(params[0])),
    ;

    private final String trigger;
    private final BiConsumer<String[], Computer> body;

}
