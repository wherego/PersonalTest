package com.example.liangge.rxjavatest.data.http;

import com.example.liangge.rxjavatest.bean.BaseBean;
import com.example.liangge.rxjavatest.bean.BeanTest;
import com.example.liangge.rxjavatest.bean.UserInfo;
import com.example.liangge.rxjavatest.common.constant.User;
import com.example.liangge.rxjavatest.common.constant.UserParam;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by liangge on 2017/3/26.
 */

public interface Api {
    @GET("user/{id}")
    Call<User> getUserInfoWithPath(@Path("id") int user_id);

    //    @POST("ju321/isb/isb-ucm-adapter-in/agentDetail")
//    Call<BaseResult> login(@Body UserParam param);
    @POST("ju321/isb/isb-ucm-adapter-in/agentDetail")
    Call<BeanTest> login(@Body UserParam param);

    @POST("ju321/isb/isb-ucm-adapter-in/agentDetail")
    Observable<BeanTest> UserLogin(@Body UserParam param);
    @POST("ju321/isb/isb-ucm-adapter-in/agentDetail")
    Observable<BaseBean<UserInfo>> userLogin(@Body UserParam param);
    @GET("ju321/isb/isb-ucm-adapter-in/agentDetail")
    Observable<BaseBean<UserInfo>> checkIsUpdate();
}
