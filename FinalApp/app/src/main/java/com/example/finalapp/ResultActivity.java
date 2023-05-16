package com.example.finalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView textViewInfo, textViewMyScore, textViewHighest;
    private Button playAgainButton, QuitButton;

    int myScore;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewMyScore = findViewById(R.id.textViewMyScore);
        textViewHighest = findViewById(R.id.textViewHighest);
        textViewInfo = findViewById(R.id.textViewInfo);
        playAgainButton = findViewById(R.id.playAgainButton);
        QuitButton = findViewById(R.id.QuitButton);

        myScore = getIntent().getIntExtra("score", 0);
        textViewMyScore.setText("Your Score: "+myScore);

        sharedPreferences = this.getSharedPreferences("Score", Context.MODE_PRIVATE);
        int highestScore = sharedPreferences.getInt("highestScore", 0);

        if (myScore >= highestScore)
        {
            sharedPreferences.edit().putInt("highestScore", myScore).apply();
            textViewHighest.setText("Highest Score :"+ myScore);
            textViewInfo.setText("Congratulations! The new high score.\n");
        }
        else
        {
             textViewHighest.setText("Highest Score :"+highestScore);

             if ((highestScore - myScore) > 10)
             {
                 textViewInfo.setText("Get Faster..");
             }

            if ((highestScore - myScore) > 3 && (highestScore - myScore) <= 10)
            {
                textViewInfo.setText("Getting better");
            }

            if ((highestScore - myScore) <= 3)
            {
                textViewInfo.setText("Almost there");
            }
        }

        playAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        QuitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);

            }
        });
    }
}