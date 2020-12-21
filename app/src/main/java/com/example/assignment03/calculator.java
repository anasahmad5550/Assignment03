package com.example.assignment03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class calculator extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnmul,btnsub,btndiv,btndot,btnequal,btnclear;
    EditText result;
    Float value1,value2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        result =(EditText)findViewById(R.id.text);
        btn0 =(Button)findViewById(R.id.btn0);
        btn1 =(Button)findViewById(R.id.btn1);
        btn2 =(Button)findViewById(R.id.btn2);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4 =(Button)findViewById(R.id.btn4);
        btn5 =(Button)findViewById(R.id.btn5);
        btn6 =(Button)findViewById(R.id.btn6);
        btn7 =(Button)findViewById(R.id.btn7);
        btn8 =(Button)findViewById(R.id.btn8);
        btn9 =(Button)findViewById(R.id.btn9);
        btndot =(Button)findViewById(R.id.btndot);
        btnadd =(Button)findViewById(R.id.btnadd);
        btnsub =(Button)findViewById(R.id.btnsub);
        btnmul =(Button)findViewById(R.id.btnmul);
        btndiv =(Button)findViewById(R.id.btndiv);
        btnequal =(Button)findViewById(R.id.btnequal);
        btnclear=(Button)findViewById(R.id.btnclear);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");
            }

});
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }

        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }

        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }

        }); btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }

        }); btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }

        }); btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }

        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }

        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }

        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().length()!=0)
                {
                    value1=Float.parseFloat(result.getText()+"");
                    add=true;
                    result.setText(null);
                }

            }

        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().length()!=0)
                {
                    value1=Float.parseFloat(result.getText()+"");
                    sub=true;
                    result.setText(null);
                }

            }

        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().length()!=0)
                {
                    value1=Float.parseFloat(result.getText()+"");
                    div=true;
                    result.setText(null);
                }

            }

        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().length()!=0)
                {
                    value1=Float.parseFloat(result.getText()+"");
                    mul=true;
                    result.setText(null);
                }

            }

        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }

        });
        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || sub || mul || div)
                {
                    value2=Float.parseFloat(result.getText()+"");
                }

                if(add==true)
                {
                    result.setText(value1+value2+"");
                    add=false;
                }
                if(sub==true)
                {
                    result.setText(value1-value2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    result.setText(value1*value2+"");
                    mul=false;
                } if(div==true)
                {
                    result.setText(value1/value2+"");
                    div=false;
                }


            }

        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("");
            }

        });








    }
}