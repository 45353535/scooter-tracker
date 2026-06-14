package com.apm.insight.k;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends DataOutputStream implements AutoCloseable {
    public f(OutputStream outputStream) {
        super(outputStream);
    }

    public final void a() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
