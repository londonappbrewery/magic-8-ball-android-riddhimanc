package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView img = (ImageView)findViewById(R.id.imageView);

        Button btn = (Button)findViewById(R.id.button);

        final int[] ansarry ={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Random Genrndmnum = new Random();
            int num = Genrndmnum.nextInt(5);
            Log.d("No generated","Random no is: "+num);
            img.setImageResource(ansarry[num]);
        }
    });


    }
}
