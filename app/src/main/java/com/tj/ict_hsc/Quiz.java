package com.tj.ict_hsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        textView=(TextView)findViewById(R.id.tbook);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
