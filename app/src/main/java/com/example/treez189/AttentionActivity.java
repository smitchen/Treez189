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
    boolean displayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attention);

        final Button back_btn = findViewById(R.id.act_to_main);
        back_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(AttentionActivity.this, "Going back to main menu...",
                        Toast.LENGTH_SHORT).show();
                //launch main activity
                startActivity(new Intent(AttentionActivity.this, MainActivity.class));
            }
        });

        /***temp code to demonstrate the hiding and showing of an image***/
        final ImageView baby_groot = findViewById(R.id.babgroot_id);
        final Button show = findViewById(R.id.show_id);
        show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                //launch main activity
                if (displayed == false) {
                    displayed = true;
                    Toast.makeText(AttentionActivity.this, "I am Groot!",
                            Toast.LENGTH_SHORT).show();
                    baby_groot.setVisibility(View.VISIBLE);
                }
                if(displayed == true) {
                    displayed = false;
                    Toast.makeText(AttentionActivity.this, "Goodbye Groot!",
                            Toast.LENGTH_SHORT).show();
                    baby_groot.setVisibility(View.INVISIBLE);
                }
            }
        });
        /***temp code to demonstrate the hiding and showing of an image***/
    }

    public void showTree(int stage){
        // show the tree
    }
}
