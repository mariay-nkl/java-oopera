import java.util.Objects;

public class Actor extends Person{
    private final double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }


    @Override
    public String toString() {
        return super.toString() + " (" + height + " м)";
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return this.height == actor.height &&
                Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

}


