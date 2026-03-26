import java.util.ArrayList;


class ads_list{
    ArrayList<advertisement> ads = new ArrayList<advertisement>();
    private int d=-1;

    public void insert_ad_internet(advertisement_internet x){
        ads.add(x);
        d++;
    }
    public void insert_ad_media(advertisement_media x){
        ads.add(x);
        d++;
    }
    public void insert_ad_printed(advertisement_printed x){
        ads.add(x);
        d++;
    }


    public void print_ad_list(){
        for (int i=0;i<=d;i++){
            System.out.println(ads.get(i).toString());
        }
    }

    public void ads_of_advertizer(ArrayList<String> adv_code){
        for (int i=0;i<=d;i++){
            for (int j=0;j<adv_code.size();j++){
                if(ads.get(i).get_type_code().equals(adv_code.get(j))){
                    System.out.println(ads.get(i).toString());
                }
            }
        }
    }
    public int number_of_ads_for_product(String productcode){
        int total=0;
        for (int i=0;i<=d;i++){
            if(productcode.equals(ads.get(i).get_product_code())){
                total++;
            }
        }
        return total;
    }
    
    public int get_size(){
        return d;
    }

    public advertisement get_ad(int i){
        return ads.get(i);
    }

    public double total_cost_for_advertizer(ArrayList<String> adv_codes, ad_type_list list_of_ad_types){
        double sum=0;
        for(int i=0;i<=d;i++){
            for(int j=0;j<adv_codes.size();j++){
                if(ads.get(i).get_type_code().equals(adv_codes.get(j))){
                    if(ads.get(i).type.equals("internet")){
                        advertisement_internet x=(advertisement_internet) ads.get(i);
                        sum += list_of_ad_types.internet_cost(
                            x.get_type_code(), x.getdays(), x.getauto(), x.page_number
                        );
                    }
                    else if(ads.get(i).type.equals("media")){
                        advertisement_media x=(advertisement_media) ads.get(i);
                        sum += list_of_ad_types.media_cost(
                            x.get_type_code(), x.getdays(), x.duration, x.timezone
                        );
                    }
                    else{
                        advertisement_printed x=(advertisement_printed) ads.get(i);
                        sum += list_of_ad_types.printed_cost(
                            x.get_type_code(), x.getdays(), x.word_number, x.page
                        );
                    }
                }
            }
        }
        return sum;
    }

    public double total_cost_for_product(String product_code, ad_type_list list_of_ad_types){
        double sum=0;
        for(int i=0;i<=d;i++){
            if(ads.get(i).get_product_code().equals(product_code)){
                if(ads.get(i).type.equals("internet")){
                    advertisement_internet x=(advertisement_internet) ads.get(i);
                    sum += list_of_ad_types.internet_cost(
                        x.get_type_code(), x.getdays(), x.getauto(), x.page_number
                    );
                }
                else if(ads.get(i).type.equals("media")){
                    advertisement_media x=(advertisement_media) ads.get(i);
                    sum += list_of_ad_types.media_cost(
                        x.get_type_code(), x.getdays(), x.duration, x.timezone
                    );
                }
                else{
                    advertisement_printed x=(advertisement_printed) ads.get(i);
                    sum += list_of_ad_types.printed_cost(
                        x.get_type_code(), x.getdays(), x.word_number, x.page
                    );
                }
            }
        }
        return sum;
    }









}