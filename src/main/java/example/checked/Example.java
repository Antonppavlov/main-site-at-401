package example.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = searchFile("src/test/resources/lesszons4.txt");
    }


    public static Scanner searchFile(String path) throws FileNotFoundException {
        File file = new File(path);
        return new Scanner(file);
    }
}
