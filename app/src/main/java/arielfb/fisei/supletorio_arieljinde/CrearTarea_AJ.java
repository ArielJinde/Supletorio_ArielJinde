package arielfb.fisei.supletorio_arieljinde;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CrearTarea_AJ extends AppCompatActivity {

    private Spinner spinnerUsuarios;
    private DatabaseReference databaseReference;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_tarea_aj);

        databaseReference = FirebaseDatabase.getInstance().getReference();
        spinnerUsuarios = findViewById(R.id.spinnerUsuarios);

        cargarCategoria();
    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_creacion_aj,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.guardar){
            Toast.makeText(CrearTarea_AJ.this, "Opcion 1s", Toast.LENGTH_SHORT).show();
        /*    Intent intent = new Intent(HomeMainActivity_AJ.this, CrearTarea_AJ.class);
            startActivity(intent);*/
        }
        if (id == R.id.cancelar){
            Toast.makeText(CrearTarea_AJ.this, "Opcion 1s", Toast.LENGTH_SHORT).show();

        }
        if (id == R.id.cerrar_sesion){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(CrearTarea_AJ.this, MainActivity_AJ.class));

        }
            return super.onOptionsItemSelected(menuItem);
    }

    public void cargarCategoria() {
        final List<Tipo_Tarea_AJ> categorias = new ArrayList<>();
        databaseReference.child("Tipo_Tarea").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    for (DataSnapshot ds : snapshot.getChildren()) {
                        int  descripcion =Integer.parseInt(ds.child("Descrip").getValue().toString());
                        String nombre = ds.child("Nombre").getValue().toString();
                        categorias.add(new Tipo_Tarea_AJ(descripcion, nombre));
                    }

                    ArrayAdapter<Tipo_Tarea_AJ> arrayAdapter =
                            new ArrayAdapter<>(CrearTarea_AJ.this,
                                    android.R.layout.simple_dropdown_item_1line, categorias);
                    spinnerUsuarios.setAdapter(arrayAdapter);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

}