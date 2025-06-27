class Harish {
    protected static int age;
    private static long ph;

    Harish(int a) {
        age = a;
        System.out.println(age);
    }

}

public class Inheritance extends Harish {
    int g = 0;

    Inheritance(int a) {
        super(a);
        g = Harish.age;

    }

    public static void main(String[] args) {
        Inheritance gu = new Inheritance(5);
        System.out.println(Harish.age);
    }

}
