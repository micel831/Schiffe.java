package at.cb.schiffeversenken;


public enum Schiffe {
    boat(0,2),
    carrier(1,3),
    submarine(2,4),
    cruise(3,5),
    destroyer(4,6);


    private final int id;
    private final int länge;

    Schiffe(int id, int länge){
        this.id = id;
        this.länge = länge;
    }

    public int getId() {
        return id;
    }

    public int getLänge() {
        return länge;
    }
}
