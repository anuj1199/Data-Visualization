package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class linearsearch extends AppCompatActivity {
    TextView t1,t2;
    EditText et1;
    Button b1;
    String[] intarray = new String[]{
            "10", "14", "19", "26", "27", "31", "33", "35", "42", "44" };
    boolean Check;
    int i = 0;
    String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearsearch);
        t1 = (TextView)findViewById(R.id.textView3);
        b1=findViewById(R.id.button);
        t2 = (TextView)findViewById(R.id.textView5);
        et1=(EditText)findViewById(R.id.et1);
        while( i <intarray.length)
        {
            t1.setText(t1.getText() + " " + intarray[i] + " , ");
            i++;
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                key=et1.getText().toString();
                Check = Arrays.asList(intarray).contains(key);

                if(Check == true){
                    t2.setText("Element Found At Location "+ i);
                }
                else {
                    t2.setText("Not Found");
                }
            }
        });
    }
}


