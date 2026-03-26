

class advertizer{
    public String name,afm;
    
    public advertizer(String afm,String name){
        this.name=name;
        this.afm=afm;
    }

    public String toString(){
        return "name: "+name+", carrierTaxID: "+afm;
    }
}