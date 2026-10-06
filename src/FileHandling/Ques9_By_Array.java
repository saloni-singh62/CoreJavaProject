package FileHandling;
// We have String array of subjects print all the subjects one by one
// We have String array of subjects print only the subjects starting with j
public class Ques9_By_Array {
    public static void main(String[] args) {
//        String[] str = new String[3];
//        str[0] = "Hindi";
//        str[1] = "English";
//        str[2] = "Maths";
//        str[3] = "Science";

        String[] arr = {"Java", "Python", "Js", "Sql", "HTML"};

        for (String s : arr) {
            if (s.startsWith("J")) ;
            {
                System.out.println(s);
            }
            System.out.println("======");
        }
    }
}
