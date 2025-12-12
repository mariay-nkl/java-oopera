import java.util.ArrayList;

public class Show {
    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList <Actor> listOfActors = new ArrayList<>();

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
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
        ArrayList<Integer> actorIndexes = new ArrayList<>();

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(surnameToReplace)) {
                actorIndexes.add(i);
            }
        }

        if (actorIndexes.isEmpty()) {
            System.out.println("Актер с фамилией " + surnameToReplace + " не найден!");
            return;
        }

        if (actorIndexes.size() > 1) {
            System.out.println("В спектакле " + actorIndexes.size() + " актера с фамилией '" +
                    surnameToReplace + "'");
            System.out.println("Заменяем первого найденного актера");
        }

        int firstActorIndex = actorIndexes.get(0);
        Actor oldActor = listOfActors.get(firstActorIndex);
        listOfActors.set(firstActorIndex, newActor);

        System.out.println("Актер " + oldActor + " заменен на " + newActor);
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
