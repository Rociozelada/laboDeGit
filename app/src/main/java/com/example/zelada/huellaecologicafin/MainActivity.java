package com.example.zelada.huellaecologicafin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView tv1;
    RadioButton rd1,rd2,rd3,rd4,rd5,rd6,rd7,rd8,rd9,rd10,rd11,rd12,rd13,rd14,rd15,rd16,rd17,rd18,rd19,rd20,rd21,rd22,rd23;
    private TextView texto;
    int suma=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rd1=(RadioButton)findViewById(R.id.radioButton1);
        rd2=(RadioButton)findViewById(R.id.radioButton2);
        rd3=(RadioButton)findViewById(R.id.radioButton3);
        rd5=(RadioButton)findViewById(R.id.radioButton5);
        rd4=(RadioButton)findViewById(R.id.radioButton4);
        rd5=(RadioButton)findViewById(R.id.radioButton5);
        rd6=(RadioButton)findViewById(R.id.radioButton6);
        rd7=(RadioButton)findViewById(R.id.radioButton7);
        rd8=(RadioButton)findViewById(R.id.radioButton8);
        rd9=(RadioButton)findViewById(R.id.radioButton9);
        rd10=(RadioButton)findViewById(R.id.radioButton10);
        rd11=(RadioButton)findViewById(R.id.radioButton11);
        rd12=(RadioButton)findViewById(R.id.radioButton12);
        rd13=(RadioButton)findViewById(R.id.radioButton13);
        rd14=(RadioButton)findViewById(R.id.radioButton14);
        rd15=(RadioButton)findViewById(R.id.radioButton15);
        rd16=(RadioButton)findViewById(R.id.radioButton16);
        rd17=(RadioButton)findViewById(R.id.radioButton17);
        rd18=(RadioButton)findViewById(R.id.radioButton18);
        rd19=(RadioButton)findViewById(R.id.radioButton19);
        rd20=(RadioButton)findViewById(R.id.radioButton20);
        rd21=(RadioButton)findViewById(R.id.radioButton21);
        rd22=(RadioButton)findViewById(R.id.radioButton22);
        rd23=(RadioButton)findViewById(R.id.radioButton23);

        tv1= (TextView)findViewById(R.id.textViewRes);
        // asignamos el evento onclic o touch a los botones

        rd1.setOnClickListener(this);
        rd2.setOnClickListener(this);
        rd3.setOnClickListener(this);
        rd4.setOnClickListener(this);
        rd5.setOnClickListener(this);
        rd6.setOnClickListener(this);
        rd7.setOnClickListener(this);
        rd8.setOnClickListener(this);
        rd9.setOnClickListener(this);
        rd10.setOnClickListener(this);
        rd11.setOnClickListener(this);
        rd12.setOnClickListener(this);
        rd13.setOnClickListener(this);
        rd14.setOnClickListener(this);
        rd15.setOnClickListener(this);
        rd16.setOnClickListener(this);
        rd17.setOnClickListener(this);
        rd18.setOnClickListener(this);
        rd19.setOnClickListener(this);
        rd20.setOnClickListener(this);
        rd21.setOnClickListener(this);
        rd22.setOnClickListener(this);
        rd23.setOnClickListener(this);

        }


    public void onClick(View view) {
        //pregunta uno
        int sum=0;
        switch (view.getId()){
            case R.id.radioButton1:
                sum=2; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton2:
                sum=10; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton3:
                sum=20; //tv1.setText("el valor es dos =" +sum);
                break;


        }

        suma=suma+sum;
        tv1.setText("el res es1 ="+suma+" sum="+sum);
        sum=0;

        //pregunta dos
        switch (view.getId()){
            case R.id.radioButton4:
                sum=150;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton5:
                sum=50; //tv1.setText("el valor es dos =" +sum);
                break;

        }

        suma=suma+sum;
        sum=0;
        tv1.setText("el res es2 ="+suma+" sum="+sum);
        //pregunta tres
        switch (view.getId()){
            case R.id.radioButton6:
                sum=5;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton7:
                sum=3; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton8:
                sum=70; //tv1.setText("el valor es dos =" +sum);
                break;

        }

        suma=suma+sum;
        tv1.setText("el res es3 ="+suma+" sum="+sum);
        sum=0;
        //pregunta cuatro
        switch (view.getId()){
            case R.id.radioButton9:
                sum=85;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton10:
                sum=100; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton11:
                sum=40; //tv1.setText("el valor es dos =" +sum);
                break;

        }

        suma=suma+sum;
        tv1.setText("el res es4 ="+suma+" sum="+sum);
        sum=0;
        //pregunta cinco
        switch (view.getId()){
            case R.id.radioButton12:
                sum=5;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton13:
                sum=45; //tv1.setText("el valor es dos =" +sum);
                break;
        }

        suma=suma+sum;
        tv1.setText("el res es5 ="+suma+" sum="+sum);
        sum=0;
        //pregunta seis
        switch (view.getId()){
            case R.id.radioButton14:
                sum=5;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton15:
                sum=40; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton16:
                sum=30; //tv1.setText("el valor es dos =" +sum);
                break;

        }

        suma=suma+sum;
        tv1.setText("el res es6 ="+suma+" sum="+sum);
        sum=0;
        //pregunta siete
        switch (view.getId()){
            case R.id.radioButton17:
                sum=70;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton18:
                sum=55; //tv1.setText("el valor es dos =" +sum);
                break;


        }
        suma=suma+sum;
        tv1.setText("el res es7 ="+suma+" sum="+sum);
        sum=0;
        //pregunta ocho
        switch (view.getId()){
            case R.id.radioButton19:
                sum=5;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton20:
                sum=15; //tv1.setText("el valor es dos =" +sum);
                break;


        }
        suma=suma+sum;
        tv1.setText("el res es8 ="+suma+" sum="+sum);
        sum=0;
        //pregunta nueve

        switch (view.getId()){
            case R.id.radioButton21:
                sum=5;// tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton22:
                sum=10; //tv1.setText("el valor es dos =" +sum);
                break;
            case R.id.radioButton23:
                sum=15; //tv1.setText("el valor es dos =" +sum);
                break;

        }
        suma=suma+sum;
        tv1.setText("el res es9 ="+suma+" sum="+sum);
    }


    public void evaluar(View v){

        if (suma<=200){
            tv1.setText("consumes lo que necesitas puntos= "+suma);
        }else{
            if(suma<=400){
                tv1.setText("consumes mas de lo necesario = "+suma+"es nesario dos planetas");
            }
            else{
                tv1.setText("Tu consumo es insostenible = "+suma+"es nesario tres planetas para cubrir tu consumo");
            }
        }


    }


}





