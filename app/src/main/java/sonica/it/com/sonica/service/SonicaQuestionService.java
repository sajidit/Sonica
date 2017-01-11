package sonica.it.com.sonica.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import sonica.it.com.sonica.bean.Question;
import sonica.it.com.sonica.bean.ResponseBody;

/**
 * Created by SajidA on 02/11/2016.
 */

public interface SonicaQuestionService {

    @GET("/_ah/api/questions/v1/questions")
    Call<ResponseBody> listRepos();
}
