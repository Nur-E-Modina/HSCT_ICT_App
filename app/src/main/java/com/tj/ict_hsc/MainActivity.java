package com.tj.ict_hsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private long backPressedTime;
private Toast backToast;
    private Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent1=new Intent(MainActivity.this,Tutorial.class);
        intent1.putExtra("tag","Tutorial");
        startActivity(intent1);
    }
});
button2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent2=new Intent(MainActivity.this,MCQ.class);
        intent2.putExtra("tag","Tutorial");
        startActivity(intent2);
    }
});
button3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent3=new Intent(MainActivity.this,Quiz.class);
        intent3.putExtra("tag","Tutorial");
        startActivity(intent3);
    }
});
button4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent myIntent=new Intent(Intent.ACTION_SEND);
        myIntent.setType("Text/plain");
        String shareBody="This is very useful app .You Can Try this APP https";
        String shareSub="ICT_HSC app";
        myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        startActivity(Intent.createChooser(myIntent,"Share Using"));
    }
});
button5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent5=new Intent(MainActivity.this,About.class);
        intent5.putExtra("tag5","This app helps you to develop your ICT skill and you can get an idea about question pattern \n\n\n Developed by,\n Nur-E-Modina Jhorna\n Bsc(Eng.)in CSE from HSTU.\n Msc in CSE from JU.\n\n Mobile No:01767014488\n" +
                "Email Id: jhorna12.hstu@gmail.com\n ");
        startActivity(intent5);
    }
});
    }

    public void onBackPressed()
    {

        if(backPressedTime+2000>System.currentTimeMillis())
        {
            backToast.cancel();
            super.onBackPressed();
        return;
        }
        else {
           backToast= Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT);
           backToast.show();
        }
        backPressedTime=System.currentTimeMillis();
    }

}
