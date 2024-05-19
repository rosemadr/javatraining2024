package datatypes.com.company.fields;

public class Field {
    private String name;

    public Field(String name, int age) {
        setName(name);
        setAge(age);
    }

    private int age = 25;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 65) {
            throw new IllegalArgumentException("Age out of range");
        }
        this.age = age;
    }
}
