package com.tj.ict_hsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class About extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        textView=(TextView)findViewById(R.id.text1);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String value=bundle.getString("tag5");
            textView.setText(value);
            Toast.makeText(About.this,"Info About Developer",Toast.LENGTH_LONG).show();

        }
    }
}
