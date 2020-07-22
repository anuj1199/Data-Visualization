package com.example.project;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class selectionsort extends AppCompatActivity {
    TextView t1, t2;
    Button b1;
    String[] intarray = new String[]{
            "99,", "44,", "38,", "47,","50,","48," ,"1,","26,","27,","2",};
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectionsort);
        b1 =  findViewById(R.id.button);
        t1 =  findViewById(R.id.editText);
        t2 =  findViewById(R.id.textView6);
        while (i < intarray.length) {
            t1.setText(t1.getText() + " " + intarray[i] + " ");
            i++;
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                String myString = t1.getText().toString();
                String myStringList[] = myString.split(",");
                String mySortedString[] = myStringList.clone();
                int i, j, k;

                try {
                    for(i=1; i < myStringList.length; i++){
                        for (j=0;j<i;j++){
                            if(myStringList[i].compareTo(mySortedString[j]) < 0){
                                break;
                            }
                        }
                        if(j==i){
                            mySortedString[j] = myStringList[i];
                        } else {
                            for(k = i; k > j ; k-- ){
                                mySortedString[k] = mySortedString[k-1];
                            }
                            mySortedString[j] = myStringList[i];
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }

                t2.setText(String.join(" ", mySortedString));
            }
        });
    }}

