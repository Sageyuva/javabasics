public class student {
    public student(String name, String Mname, String lname, long ph_no, String Address) {
        System.out.println("Name of the student is " + name);
        System.out.println("Middle name of the student is " + Mname);
        System.out.println("Last name of the student is " + lname);
        System.out.println("Phone Number of the student is " + ph_no);
        System.out.println("Address of the student is " + Address);
    }
}
    class  b{
        public static void main(String[] args) {
            student no1= new student("Nikhil","Hanamanthrao","Jawali",9686396288l,"Plot no 153 Jr Nagar near Quadri chowk , Aland Road , Kalaburagi 585-102");

            student no2= new student("Yuvaraj","Hanamanthrao","Dhammure",9686396288l,"Plot no 153 Jr Nagar near Quadri chowk , Aland Road , Kalaburagi 585-102");
        }
    }
