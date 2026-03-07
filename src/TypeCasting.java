public class TypeCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;      // automatic

        double c = 9.7;
        int d = (int) c;   // manual

        System.out.println(b);
        System.out.println(d);
    }
}