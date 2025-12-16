public class Main{
    public static void main(String[] args) {
        Max m=new Max();
        System.out.println(m.findMax("Apple", "Peach", "Banana"));
        System.out.println(m.findMax("Apple", "Banana","Peach"));
        System.out.println(m.findMax("Peach","Apple",  "Banana"));
    }
}