package com.appodeal.ads.adapters.yandex;

import android.location.Location;
import com.appodeal.ads.AdUnitParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f12610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f12611c;

    public c(String adUnitId, Location location, Map map) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f12609a = adUnitId;
        this.f12610b = location;
        this.f12611c = map;
    }

    public final String toString() {
        return "YandexAdUnitParams(adUnitId='" + this.f12609a + "', location=" + this.f12610b + ", parameters=" + this.f12611c + ")";
    }
}
