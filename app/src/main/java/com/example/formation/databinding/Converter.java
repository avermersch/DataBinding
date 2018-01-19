package com.example.formation.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Formation on 19/01/2018.
 */

public class Converter extends BaseObservable{

    private String euro;
    private String yen;

    public Converter() {
    }

    public Converter(String euro) {
        this.euro = euro;
        this.yen = String.valueOf(Double.parseDouble(this.euro)*135.869324);
    }

    @Bindable
    public String getEuro() {
        return euro;
    }

    public Converter setEuro(String euro) {
        this.euro = euro;

        this.yen = String.valueOf(Double.parseDouble(this.euro)*135.869324);

        notifyPropertyChanged(BR.euro);
        notifyPropertyChanged(BR.yen);
        return this;
    }

    @Bindable
    public String getYen() {
        return yen;
    }

    public Converter setYen(String yen) {
        this.yen = yen;
        notifyPropertyChanged(BR.yen);
        return this;
    }
}
