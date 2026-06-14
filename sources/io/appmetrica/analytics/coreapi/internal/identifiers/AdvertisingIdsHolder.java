package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f75165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f75166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f75167c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.f75165a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.f75166b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.f75167c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f75165a + ", mHuawei=" + this.f75166b + ", yandex=" + this.f75167c + '}';
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.f75165a = adTrackingInfoResult;
        this.f75166b = adTrackingInfoResult2;
        this.f75167c = adTrackingInfoResult3;
    }
}
