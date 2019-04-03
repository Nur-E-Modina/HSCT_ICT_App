package com.tj.ict_hsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MCQ extends AppCompatActivity implements View.OnClickListener {
private Button button1,button2,button3,button4,button5,button6;
private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq);
        button1=(Button)findViewById(R.id.button11);
        button2=(Button)findViewById(R.id.button22);
        button3=(Button)findViewById(R.id.button33);
        button4=(Button)findViewById(R.id.button44);
        button5=(Button)findViewById(R.id.button55);
        button6=(Button)findViewById(R.id.button66);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button11)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","kf");
            startActivity(intent);
        }
        if (v.getId()==R.id.button22)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","ks");
            startActivity(intent);
        }
        if (v.getId()==R.id.button33)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","kt");
            startActivity(intent);
        }
        if (v.getId()==R.id.button44)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","kfo");
            startActivity(intent);
        }
        if (v.getId()==R.id.button55)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","kfi");
            startActivity(intent);
        }
        if (v.getId()==R.id.button66)
        {
            intent=new Intent(MCQ.this,MCQ_Details.class);
            intent.putExtra("tag1","ksi");
            startActivity(intent);
        }
    }
}
