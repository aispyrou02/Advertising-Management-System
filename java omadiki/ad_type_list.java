import java.util.ArrayList;

class ad_type_list{
    ArrayList<AdType> ad_types = new ArrayList<AdType>();
    private int d=-1;

    public void insert_ad(AdType x){
        ad_types.add(x);
        d++;
    }
    public String get_type(String ad_type_code){
        for(int i=0;i<=d;i++){
            if (ad_types.get(i).get_code().equals(ad_type_code)){
                return ad_types.get(i).type;
            }
        }
        return "nothing";

    }
    public ArrayList<String> afm_to_code(String desired_afm){
        ArrayList<String> codes=new ArrayList<String>();
        for(int i=0;i<=d;i++){
            if(ad_types.get(i).get_afm().equals(desired_afm)){
                codes.add(ad_types.get(i).get_code());
            }
        }
        return codes;
    }
    public double internet_cost(String code,int duration,int automated,int extra_pages){
        for(int i=0;i<=d;i++){
            if(ad_types.get(i).get_code().equals(code)){
                return ((internet)ad_types.get(i)).get_cost(duration,automated,extra_pages);
            }
        }
        return 0;
    }

    public double media_cost(String code,int duration,int media_ad_duration,String timezone){
        for(int i=0;i<=d;i++){
            if(ad_types.get(i).get_code().equals(code)){
                return ((media)ad_types.get(i)).get_cost(duration,media_ad_duration,timezone);
            }
        }
        return 0;
    }

    public double printed_cost(String code,int duration,int words,String page){
        for(int i=0;i<=d;i++){
            if(ad_types.get(i).get_code().equals(code)){
                return ((printed)ad_types.get(i)).get_cost(duration,words,page);
            }
        }
        return 0;
    }
    public void print_ad_type_list(){
        for(int i=0;i<=d;i++){
            System.out.println(ad_types.get(i).toString());
        }
    }


}