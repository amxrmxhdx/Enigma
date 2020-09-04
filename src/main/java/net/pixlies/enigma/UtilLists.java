package net.pixlies.enigma;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class UtilLists {

    private final Map<UUID, Computer> openComputers;

    public UtilLists() {
        openComputers = new HashMap<>();
    }

}
