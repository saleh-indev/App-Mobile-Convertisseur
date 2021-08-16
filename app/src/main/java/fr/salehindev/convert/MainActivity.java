package fr.salehindev.convert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText valeur;
    RadioButton euro, dinard;
    TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valeur =this.findViewById(R.id.valeur);
        euro= this.findViewById(R.id.euro);
        dinard=this.findViewById(R.id.dinard);
        resultat=this.findViewById(R.id.resultat);
    }
    public void convertir(View v){
        double montant= Double.parseDouble(valeur.getText().toString());
        if(euro.isChecked())
            resultat.setText(montant*200+"");

        if(dinard.isChecked())
            resultat.setText(montant/200+"");
    }
    public void quitter(View v){
        finish();
    }
}