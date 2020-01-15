package com.example.calctruco;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnRespOnClick(View view){

        CheckBox pt1_1 = findViewById(R.id.Ponto1_1);

        pt1_1.addTouchables(11);
        pt1_1.setVisibility(View.VISIBLE);

    }


}



