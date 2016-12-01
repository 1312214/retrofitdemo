package com.example.rogerh.retrofit_5hteam.rest;

// Lưu ý: import 2 thư viên bên dưới, Gson dùng để tạo Java object được chuyển từ Json của trang
//Web ta sử dụng API
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by rogerh on 12/1/2016.
 */

public class ApiClient {

    // URL cơ sở dùng để kết hợp với key_API & ID để thực hiện gửi yêu cầu đến webservice
    public static final String BASE_URL = "http://api.themoviedb.org/3/";

    private static Retrofit retrofit = null;

    // Hàm thực hiện gửi request đến một API bằng cách sử dụng lớp Retrofit Builder.
    // Sử dụng GsonConverterFactory để tạo đối tượng Java object cho dữ liệu json nhận về.
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}