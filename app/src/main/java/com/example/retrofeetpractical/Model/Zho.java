
package com.example.retrofeetpractical.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Zho {

    @SerializedName("official")
    @Expose
    private String official;
    @SerializedName("common")
    @Expose
    private String common;

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

}
