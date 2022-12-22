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
        extraCheese = 0;
        extraToppingVeg = 0;
        extrToppingNonVeg = 0;
        paperBag = 0;

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
        extraCheese += 80;
        this.price += 80;
    }

    public void addExtraToppings(){
        toppingFlag = true;
        if( isVeg ){
            extraToppingVeg += 70;
            this.price += 70;
        }
        else{
            extrToppingNonVeg += 120;
            this.price += 120;
        }
    }

    public void addTakeaway(){
        paperBagFlag = true;
        paperBag += 20;
        this.price += 20;
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
