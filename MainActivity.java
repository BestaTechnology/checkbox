package com.example.lenovo.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CheckBox java, opps, python;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java =(CheckBox)findViewById(R.id.java);

        opps =(CheckBox)findViewById(R.id.opps);

        python =(CheckBox)findViewById(R.id.python);


        button = (Button)findViewById(R.id.button);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())

                Toast.makeText(getApplicationContext(),"Java is selected",Toast.LENGTH_SHORT).show();

            }
        });


        opps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())

                    Toast.makeText(getApplicationContext(),"oops is selected",Toast.LENGTH_SHORT).show();

            }
        });

        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked())

                    Toast.makeText(getApplicationContext(),"python is selected",Toast.LENGTH_SHORT).show();

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               StringBuffer result = new StringBuffer();
               result.append("java is selected").append(java.isChecked());
               result.append("\n opps is selected").append(opps.isChecked());
               result.append("\n Python is selected").append(python.isChecked());

               Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
