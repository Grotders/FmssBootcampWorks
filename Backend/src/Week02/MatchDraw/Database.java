package Week02.MatchDraw;

import java.util.ArrayList;

public class Database {
    private static final ArrayList<Club> allClubs = new ArrayList<>();

    static {
        createAllClubsList();
    }

    public static ArrayList<Club> pickClubs(int howManyClubNeeded) {
        ArrayList<Club> clubs= new ArrayList<>();

        for (int i=0; i < howManyClubNeeded; i++) {
            clubs.add(allClubs.get(i));
        }
        return clubs;
    }

    private static void createAllClubsList() {
        allClubs.add(new Club("Liverpool FC"));
        allClubs.add(new Club("Manchester City"));
        allClubs.add(new Club("Real Madrid"));
        allClubs.add(new Club("Bayern München"));
        allClubs.add(new Club("Inter Milan"));
        allClubs.add(new Club("AC Milan"));
        allClubs.add(new Club("Ajax Amsterdam"));
        allClubs.add(new Club("Chelsea FC"));
        allClubs.add(new Club("Paris Saint-Germain"));
        allClubs.add(new Club("SSC Napoli"));
        allClubs.add(new Club("Atletico Madrid"));
        allClubs.add(new Club("Tottenham Hotspur"));
        allClubs.add(new Club("Palmeiras"));
        allClubs.add(new Club("Barcelona"));
        allClubs.add(new Club("Villarreal"));
        allClubs.add(new Club("Flamengo"));
        allClubs.add(new Club("Borussia Dortmund"));
        allClubs.add(new Club("Arsenal"));
        allClubs.add(new Club("Benfica"));
        allClubs.add(new Club("Juventus"));
        allClubs.add(new Club("Sporting"));
        allClubs.add(new Club("RB Leipzig"));
        allClubs.add(new Club("FK Red Star Belgrade"));
        allClubs.add(new Club("Sevilla"));
        allClubs.add(new Club("Roma"));
        allClubs.add(new Club("Bayer Leverkusen"));
        allClubs.add(new Club("Lazio"));
        allClubs.add(new Club("PSV Eindhoven"));
        allClubs.add(new Club("Real Betis"));
        allClubs.add(new Club("Rangers"));
        allClubs.add(new Club("1. FC Union Berlin"));
        allClubs.add(new Club("Red Bull Salzburg"));
        allClubs.add(new Club("Monaco"));
        allClubs.add(new Club("Atalanta"));
        allClubs.add(new Club("Real Sociedad"));
        allClubs.add(new Club("Atlético Mineiro"));
        allClubs.add(new Club("Flora Tallinn"));
        allClubs.add(new Club("Newcastle United"));
        allClubs.add(new Club("Slavia Prague"));
        allClubs.add(new Club("Czech Republic"));
        allClubs.add(new Club("Shakhtar Donetsk"));
        allClubs.add(new Club("Celtic"));
        allClubs.add(new Club("Lyon"));
        allClubs.add(new Club("Olympiakos"));
        allClubs.add(new Club("River Plate"));
        allClubs.add(new Club("Brighton"));
        allClubs.add(new Club("Feyenoord"));
        allClubs.add(new Club("Marseille"));
        allClubs.add(new Club("Athletic Bilbao"));
        allClubs.add(new Club("Freiburg"));
    }
}
















