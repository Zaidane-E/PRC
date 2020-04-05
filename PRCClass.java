import java.util.ArrayList;

public class PRCClass {

    //Instance Variables
    private String season;
    private int year;
    private Classes prcClass;
    private int numberOfAnime;
    private int part;
    private String body;
    private ArrayList<Anime> animeList;
    private ArrayList<Participant> participants;

    //PrcClass Constructor
    public PRCClass(String season, int year, Classes prcClass, int part, ArrayList<Anime> animeList, ArrayList<Participant> participants) {
    
        body = "Greetings AG members, and welcome to this season's Anime Guild Power Rankings, where we take a group of people and have them decide on their favorite airing animes! The group will come together and discuss the current season’s anime and rank them, with 1 being their favorite, in three week intervals, throughout the current season. This is not what the guild feels as a whole, but rather this group of watchers.";
        this.season = season;
        this.year = year;
        this.prcClass = prcClass;
        this.part = part;
        this.animeList = animeList;
        this.participants = participants;
        if ( prcClass == Classes.Togashi ) {
            numberOfAnime = 5;
        } else if ( prcClass == Classes.Oda ) {
            numberOfAnime = 13; 
        } else if ( prcClass == Classes.Toriyama ) {
            numberOfAnime = 25;
        } else if ( prcClass == Classes.Character ) {
            numberOfAnime = 15;
        }

    }

    public PRCClass(String season, int year, Classes prcClass, int part) {
    
        body = "Greetings AG members, and welcome to this season's Anime Guild Power Rankings, where we take a group of people and have them decide on their favorite airing animes! The group will come together and discuss the current season’s anime and rank them, with 1 being their favorite, in three week intervals, throughout the current season. This is not what the guild feels as a whole, but rather this group of watchers.";
        this.season = season;
        this.year = year;
        this.prcClass = prcClass;
        this.part = part;
        animeList = null;
        if ( prcClass == Classes.Togashi ) {
            numberOfAnime = 5;
        } else if ( prcClass == Classes.Oda ) {
            numberOfAnime = 13; 
        } else if ( prcClass == Classes.Toriyama ) {
            numberOfAnime = 25;
        } else if ( prcClass == Classes.Character ) {
            numberOfAnime = 15;
        }

    }

    //Geter Methods
    /**
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @return the prcClass
     */
    public Classes getPrcClass() {
        return prcClass;
    }

    /**
     * @return the numberOfAnime
     */
    public int getNumberOfAnime() {
        return numberOfAnime;
    }

    /**
     * @return the part
     */
    public int getPart() {
        return part;
    }

    /**
     * @return the animeList
     */
    public ArrayList<Anime> getAnimeList() {
        return animeList;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @return the participants
     */
    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    //Setter Methods

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @param animeList the animeList to set
     */
    public void setAnimeList(ArrayList<Anime> animeList) {
        this.animeList = animeList;
    }

    /**
     * Print Class Header
     */
    public void printHeader() {
        System.out.println("Anime Guild's " + season + " " + prcClass + "\n" + "Power Ranking Committee Part " + part + " of " + "4");
    }

    /**
     * Clear ineligible anime
     * from animeList
     */
    public void clearIneligible() {
        for ( Anime anime: animeList ) {
            if ( !anime.getEligible() ) {
                animeList.remove(anime);
            }
        }
    }

    /**
     * Sort all anime in
     * animeList by score
     */
    public void sortAnime() {
        Anime temp;
        for ( int i = 0 ; i < animeList.size() - 1 ; i++ ) {
            for ( int j = 1 ; j < animeList.size() ; j ++ ) {
                if ( animeList.get(i).getScore() < animeList.get(j).getScore() ) {
                    temp = animeList.get(j);
                    animeList.set(j, animeList.get(i));
                    animeList.set(i, temp);
                }
            }
        }
    }

    public void printAnime() {
        for ( Anime anime: animeList ) {
            System.out.println(anime + " : " + anime.getScore());
        }
    }


}