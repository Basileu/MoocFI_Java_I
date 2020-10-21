
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if(!(obj instanceof Person)) {
            return false;
        }
        Person comparePers = (Person) obj;
        if (this.name.equals(comparePers.name) && height == comparePers.height 
                && weight == comparePers.weight && birthday.equals(comparePers.birthday)) {
            return true;
        } else {
            return false;
        }
    }
    // implement an equals method here for checking the equality of objects
}
