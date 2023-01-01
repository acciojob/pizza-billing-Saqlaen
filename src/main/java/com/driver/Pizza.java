package com.driver;

public class Pizza {

    private int price;
    private int Base;
    private Boolean Veg;
    private String bill;
    private int extraCheese;
    private int topping;
    private int paperBag;
    private boolean cheeseFlag;
    private boolean toppingFlag;
    private boolean paperBagFlag;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.Veg = isVeg;
        bill = "";
        this.extraCheese = 80;
        this.paperBag = 20;

        if( Veg ){
            this.Base = 300;
            this.price = Base;
            this.topping = 70;
        }
        else{
            this.Base = 400;
            this.price = Base;
            this.topping = 120;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if( cheeseFlag == false ){
            cheeseFlag = true;
            this.price += this.extraCheese;
        }
    }

    public void addExtraToppings(){
        if( Veg ){
            if( toppingFlag == false ){
                this.price += this.topping;
                toppingFlag = true;
            }
        }
        else{
            if( toppingFlag == false ){
                toppingFlag = true;
                this.price += this.topping;
            }
        }
    }

    public void addTakeaway(){
        if( paperBagFlag == false ){
            paperBagFlag = true;
            this.price += paperBag;
        }
    }

    public String getBill(){
        if( billGenerated == false ){
            this.bill += "Base Price Of The Pizza: "+this.Base+"\n";
            if( cheeseFlag ){
                this.bill += "Extra Cheese Added: "+this.extraCheese+"\n";
            }
            if( toppingFlag ){
                this.bill += "Extra Toppings Added: "+this.topping+"\n";
            }
            if( paperBagFlag ){
                this.bill += "Paperbag Added: "+this.paperBag+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            billGenerated = true;
        }
        
        return this.bill;
    }
}
