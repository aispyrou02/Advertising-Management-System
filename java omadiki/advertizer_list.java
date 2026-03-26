import java.util.ArrayList;

class advertizer_list{
    private int d=-1;
    ArrayList<advertizer> advertizers=new ArrayList<advertizer>();

    public void add_element(advertizer x){
        advertizers.add(x);
        d++;
    }

    public void print_advertizer_list(){
        for (int i=0;i<=d;i++){
            System.out.println(advertizers.get(i).toString());
        }
    }

}