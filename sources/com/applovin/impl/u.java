package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f11036e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f11037f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f11038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppLovinAdSize f11040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAdType f11041d;

    private u(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        String lowerCase;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f11040c = appLovinAdSize;
        this.f11041d = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
        } else {
            lowerCase = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
        }
        if (z10) {
            lowerCase = lowerCase + "_bidding";
        }
        if (z11) {
            lowerCase = lowerCase + "_direct_sold";
        }
        this.f11039b = lowerCase;
    }

    public static u a(String str) {
        return a(null, null, str);
    }

    public static u b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static u c() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static u h() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static u j() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static u k() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static u l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public static u m() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public MaxAdFormat d() {
        AppLovinAdSize appLovinAdSizeF = f();
        if (appLovinAdSizeF == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (appLovinAdSizeF == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (appLovinAdSizeF != AppLovinAdSize.INTERSTITIAL) {
            if (appLovinAdSizeF == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        }
        if (g() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (g() == AppLovinAdType.APP_OPEN) {
            return MaxAdFormat.APP_OPEN;
        }
        if (g() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    public String e() {
        return this.f11039b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        return this.f11039b.equalsIgnoreCase(((u) obj).f11039b);
    }

    public AppLovinAdSize f() {
        if (this.f11040c == null && JsonUtils.valueExists(this.f11038a, Reporting.Key.AD_SIZE)) {
            this.f11040c = AppLovinAdSize.fromString(JsonUtils.getString(this.f11038a, Reporting.Key.AD_SIZE, null));
        }
        return this.f11040c;
    }

    public AppLovinAdType g() {
        if (this.f11041d == null && JsonUtils.valueExists(this.f11038a, "ad_type")) {
            this.f11041d = AppLovinAdType.fromString(JsonUtils.getString(this.f11038a, "ad_type", null));
        }
        return this.f11041d;
    }

    public int hashCode() {
        return this.f11039b.hashCode();
    }

    public boolean i() {
        return a().contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f11039b + ", zoneObject=" + this.f11038a + '}';
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static u b() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.APP_OPEN);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        return a(appLovinAdSize, appLovinAdType, str, false, false);
    }

    public static u a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, boolean z10, boolean z11) {
        u uVar = new u(appLovinAdSize, appLovinAdType, str, z10, z11);
        synchronized (f11037f) {
            try {
                String str2 = uVar.f11039b;
                Map map = f11036e;
                if (map.containsKey(str2)) {
                    uVar = (u) map.get(str2);
                } else {
                    map.put(str2, uVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(Reporting.Key.AD_SIZE) && jSONObject.has("ad_type")) {
            synchronized (f11037f) {
                try {
                    u uVar = (u) f11036e.get(JsonUtils.getString(jSONObject, Reporting.Key.ZONE_ID, ""));
                    if (uVar != null) {
                        uVar.f11040c = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, Reporting.Key.AD_SIZE, ""));
                        uVar.f11041d = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static Collection a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(7);
        Collections.addAll(linkedHashSet, c(), k(), j(), m(), b(), h(), l());
        return DesugarCollections.unmodifiableSet(linkedHashSet);
    }
}
