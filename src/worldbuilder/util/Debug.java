package worldbuilder.util;

import java.util.ArrayList;

public class Debug {
    private static final ArrayList<String> errors = new ArrayList<>();

    public static void logError(String errorCode) {
        errors.add(errorCode);
    }

    public static ArrayList<String> getErrors() {
        return errors;
    }
}
