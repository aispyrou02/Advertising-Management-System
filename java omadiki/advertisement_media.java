
class advertisement_media extends advertisement{
    public int duration;
    public String timezone;




    public advertisement_media(String type_code,String product_code,int days,String explanation,int duration,String timezone){
        super(type_code,product_code,days,explanation);
        this.duration=duration;
        this.timezone=timezone;
        type="media";
    }


    public String toString(){
        return super.toString()+", duration in seconds: "+duration+", time zone: "+timezone;
    }
}