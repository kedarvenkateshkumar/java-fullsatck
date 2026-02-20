package java8_Features.FunctionalInterface;
@FunctionalInterface
interface A{
    int add(int i, int j);
}
public class Main {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j;
        System.out.println(obj.add(10,22));
    }
}
