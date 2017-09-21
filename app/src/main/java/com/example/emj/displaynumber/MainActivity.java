package com.example.emj.displaynumber;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Integer displayNumber = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundColor(Color.WHITE);
        layout.setGravity(Gravity.TOP);

        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);

        textView = new TextView(this);
        textView.setTag("NumberText");
        textView.setText(displayNumber.toString());
        layout.addView(textView);



        LinearLayout layout_b = new LinearLayout(this);
        layout_b.setBackgroundColor(Color.WHITE);
        layout_b.setGravity(Gravity.BOTTOM);

        layout_b.setOrientation(LinearLayout.HORIZONTAL);


        Button button = new Button(this);
        button.setText("Up");
        button.setTag("Button_Up");
        button.setOnClickListener(this);
        button.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        layout_b.addView(button);



        Button button2 = new Button(this);
        button2.setText("Down");
        button2.setTag("Button_Down");
        button2.setOnClickListener(this);
        button2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));

        layout_b.addView(button2);


        layout.addView(layout_b, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 1));
    }

    public void onClick(View view) {
        Log.d("Info", "Click Button:" + (String)view.getTag());
        if (view.getTag().equals("Button_Up")) {
            displayNumber++;
        } else {
            displayNumber--;
        }
        textView.setText(displayNumber.toString());
    }
}
