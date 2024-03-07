package com.example.translatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<WordModal>familyMembers;

    public CustomAdapter(Context context, ArrayList<WordModal> familyMembers) {
        this.context = context;
        this.familyMembers = familyMembers;
    }

    @Override
    public int getCount() {
        return familyMembers.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.list_items,viewGroup,false);
        ImageView image = view.findViewById(R.id.image);
        TextView english = view.findViewById(R.id.englishWord);
        TextView kikuyu = view.findViewById(R.id.kikuyuWord);

        english.setText(familyMembers.get(i).getEnglishWord());
        kikuyu.setText(familyMembers.get(i).getKikuyuWord());
        image.setImageResource(familyMembers.get(i).getImage());

        return view;
    }
}
