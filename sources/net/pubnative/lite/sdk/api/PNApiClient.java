package net.pubnative.lite.sdk.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.analytics.Reporting;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.PNApiUrlComposer;
import net.pubnative.lite.sdk.utils.json.JsonOperations;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class PNApiClient implements ApiClient {
    private static final String TAG = "PNApiClient";
    private String mApiUrl = BuildConfig.BASE_URL;
    private final Context mContext;
    private JSONObject mPlacementParams;

    public PNApiClient(Context context) {
        this.mContext = context;
    }

    private String processJS(String str) {
        return str.replace("<script>", "").replace("</script>", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_REQUEST, str);
        JsonOperations.putJsonString(this.mPlacementParams, Reporting.Key.AD_RESPONSE, str2);
        JsonOperations.putJsonLong(this.mPlacementParams, Reporting.Key.RESPONSE_TIME, jCurrentTimeMillis);
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, jCurrentTimeMillis);
    }

    private void sendTrackingRequest(String str, String str2, final String str3, final ApiClient.TrackUrlListener trackUrlListener) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            map.put("User-Agent", str2);
        }
        PNHttpClient.makeRequest(this.mContext, str, map, null, false, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.PNApiClient.2
            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFailure(Throwable th2) {
                ApiClient.TrackUrlListener trackUrlListener2 = trackUrlListener;
                if (trackUrlListener2 != null) {
                    trackUrlListener2.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_URL, th2));
                }
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onFinally(String str4, int i10) {
                trackUrlListener.onFinally(str4, str3, i10);
            }

            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
            public void onSuccess(String str4, Map<String, List<String>> map2) {
                ApiClient.TrackUrlListener trackUrlListener2 = trackUrlListener;
                if (trackUrlListener2 != null) {
                    trackUrlListener2.onSuccess();
                }
            }
        });
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(AdRequest adRequest, String str, ApiClient.AdRequestListener adRequestListener) {
        getAd(getAdRequestURL(adRequest), str, adRequestListener);
    }

    protected String getAdRequestURL(AdRequest adRequest) {
        return PNApiUrlComposer.buildUrl(this.mApiUrl, (PNAdRequest) adRequest);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public String getApiUrl() {
        return this.mApiUrl;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public JSONObject getPlacementParams() {
        return this.mPlacementParams;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
        AdResponse adResponse = null;
        try {
            AdResponse adResponse2 = new AdResponse(new JSONObject(str));
            e = null;
            adResponse = adResponse2;
        } catch (Error e10) {
            e = new HyBidError(HyBidErrorCode.PARSER_ERROR, e10);
        } catch (Exception e11) {
            e = e11;
        }
        processStream(adResponse, e, adRequestListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setApiUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mApiUrl = str;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setCustomUrl(String str) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    @SuppressLint({"SetJavaScriptEnabled", "ObsoleteSdkInt"})
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
        if (TextUtils.isEmpty(str)) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_JS, "Empty JS tracking beacon"));
                return;
            }
            return;
        }
        try {
            WebView webView = new WebView(this.mContext);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.evaluateJavascript(processJS(str), null);
            if (trackJSListener != null) {
                trackJSListener.onSuccess(str);
            }
        } catch (RuntimeException unused) {
            if (trackJSListener != null) {
                trackJSListener.onFailure(new HyBidError(HyBidErrorCode.ERROR_TRACKING_JS, "Error tracking JS beacon. No webview to evaluate JS."));
            }
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
        sendTrackingRequest(str, str2, str3, trackUrlListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(final String str, String str2, final ApiClient.AdRequestListener adRequestListener) {
        this.mPlacementParams = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new HyBidError(HyBidErrorCode.INVALID_URL));
            }
        } else {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                map.put("User-Agent", str2);
            }
            PNHttpClient.makeRequest(this.mContext, str, map, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.PNApiClient.1
                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onFailure(Throwable th2) {
                    PNApiClient.this.registerAdRequest(str, th2.getMessage(), jCurrentTimeMillis);
                    if (adRequestListener != null) {
                        String str3 = PNApiClient.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.SERVER_ERROR_PREFIX;
                        sb2.append(hyBidErrorCode.getMessage());
                        sb2.append(th2.getMessage());
                        Log.d(str3, sb2.toString());
                        adRequestListener.onFailure(new HyBidError(hyBidErrorCode, th2));
                    }
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public /* synthetic */ void onFinally(String str3, int i10) {
                    e.a(this, str3, i10);
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onSuccess(String str3, Map<String, List<String>> map2) {
                    PNApiClient.this.registerAdRequest(str, str3, jCurrentTimeMillis);
                    PNApiClient.this.processStream(str3, adRequestListener);
                }
            });
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, AdRequest adRequest, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
        processStream(str, adRequestListener);
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
        if (exc != null) {
            adRequestListener.onFailure(new HyBidError(HyBidErrorCode.PARSER_ERROR, exc));
            return;
        }
        if (adResponse == null) {
            adRequestListener.onFailure(new HyBidError(HyBidErrorCode.PARSER_ERROR));
            return;
        }
        if ("ok".equals(adResponse.status)) {
            List<Ad> list = adResponse.ads;
            if (list != null && !list.isEmpty()) {
                adRequestListener.onSuccess(adResponse.ads.get(0));
                return;
            } else {
                adRequestListener.onFailure(new HyBidError(HyBidErrorCode.NO_FILL));
                return;
            }
        }
        String str = TAG;
        StringBuilder sb2 = new StringBuilder();
        HyBidErrorCode hyBidErrorCode = HyBidErrorCode.SERVER_ERROR_PREFIX;
        sb2.append(hyBidErrorCode.getMessage());
        sb2.append(adResponse.error_message);
        Log.d(str, sb2.toString());
        adRequestListener.onFailure(new HyBidError(hyBidErrorCode, new Exception(adResponse.error_message)));
    }
}
