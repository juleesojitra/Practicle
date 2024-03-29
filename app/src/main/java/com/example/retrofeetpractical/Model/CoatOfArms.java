
package com.example.retrofeetpractical.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CoatOfArms {

    @SerializedName("png")
    @Expose
    private String png;
    @SerializedName("svg")
    @Expose
    private String svg;

    public String getPng() {
        return png;
    }

    public void setPng(String png) {
        this.png = png;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

}
