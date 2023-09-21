class cricketPlayer
{
    String playerName;
    int score;
    int ballsPlayed;
    int numFours;
    int numSixes;

    public cricketPlayer(String playerName,int score, int ballsPlayed, int numFours, int numSixes)
    {
        this.ballsPlayed=ballsPlayed;
        this.numFours=numFours;
        this.numSixes=numSixes;
        this.score=score;
        this.playerName=playerName;
    }

    public void getPlayerName()
    {
        System.out.printf("Player Name: %s\n",playerName);
    }
    public void getScore()
    {
        System.out.printf("Total Score: %d\n",score);
    }
    public void getBallsPlayed()
    {
        System.out.printf("Balls Played: %d\n",ballsPlayed);
    }
    public void getNumFours()
    {
        System.out.printf("Number of Fours: %d\n",numFours);
    }

    public void getNumSixes()
    {
        System.out.printf("Number of Sixes: %d\n",numSixes);
    }
    private void strikeRate()
    {
        System.out.printf("Strike Rate: %.3f\n",((float)score/(float)ballsPlayed)*100.0);
    }
    private void boundaryPercentage()
    {
        System.out.printf("Boundary Percentage: %.3f\n",(((float)numFours+(float)numSixes)/(float)ballsPlayed)*100.0);
    }
    public void print()
    {
        getPlayerName();
        getScore();
        getBallsPlayed();
        getNumFours();
        getNumSixes();
        strikeRate();
        boundaryPercentage();
    }
}

class Main
{
    public static void main(String[] args)
    {
            cricketPlayer p1=new cricketPlayer("babar azam",78,54,8,3);

            p1.print();
    }
}