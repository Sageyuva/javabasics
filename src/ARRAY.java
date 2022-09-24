import java.util.*;
public class ARRAY {
    public static void main(String[] args) {
      // 1st method
        int roll[]={12,23,34,45,23,23};
        // 1st method 1st way of output
        System.out.println(roll[0]);
        // 1st method 2nd way of output using for loop
        for (int i=0;i<6;i++){
            System.out.println(roll[i]);
        }


        // 2nd method of declaring array

        int[] t= new int[5];
        t[0]=1;
        t[1]=2;
        t[2]=3;
        t[3]=4;
        t[4]=5;

        // 1 way of taking output

        System.out.println(t[1]);

        // 2nd way of taking output
for (int i =0;i<5;i++){
    System.out.println(t[i]);
}


// 3rd way of declaring a array using by taking input from the user
        Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int[] u = new int[size];

// talking input from user using for loop
        for (int i=0;i<size;i++){
            u[i]= sc.nextInt();
        }
        //printing given output using for loop

        for(int i=0;i<size;i++){
            System.out.println(u[i]);
        }

        int x = sc.nextInt();
        for (int i=0;i<size;i++){
            if (x==u[i]){
                System.out.println("The value "+x+" is found at index number "+u[i]);
            }
        }

    }
}