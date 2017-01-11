package sonica.it.com.sonica;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.lang.reflect.Array;
import java.util.List;

import io.realm.Realm;
import sonica.it.com.sonica.adapter.QuestionAdapter;
import sonica.it.com.sonica.adapter.VocabularyAdapter;
import sonica.it.com.sonica.bean.Question;
import sonica.it.com.sonica.bean.Vocabulary;
import sonica.it.com.sonica.service.impl.VocabularyServiceImpl;

public class VocabularyActivity extends AppCompatActivity {

    VocabularyAdapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacabulary);
        Realm.init(this);
        List<Vocabulary> list = getVocabulary();

        adapter = new VocabularyAdapter(getSupportFragmentManager());
        adapter.setVocabulary(list);
        viewPager = (ViewPager) findViewById(R.id.pager_vocabulary);
        viewPager.setAdapter(adapter);
    }

    private List<Vocabulary> getVocabulary() {
        Realm realm = Realm.getDefaultInstance();
        return realm.where(Vocabulary.class).findAll();
    }
}
