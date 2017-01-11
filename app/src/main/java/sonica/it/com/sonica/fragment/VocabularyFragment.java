package sonica.it.com.sonica.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import sonica.it.com.sonica.R;
import sonica.it.com.sonica.bean.Vocabulary;

/**
 * Created by SajidA on 09/11/2016.
 */

public class VocabularyFragment extends Fragment {

    @BindView(R.id.word_display)
    TextView word;

    public static VocabularyFragment newInstance(Vocabulary v) {
        VocabularyFragment fragment = new VocabularyFragment();
        Bundle b = new Bundle();
        b.putSerializable("vocabulary", v);
        fragment.setArguments(b);
        return fragment;
    }

    public void onCreate(Bundle b) {
        super.onCreate(b);
        /*setHasOptionsMenu(true);*/
    }
/*
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.fragment_vaculabary,
                container, false);
        ButterKnife.bind(this, rootView);
        Bundle args = getArguments();
        Vocabulary v = (Vocabulary) args.getSerializable("vocabulary");
        word.setText(Html.fromHtml(v.getLemma()));
        return rootView;
    }
}
