package com.example.treez189;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AttentionActivity extends AppCompatActivity {

    MainActivity user = new MainActivity();
    // boolean displayed = false;
    final ImageView potted_groot = findViewById(R.id.pottedgroot_id);
    final ImageView baby_groot = findViewById(R.id.babgroot_id);
    final ImageView teen_groot = findViewById(R.id.teengroot_id);
    final ImageView adult_groot = findViewById(R.id.adultgroot_id);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);

        user.dummy_data = 0;

        final Button back_btn = findViewById(R.id.act_to_main);
        back_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(AttentionActivity.this, "Going back to main menu...",
                        Toast.LENGTH_SHORT).show();
                //launch main activity
                startActivity(new Intent(AttentionActivity.this, MainActivity.class));
            }
        });

        /***temp code to use dummy data***/
        final Button show = findViewById(R.id.dummy_data_id);
        show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                // getNeuroData will increase user's dummy_data value and return it
                int my_data = user.getNeuroData();
                // showTree takes that return value as input and hides and displays groots properly
                showTree(my_data);
            }
        });
        /***temp code to demonstrate the hiding and showing of an image***/
    }

    /*  Name:           showTree
     *  Input:          int stage - an int value representing which groot should be shown
     *                              0 = potted groot
     *                              1 = baby groot
     *                              2 = teen groot
     *                              3 = adult groot
     *  Description:    this function will display the proper groot on the attention activity screen
     *  Returns:        void
     */
    public void showTree(int stage){

        if (stage == 0) {
            Toast.makeText(AttentionActivity.this, "I am (potted) Groot!",
                    Toast.LENGTH_SHORT).show();
            adult_groot.setVisibility(View.INVISIBLE);
            potted_groot.setVisibility(View.VISIBLE);
        }
        if (stage == 1) {
            Toast.makeText(AttentionActivity.this, "I am (baby) Groot!",
                    Toast.LENGTH_SHORT).show();
            potted_groot.setVisibility(View.INVISIBLE);
            baby_groot.setVisibility(View.VISIBLE);
        }
        if (stage == 2) {
            Toast.makeText(AttentionActivity.this, "I am (teenage) Groot!",
                    Toast.LENGTH_SHORT).show();
            baby_groot.setVisibility(View.INVISIBLE);
            teen_groot.setVisibility(View.VISIBLE);
        }
        if (stage == 3) {
            Toast.makeText(AttentionActivity.this, "I am (adult) Groot!",
                    Toast.LENGTH_SHORT).show();
            teen_groot.setVisibility(View.INVISIBLE);
            adult_groot.setVisibility(View.VISIBLE);
        }
    }
}
