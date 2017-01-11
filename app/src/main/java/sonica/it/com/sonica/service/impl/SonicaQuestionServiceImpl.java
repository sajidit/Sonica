package sonica.it.com.sonica.service.impl;


import java.util.List;

import io.realm.Realm;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import sonica.it.com.sonica.bean.Question;
import sonica.it.com.sonica.bean.ResponseBody;
import sonica.it.com.sonica.service.SonicaQuestionService;

/**
 * Created by SajidA on 02/11/2016.
 */

public class SonicaQuestionServiceImpl  implements Callback<ResponseBody> {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://sonica-games.appspot.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    SonicaQuestionService service = retrofit.create(SonicaQuestionService.class);

    public void getQuestions(){
        Call<ResponseBody> repos = service.listRepos();
        repos.enqueue(this);
    }

    @Override
    public void onResponse(Call<ResponseBody> response, Response<ResponseBody> res) {
        try {
            // Get a Realm instance for this thread
            Realm realm = Realm.getDefaultInstance();

            // Persist your data in a transaction
            realm.beginTransaction();
            realm.copyToRealm(res.body().getItems());
            realm.commitTransaction();
            System.out.println("Number of persons: " + realm.where(Question.class).count());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(Call<ResponseBody> call, Throwable t) {
        t.printStackTrace();
    }
}
