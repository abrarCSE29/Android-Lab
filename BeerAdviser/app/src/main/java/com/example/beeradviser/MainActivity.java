package com.example.beeradviser;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void show(View view) {
        Spinner MealSpinner = (Spinner) findViewById(R.id.MealSpinner);
        String SelectedMeal = String.valueOf(MealSpinner.getSelectedItem());
        TextView MenuTextView = (TextView) findViewById(R.id.MenuTextView);
        FoodExpert f = new FoodExpert();
        List<String> MealList = f.getMenu(SelectedMeal);

        StringBuilder menuFormatted = new StringBuilder();
        for(String menu : MealList){
            menuFormatted.append(menu).append("\n");
        }
        MenuTextView.setText(menuFormatted);

    }
}