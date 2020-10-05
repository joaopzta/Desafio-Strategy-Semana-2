import abstracts.Races;

public class Context {

    private Races race;

    public Context(Races race) {
        this.race = race;
    }

    public void getRaceInformation() {
        this.race.display();
    }

}
