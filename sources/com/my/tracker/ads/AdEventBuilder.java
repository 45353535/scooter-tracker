package com.my.tracker.ads;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class AdEventBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f61216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f61217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double f61218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f61219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f61220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    String f61221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f61222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f61223h;

    private AdEventBuilder(int i10, int i11, double d10, String str) {
        this.f61216a = i10;
        this.f61217b = i11;
        this.f61218c = d10;
        this.f61219d = str;
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newClickBuilder(int i10) {
        return new AdEventBuilder(18, i10, Double.NaN, null);
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newImpressionBuilder(int i10) {
        return new AdEventBuilder(17, i10, Double.NaN, null);
    }

    @NonNull
    @AnyThread
    public static AdEventBuilder newRevenueBuilder(int i10, double d10, @NonNull String str) {
        return new AdEventBuilder(19, i10, d10, str);
    }

    @NonNull
    @AnyThread
    public AdEvent build() {
        return new AdEvent(this.f61216a, this.f61217b, this.f61218c, this.f61219d, this.f61220e, this.f61221f, this.f61222g, this.f61223h);
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withAdFormat(@Nullable String str) {
        this.f61223h = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withAdId(@Nullable String str) {
        this.f61222g = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withPlacementId(@Nullable String str) {
        this.f61221f = str;
        return this;
    }

    @NonNull
    @AnyThread
    public AdEventBuilder withSource(@Nullable String str) {
        this.f61220e = str;
        return this;
    }
}
