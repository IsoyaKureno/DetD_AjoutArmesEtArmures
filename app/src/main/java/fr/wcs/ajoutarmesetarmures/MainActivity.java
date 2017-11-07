package fr.wcs.ajoutarmesetarmures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonArme=findViewById(R.id.buttonArme);
        Button buttonArmure=findViewById(R.id.buttonArmure);
        buttonArme.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent toAjoutArme=new Intent(MainActivity.this,AjoutArme.class);
                startActivity(toAjoutArme);
            }
        });
        buttonArmure.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent toAjoutArmure=new Intent(MainActivity.this,AjoutArmure.class);
                startActivity(toAjoutArmure);
            }
        });
    }
}
