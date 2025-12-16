public class Max {
    public Integer findMax(Integer n1,Integer n2,Integer n3){
        Integer max=n1;
        if(n2.compareTo(n1)>0){
            max=n2;
        }
        if(n3.compareTo(max)>0){
            max=n3;
        }
        return max;
    }
}
