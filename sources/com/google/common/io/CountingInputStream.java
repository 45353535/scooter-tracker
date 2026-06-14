package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class CountingInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30920c;

    public CountingInputStream(InputStream inputStream) {
        super((InputStream) Preconditions.checkNotNull(inputStream));
        this.f30920c = -1L;
    }

    public long getCount() {
        return this.f30919b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f30920c = this.f30919b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f30919b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f30920c == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f30919b = this.f30920c;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.f30919b += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f30919b += (long) i12;
        }
        return i12;
    }
}
