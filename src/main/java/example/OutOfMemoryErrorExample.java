package example;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorExample {
    static final List<Object[]> arrays = new ArrayList<>();

    public static void main(String[] args) {
        while (true){
            arrays.add(new Object[10000000]);
        }
    }
}

