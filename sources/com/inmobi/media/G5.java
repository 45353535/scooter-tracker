package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class G5 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f36923a;

    public G5(InputStream[] inputStreamArr) {
        this.f36923a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f36923a) {
            AbstractC3612bl.a(inputStream);
        }
    }
}
