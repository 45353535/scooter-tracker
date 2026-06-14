package com.monetization.ads.exo.source.dash;

import java.io.IOException;
import yads.gz2;
import yads.jz2;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements gz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f58980a;

    public a(DashMediaSource dashMediaSource) {
        this.f58980a = dashMediaSource;
    }

    public final void a() {
        long j10;
        DashMediaSource dashMediaSource = this.f58980a;
        synchronized (jz2.f112523b) {
            try {
                j10 = jz2.f112524c ? jz2.f112525d : -9223372036854775807L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        dashMediaSource.onUtcTimestampResolved(j10);
    }

    public final void a(IOException iOException) {
        this.f58980a.onUtcTimestampResolutionError(iOException);
    }
}
