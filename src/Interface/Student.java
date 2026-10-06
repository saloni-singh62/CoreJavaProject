package Interface;
import java.lang.*;
public class Student implements Comparable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Object o){
       Student s = (Student)o;
		if(this.id >s.id)
            {
                return 1;
            }else if
                (this.id<s.id)
            {
                return -1;
            }
		else
            {
                return 0;
            }
        // return this.name.compareTo(s.name);
    }
}