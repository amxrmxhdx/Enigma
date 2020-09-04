package net.pixlies.enigma.holyc;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.pixlies.enigma.Computer;
import org.apache.commons.lang.StringUtils;

public class Compiler {

    public static CompilerAnswer process(String line, Computer computer) {
        if (!line.endsWith(";")) return new CompilerAnswer(true, "No semicolon at the end of method.");
        for (Methods method : Methods.values()) {
            if (line.startsWith(method.getTrigger())) {
                String[] params = StringUtils.substringBetween("(\"", "\")").split(",");
                method.getBody().accept(params, computer);
                break;
            }
        }
        return new CompilerAnswer(false, "Compiler finished.");
    }

    @Data
    @AllArgsConstructor
    public static class CompilerAnswer {

        private boolean failed;
        private String answer;

    }

}
