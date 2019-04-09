package com.example.mysnakesladders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int [] myDice = {

      R.drawable.one,
      R.drawable.two,
      R.drawable.three,
      R.drawable.four,
      R.drawable.five,
      R.drawable.six

    };

    public void buttonTapped (View view){

        Button button = findViewById(R.id.button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.bounce);

        // Use bounce interpolator with amplitude 0.2 and frequency 20
        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        myAnim.setInterpolator(interpolator);

        button.startAnimation(myAnim);

        Random ran = new Random();
        int randomRan = ran.nextInt(6);


        ImageView dice = findViewById(R.id.imageView);
        dice.setImageResource(myDice[randomRan]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

















