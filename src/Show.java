import java.util.ArrayList;
import java.util.List;

public class Show {
    private final String title;
    private final double duration;
    private final Director director;
    private final List <Actor> listOfActors;

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
        director.incrementNumberOfShows();
    }

    public String getTitle() {
        return title;
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актер " + actor  + " уже участвует в спектакле!");
            return;
        }
        listOfActors.add(actor);

    }

    public void  replaceActor(Actor newActor, String surnameToReplace) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер с фамилией " + surnameToReplace + " не найден!");

    }

    public void printActorsList() {
        System.out.println("Список актеров в спектакле " + title + ":");
        if (listOfActors.isEmpty()) {
            System.out.println("(нет актеров)");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(" - " + actor);
            }
        }
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    @Override
    public String toString() {
        return "Спектакль: " + title + " (" + duration + " минут)";
    }
}
