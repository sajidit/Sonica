package sonica.it.com.sonica.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import sonica.it.com.sonica.bean.Question;
import sonica.it.com.sonica.fragment.MultipleChoiceFragment;

/**
 * Created by SajidA on 03/11/2016.
 */

public class QuestionAdapter extends FragmentStatePagerAdapter {

    List<Question> list;
    Integer size;

    public void setQuestion(List<Question> list){
        this.list = list;
        this.size = list.size();
    }

    public QuestionAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int i) {
        Fragment fragment = MultipleChoiceFragment.newInstance(list.get(i));
        return fragment;
    }



    public int getCount() {
        return size;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position +1);
    }

}
