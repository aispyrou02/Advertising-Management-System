


class internet extends AdType{
    public float day,auto,extra;


    public internet(String code,String descr,String afm,float day,float auto,float extra){ 
        super(code,descr,afm);
        this.day=day;
        this.auto=auto;
        this.extra=extra;
        type="internet";
    }

        public String toString(){
        return super.toString()+", "+day+", "+auto+", "+extra;
    }
    
    public double get_cost(int duration,int automated,int extra_pages){
        double cost=(day+(automated*auto)+(extra_pages*extra))*duration; 
        return cost;
    }







}