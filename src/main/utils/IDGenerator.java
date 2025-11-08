package main.utils;

import java.util.UUID;

public class IDGenerator {
    public static String generateID(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
