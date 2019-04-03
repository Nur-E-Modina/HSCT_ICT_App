package com.tj.ict_hsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class knowledge_details extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge_details);
        textView=(TextView)findViewById(R.id.textknowledge);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null) {
            String details = bundle.getString("tag");
            showDetails(details);
        }
    }
    void showDetails(String details)
    {
        if (details.equals("first"))
        {
            textView.setText(R.string.first_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন ১ম অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (details.equals("second"))
        {
            textView.setText(R.string.second_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন ২য় অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (details.equals("third"))
        {
            textView.setText(R.string.third_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন ৩য় অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (details.equals("fourth"))
        {
            textView.setText(R.string.fourth_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন ৪র্থ অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (details.equals("fifth"))
        {
            textView.setText(R.string.fifth_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন ৫ম অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }
        if (details.equals("sixth"))
        {
            textView.setText(R.string.sixth_mcq);
            Toast.makeText(knowledge_details.this,"আপনি এখন  ৬ষ্ঠ অধ্যায়টি পড়ছেন", Toast.LENGTH_LONG).show();
        }


    }

}
