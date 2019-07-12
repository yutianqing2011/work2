package com.example.homeword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class work2 extends AppCompatActivity {
    int getViewCount(View view){
        int num,total=0;
        if(view instanceof ViewGroup){
            view=(ViewGroup)view;
            int childnum=((ViewGroup) view).getChildCount();
            for(int i=0;i<childnum;i++){
                total=total+getViewCount(((ViewGroup) view).getChildAt(i));
            }
            return total;
        }
        else {
            return 1;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work2);

        View inflate= LayoutInflater.from(this).inflate(R.layout.activity_main,null);
        int num=getViewCount(inflate);
        TextView textView=findViewById(R.id.textView);
        textView.setText("我们计算的长度为："+num);
    }
}
