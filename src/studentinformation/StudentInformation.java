
package studentinformation;

class Studinfo{
    private String StudName;
    private String Course;
    private int year;
    
    void setStudName(String a){
        this.StudName = a;}
     void setCourse(String b){
         this.Course = b; }
      void setYear(int c){
          this.year = c; }
     
    String getStudName(){
        return (this.StudName);}
    String getCourse(){
        return (this.Course);}
    int getYear(){
        return (this.year);

    }   
}
public class StudentInformation {

    public static void main(String[] args) {
       Studinfo sti = new Studinfo();
                sti.setStudName("Reinalyn Buenaflor");
                sti.setCourse("BSIT");
                sti.setYear(3);
       String a = sti.getStudName();
       String b = sti.getCourse();
       int c = sti.getYear();
       
       System.out.println("Student Name is : "+ a);
       System.out.println("Course is : "+ b);
       System.out.println("Year is : "+ c);
    }
}
