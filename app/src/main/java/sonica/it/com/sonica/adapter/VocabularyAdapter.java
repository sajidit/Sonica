package sonica.it.com.sonica.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import sonica.it.com.sonica.bean.Vocabulary;
import sonica.it.com.sonica.fragment.VocabularyFragment;

/**
 * Created by SajidA on 09/11/2016.
 */

public class VocabularyAdapter extends FragmentStatePagerAdapter {

    List<Vocabulary> list;
    Integer size;

    public VocabularyAdapter(FragmentManager fm) {super(fm);}

    public void setVocabulary(List<Vocabulary> list) {
        this.list = list;
        this.size = list.size();
    }

    public Fragment getItem(int i) {
        return VocabularyFragment.newInstance(list.get(i));
    }

    public int getCount() {
        return size;
    }

    public CharSequence getPageTitle(int position) {
        return "OBJECT" + (position+1);
    }

}
