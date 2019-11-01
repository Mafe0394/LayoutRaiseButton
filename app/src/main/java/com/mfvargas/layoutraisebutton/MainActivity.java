package com.mfvargas.layoutraisebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        agregarFAB();
    }

    public void agregarFAB(){
        FloatingActionButton miFAB =findViewById(R.id.miFAB);
        miFAB.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //Toast.makeText(this,getResources().getString(R.string.app_name),Toast.LENGTH_SHORT).show();
        Snackbar.make(v,
                getResources().getString(R.string.app_name),
                Snackbar.LENGTH_SHORT)
                .setAction(R.string.texto_accion, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getBaseContext(), getResources().getString(R.string.app_name),Toast.LENGTH_SHORT).show();
                        Log.d("Gato","Azul");
                    }
                })
                .setActionTextColor(getResources().getColor(R.color.colorPrimaryDark))
                .show();
    }
}
