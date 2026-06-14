package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
final class ReusableBufferedOutputStream extends BufferedOutputStream implements AutoCloseable {
    private boolean closed;

    public ReusableBufferedOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.closed = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            Util.sneakyThrow(th);
        }
    }

    public void reset(OutputStream outputStream) {
        Assertions.checkState(this.closed);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.closed = false;
    }

    public ReusableBufferedOutputStream(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
