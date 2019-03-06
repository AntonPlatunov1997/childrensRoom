package com.services;

import com.model.entities.toys.Toy;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class TextPrinter {

    public String printer (List<Toy> list){
        StringBuilder sb = new StringBuilder();
if (list!= null& !list.isEmpty()){
    sb.append("<ui>");

      for (Toy toy:list){
          sb.append("<li>" + toy + "</li>");

      }
    sb.append("</ui>");

}
        return sb.toString();
    }





    public static String showMessages(Locale locale, String key) {

        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", locale);
        return bundle.getString(key);

    }

    public static String showMessages(String key) {

        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", new Locale("ukr"));
        return bundle.getString(key);

    }

    public static String showMessages(String language,String key){

        ResourceBundle bundle =
                ResourceBundle.getBundle("messages", new Locale("eng"));
        return bundle.getString(key);

    }

}
