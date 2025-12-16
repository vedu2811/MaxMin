public class Max {
    public String findMax(String n1,String n2,String n3){
        String max=n1;
        if(n2.compareTo(n1)>0){
            max=n2;
        }
        if(n3.compareTo(max)>0){
            max=n3;
        }
        return max;
    }
}
