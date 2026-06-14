package com.mbridge.msdk.thrid.okio;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public interface s extends Closeable {
    long b(c cVar, long j10) throws IOException;

    t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
