package arielfb.fisei.supletorio_arieljinde;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class HomeMainActivity_AJ extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem personal,bissnes;
    PagesController_AJ adapterPagesController_aj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main_aj);

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
}