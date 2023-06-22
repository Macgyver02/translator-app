package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
WordModal wordModal;
    ArrayList<WordModal>tenNumbers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        wordModal=new WordModal();
        tenNumbers=new ArrayList();
    }

    public void family(){
        tenNumbers.add(new WordModal("Zero","Kibugu",R.drawable.zero));
        tenNumbers.add(new WordModal("One","Imwe",R.drawable.one));
        tenNumbers.add(new WordModal("Two","Igiiri",R.drawable.two));
        tenNumbers.add(new WordModal("Three","Ithatu",R.drawable.three));
        tenNumbers.add(new WordModal("Four","Inya",R.drawable.four));
        tenNumbers.add(new WordModal("Five","Ithano",R.drawable.five));
        tenNumbers.add(new WordModal("Six","Ithathatu",R.drawable.six));
        tenNumbers.add(new WordModal("Seven","Mugwanja",R.drawable.seven));
        tenNumbers.add(new WordModal("Eight","Inyanya",R.drawable.eight));
        tenNumbers.add(new WordModal("Nine","Kenda",R.drawable.nine));
        // familyMembers.add(new WordModal("Siblings","Baba",R.drawable.papa));
    }

}