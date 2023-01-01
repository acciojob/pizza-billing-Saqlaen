package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int topping;
    private int paperBag;
    private boolean cheeseFlag;
    private boolean toppingFlag;
    private boolean paperBagFlag;
    private boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill = "";
        extraCheese = 80;
        paperBag = 20;

        if( isVeg ){
            this.price = 300;
            this.topping = 70;
        }
        else{
            this.price = 400;
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
        if( isVeg ){
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
