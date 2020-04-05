public class Vote {

    //Instance Variables
    private Anime vote;
    private String comment;
    private int rank;

    //Vote Constructor
    public Vote(Anime vote, int rank) {

        this.vote = vote;
        comment = null;
        this.rank = rank;

    }

    public Vote(Anime vote, String comment, int rank) {

        this.vote = vote;
        this.comment = comment;
        this.rank = rank;

    }

    //Getter Methods
    /**
     * @return the vote
     */
    public Anime getVote() {
        return vote;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    //Setter Methods
    /**
     * @param vote the vote to set
     */
    public void setVote(Anime vote) {
        this.vote = vote;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

}