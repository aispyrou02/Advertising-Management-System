
class product extends advertizer{
    private String code;
    
    public product(String code,String name,String afm){
        super(name,afm);
        this.code=code;
    }

    public String toString(){
        return "product code: "+code+", "+super.toString();
    }

    public String get_code(){
        return code;
    }

}