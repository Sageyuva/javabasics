import java.util.ArrayList;
public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> rool =new ArrayList<Integer>();
        rool.add(10);
        rool.add(12);
        rool.add(34);
        rool.add(36);
        rool.add(2,7);
        rool.set(2,1);
        rool.remove(2);
//        int element= rool.get(1);
//        System.out.println(element);
        System.out.println(rool);

    }
}