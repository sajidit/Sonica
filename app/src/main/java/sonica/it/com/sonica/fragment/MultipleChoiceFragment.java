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
import sonica.it.com.sonica.bean.Question;

/**
 * Created by SajidA on 04/11/2016.
 */

public class MultipleChoiceFragment extends Fragment {

    public static Question question;

    @BindView(R.id.question_mcq)
    TextView questionMCQ;

    @BindView(R.id.option_a)
    TextView optionA;

    @BindView(R.id.option_b)
    TextView optionB;

    @BindView(R.id.option_c)
    TextView optionC;

    @BindView(R.id.option_d)
    TextView optionD;

    public static MultipleChoiceFragment newInstance(Question question) {
        MultipleChoiceFragment fragment = new MultipleChoiceFragment();
        Bundle aaa = new Bundle();
        aaa.putSerializable("question", question);
        fragment.setArguments(aaa);
        return fragment;
    }

    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        inflater.inflate(R.menu.menu_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.fragment_collection_object,
                container, false);
        ButterKnife.bind(this, rootView);
        Bundle args = getArguments();
        Question q = (Question) args.getSerializable("question");
        questionMCQ.setText(Html.fromHtml(q.getQ()));
        optionA.setText(Html.fromHtml(q.getoA()));
        optionB.setText(Html.fromHtml(q.getoB()));
        optionC.setText(Html.fromHtml(q.getoC()));
        optionD.setText(Html.fromHtml(q.getoD()));
        return rootView;
    }

}
