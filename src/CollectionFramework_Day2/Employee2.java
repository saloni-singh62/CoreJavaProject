package CollectionFramework_Day2;

public class Employee2 {
    public class Employee {
        private int id;
        String name;
        double sal;

        Employee(int id , String name , double sal){
            this.id = id;
            this.name = name;
            this.sal = sal;
        }
        @Override
        public String toString(){
            return "("+id + " id" + name + " name ";
        }
    }

}
