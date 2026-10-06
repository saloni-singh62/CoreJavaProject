package Day4_HasARelation;

public class Marksheet {
   double hindi , english , maths , physics , chemistry ;

   public Marksheet(double hindi , double english , double maths , double physics , double chemistry) {
      this.hindi = hindi;
      this.english = english;
      this.maths = maths;
      this.physics = physics;
      this.chemistry = chemistry;
   }
   public void display(){
      System.out.println("1.Hindi\t" + hindi);
      System.out.println("2.English\t" + english);
      System.out.println("3.Maths\t" + maths);
      System.out.println("4.Physics\t" + physics);
      System.out.println("5. Chemistry\t" + chemistry);
   }
   void getPercentage(){
      double sum  = hindi + english + maths + physics + chemistry;
      double percentage = sum / 500 * 100;
      System.out.println("Percentage : " +  percentage);
   }

   public void getFinalGrade(){
      if(hindi > 90 && english > 90 && maths > 90 && physics > 90 && chemistry > 90){
         System.out.println("Grade : A+");
      } else if (hindi > 80 && english > 80 && maths > 80 && physics > 80 && chemistry > 80) {
         System.out.println("Grade : B+");
      } else if (hindi > 60 && english > 60 && maths > 60 && physics > 60 && chemistry > 60) {
         System.out.println("Grade : C+");
      } else if (hindi < 33 && english < 33 && maths < 33 && physics < 33 && chemistry < 33) {
         System.out.println("Failed.....");
      }
   }
}
