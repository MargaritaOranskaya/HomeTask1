package org.example;

public class Revizor {

    public void closeStore(Shop shop){
        if(shop.getName()=="IKEA"){
            shop.setName(null);
        }
    }

    public void rebrand(Shop shop){
        if(shop.getName()=="MacDonalds"){
            shop.setName("Вкусно и точка");
        }else {
            StringBuilder rename = new StringBuilder(shop.getName());
            rename.deleteCharAt(0);
            String endRename = rename.toString();
            shop.setName(endRename);
        }
    }
}
