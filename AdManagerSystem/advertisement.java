

abstract class advertisement{
    protected String type_code,product_code,explanation;
    protected int days;
    public String type;


    public advertisement(String type_code,String product_code,int days,String explanation){
        this.type_code=type_code;
        this.product_code=product_code;
        this.days=days;
        this.explanation=explanation;
    }
    public String toString(){
        return "ad type code: "+type_code+", product: "+product_code+", days: "+days+", "+explanation;
    }
    public String get_type_code(){
        return type_code;
    }
    public int getdays(){
        return days;
    }
    public String get_product_code(){
        return product_code;
    }
    


}