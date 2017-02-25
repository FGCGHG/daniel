package com.dev.dan.dan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view){
        EditText one=(EditText)findViewById(R.id.nameInput);
        TextView tv=(TextView)findViewById(R.id.ans);

        String name=one.getText().toString();


        if(name.equals("Dan")){
            tv.setText("hey Dan you come from Kampala");
            one.setText("");
        }

        else if(name.equals("Sibo")){
            tv.setText("hey Sibo you come from kabeza");
            one.setText("");
        }
        else if(name.equals("Sissy")){
            tv.setText("hey sissy you come from kikuciro");
            one.setText("");
        }
        else if(name.equals("Yvone")){
            tv.setText("hey Yvone you come from Kanombe");
            one.setText("");
        }
        else{
            tv.setText("hey you we dont know where you come from");
            one.setText("");
        }








    }
}
