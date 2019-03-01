package com.example.treez189;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// FUNCTION HEADER TEMPLATE
/*  Name:
 *  Input:
 *  Description:
 *  Returns:
 */

public class MainActivity extends AppCompatActivity {

    public int dummy_data;

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

    /*  Name:           getNeuroData
     *  Input:          n/a - temporarily
     *  Description:    This function will communicate with the Neurosky headset to acquire the data
     *                  in real time that it is processing. It will process the data and categorize
     *                  it into one of four categories --> a number 0 to 3 to denote which groot
     *                  age should be displayed.
     *  Returns:        An int value that denotes which groot age should be displayed.
     */
    public int getNeuroData(){
        // get the data via bluetooth
        if(this.dummy_data == 0)
            this.dummy_data = 1;
        else if(this.dummy_data == 1)
            this.dummy_data = 2;
        else if(this.dummy_data == 2)
            this.dummy_data = 3;
        else if(this.dummy_data == 3)
            this.dummy_data = 0;

        return this.dummy_data;
    }
}
