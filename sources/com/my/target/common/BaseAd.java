package com.my.target.common;

import androidx.annotation.NonNull;
import com.my.target.h6;
import com.my.target.j;
import com.my.target.mediation.AdNetworkConfig;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f59399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6.a f59400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f59401c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f59402d = UUID.randomUUID().toString();

    public BaseAd(int i10, @NonNull String str) {
        this.f59399a = j.a(i10, str);
        this.f59400b = h6.a(i10);
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.f59399a.g();
    }

    public boolean isLoadCalled() {
        return !this.f59401c.compareAndSet(false, true);
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.f59399a.a(str, adNetworkConfig);
    }
}
