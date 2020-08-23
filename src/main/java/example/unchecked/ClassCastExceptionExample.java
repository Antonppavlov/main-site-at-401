package example.unchecked;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        Object integer = 1;
        System.out.println((String) integer);
    }
}
