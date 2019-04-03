package com.tj.ict_hsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MCQ_Details extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcq__details);
        textView=(TextView)findViewById(R.id.textdetails);
        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String knowledge=bundle.getString("tag1");
            showDetails(knowledge);
        }
    }
    void showDetails(String knowledge)
    {
        if (knowledge.equals("kf"))
        {
            textView.setText(R.string.first_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ১ম অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();

        }
        if (knowledge.equals("ks"))
        {
            textView.setText(R.string.second_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ২য় অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (knowledge.equals("kt"))
        {
            textView.setText(R.string.third_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ৩য় অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (knowledge.equals("kfo"))
        {
            textView.setText(R.string.fourth_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ৪র্থ অধ্যায়টি  পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (knowledge.equals("kfi"))
        {
            textView.setText(R.string.fifth_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ৫ম অধ্যায়টি  পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (knowledge.equals("ksi"))
        {
            textView.setText(R.string.sixth_knowledge);
            Toast.makeText(MCQ_Details.this,"আপনি এখন ৬ষ্ঠ অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
    }
}
