package com.company.model;

public class Client extends Person {

     String creditCard = "";

     public Client(){}

     public Client(int id, String name, String phone){
          super(name, phone, id);
          this.creditCard = "0000 0000 0000 0000";
     }
     public void setCreditCard(String creditCard) {
          this.creditCard = creditCard;
     }

     public String getCreditCard() {
          return creditCard;
     }

     @Override
     public String toString() {
          String strPersona = super.toString();
          return  strPersona +" - " + creditCard;
     }
}
