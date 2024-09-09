package com.example.calci;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    TextView tv1;
    EditText n1,n2;
    Button add,sub,mul,div;
    int no =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv1);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                no = no1+no2;
                tv1.setText(Integer.toString(no));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                no = no1-no2;
                tv1.setText(Integer.toString(no));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                no = no1*no2;
                tv1.setText(Integer.toString(no));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int no1 = Integer.parseInt(n1.getText().toString());
                int no2 = Integer.parseInt(n2.getText().toString());
                if (no1 < no2) {
                    tv1.setText(Integer.toString(000));
                }
                else {
                    no = no1/no2;
                    tv1.setText(Integer.toString(no));
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}