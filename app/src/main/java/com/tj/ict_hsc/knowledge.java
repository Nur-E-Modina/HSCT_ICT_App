package com.tj.ict_hsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class knowledge extends AppCompatActivity implements View.OnClickListener {
    private Button bt1,bt2,bt3,bt4,bt5,bt6;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);

        bt1=(Button)findViewById(R.id.but1);
        bt2=(Button)findViewById(R.id.but2);
        bt3=(Button)findViewById(R.id.but3);
        bt4=(Button)findViewById(R.id.but4);
        bt5=(Button)findViewById(R.id.but5);
        bt6=(Button)findViewById(R.id.but6);
       bt1.setOnClickListener(this);
       bt2.setOnClickListener(this);
       bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.but1)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","first");
            startActivity(intent);
        }
        if(v.getId()==R.id.but2)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","second");
            startActivity(intent);
        }
        if(v.getId()==R.id.but3)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","third");
            startActivity(intent);
        }
        if(v.getId()==R.id.but4)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","fourth");
            startActivity(intent);
        }
        if(v.getId()==R.id.but5)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","fifth");
            startActivity(intent);
        }
        if(v.getId()==R.id.but6)
        {
            intent=new Intent(knowledge.this,knowledge_details.class);
            intent.putExtra("tag","sixth");
            startActivity(intent);
        }

    }
}
