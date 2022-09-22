class A{
    private int value;

    public void setValue(int m){
        value=m;

    }
    public int getValue(){
        return value;
    }

}
 class b{
     public static void main(String[] args) {
         A m = new A();
         m.setValue(100);
         System.out.println(m.getValue());
     }



 }