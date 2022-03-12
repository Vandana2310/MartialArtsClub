package com.example.martialartsclub;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;

import com.example.martialartsclub.Model.MartialArt;

public class MartialArtButton extends AppCompatCheckBox {

    private MartialArt martialArtObject;

    public MartialArtButton(@NonNull Context context,MartialArt martialArt) {
        super(context);

        martialArtObject= martialArt;
    }

    public String getMartialArtColor() {
        return martialArtObject.getMartialArtColor();
    }

    public  double getMartialArtPrice(){
        return  martialArtObject.getMartialArtPrice();
    }
}
