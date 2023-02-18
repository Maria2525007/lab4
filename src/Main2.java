
class C1{
    private final Integer i;
    public int b;

    C1(Integer i) {
        this.i = i;
    }

    @Override
    public int hashCode(Object a) {
        this.b=b;
        return (b);
    }
}

public class Main2 {
    public static void main(String[] arg){
        var i1 = new C1(1);
        var i2 = new C1(1);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        System.out.println(i1.equals(i2));

    }
}
