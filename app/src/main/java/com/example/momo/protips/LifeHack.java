package com.example.momo.protips;

public class LifeHack {
    //Encapsulamos los datos necesarios de un life hack
    private String txtLifeHack;
    private String img_url;

    //Creamos metodo constructor que recibira los datos necesarios
    public LifeHack(String txtLifeHack, String img_url){
        this.txtLifeHack = txtLifeHack;
        this.img_url = img_url;
    }

    //Metodo para obtener el texto del Life Hack
    public String getTxtLifeHack(){
        return txtLifeHack;
    }

    //Metodo para obtener el link de la imagen del Life Hack
    public String getImg_url(){
        return img_url;
    }
}
