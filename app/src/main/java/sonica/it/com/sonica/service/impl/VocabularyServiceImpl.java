package sonica.it.com.sonica.service.impl;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import io.realm.Realm;
import sonica.it.com.sonica.bean.Vocabulary;
import sonica.it.com.sonica.service.VocabularyService;

/**
 * Created by SajidA on 09/11/2016.
 */

public class VocabularyServiceImpl implements VocabularyService {

    public static void readJson(Context myContext) {
        try {
            Gson gson = new Gson();
            BufferedReader br = new BufferedReader( new InputStreamReader(myContext.getAssets().open("TestWords.json")));
            List<Vocabulary> v = gson.fromJson(br, new TypeToken<List<Vocabulary>>(){}.getType());
            Realm realm = Realm.getDefaultInstance();

            // Persist your data in a transaction
            realm.beginTransaction();
            realm.copyToRealm(v);
            realm.commitTransaction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
