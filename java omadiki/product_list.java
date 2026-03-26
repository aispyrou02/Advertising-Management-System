import java.util.ArrayList;

class product_list{
    private int d=-1;
    ArrayList<product> products=new ArrayList<product>();

    public void add_element(product x){
        products.add(x);
        d++;
    }

    public ArrayList<String> get_all_codes(){
        ArrayList<String> allcodes=new ArrayList<String>();
        for(int i=0;i<=d;i++){
            allcodes.add(products.get(i).get_code());
        }
        return allcodes;
    }

    public void print_product_list(){
        for (int i=0;i<=d;i++){
            System.out.println(products.get(i).toString());
        }
    }

}