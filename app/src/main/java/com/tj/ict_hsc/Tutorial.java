package com.tj.ict_hsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tutorial extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Tutorial.this,knowledge.class);
                intent1.putExtra("tag","Tutorial");
                startActivity(intent1);
            }
        });
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            intent=new Intent(Tutorial.this,Third.class);
            intent.putExtra("name","qp");
            startActivity(intent);
        }

    }

}
