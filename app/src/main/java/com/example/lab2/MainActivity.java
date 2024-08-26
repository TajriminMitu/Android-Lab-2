package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CricketExpert expert = new CricketExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSeekMenu(View view) {
        Spinner MealSpinner = (Spinner) findViewById(R.id.MealSpinner);
        String SelectedMeal = String.valueOf(MealSpinner.getSelectedItem());

        List<String> menuList = expert.getMenu(SelectedMeal);

        StringBuilder menuFormatted = new StringBuilder();
        for (String menu : menuList) {
            menuFormatted.append(menu).append('\n');
        }

        TextView MenuTextView = (TextView) findViewById(R.id.MenuTextView);
        MenuTextView.setText(menuFormatted);
    }
}