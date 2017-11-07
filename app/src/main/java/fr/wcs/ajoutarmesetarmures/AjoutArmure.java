package fr.wcs.ajoutarmesetarmures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AjoutArmure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_armure);

        Button buttonAjout=findViewById(R.id.buttonAjout);
        buttonAjout.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                EditText editNom=findViewById(R.id.editNom);
                String nom=editNom.getText().toString();

                EditText editBonusArmure=findViewById(R.id.editBonusArmure);
                int bonusArmor=Integer.parseInt(editBonusArmure.getText().toString());

                EditText editMaxDex=findViewById(R.id.editMaxDex);
                int maxDex=Integer.parseInt(editMaxDex.getText().toString());

                Armure armure=new Armure(nom,bonusArmor,maxDex);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference armuresRef = database.getReference("Armures");

                armuresRef.push().setValue(armure);
            }
        });
    }
}
