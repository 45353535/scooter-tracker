package com.appodeal.ads.adapters.level_play;

import com.appodeal.ads.AdUnitParams;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements AdUnitParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f12383d;

    public b(String adUnitId, boolean z10, ArrayList configs, Double d10) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(configs, "configs");
        this.f12380a = adUnitId;
        this.f12381b = z10;
        this.f12382c = configs;
        this.f12383d = d10;
    }

    public final String a() {
        return this.f12380a;
    }

    public final Double b() {
        return this.f12383d;
    }

    public final boolean c() {
        return this.f12381b;
    }

    public final String toString() {
        return "LevelPlayAdUnitParams(adUnitId='" + this.f12380a + "', isAutoRefreshEnabled='" + this.f12381b + "', bidFloor=" + this.f12383d + ")";
    }
}
