package Interface;

import java.util.Comparator;

public class Employee implements Comparator {

    int id;
    String name;

    public Employee(int id , String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        if (e1.id > e2.id) {
            return 1;
        } else if (e1.id < e2.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

