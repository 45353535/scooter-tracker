package com.applovin.impl;

import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DtbConstants;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DTBAdSize f11243b;

    private enum a {
        VIDEO,
        DISPLAY,
        INTERSTITIAL
    }

    public x(String str, JSONObject jSONObject, MaxAdFormat maxAdFormat) {
        this.f11242a = str;
        this.f11243b = a(JsonUtils.getInt(jSONObject, "type", a(maxAdFormat).ordinal()), maxAdFormat, str);
    }

    public DTBAdSize a() {
        return this.f11243b;
    }

    private a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat.isAdViewAd() ? a.DISPLAY : a.INTERSTITIAL;
    }

    private DTBAdSize a(int i10, MaxAdFormat maxAdFormat, String str) {
        try {
            if (a.VIDEO.ordinal() == i10) {
                return new DTBAdSize.DTBVideo(320, DtbConstants.DEFAULT_PLAYER_HEIGHT, str);
            }
            if (a.DISPLAY.ordinal() == i10) {
                return new DTBAdSize(maxAdFormat.getSize().getWidth(), maxAdFormat.getSize().getHeight(), str);
            }
            if (a.INTERSTITIAL.ordinal() == i10) {
                return new DTBAdSize.DTBInterstitialAdSize(str);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
