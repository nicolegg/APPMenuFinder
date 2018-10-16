package pe.edu.upeu.appmenufinder;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {
    private TextView titulo;
    private CardView ingres,regis;
    private Typeface Andora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        String fuente1 = "fuentes/Andora.ttf";
        this.Andora = Typeface.createFromAsset(getAssets(),fuente1);

        titulo =(TextView) findViewById(R.id.tvtitulo);
        titulo.setTypeface(Andora);
        titulo.setTextColor(Color.parseColor("#F6F6F6"));

        ingres = (CardView) findViewById(R.id.btningresar);
        regis =(CardView) findViewById(R.id.btnRegistrar);

        ingres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ingres = new Intent(InicioActivity.this,LoginActivity.class);
                startActivity(ingres);
            }
        });
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registra = new Intent(InicioActivity.this,RegistarseActivity.class);
                startActivity(registra);
            }
        });



    }

}
