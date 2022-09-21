import java.awt.*;

public class student {

    private student(String name,String middlename,String surname,int usn,int number,int batch){

        System.out.println("Name of the student " +name);
        System.out.println("Father name of the  student is " +middlename);
        System.out.println("surame of the student " +surname);
        System.out.println("USN of the student "+usn);
        System.out.println("Phone number of the student "+ number);
        System.out.println("Batch of the student is  "+batch);
    }


}
class b{
    public static void main(String[] args) {
        student no1 = new
                student("Yuvaraj","Hanamanthrao","Dhammure",158,99999,19);
        student no2=new student("Nikhil","Hanamanthrao","Jawali",83,9999090,19);
        student no3=new student("Vinay","Subhash","Nirwane",153,99999,19);

    }
}
