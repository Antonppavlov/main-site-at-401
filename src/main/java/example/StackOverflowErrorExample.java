package example;

public class StackOverflowErrorExample {
    static int count = 0;

    public static void main(String[] args) {
        example();
    }

    public static int example() {
        System.out.println(count++);
        return example();
    }
}

