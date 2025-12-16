public class Max {
    public Float findMax(Float n1,Float n2,Float n3){
        Float max=n1;
        if(n2.compareTo(n1)>0){
            max=n2;
        }
        if(n3.compareTo(max)>0){
            max=n3;
        }
        return max;
    }
}
