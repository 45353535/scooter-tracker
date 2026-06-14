package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class i extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f51742e;

    public i(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f51742e = tVar;
    }

    public final i a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f51742e = tVar;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t b() {
        return this.f51742e.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public long c() {
        return this.f51742e.c();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public boolean d() {
        return this.f51742e.d();
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public void e() throws IOException {
        this.f51742e.e();
    }

    public final t g() {
        return this.f51742e;
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10, TimeUnit timeUnit) {
        return this.f51742e.a(j10, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a(long j10) {
        return this.f51742e.a(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.t
    public t a() {
        return this.f51742e.a();
    }
}
