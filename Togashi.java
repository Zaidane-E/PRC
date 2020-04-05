import java.util.ArrayList;

public class Togashi extends PRCClass {

    //Instance Variables
    private static Classes prcClass = Classes.Togashi;
    private final int[] pointSystem = {16, 11, 7, 4, 2};

    // Togashi Constructor
    public Togashi(String season, int year, int part, ArrayList<Anime> animeList, ArrayList<Participant> participants) {

        super(season, year, prcClass, part, animeList, participants);
        
    }

    /**
     * Calculate the score for
     * each anime
     */
    public void calculateScore() {
        for ( Participant participant: getParticipants() ) {
            for ( Vote vote: participant.getVotes() ) {
                vote.getVote().increaseScore(pointSystem[vote.getRank() - 1]);
            }
        }
        sortAnime();
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        Togashi newClass = new Togashi("Winter", 2020, 3, null, null);
        newClass.printHeader();
        System.out.println();
        System.out.println(newClass.getBody());
    }

}