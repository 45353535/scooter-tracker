package net.pubnative.lite.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.D5;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.request.Macros;
import net.pubnative.lite.sdk.models.request.OpenRTBAdRequest;
import net.pubnative.lite.sdk.models.response.Bid;
import net.pubnative.lite.sdk.models.response.OpenRTBResponse;
import net.pubnative.lite.sdk.models.response.SeatBid;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.network.e;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.OpenRTBApiUrlComposer;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class OpenRTBApiClient implements ApiClient {
    private String mApiUrl = BuildConfig.BASE_RTB_URL;
    private final Context mContext;
    private String mCustomUrl;
    private JSONObject mPlacementParams;

    public OpenRTBApiClient(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void buildAd(final net.pubnative.lite.sdk.models.response.OpenRTBResponse r10, final net.pubnative.lite.sdk.models.AdRequest r11, final net.pubnative.lite.sdk.models.response.Bid r12, java.lang.Integer r13, java.lang.Integer r14, final net.pubnative.lite.sdk.api.ApiClient.AdRequestListener r15) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.api.OpenRTBApiClient.buildAd(net.pubnative.lite.sdk.models.response.OpenRTBResponse, net.pubnative.lite.sdk.models.AdRequest, net.pubnative.lite.sdk.models.response.Bid, java.lang.Integer, java.lang.Integer, net.pubnative.lite.sdk.api.ApiClient$AdRequestListener):void");
    }

    private String getAdRequestURL(OpenRTBAdRequest openRTBAdRequest) {
        return OpenRTBApiUrlComposer.buildUrl(this.mApiUrl, openRTBAdRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, String str3, long j10) {
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, str3, System.currentTimeMillis() - j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String replaceMacros(String str, AdRequest adRequest, OpenRTBResponse openRTBResponse, Bid bid) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strReplace = str.replace("${AUCTION_PRICE}", String.valueOf(bid.getPrice()));
        if (adRequest != null) {
            OpenRTBAdRequest openRTBAdRequest = (OpenRTBAdRequest) adRequest;
            if (!TextUtils.isEmpty(openRTBAdRequest.getId())) {
                strReplace = strReplace.replace(Macros.AUCTION_ID, openRTBAdRequest.getId());
            }
            if (openRTBAdRequest.getImp() != null && !openRTBAdRequest.getImp().isEmpty() && !TextUtils.isEmpty(openRTBAdRequest.getImp().get(0).getId())) {
                strReplace = strReplace.replace(Macros.AUCTION_IMP_ID, openRTBAdRequest.getImp().get(0).getId());
            }
        }
        if (openRTBResponse.getSeatBids() != null && !openRTBResponse.getSeatBids().isEmpty() && !TextUtils.isEmpty(openRTBResponse.getSeatBids().get(0).getSeat())) {
            strReplace = strReplace.replace(Macros.AUCTION_SEAT_ID, openRTBResponse.getSeatBids().get(0).getSeat());
        }
        return !TextUtils.isEmpty(bid.getAdId()) ? strReplace.replace(Macros.AUCTION_AD_ID, bid.getAdId()) : strReplace;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(String str, String str2, ApiClient.AdRequestListener adRequestListener) {
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
        return null;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
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
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mCustomUrl = str;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(AdRequest adRequest, String str, final ApiClient.AdRequestListener adRequestListener) {
        if (!(adRequest instanceof OpenRTBAdRequest)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Invalid ad request. Make sure you have initialized HyBid SDK properly."));
                return;
            }
            return;
        }
        final OpenRTBAdRequest openRTBAdRequest = (OpenRTBAdRequest) adRequest;
        final String adRequestURL = !TextUtils.isEmpty(this.mCustomUrl) ? this.mCustomUrl : getAdRequestURL(openRTBAdRequest);
        if (adRequestURL == null) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("PNApiClient - Error: invalid request URL"));
                return;
            }
            return;
        }
        try {
            final String string = openRTBAdRequest.toJson().toString();
            try {
                if (TextUtils.isEmpty(string)) {
                    if (adRequestListener != null) {
                        adRequestListener.onFailure(new Exception("Invalid post body for OpenRTB request"));
                        return;
                    }
                    return;
                } else {
                    HashMap map = new HashMap();
                    map.put("x-openrtb-version", "2.3");
                    map.put("Content-Type", D5.L);
                    map.put(HttpHeaders.ACCEPT_CHARSET, D5.N);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    PNHttpClient.makeRequest(this.mContext, adRequestURL, null, string, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.OpenRTBApiClient.1
                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onFailure(Throwable th2) {
                            OpenRTBApiClient.this.registerAdRequest(adRequestURL, th2.getMessage(), string, jCurrentTimeMillis);
                            ApiClient.AdRequestListener adRequestListener2 = adRequestListener;
                            if (adRequestListener2 != null) {
                                adRequestListener2.onFailure(th2);
                            }
                        }

                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onFinally(String str2, int i10) {
                            e.a(this, str2, i10);
                        }

                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onSuccess(String str2, Map<String, List<String>> map2) {
                            OpenRTBApiClient.this.registerAdRequest(adRequestURL, str2, string, jCurrentTimeMillis);
                            OpenRTBApiClient.this.processStream(str2, openRTBAdRequest, null, null, adRequestListener);
                        }
                    });
                    return;
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
        if (adRequestListener != null) {
            adRequestListener.onFailure(new Exception("Error processing OpenRTB ad request"));
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, AdRequest adRequest, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
        OpenRTBResponse openRTBResponse;
        Exception exc = null;
        try {
            openRTBResponse = new OpenRTBResponse(new JSONObject(str));
        } catch (Error e10) {
            openRTBResponse = null;
            exc = new Exception("Response cannot be parsed", e10);
        } catch (Exception e11) {
            openRTBResponse = null;
            exc = e11;
        }
        if (exc != null) {
            adRequestListener.onFailure(exc);
            return;
        }
        if (openRTBResponse == null) {
            adRequestListener.onFailure(new Exception("OpenRTBApiClient - Parse error"));
            return;
        }
        if (openRTBResponse.getSeatBids() != null && !openRTBResponse.getSeatBids().isEmpty()) {
            SeatBid seatBid = openRTBResponse.getSeatBids().get(0);
            if (seatBid.getBids() != null && !seatBid.getBids().isEmpty() && seatBid.getBids().get(0) != null) {
                buildAd(openRTBResponse, adRequest, seatBid.getBids().get(0), num, num2, adRequestListener);
                return;
            } else {
                adRequestListener.onFailure(new Exception("HyBid - No fill"));
                return;
            }
        }
        adRequestListener.onFailure(new Exception("HyBid - No fill"));
    }
}
