package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int baseVeg;
    private int baseNonveg;
    private int extraCheese;
    private int extraToppingVeg;
    private int extrToppingNonVeg;
    private int paperBag;
    private boolean cheeseFlag;
    private boolean toppingFlag;
    private boolean paperBagFlag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        bill = "";
        baseVeg = 300;
        baseNonveg = 400;
        extraCheese = 80;
        extraToppingVeg = 70;
        extrToppingNonVeg = 120;
        paperBag = 20;
        
        if( isVeg ){
            this.price = baseVeg;
        }
        else{
            this.price = baseNonveg;
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        cheeseFlag = true;
        this.price += extraCheese;
    }

    public void addExtraToppings(){
        toppingFlag = true;
        if( isVeg ){
            this.price += extraToppingVeg;
        }
        else{
            this.price += extrToppingNonVeg;
        }
    }

    public void addTakeaway(){
        paperBagFlag = true;
        this.price += paperBag;
    }

    public String getBill(){
        if( isVeg ){
            bill += "Base Price Of The Pizza: "+baseVeg+"\n";
            if( cheeseFlag ){
                bill += "Extra Cheese Added: "+extraCheese+"\n";
            }
            if( toppingFlag ){
                bill += "Extra Toppings Added: "+extraToppingVeg+"\n";
            }
            if( paperBagFlag ){
                bill += "Paperbag Added: "+paperBag+"\n";
            }
            bill += "Total Price: "+price+"\n";
        }
        else{
            bill += "Base Price Of The Pizza: "+baseNonveg+"\n";
            if( cheeseFlag ){
                bill += "Extra Cheese Added: "+extraCheese+"\n";
            }
            if( toppingFlag ){
                bill += "Extra Toppings Added: "+extrToppingNonVeg+"\n";
            }
            if( paperBagFlag ){
                bill += "Paperbag Added: "+paperBag+"\n";
            }
            bill += "Total Price: "+price+"\n";
        }
        return this.bill;
    }
}
