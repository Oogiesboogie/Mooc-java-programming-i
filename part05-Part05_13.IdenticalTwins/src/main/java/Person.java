
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

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comp = (Person) compared;
        if (comp.height == this.height
                && comp.weight == this.weight
                && comp.name.equals(this.name)) {
            if (comp.birthday == this.birthday) {
                return true;
            }

            if (!(comp.birthday instanceof SimpleDate)) {
                return false;
            }
            
            SimpleDate twinBirthday = comp.birthday;
            if (twinBirthday.getYear() == this.birthday.getYear() &&
                    twinBirthday.getMonth() == this.birthday.getMonth() &&
                    twinBirthday.getDay() == this.birthday.getDay()) {
                return true;
            }
        }

        return false;
    }
}
