class printed extends AdType{
    private float first,middle,last;


    public printed(String code,String descr,String afm,float first,float middle,float last){ 
        super(code,descr,afm);
        this.first=first;
        this.middle=middle;
        this.last=last;
        type="printed";
    }

    public String toString(){
        return super.toString()+", "+first+", "+middle+", "+last;
    }



    public double get_cost(int duration,int words,String page){
        float prise=0;
        if (page.equals("first")){
            prise=first;
        }
        else if (page.equals("middle")){
            prise=middle;
        }
        else{
            prise=last;
        }

        double cost=prise*words*duration; 
        return cost;
    }
















}