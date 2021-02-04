package net.ralphpina.famigo.videoplayer.app;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;

/**
 * Created by ralphpina on 4/18/14.
 */
public interface VideoService {
    @GET("/videolist.json")
    void videos(Callback<Response> cb);
}
