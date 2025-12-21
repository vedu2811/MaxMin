public class Main{
    public static void main(String[] args) {
        Max m=new Max();
        System.out.println(m.findMax("Apple", "Peach", "Banana"));
        System.out.println(m.findMax("Apple", "Banana"));
        System.out.println(m.findMax(4,6,3,4,5,7,9));
        System.out.println(m.findMax(2.33,6.1,0.4,8.2,8.8));
    }
}