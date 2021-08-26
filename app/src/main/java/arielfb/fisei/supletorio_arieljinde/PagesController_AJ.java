package arielfb.fisei.supletorio_arieljinde;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagesController_AJ extends FragmentPagerAdapter {

    int numTabs;

    public PagesController_AJ(@NonNull  FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numTabs = behavior;
    }

    @NonNull

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new PersonalFragment_AJ();
            case 1:
                return  new BissnessFragment_AJ();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
