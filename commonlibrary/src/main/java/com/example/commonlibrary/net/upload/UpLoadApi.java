package com.example.commonlibrary.net.upload;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.Response;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Url;

/**
 * @ClassName: UpLoadApi
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunweixing
 * @date 2018-09-07
 */
public interface UpLoadApi {
    @POST
    public Observable<Response> upLoad(@Url String url, @PartMap Map<String, RequestBody> requestBodyMap);

    @POST
    public Observable<Response> upLoad(@Url String url, @Part MultipartBody.Part part);
}
