/*Design a class Cricketer having data member name and a number of matches and appropriate
member function to set the values. Derived two classes Batsman and Bowler from cricketer
class with data member total number of runs and wickets respectively. Batsman class is having
method to calculate average wicket. Write a program to create two objects and display
information of one batsman and bowler along with average run and wicket.*/
class Crickter
{
    public String name;
    public double matchPlayed;
    public void setValues(String name,double matchPlayed)
	{
        this.name=name;
        this.matchPlayed=matchPlayed;
    }
}
class Batsman extends Crickter
{
    public double totalruns;
    public double avarageRuns(double totalruns)
	{
        this.totalruns=totalruns;
        return this.totalruns/matchPlayed;
    }

}
class Bowler extends Crickter
{
    public double wickets;
    public double avarageWickets(double wickets)
	{
        this.wickets=wickets;
        return this.wickets/matchPlayed;
    }
}
class criket
{
    public static void main(String args[])
	{
        Batsman bm=new Batsman();
        bm.setValues("Sachin Tendulkar",782);
        double avgRuns=bm.avarageRuns(34357);
        System.out.println("Batsman Information\n");
        System.out.println("Batsman Name:"+bm.name);
        System.out.println("Batsman Run:"+bm.totalruns);
        System.out.println("Batsman Match Played:"+bm.matchPlayed);
        System.out.println("Batsman Avg Runs:"+avgRuns);      
        Bowler br=new Bowler();
        br.setValues("Muttiah Muralitharan",583);
        double avgWickets=br.avarageWickets(1347);
        System.out.println("\nBowler Information\n");
        System.out.println("Bpwler Name:"+br.name);
        System.out.println("Bpwler Wicketcs:"+br.wickets);
        System.out.println("Bpwler Match Played:"+br.matchPlayed);
        System.out.println("Bpwler Avg Wickets:"+avgWickets); 
    }
} 

