package com.example.treez189;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button attention_btn = findViewById(R.id.attention_id);
        attention_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The more focused you are, the " +
                                "healthier your tree will be!",
                        Toast.LENGTH_SHORT).show();
                //launch attention activity
                startActivity(new Intent(MainActivity.this, AttentionActivity.class));
            }
        });

        final Button meditation_btn = findViewById(R.id.meditation_id);
        meditation_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "The more relaxed you are, the " +
                                "healthier your tree will be!",
                        Toast.LENGTH_SHORT).show();
                //launch meditation activity
                startActivity(new Intent(MainActivity.this, MeditationActivity.class));
            }
        });
    }

    /* This function must be accessible from other activities (Attention, Meditation)
     * Should acquire the data from the Neurosky to be manipulated by each activity as needed.
     *
     */
    public void getNeuroskyData(){
        // get the data via bluetooth
    }
}
