public class Anime {
    
    //Instance Variables
    private String name;
    private boolean eligible;
    private double score;

    //Anime Constructor
    public Anime(String name, boolean eligible) {

        this.name = name;
        this.eligible = eligible;
        score = 0;

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the eligibilty
     */
    public boolean getEligible() {
        return eligible;
    }

    /**
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * @param points
     * increase the score by 
     * specified number 
     */
    public void increaseScore(int points) {
        score += points;
    }

    /**
     * @return anime name
     */
    @Override
    public String toString() {
        return name;
    }

}