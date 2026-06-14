package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h implements s, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f51741a;

    public h(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f51741a = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f51741a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f51741a.close();
    }

    public final s d() {
        return this.f51741a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f51741a.toString() + ")";
    }
}
