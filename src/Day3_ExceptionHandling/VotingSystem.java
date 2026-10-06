package Day3_ExceptionHandling;

public class VotingSystem {
    public void vote(AdharCard ad){
        if(ad.age < 18){
          //Stop
        }
        System.out.println("Voting logic");
        System.out.println("Line 1");
        System.out.println("Line 2");
    }
}
