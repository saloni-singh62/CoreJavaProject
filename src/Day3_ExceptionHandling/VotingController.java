package Day3_ExceptionHandling;

public class VotingController {
    public static void main(String[] args) {
        AdharCard p1 = new AdharCard("Shreya" ,24);
        AdharCard p2 = new AdharCard("Shikha" , 17);
        VotingSystem system = new VotingSystem();
        System.out.println(p1.name + "wants to votevhaving adhar number" + p1.getAdharNumber());

    }
}
