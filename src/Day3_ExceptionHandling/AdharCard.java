package Day3_ExceptionHandling;

public class AdharCard {
    private long count = 1234567892;
    static final String countryName = "India";
    String name;
    final long adharNumber ;
    int age;
    public AdharCard(String name , int age){
        this.name = name;
        this.age = age;
        adharNumber = ++count;
    }
    public long getAdharNumber(){
        return adharNumber;
    }
}
