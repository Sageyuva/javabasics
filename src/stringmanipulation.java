import java.util.Locale;
import java.util.Scanner;

public class stringmanipulation {
    public static void main(String[] args) {
        // joining 2 strings
        String fname="yuvaraj";
        String lname="dhammure";
        String funame= fname+" "+lname;
        System.out.println(funame);


        // using scanner class to take input from the user

        Scanner sc = new Scanner(System.in);
        String name = sc.next() ;



        // command to find the length of the given variable


        System.out.println(name.length());


        // command to find the only one character of the string


        System.out.println(name.charAt(0));


        // command to find the index number of given character


        System.out.println(name.indexOf("y"));


        // command to find the given variable is equal to another data or not


        System.out.println(name.equals("yuvarajdhammure"));
        System.out.println(name.equals("naruto"));


        //command to capital all the character


        System.out.println(name.toUpperCase());


        // command to convert all letters to smaller


        System.out.println(name.toLowerCase());


        // scanner command to give a whole line or more data


        Scanner dc= new Scanner(System.in);
        String nn= dc.nextLine();
        System.out.println(nn);


        // scanner class to give a long data of integers


        long nm=dc.nextLong();
        System.out.println(nm);


        // Comparing 2 strings


        if (fname.compareTo(lname)==0)
        {
            System.out.println("Strings are equal ");
        }
        else {
            System.out.println("Strings are not equal");
        }


        // comparing to new strings are equal when they are declared in if condition itself


        if (new String("yuvaraj")== new String("yuvaraj")){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }

   // creating a substring in string


        String sentence = "My name is Yuvaraj Dhammure";
        String first_name = sentence.substring(11,18);
        String last_name = sentence.substring(19,sentence.length());
        System.out.println(first_name);
        System.out.println(last_name);
        System.out.println(first_name+" "+last_name);


    }
}
