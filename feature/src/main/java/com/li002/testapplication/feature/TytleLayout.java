package com.li002.testapplication.feature;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.li002.testapplication.feature.R.layout.tytle;

public class TytleLayout extends LinearLayout {
        public TytleLayout(final Context context, AttributeSet attributeSet){
            super(context,attributeSet);
            LayoutInflater.from(context).inflate(R.layout.tytle,this);
            Button button_return=findViewById(R.id.tytle_back);
            Button button_option=findViewById(R.id.tytle_option);
            button_return.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    ((Activity)getContext()).finish();
                }
            });
            button_option.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast toast=new Toast(getContext());
                    toast.makeText(getContext(),"here are options",Toast.LENGTH_SHORT).show();
                }
            });
        }

}
