

class advertisement_printed extends advertisement{
    public int word_number;
    public String page;




    public advertisement_printed(String type_code,String product_code,int days,String explanation,int word_number,String page){
        super(type_code,product_code,days,explanation);
        this.word_number=word_number;
        this.page=page;
        type="printed";
    }

    
    public String toString(){
        return super.toString()+", number of words: "+word_number+", which page: "+page;
    }

}