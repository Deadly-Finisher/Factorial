package com.example.calculating_factorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculating_factorial.R;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView1, textView2;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById((R.id.button));
        editText=findViewById(R.id.editTextNumber);
        textView1=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        Toast.makeText(this, " Thanks for using the application ", Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=Integer.parseInt(editText.getText().toString());
                long fac=1;
                for(int i=1;i<=a;i++)
                {
                    fac=fac*i;
                }
                textView1.setText("Factorial = "+fac);
            }
        });
    }

}