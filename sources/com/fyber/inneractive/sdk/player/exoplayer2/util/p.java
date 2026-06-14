package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends BufferedOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23141a;

    public p(b bVar) {
        super(bVar);
    }

    public final void a(OutputStream outputStream) {
        if (!this.f23141a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f23141a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f23141a = true;
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
        if (th == null) {
            return;
        }
        int i10 = z.f23162a;
        throw th;
    }

    public p(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}
