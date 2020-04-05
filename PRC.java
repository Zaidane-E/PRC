import java.util.ArrayList;

public class PRC {

    public static void main(String[] args) {
        Anime anime = new Anime("Kimetsu no Yaiba", true);
        Anime anime1 = new Anime("Boku no Hero Academia", true);
        Vote vote = new Vote(anime, 1);
        Vote vote1 = new Vote(anime, 2);
        ArrayList<Vote> votes = new ArrayList<Vote>();
        votes.add(vote);
        Participant jirmt = new Participant("Jirmt", votes);
        ArrayList<Participant> participants = new ArrayList<Participant>();
        participants.add(jirmt);
        ArrayList<Anime> animeList = new ArrayList<Anime>();
        animeList.add(anime);
        Togashi togashi = new Togashi("Fall", 2019, 4, animeList, participants);
        togashi.printHeader();
        togashi.calculateScore();
        togashi.printAnime();
    }

}