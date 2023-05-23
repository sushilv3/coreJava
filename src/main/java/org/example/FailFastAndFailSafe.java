package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailFastAndFailSafe {
    public FailFastAndFailSafe() {
    }

    public void names() {
        List<String> names = Arrays.asList("ram", "shyam", "dhyan shyam", "ram dulare");
        names.forEach(s -> {
            names.add("new names");
        });
    }

}
