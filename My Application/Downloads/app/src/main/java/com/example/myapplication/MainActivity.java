package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText NumeroN;
    private TextView tvResult;
    private Button btCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumeroN = findViewById(R.id.NumeroN);
        tvResult = findViewById(R.id.tvResult);
        btCalcular = findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(op -> calc());
    }

        public void calc() {
            int Valor = Integer.parseInt(NumeroN.getText().toString());
            int H=0;
            if (Valor < 1 || Valor > 20)
            {
                tvResult.setText("Invalido, tente novamente");
            } else
            {
                for (int a=1; a<=Valor; a++) {
                    if (a % 2 == 0)
                    {
                        H = H + (a * 2);
                    }
                    else
                    {
                        H = H + (a);
                    }
                }
                tvResult.setText(String.valueOf(H));
            }

        }
}