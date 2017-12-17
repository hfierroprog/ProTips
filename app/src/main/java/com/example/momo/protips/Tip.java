package com.example.momo.protips;

import com.google.gson.annotations.SerializedName;

public class Tip {
    @SerializedName("TXT_TIP")
    private String TXT_TIP;
    @SerializedName("IMG_TIP")
    private String IMG_TIP;

    public Tip(String TXT_TIP,String IMG_TIP){
        this.TXT_TIP = TXT_TIP;
        this.IMG_TIP = IMG_TIP;
    }

    public String getTxt_tip() {
        return TXT_TIP;
    }

    public String getImg_tip() {
        return IMG_TIP;
    }
}
