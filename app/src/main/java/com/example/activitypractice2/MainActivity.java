package com.example.activitypractice2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void SendMobileName(View view)
    {
        //press the A button  that recieve  BMW s1000RR
        String mobile;
        if(view.getId()==R.id.buttonA)
        {
            mobile="BNW S1000R";
        }
        else {
            mobile="AUDI R8";
        }
        Intent intent=new Intent(this,MobileActiviy.class);
        Bundle bundle=new Bundle();
        bundle.putString("mobile",mobile);
        //use intent to bring data to another activity
        intent.putExtras(bundle);
        startActivity(intent);




    }


}