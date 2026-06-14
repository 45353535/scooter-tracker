package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class POBVideo {
    protected static final int BOXING_ALLOWED = 1;
    protected static final int PLAYBACK_END = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Linearity f62818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private POBRequest.AdPosition f62819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Placement f62820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Plcmt f62821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final POBAdSize f62822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONArray f62823f;
    protected static final int[] PROTOCOLS = {2, 3, 5, 6, 7, 8, 11, 12, 13, 14};
    protected static final String[] MIMES = POBVideoPlayer.SupportedMediaType.getStringValues();
    protected static final int[] DELIVERY = {2};
    protected static final int[] COMPANION_TYPE = {1, 2, 3};

    public enum Linearity {
        LINEAR(1),
        NON_LINEAR(2);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62825a;

        Linearity(int i10) {
            this.f62825a = i10;
        }

        public int getValue() {
            return this.f62825a;
        }
    }

    public enum Placement {
        IN_BANNER(2),
        INTERSTITIAL(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62827a;

        Placement(int i10) {
            this.f62827a = i10;
        }

        public int getValue() {
            return this.f62827a;
        }
    }

    public enum Plcmt {
        STANDALONE(4),
        INTERSTITIAL(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f62829a;

        Plcmt(int i10) {
            this.f62829a = i10;
        }

        public int getValue() {
            return this.f62829a;
        }
    }

    public POBVideo(@NonNull Placement placement, @NonNull Plcmt plcmt, @NonNull Linearity linearity, @NonNull POBAdSize pOBAdSize) {
        this.f62822e = pOBAdSize;
        this.f62820c = placement;
        this.f62818a = linearity;
        this.f62821d = plcmt;
    }

    @NonNull
    public POBAdSize getAdSize() {
        return this.f62822e;
    }

    @Nullable
    public JSONArray getCompanionAds() {
        return this.f62823f;
    }

    @NonNull
    public Linearity getLinearity() {
        return this.f62818a;
    }

    @Nullable
    public POBRequest.AdPosition getPosition() {
        return this.f62819b;
    }

    @NonNull
    public JSONObject getRTBJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, this.f62822e.getAdWidth());
        jSONObject.put("h", this.f62822e.getAdHeight());
        if (this.f62823f == null) {
            POBBanner pOBBanner = new POBBanner(this.f62822e);
            POBRequest.AdPosition adPosition = this.f62819b;
            if (adPosition != null) {
                pOBBanner.setAdPosition(adPosition);
            }
            this.f62823f = new JSONArray(new JSONObject[]{pOBBanner.getRTBJson(new HashSet(), true)});
        }
        jSONObject.put("companionad", this.f62823f);
        POBRequest.AdPosition adPosition2 = this.f62819b;
        if (adPosition2 != null) {
            jSONObject.put(POBCTAOverlayData.KEY_CTA_POS, adPosition2.getValue());
        }
        jSONObject.put("protocols", new JSONArray(PROTOCOLS));
        jSONObject.put(POBCoreNativeConstants.NATIVE_MIMES, new JSONArray(MIMES));
        jSONObject.put("linearity", this.f62818a.getValue());
        jSONObject.put("boxingallowed", 1);
        jSONObject.put("delivery", new JSONArray(DELIVERY));
        jSONObject.put("companiontype", new JSONArray(COMPANION_TYPE));
        jSONObject.put("placement", this.f62820c.getValue());
        jSONObject.put("plcmt", this.f62821d.getValue());
        jSONObject.put("minbitrate", 250);
        jSONObject.put("maxbitrate", 5000);
        jSONObject.put("playbackend", 1);
        jSONObject.put("startdelay", 0);
        Set<Integer> supportedAPIs = getSupportedAPIs();
        if (!supportedAPIs.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) supportedAPIs));
        }
        return jSONObject;
    }

    @NonNull
    protected Set<Integer> getSupportedAPIs() {
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBVideoMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        return hashSet;
    }

    public void setCompanionAds(@NonNull JSONArray jSONArray) {
        this.f62823f = jSONArray;
    }

    public void setPosition(@Nullable POBRequest.AdPosition adPosition) {
        this.f62819b = adPosition;
    }
}
