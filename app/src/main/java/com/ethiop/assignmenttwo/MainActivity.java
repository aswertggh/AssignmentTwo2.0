package com.ethiop.assignmenttwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView countView;
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For return saved state

        if(savedInstanceState!= null) {

            temp = savedInstanceState.getInt("count");
            countView = (TextView) findViewById(R.id.countView);
            countView.setText(String.valueOf(temp));
        }
    }

    public void count(View view) {

        countView = (TextView) findViewById(R.id.countView);
        String getView = (String) countView.getText();
            temp = Integer.parseInt(getView);
            temp += 1;
            countView.setText(Integer.toString(temp));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",temp);
    }


    /*
    *
    * Another waye of state restoration
    *                |
    *                |
    *                |
    *               \|/
    *                |
     */


   /* @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        temp = savedInstanceState.getInt("count");
        Log.wtf("wtf",String.valueOf(temp));
        countView = (TextView) findViewById(R.id.countView);
        countView.setText(String.valueOf(temp));
    }*/
}