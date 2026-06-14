package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f51305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f51306c;

    public h(String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f51304a = str;
        this.f51305b = j10;
        this.f51306c = eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f51305b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f51304a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f51306c;
    }
}
