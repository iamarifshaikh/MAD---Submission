package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rotate(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().rotationBy(45).setDuration(2000);
    }

    public void translate(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().translationXBy(50).setDuration(20);
    }
    public void scale(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().scaleX(2).setDuration(20);
    }
    public void disapp(View view)
    {
        TextView txt=(TextView)  findViewById(R.id.animtxt);
        txt.animate().alpha(0).setDuration(1000);
}

}