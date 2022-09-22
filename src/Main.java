import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        long num =96863962888768l;
//       int num2=445;
//       String name="yuvaraj";
//        System.out.println("coding is very interseted 96863962888768");
//        int[] yuva= new int[7];
//        yuva[0]=10;
//        yuva[1]=20;
//        yuva[2]=30;
//        yuva[3]=40;
//        yuva[4]=50;
//        yuva[5]=60;
//        yuva[6]=70;
//        System.out.println(yuva[6]);
//        for (int i=0;i<7;i++){
//            System.out.println(yuva[i]);
//        }
//        int l[]=new int[4];
//        int u[]={22,22,22,22,22,222,22};
//        for (int i=0;i<7;i++){
//            System.out.println(u[i]);
//        }
        Scanner DC= new Scanner(System.in);
        int size = DC.nextInt();
        int[] array= new int[size];

        for (int i=0;i<size;i++){
            array[i]= DC.nextInt();
        }
        int x= DC.nextInt();
        for (int i=0;i<array.length;i++){
            if (array[i]==x){
                System.out.println("X valaue found at index "+i);
            }
        }


    }
}