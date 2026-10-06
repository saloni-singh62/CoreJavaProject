package July_30;
public class Customer {
        int cid;
        String cname;
        int age;
        long phone;

        public Customer(int cid, String cname, int age , long phone ) {
            this.cid = cid;
            this.cname = cname;
            this.age = age;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Customer ID : " + cid + "\n" + "Customer Name : " + cname + "\n" +
                    "Age :" + age ;
        }
        @Override
    public boolean equals(Object obj){
            Customer c = (Customer)obj;
            return this.cid == c.cid && this.phone ==c.phone;
        }
}
