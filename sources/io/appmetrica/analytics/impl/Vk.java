package io.appmetrica.analytics.impl;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes12.dex */
public final class Vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo f76604a;

    public Vk(zo zoVar) {
        this.f76604a = zoVar;
    }

    public final long a() {
        long jOptLong;
        zo zoVar = this.f76604a;
        synchronized (zoVar) {
            jOptLong = zoVar.f78664a.a().optLong("session_id", -1L);
        }
        long j10 = RealConnection.IDLE_CONNECTION_HEALTHY_NS;
        if (jOptLong >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
            j10 = 1 + jOptLong;
        }
        this.f76604a.c(j10);
        return j10;
    }
}
