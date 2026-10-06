package Day_23;
//WAJP to create amazon customer entity.
//Create code in such way is we print object refrence of customer it should display the details
//of customer instead address


public class AmazonCustomer {
    int cid;
    String cname;
    long pnum;
    String email;

    public AmazonCustomer(int cid , String cname , long pnum ,String email){
        this.cid = cid;
        this.cname = cname;
        this.pnum = pnum;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Customer ID : " + cid +"\n"+ "Customer Name : " + cname +  "Phone Number\n" + pnum + "EmailId\n" + email;
    }

}
