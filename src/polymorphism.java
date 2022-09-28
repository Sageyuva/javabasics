//Polymorphism has 2 types
//1.Compile time Polymorphism (Based on on "METHOD OVERLODING")
//syntax:- return_type Methid name(Parameters)
//         return_type Methid name(Parameters,Parameters)
class a{

    int add(){
        int a=10,b=80;
        int c=a+b;
        return c;

    }
    void add(int x, int y){
        int c=x+y;
        System.out.println(c);
    }
    void add(int x, double y){
        double c= x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
      a name = new a();
     name.add(100,100); name.add(200,200.999); name.add(); name.add(300,800);
     int add = name.add();
        System.out.println(add);
    }
}

//TYPE 2 :- COMPILE TIME POLYMORPHISM
// compile- time polymorphism uses inheritence

class  a{
    void car(){
        System.out.println("Tata cars");
    }
}

class c extends a{
    @Override
    void car(){
        System.out.println("NEXON");
    }
}
class  demo{
    public static void main(String[] args) {
        a car =new c();
        car.car();



    }
}