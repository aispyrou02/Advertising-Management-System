
class advertisement_internet extends advertisement{
    public int page_number,automated;



    public advertisement_internet(String type_code,String product_code,int days,String explanation,int automated,int page_number){
        super(type_code,product_code,days,explanation);
        this.automated=automated;
        this.page_number=page_number;
        type="internet";
    }

    public int getauto(){
        return automated;
    }


    
    public String toString(){
        return super.toString()+", auto show: "+automated+", extra pages: "+page_number;
    }

}