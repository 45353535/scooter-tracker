package org.tensorflow.lite;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public interface b extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    long getNativeHandle();
}
