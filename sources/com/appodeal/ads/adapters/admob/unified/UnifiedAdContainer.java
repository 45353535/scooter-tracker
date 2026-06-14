package com.appodeal.ads.adapters.admob.unified;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class UnifiedAdContainer<T> {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @Nullable
    private T f11918ad;

    public void destroy() {
        this.f11918ad = null;
    }

    @Nullable
    public T getAd() {
        return this.f11918ad;
    }

    public void setAd(@Nullable T t10) {
        this.f11918ad = t10;
    }
}
