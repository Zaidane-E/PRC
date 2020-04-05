import java.util.ArrayList;

public class Participant {

    //Instance Variables
    private String name;
    private int strikes;
    private ArrayList<Vote> votes;

    //Constructor
    public Participant(String name, ArrayList<Vote> votes) {

        this.name = name;
        strikes = 0;
        ArrayList<Vote> temp = votes;
        for ( Vote vote: votes ) {
            temp.remove(vote);
        }
        this.votes = votes;

    }

    //Getters
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the strikes
     */
    public int getStrikes() {
        return strikes;
    }

    /**
     * @return the votes
     */
    public ArrayList<Vote> getVotes() {
        return votes;
    }

    //Setters

    /**
     * @param strikes the strikes to set
     */
    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    /**
     * Add strike and return
     * number of strikes
     * @return strikes
     */
    public int addStrike(){
        return ++strikes;
    }

    /**
     * Sort participant's votes 
     * by rank and
     * @return sorted votes
     */
    public void sortVotes(){
        ArrayList<Vote> temp = new ArrayList<Vote>();
        for ( int i = 0 ; i < votes.size() ; i++ ) {
            temp.add(votes.get(i).getRank(), votes.get(i));
        }
        votes = temp;
    }

}