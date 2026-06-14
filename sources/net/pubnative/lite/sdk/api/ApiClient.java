package net.pubnative.lite.sdk.api;

import android.content.Context;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface ApiClient {

    public interface AdRequestListener {
        void onFailure(Throwable th2);

        void onSuccess(Ad ad2);
    }

    public interface TrackJSListener {
        void onFailure(Throwable th2);

        void onSuccess(String str);
    }

    public interface TrackUrlListener {
        void onFailure(Throwable th2);

        void onFinally(String str, String str2, int i10);

        void onSuccess();
    }

    void getAd(String str, String str2, AdRequestListener adRequestListener);

    void getAd(AdRequest adRequest, String str, AdRequestListener adRequestListener);

    String getApiUrl();

    Context getContext();

    JSONObject getPlacementParams();

    void processStream(String str, AdRequestListener adRequestListener);

    void processStream(String str, AdRequest adRequest, Integer num, Integer num2, AdRequestListener adRequestListener);

    void processStream(AdResponse adResponse, Exception exc, AdRequestListener adRequestListener);

    void setApiUrl(String str);

    void setCustomUrl(String str);

    void trackJS(String str, TrackJSListener trackJSListener);

    void trackUrl(String str, String str2, String str3, TrackUrlListener trackUrlListener);
}
