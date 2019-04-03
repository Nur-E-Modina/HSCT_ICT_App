package com.tj.ict_hsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends AppCompatActivity {
private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView=(TextView)findViewById(R.id.textid1);


        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String question=bundle.getString("name");
            showDetails(question);
        }

    }
    void showDetails(String question)
    {
        if(question.equals("qp"))
        {
            textView.setText(R.string.qp_details);
        }

        }

    }

