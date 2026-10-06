package Practice;

public class Ques_1 {
        private int eid;
        private String name;
        private double sal;
        private String dept;

    public void setEid(int eid ){
            this.eid = eid;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setSal(double sal) {
            this.sal = sal;
        }
        public void setDept(String dept) {
            this.dept = dept;
        }

        public int getEid(){
           return eid;
        }
        public String getName(){
            return name;
        }
        public double getSal() {
        return sal;
        }
        public String getDept(){
            return dept;
        }

        public static void main(String[] args) {
            Ques_1 q = new Ques_1();
            q.setEid(101);
            q.setName("Shreya");
            q.setSal(20000.0);
            q.setDept("CS");

            System.out.println(q.getEid());
            System.out.println(q.getName());
            System.out.println(q.getSal());
            System.out.println(q.getDept());
    }
}
