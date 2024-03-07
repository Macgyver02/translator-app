package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Family extends AppCompatActivity {

    WordModal wordModal;
    ArrayList<WordModal> familyMembers;

    ListView familyListView;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        wordModal=new WordModal();
        familyMembers=new ArrayList();
        familyListView = findViewById(R.id.familyListView);
        family();
        customAdapter=new CustomAdapter(getApplicationContext(),familyMembers);

        familyListView.setAdapter(customAdapter);
    }

    public void family(){

        familyMembers.add(new WordModal("Father","Baba",R.drawable.papa));
        familyMembers.add(new WordModal("Mother","Mamii",R.drawable.mama));
        familyMembers.add(new WordModal("Grandfather","Guka",R.drawable.grandpapa));
        familyMembers.add(new WordModal("Grandmother","Cucu",R.drawable.grandamama));
        familyMembers.add(new WordModal("Child","Kana",R.drawable.child));
        familyMembers.add(new WordModal("Girl","Mwiritu",R.drawable.girl));

    }

}