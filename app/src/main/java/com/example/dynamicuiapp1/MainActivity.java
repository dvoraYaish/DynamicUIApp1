package com.example.dynamicuiapp1;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout arrayGL = findViewById(R.id.arrGL);


        Button[][] arrayButtons=new Button[3] [3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayButtons[i][j] = new Button( this);
                arrayButtons[i][j].setLayoutParams (new LinearLayout.LayoutParams( 150, 150));
                arrayButtons[i][j].requestLayout();
                arrayButtons[i][j].setPadding ( 10, 10,  10, 10);
                arrayButtons[i][j].setText("" + i+","+j);
                arrayButtons[i][j].setId(i*6+j);
                arrayGL.addView(arrayButtons [i][j]);
            }
        }
    }
}

