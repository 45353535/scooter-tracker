package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class g implements r, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f51740a;

    public g(r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f51740a = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        this.f51740a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f51740a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51740a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f51740a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f51740a.toString() + ")";
    }
}
