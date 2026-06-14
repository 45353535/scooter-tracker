package com.monetization.ads.exo.source.dash;

import java.io.IOException;
import yads.se1;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements se1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f58994a;

    public f(DashMediaSource dashMediaSource) {
        this.f58994a = dashMediaSource;
    }

    @Override // yads.se1
    public final void a() throws IOException {
        this.f58994a.loader.a(Integer.MIN_VALUE);
        IOException iOException = this.f58994a.manifestFatalError;
        if (iOException != null) {
            throw iOException;
        }
    }
}
