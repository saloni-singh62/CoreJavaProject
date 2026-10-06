package Interface;

public class About_Interface {
        public static void main(String[] args) {
            // comparasion
            int i = 10;
            int j = 20;
            // Primitive
            // == , !=
            // > < >= <=

            System.out.println(i > j);
            System.out.println(i < j);

            // Non primitive
            // != , ==
            // they compare addresses/ reference

          Employee s1 = new Employee(101 , "t");
            Employee s2 = new Employee(123 , "r");
		/*
		System.out.println(s1 > s2);
		System.out.println(s1 < s2);
		*/
            // Java Provides two predefined interfaces
            // to compare objects

            // 1 Comparable -> java.lang
            //  public  int compareTo(Object o)

            // 2 Comparator --> java.util
            // public  int compare(Object o1 , Object o2)

           // System.out.println(s1.compareTo(s2));
            String x = "k";
            String y = "j";
            System.out.println(x.compareTo(y));
    }
}
