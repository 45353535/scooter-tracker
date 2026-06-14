package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f51256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f51257b;

    public e(IOException iOException) {
        super(iOException);
        this.f51256a = iOException;
        this.f51257b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f51256a, (Throwable) iOException);
        this.f51257b = iOException;
    }

    public IOException d() {
        return this.f51256a;
    }

    public IOException g() {
        return this.f51257b;
    }
}
