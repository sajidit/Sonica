package sonica.it.com.sonica;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import io.realm.Realm;
import sonica.it.com.sonica.service.impl.SonicaQuestionServiceImpl;

public class MainActivity extends AppCompatActivity {

    private String[] mPlanetTitles;
    private ListView mDrawerList;

    SonicaQuestionServiceImpl service = new SonicaQuestionServiceImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Realm.init(this);
        mPlanetTitles = getResources().getStringArray(R.array.titles);
//      service.getQuestions();
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        mDrawerList.setAdapter(new ArrayAdapter<String>(this, R.layout.drawer_list_item, mPlanetTitles));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
