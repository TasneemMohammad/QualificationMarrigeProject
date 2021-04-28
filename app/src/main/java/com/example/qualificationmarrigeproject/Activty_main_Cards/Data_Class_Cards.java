package com.example.qualificationmarrigeproject.Activty_main_Cards;

public class Data_Class_Cards {

   private String title_card ;
   private int img_card ;

    public Data_Class_Cards(String title_card, int img_card) {
        this.title_card = title_card;
        this.img_card = img_card;
    }

    public String getTitle_card() {
        return title_card;
    }

    public void setTitle_card(String title_card) {
        this.title_card = title_card;
    }

    public int getImg_card() {
        return img_card;
    }

    public void setImg_card(int img_card) {
        this.img_card = img_card;
    }
}
