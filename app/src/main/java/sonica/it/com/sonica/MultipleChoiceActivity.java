package sonica.it.com.sonica;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.List;

import io.realm.Realm;
import sonica.it.com.sonica.adapter.QuestionAdapter;
import sonica.it.com.sonica.bean.Question;
import sonica.it.com.sonica.service.impl.VocabularyServiceImpl;

public class MultipleChoiceActivity extends AppCompatActivity {

    QuestionAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice);
        Realm.init(this);
        VocabularyServiceImpl.readJson(this);
        List<Question> list = getQuestions();
        adapter = new QuestionAdapter(getSupportFragmentManager());
        adapter.setQuestion(list);
        viewPager = (ViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(adapter);
    }

    private List<Question> getQuestions() {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Question.class).findAll();
    }

}
