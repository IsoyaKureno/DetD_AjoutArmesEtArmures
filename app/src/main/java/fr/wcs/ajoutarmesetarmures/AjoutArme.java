package fr.wcs.ajoutarmesetarmures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AjoutArme extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_arme);

        Button buttonAjout=findViewById(R.id.buttonAjout);
        buttonAjout.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {

                EditText editName=findViewById(R.id.editNom);
                String nom=editName.getText().toString();

                EditText editDegats=findViewById(R.id.editDegats);
                String degats=editDegats.getText().toString();

                EditText editLimiteCrit=findViewById(R.id.ediLimiteCrit);
                int limCrit=Integer.parseInt(editLimiteCrit.getText().toString());

                EditText editMultiCrit=findViewById(R.id.editMultiCrit);
                int multiCrit=Integer.parseInt(editMultiCrit.getText().toString());

                Spinner spinnerTypeDommage=findViewById(R.id.spinnerTypeDommage);
                String typeDommage=spinnerTypeDommage.getSelectedItem().toString();

                Arme arme=new Arme(nom,degats,limCrit,multiCrit,typeDommage);

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference armesRef = database.getReference("Armes");

                armesRef.push().setValue(arme);
            }
        });
    }
}
