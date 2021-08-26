package arielfb.fisei.supletorio_arieljinde;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HomeMainActivity_AJ extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private DatabaseReference mDatabase;

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem personal,bissnes;
    PagesController_AJ adapterPagesController_aj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main_aj);
        databaseReference = FirebaseDatabase.getInstance().getReference();
        tabLayout = findViewById(R.id.tablayout_aj);
        viewPager =  findViewById(R.id.viewPager_aj);
        personal  = findViewById(R.id.personal_aj);
        bissnes = findViewById(R.id.bissness_aj);

        adapterPagesController_aj = new PagesController_AJ(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapterPagesController_aj);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0){
                    adapterPagesController_aj.notifyDataSetChanged();
                }
                if(tab.getPosition()==1){
                    adapterPagesController_aj.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_aj,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.agregar_tarea){
            Toast.makeText(HomeMainActivity_AJ.this, "Opcion 1s", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.borrar_tareas){
            Toast.makeText(HomeMainActivity_AJ.this, "Opcion 1s", Toast.LENGTH_SHORT).show();

        }
        if (id == R.id.cerrar_sesion){
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(HomeMainActivity_AJ.this, MainActivity_AJ.class));

        }
        return super.onOptionsItemSelected(menuItem);
    }




}