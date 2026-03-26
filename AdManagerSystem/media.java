


class media extends AdType{
    private float morn,mid,after,night;


    public media(String code,String descr,String afm,float morn,float mid,float after,float night){ 
        super(code,descr,afm);
        this.morn=morn;
        this.mid=mid;
        this.after=after;
        this.night=night;
        type="media";
    }

    public String toString(){
        return super.toString()+", "+morn+", "+mid+", "+after+", "+night;
    }


    public double get_cost(int duration,int media_ad_duration,String time){
        float prise=0;
        if (time.equals("morn")){
            prise=morn;
        }
        else if (time.equals("mid")){
            prise=mid;
        }
        else if (time.equals("after")){
            prise=after;
        }
        else{
            prise=night;
        }        
        double cost=prise*duration*media_ad_duration; 
        return cost;
    }
















    public double get_prise(String time){
        if (time.equals("morn")){
            return morn;
        }
        else if (time.equals("mid")){
            return mid;
        }
        else if (time.equals("after")){
            return after;
        }
        else{
            return night;
        }        
    }









}