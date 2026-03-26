
import java.util.ArrayList;
import java.util.Scanner;

public class mainApp {
    public static void main(String args[]) {

        /// a few variables
        String afm,name,code,description,type_of_ad,pcode,explanation,timezone,place,tempstring1,tempstring2;
        String string[]=new String[10];
        float price1,price2,price3,price4;
        int answer,duration,extra_pages,automated,media_ad_duration,words,tempint1,tempint2,max,d;
        double sum;
        ArrayList<String> codes=new ArrayList<String>();
        ArrayList<Integer> counter=new ArrayList<Integer>();



        /// assign starting values to the list 
        product_list list_of_products=new product_list();
        ad_type_list list_of_ad_types=new ad_type_list();
        advertizer_list list_of_advertizers=new advertizer_list();
        ads_list list_of_ads=new ads_list();

        ///list of products
        product obj1=new product("PR001","0011","laptop");
        list_of_products.add_element(obj1);
        obj1=new product("PR002","0022","tablet");
        list_of_products.add_element(obj1);
        obj1=new product("PR003","0033","ps4");
        list_of_products.add_element(obj1);
        obj1=new product("PR004","0044","xbox360");
        list_of_products.add_element(obj1);

        ///list of carriers
        advertizer obj5=new advertizer("AC001","A001");
        list_of_advertizers.add_element(obj5);
        obj5=new advertizer("AC002","A002");
        list_of_advertizers.add_element(obj5);
        obj5=new advertizer("AC003","A003");
        list_of_advertizers.add_element(obj5);
        obj5=new advertizer("AC004","A004");
        list_of_advertizers.add_element(obj5);

        ///list of ad types
        printed obj2=new printed("Press 1","News paper 1","AC001",18,14,17);
        list_of_ad_types.insert_ad(obj2);        
        obj2=new printed("Press 2","Magazine 1","AC004",19,13,16);
        list_of_ad_types.insert_ad(obj2); 
        obj2=new printed("Press 3","Magazine 2","AC003",21,13,18);
        list_of_ad_types.insert_ad(obj2); 

        internet obj3= new internet("Internet 1","site1","AC001",30,20,12);
        list_of_ad_types.insert_ad(obj3);
        obj3= new internet("Internet 2","site2","AC003",35,16,14);
        list_of_ad_types.insert_ad(obj3);
        obj3= new internet("Internet 3","site3","AC004",28,22,18);
        list_of_ad_types.insert_ad(obj3);

        media obj4= new media("Media 1","channel 4","AC002",60,25,30,70);
        list_of_ad_types.insert_ad(obj4);
        obj4= new media("Media 2","radio 80.2","AC002",70,30,40,60);
        list_of_ad_types.insert_ad(obj4);
        obj4= new media("Media 3","radio 88.5","AC003",65,35,28,75);
        list_of_ad_types.insert_ad(obj4);



        ///list of ads
        advertisement_internet obj6=new advertisement_internet("Internet 2","PR001",5,"-",1,0);
        list_of_ads.insert_ad_internet(obj6);
        obj6=new advertisement_internet("Internet 2","PR001",6,"-",1,4);
        list_of_ads.insert_ad_internet(obj6);        
        obj6=new advertisement_internet("Internet 3","PR002",2,"-",0,5);
        list_of_ads.insert_ad_internet(obj6);
        obj6=new advertisement_internet("Internet 1","PR003",8,"-",1,0);
        list_of_ads.insert_ad_internet(obj6);

        advertisement_printed obj7=new advertisement_printed("Press 2","PR004",2,"-",12,"first");
        list_of_ads.insert_ad_printed(obj7);
        obj7=new advertisement_printed("Press 2","PR003",1,"-",10,"middle");
        list_of_ads.insert_ad_printed(obj7);
        obj7=new advertisement_printed("Press 1","PR001",4,"-",5,"last");
        list_of_ads.insert_ad_printed(obj7);
        obj7=new advertisement_printed("Press 3","PR001",9,"-",9,"last");
        list_of_ads.insert_ad_printed(obj7);

        advertisement_media obj8=new advertisement_media("Media 1","PR003",2,"-",8,"morn");
        list_of_ads.insert_ad_media(obj8);
        obj8=new advertisement_media("Media 2","PR004",4,"-",7,"after");
        list_of_ads.insert_ad_media(obj8);
        obj8=new advertisement_media("Media 3","PR002",5,"-",4,"night");
        list_of_ads.insert_ad_media(obj8);
        obj8=new advertisement_media("Media 1","PR004",6,"-",4,"mid");
        list_of_ads.insert_ad_media(obj8);


        /// elements assigned



        Scanner input = new Scanner(System.in);
        
        System.out.println("Choose action:");
        System.out.println("1. Add new advertisment carrier.");
        System.out.println("2. Add new advertisment type.");
        System.out.println("3. Add new advertisment.");
        System.out.println("4. Show advertisments.");
        System.out.println("5. Show specific carrier advertisments.");
        System.out.println("6. Calculate specific carrier advertisment cost.");
        System.out.println("7. Show number of advertisments per product.");
        System.out.println("8. Calculate specific product advertising cost.");
        System.out.println("9. Show advertisment cost per product.");
        System.out.println("10. End program.");

        int res = input.nextInt();

        while (res!=10){



                if(res==1){

                    System.out.println("Give carrierTaxID, name");
                    input.nextLine();
                    for (int i=0;i<2;i++){
                        string[i]=input.nextLine();
                    }
                    afm=string[0];
                    name=string[1];
                    obj5=new advertizer(afm,name);
                    list_of_advertizers.add_element(obj5);  
                }

                else if(res==2){

                    System.out.println("What is the next ad type? 1 for media , 2 for internet, 3 for printed press.");
                    answer=input.nextInt();                    
                    System.out.println("Give code, description, carrierTaxID, prices.");
                    input.nextLine();
                    for (int i=0;i<3;i++){
                        string[i]=input.nextLine();
                    }
                    code=string[0];
                    description=string[1];
                    afm=string[2];                 
                    if (answer==1){
                        price1=input.nextFloat();
                        price2=input.nextFloat();
                        price3=input.nextFloat();
                        price4=input.nextFloat();
                        obj4=new media(code,description,afm,price1,price2,price3,price4);
                        list_of_ad_types.insert_ad(obj4);
                    }
                    else if (answer==2){
                        price1=input.nextFloat();
                        price2=input.nextFloat();
                        price3=input.nextFloat();
                        obj3=new internet(code,description,afm,price1,price2,price3);
                        list_of_ad_types.insert_ad(obj3);                       
                    }
                    else{
                        price1=input.nextFloat();
                        price2=input.nextFloat();
                        price3=input.nextFloat();
                        obj2=new printed(code,description,afm,price1,price2,price3);
                        list_of_ad_types.insert_ad(obj2);  
                    }
                }

                else if(res==3){
                    System.out.println("Available ad types:");
                    list_of_ad_types.print_ad_type_list();

                    System.out.println("Available products:");
                    list_of_products.print_product_list();
                    duration=0;
                    System.out.println("Give ad type code, product code, duration in days, explanation.");
                    input.nextLine();
                    for (int i=0;i<4;i++){
                        if (i==2){
                            duration=input.nextInt();
                            input.nextLine();
                        }
                        else{
                            string[i]=input.nextLine();
                        }
                    }

                    code=string[0];
                    pcode=string[1];
                    explanation=string[3];

                    type_of_ad=list_of_ad_types.get_type(code);

                    if (type_of_ad.equals("internet")){
                        System.out.println("Give automatic show 1 or 0, number of extra pages.");
                        automated=input.nextInt();
                        extra_pages=input.nextInt();
                        obj6=new advertisement_internet(code,pcode,duration,explanation,automated,extra_pages);
                        list_of_ads.insert_ad_internet(obj6);
                    }
                    else if (type_of_ad.equals("media")){
                        System.out.println("Give duration in seconds, time zone: 'morn' or 'mid' or 'after' or 'night'");
                        media_ad_duration=input.nextInt();
                        input.nextLine();
                        timezone=input.nextLine();
                        obj8=new advertisement_media(code,pcode,duration,explanation,media_ad_duration,timezone);
                        list_of_ads.insert_ad_media(obj8);
                    }
                    else{
                      System.out.println("Give number of words, page on the paper: 'first' or 'middle' or 'last'");
                        words=input.nextInt();
                        input.nextLine();
                        place=input.nextLine();
                        obj7=new advertisement_printed(code,pcode,duration,explanation,words,place);
                        list_of_ads.insert_ad_printed(obj7);
                    }
                }

                else if(res==4){

                    list_of_ads.print_ad_list();
                }

                else if(res==5){
                    list_of_advertizers.print_advertizer_list();
                    System.out.println("Give the carrierTaxID of the desired advertizer.");
                    input.nextLine();
                    afm=input.nextLine();
                    codes=list_of_ad_types.afm_to_code(afm);
                    list_of_ads.ads_of_advertizer(codes);               

                }

                else if(res==6){
                    list_of_advertizers.print_advertizer_list();
                    System.out.println("Give the carrierTaxID of the desired advertizer.");
                    input.nextLine();
                    afm=input.nextLine();
                    codes=list_of_ad_types.afm_to_code(afm);

                    sum = list_of_ads.total_cost_for_advertizer(codes, list_of_ad_types);

                    System.out.println("The total of cost of the chosen advertizer is: "+sum);
                }

                    

                else if(res==7){

                    codes=list_of_products.get_all_codes();
                    for (int i=0;i<codes.size();i++){
                        counter.add(list_of_ads.number_of_ads_for_product(codes.get(i)));
                    }
                    for (int j=0;j<codes.size();j++){
                        max=counter.get(j);
                        d=j;
                        for (int i=j;i<codes.size();i++){
                            if(counter.get(i)>max){
                                max=counter.get(i);
                                d=i;
                            }
                        }
                        tempint1=counter.get(d);
                        tempint2=counter.get(j);
                        counter.set(d,tempint2);
                        counter.set(j,tempint1);
                        tempstring1=codes.get(d);
                        tempstring2=codes.get(j);
                        codes.set(d,tempstring2);
                        codes.set(j,tempstring1);
                    }
                    for (int i=0;i<codes.size();i++){
                        System.out.println("The number of ads for product with code "+codes.get(i)+" is: "+counter.get(i));
                    }
                    counter.clear();
                }

                else if(res==8){
                    list_of_products.print_product_list();
                    System.out.println("Give the code of the product you want to see the advertising cost of.");
                    input.nextLine();
                    code=input.nextLine();

                    sum = list_of_ads.total_cost_for_product(code, list_of_ad_types);
                    System.out.println("The total advertising cost of the chosen product is: " + sum);
                }
                else if(res==9){
                    codes = list_of_products.get_all_codes();
                    for(int i=0;i<codes.size();i++){
                        sum = list_of_ads.total_cost_for_product(codes.get(i), list_of_ad_types);
                        System.out.println("The advertising cost for product with code " + codes.get(i) + " is: " + sum);
                    }
                }


            

 
          
            System.out.println("Choose another action:");
            System.out.println("1. Add new advertisment carrier.");
            System.out.println("2. Add new advertisment type.");
            System.out.println("3. Add new advertisment.");
            System.out.println("4. Show advertisments.");
            System.out.println("5. Show specific carrier advertisments.");
            System.out.println("6. Calculate specific carrier advertisment cost.");
            System.out.println("7. Show number of advertisments per product.");
            System.out.println("8. Calculate specific product advertising cost.");
            System.out.println("9. Show advertisment cost per product.");
            System.out.println("10. End program.");

            res = input.nextInt();
            
        }

    }
}
 