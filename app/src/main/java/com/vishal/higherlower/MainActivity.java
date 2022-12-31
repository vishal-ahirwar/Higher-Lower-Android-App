package com.vishal.higherlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public void btnEnterOnClick(View view)
    {
        EditText input=findViewById(R.id.editTextNumberSigned);
        int i_input=Integer.parseInt(input.getText().toString());
        if(i_input<number)
        {
            Toast.makeText(this, "Too Low", Toast.LENGTH_SHORT).show();
        }else if (i_input>number)
        {
            Toast.makeText(this, "Too High", Toast.LENGTH_SHORT).show();
        }else
        {
            Toast.makeText(this, "Yeah! You Guess it Right", Toast.LENGTH_SHORT).show();
            Random random = new Random();
            number=random.nextInt(100);

            TextView textView=findViewById(R.id.score);
            score+=5;
            textView.setText(Integer.toString(score));
        };

    };

    static int number=100;
    static int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        number=random.nextInt(100);
    };
}