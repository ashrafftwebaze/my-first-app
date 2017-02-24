package com.twebzee.ashraff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nm =(EditText)findViewById(R.id.name);
        final EditText ad =(EditText)findViewById(R.id.add);
        final TextView out =(TextView)findViewById(R.id.seeout);
        Button press = (Button)findViewById(R.id.button);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =nm.getText().toString();
                String lstname = ad.getText().toString();
                String capture ="You are "+name+" "+"lastname:"+lstname;
                out.setText(capture);
            }
        });

    }
}
