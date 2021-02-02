package com.example.hughdavidson_quizapp;
//Reference for comparing strings: https://stackoverflow.com/questions/16143562/string-comparison-android/16143606#:~:text=The%20%3D%3D%20operator%20checks%20to,to%20compare%20strings%20for%20equality.
// References for working with CheckTextViews: https://youtu.be/2e2_EFunFK8 , https://youtu.be/y0zrf1N_VIk

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckedTextView q3_i, q3_ii, q3_iii, q3_iv, q3_v;
    int userScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Q3 CheckTextViews
        q3_i = (CheckedTextView) findViewById(R.id.q3_i) ;
        q3_i.setOnClickListener(view -> q3_i.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24));
        q3_ii = (CheckedTextView) findViewById(R.id.q3_ii) ;
        q3_ii.setOnClickListener(view -> q3_ii.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24));
        q3_iii = (CheckedTextView) findViewById(R.id.q3_iii) ;
        q3_iii.setOnClickListener(view -> q3_iii.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24));
        q3_iv = (CheckedTextView) findViewById(R.id.q3_iv) ;
        q3_iv.setOnClickListener(view -> q3_iv.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24));
        q3_v = (CheckedTextView) findViewById(R.id.q3_v) ;
        q3_v.setOnClickListener(view -> q3_v.setCheckMarkDrawable(R.drawable.ic_baseline_check_box_24));


        //      * Hide all red and green check boxes

/*        ImageView q1ImageView = (ImageView) findViewById(R.id.q1_redcross_image_view);
        q1ImageView.setVisibility(View.INVISIBLE);
        ImageView q2ImageView = (ImageView) findViewById(R.id.q2_redgreencheck_image_view);
        q2ImageView.setVisibility(View.INVISIBLE);
        ImageView q3_i_ImageView = (ImageView) findViewById(R.id.q3_i_greencheck_image_view);
        q3_i_ImageView.setVisibility(View.INVISIBLE);
        ImageView q3_ii_ImageView = (ImageView) findViewById(R.id.q3_ii_greencheck_image_view);
        q3_ii_ImageView.setVisibility(View.INVISIBLE);
        ImageView q3_iii_ImageView = (ImageView) findViewById(R.id.q3_iii_greencheck_image_view);
        q3_iii_ImageView.setVisibility(View.INVISIBLE);
        ImageView q3_iv_ImageView = (ImageView) findViewById(R.id.q3_iv_greencheck_image_view);
        q3_iv_ImageView.setVisibility(View.INVISIBLE);
        ImageView q3_v_ImageView = (ImageView) findViewById(R.id.q3_v_greencheck_image_view);
        q3_v_ImageView.setVisibility(View.INVISIBLE);*/
/*        ImageView q4_i_ImageView = (ImageView) findViewById(R.id.q4_i_greencheck_image_view);
        q4_i_ImageView.setVisibility(View.GONE);
        ImageView q4_ii_ImageView = (ImageView) findViewById(R.id.q4_ii_greencheck_image_view);
        q4_ii_ImageView.setVisibility(View.INVISIBLE);
        ImageView q4_iii_ImageView = (ImageView) findViewById(R.id.q4_iii_greencheck_image_view);
        q4_iii_ImageView.setVisibility(View.INVISIBLE);
        ImageView q4_iv_ImageView = (ImageView) findViewById(R.id.q4_iv_greencheck_image_view);
        q4_iv_ImageView.setVisibility(View.INVISIBLE);*/


    }
    //Show users total score
    public void showScore(View view){
        //Check score for question 1
        RadioGroup  q1 = (RadioGroup) findViewById(R.id.q1_radio_buttons);
        switch (q1.getCheckedRadioButtonId()){
            case R.id.q1_radioButton_false:
                userScore = userScore + 0;
                break;
            case R.id.q1_radioButton_true:
                userScore = userScore + 1;
                break;
        }
        //Check score for question 2
        TextView q2 = (TextView) findViewById(R.id.q2_editText);
        int q2Answer = Integer.parseInt(q2.getText().toString());

        if (q2Answer ==  100000){
            userScore = userScore + 1;
        }
        else return;

        //check score for question 3
//        q3Score();

//  Toast message to user with score
        Context context = getApplicationContext();
        CharSequence text = "You scored: " + userScore + " out of 11";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void q3Score(View view){
        if(q3_i.isChecked()){
            userScore += +1;
        }
        if(q3_ii.isChecked()){
            userScore += +1;
        }
        if(q3_iv.isChecked()){
            userScore += +1;
        }
        if(q3_v.isChecked()){
            userScore += +1;
        }
        return;
    }


    // reset answers clear all redgreen check boxes and user input views
    public void resetAnswers(View view){
        userScore = 0;
    }



}