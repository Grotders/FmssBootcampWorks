package Week02.MatchDraw;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFixtureForFirstWeek();
    }

    public static void createFixtureForFirstWeek() {
        System.out.print("Takım sayısını giriniz(Max 50): ");
        int numberOfClubs = enterNumber();

        // input check
        while (numberOfClubs < 2 || numberOfClubs > 50 || numberOfClubs % 2 == 1) {
            System.out.print("Takım sayısı (2-50) arasında olmalı veya çift olmalı: ");
            numberOfClubs = enterNumber();
        }

        ArrayList<Club> clubList = Database.pickClubs(numberOfClubs);
        ArrayList<MatchedClub> matchedClubs = matchClubs(clubList);
        printMatchedClubs(matchedClubs);
    }


    public static ArrayList<MatchedClub> matchClubs(ArrayList<Club> clubList) {
        ArrayList<MatchedClub> matchedClubs = new ArrayList<>();

        while (!clubList.isEmpty()) {
            int randomNumber = randomNumber(clubList.size()-1);

            Club club2 = clubList.remove(randomNumber);
            Club club1 = clubList.remove(0);

            MatchedClub matched = new MatchedClub(club1, club2);
            matchedClubs.add(matched);
        }
        return matchedClubs;
    }

    public static int randomNumber(int endPoint) {
        Random rand = new Random();
        return rand.nextInt(endPoint) + 1;
    }

    public static int enterNumber() {
        Scanner keyboard = new Scanner(System.in);
        return Integer.parseInt(keyboard.nextLine());
    }

    public static void printMatchedClubs(ArrayList<MatchedClub> matchedClubs) {
        matchedClubs.forEach(System.out::println);
    }
}
