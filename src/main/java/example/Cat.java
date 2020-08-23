package example;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name=name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public boolean checkName(String nameCat){
        boolean equals = name.equals(nameCat);

        return equals;
    }
}
