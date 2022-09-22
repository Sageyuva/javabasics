import java.util.Scanner;

public class array {
    public static void main(String[] args) {


        // 1st Method


//        int name[] ={12,133,45};
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        for (int i=0;i<=2;i++){
//            System.out.println(name[i]);
//        }


        // end of first method

        // 2nd method

//        int[] name = new int[5];
//        name[0]=3;
//        name[1]=9;
//        name[2]=6;
//        name[3]=7;
//        name[4]=8;
//      System.out.println(name[0]);
//        for (int i=0;i<5;i++){
//            System.out.println(name[i]);
//        }

        // end of 2nd methid

        // user input method

        Scanner u=new Scanner(System.in);
        int size=u.nextInt();

        int[] name= new int[size];


        // input loop
        for (int i=0;i<size;i++){
            name[i]=u.nextInt();
        }
int x= u.nextInt();
        // out put loop
        for (int i=0;i<size;i++){
//            System.out.println(name[i]);
            if (x==name[i]){
                System.out.println("the value of x is in index number "+name[i]);
            }else {
                System.out.println("data not found");
            }

        }





    }
}
