package com.example.domekwgrach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private TextView TVLikes;
    int count = 0;
    String text = " Polubień";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TVLikes = findViewById(R.id.TVLikes);
        Button buttonLike = findViewById(R.id.buttonLike);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonLike.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ++count;
                TVLikes.setText(count + text);
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(count > 0){
                    --count;
                    TVLikes.setText(count + text);
                }
            }
        });
    }

}