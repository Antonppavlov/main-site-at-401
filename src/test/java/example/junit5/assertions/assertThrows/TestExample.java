package example.junit5.assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestExample {

    @Test
    void myFirstTest() throws FileNotFoundException {
        File file = new File("src/test/resources/lessons41.txt");

        Assertions.assertThrows(FileNotFoundException.class, () ->new Scanner(file));
    }

}

