package com.driver;

public class Pizza {

    private int price;
    private int basePrice;
    private int toppings;
    private int vegBase=300;
    private int nonvegBase=400;
    private int cheese = 80;
    private int vegToppings = 70;
    private int nonvegToppings = 120;
    private int bag = 20;

    private boolean addCheese;
    private boolean addToppings;
    private boolean isTakeaway;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        basePrice=getBasePrice();
        price=basePrice;
        addCheese=false;
        addToppings=false;
        isTakeaway=false;
        // your code goes here
    }

    private int getBasePrice(){
        return isVeg ? vegBase : nonvegBase;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!addCheese){
            this.addCheese=true;
            this.price+=cheese;
        }
    }

    public void addExtraToppings(){
        if(!addToppings){
            this.addToppings=true;
            toppings=getToppings();
            this.price+=toppings;
        }
    }

    private int getToppings(){
        return isVeg ? vegToppings : nonvegToppings;
    }


    public void addTakeaway(){
        if(!isTakeaway){
            this.isTakeaway=true;
            this.price+=bag;
        }
    }

    public String getBill(){
        String ans="";
            ans+="Base Price Of The Pizza: " + basePrice + "\n";
        if(addCheese){
            ans+="Extra Cheese Added: " + cheese + "\n";
        }
        if(addToppings){
                ans+="Extra Toppings Added: " + toppings + "\n";
        }
        if(isTakeaway){
            ans+="Paperbag Added: " + bag + "\n";
        }
        ans+="Total Price: " + price + "\n";

        this.bill=ans;
        return this.bill;
    }
}
