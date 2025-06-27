public class Method_overloading {
    public static void main(String[] args){
        Child p = new Child();
        p.hi();
    }
}
class Parent{
    Parent(){
        System.out.println("HI");
    }
    void hi(){
        System.out.println("naa parent hi");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("da");
    }
    void hi(){
        System.out.println("naa student hi");
    }
}
