abstract class AdType {
    protected String adCode,adTypeDescription,carrierTaxID; //klhronomei apo Carrier.class mallon???
    public String type;

    public AdType(String adCode, String adTypeDescription, String carrierTaxID){
        this.adCode = adCode;
        this.adTypeDescription = adTypeDescription;
        this.carrierTaxID = carrierTaxID;
    }

    public String get_code(){
        return adCode;
    }


    public String toString(){
        return adCode+", "+adTypeDescription+", "+carrierTaxID;
    }

    public String get_afm(){
        return carrierTaxID;
    }




}