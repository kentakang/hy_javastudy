package test1;

public class Person {
    private String name;
    private int age;

    // 생성자 오버로딩
    public Person() {
        this.name = "unknown";
        this.age = 1;
    }

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public Person(int age) {
        this.name = "unknown";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }
}
