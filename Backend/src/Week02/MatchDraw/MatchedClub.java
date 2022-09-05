package Week02.MatchDraw;

public class MatchedClub {
    private final Club club1;
    private final Club club2;

    public MatchedClub(Club club1, Club club2) {
        this.club1 = club1;
        this.club2 = club2;
    }

    @Override
    public String toString() {
        return String.format("\t%20s --> %-20s",club1, club2);
    }
}
