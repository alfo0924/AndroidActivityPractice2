package com.example.activitypractice2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MobileActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mobile_activiy);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Bundle bundle=this.getIntent().getExtras();
        if(bundle !=null)
        {
            String mobile =String.format(bundle.getString("mobile"));

            //set the textName
            TextView name=(TextView) findViewById(R.id.textView);
            name.setText(mobile);

            //set the image
            ImageView img=(ImageView)findViewById(R.id.imageView);
            String filename=mobile.toLowerCase();
            int imgId=getResources().getIdentifier(filename,"drawable",getPackageName());
            Drawable drawableImg= ContextCompat.getDrawable(this,imgId);
            img.setImageDrawable(drawableImg);

        }


    }
    }
