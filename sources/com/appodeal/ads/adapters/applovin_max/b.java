package com.appodeal.ads.adapters.applovin_max;

import android.app.Activity;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.AdUnitParams;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f11978c;

    public b(String adUnitId, ArrayList configs, Map extraData) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(configs, "configs");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f11976a = adUnitId;
        this.f11977b = configs;
        this.f11978c = extraData;
    }

    public static AppLovinSdk a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(activity);
        Intrinsics.checkNotNullExpressionValue(appLovinSdk, "getInstance(...)");
        return appLovinSdk;
    }

    public final String b() {
        return this.f11976a;
    }

    public final Map c() {
        return this.f11978c;
    }

    public final String toString() {
        return "ApplovinMaxAdUnitParams(adUnitId='" + this.f11976a + "', configs=" + this.f11977b + ", extraData='" + this.f11978c + "')";
    }
}
