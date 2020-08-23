package example.unchecked;

public class StringIndexOutOfBoundsExample {

    public static void main(String[] args) {
        String name = "Бармаглот";
        System.out.println(name.charAt(10));
    }
}
