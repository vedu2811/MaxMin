import java.util.Arrays;

public class Max  {
    public <T extends Comparable<T>> T findMax(T... values){
        if(values.length==0){
            return null;
        }
        Arrays.sort(values);
        return values[values.length-1];

//        T max=n1;
//        if(n2.compareTo(n1)>0){
//            max=n2;
//        }
//        if(n3.compareTo(max)>0){
//            max=n3;
//        }
//        return max;
    }
}
