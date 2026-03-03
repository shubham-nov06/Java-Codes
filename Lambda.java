

Interface B {
    int cube(int x);
}

public class Lambda{
    public static void main(String[] args) {
        B obj = (x) -> x * x * x;
        System.out.println(obj.cube(5));
    }
}
