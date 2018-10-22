package com.example.david.praktikum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.NameTag);
        NumberPicker np  = (NumberPicker) findViewById(R.id.np);

        np.setMinValue(2);
        np.setMaxValue(20);
        np.setOnValueChangedListener(onValueChangeListener);
    }


    NumberPicker.OnValueChangeListener onValueChangeListener = new NumberPicker.OnValueChangeListener(){
        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int i1){
            Toast.makeText(MainActivity.this, "selected number"+ numberPicker.getValue(), Toast.LENGTH_SHORT);
            TextView tv = (TextView) findViewById(R.id.NameTag);
            tv.setTextSize(numberPicker.getValue());
        }
    };

    public void visibleButtonClicked(View view){
        TextView textView = (TextView) findViewById(R.id.NameTag);
        if (textView.getVisibility() == View.VISIBLE){
            textView.setVisibility(View.INVISIBLE);
        }
        else{
            textView.setVisibility(View.VISIBLE);
        }
        ;}


}

