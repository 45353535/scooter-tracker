package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class MultiInputStream extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f30947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InputStream f30948c;

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f30947b = (Iterator) Preconditions.checkNotNull(it);
        m();
    }

    private void m() throws IOException {
        close();
        if (this.f30947b.hasNext()) {
            this.f30948c = ((ByteSource) this.f30947b.next()).openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f30948c;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f30948c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f30948c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f30948c;
            if (inputStream == null) {
                return -1;
            }
            int i10 = inputStream.read();
            if (i10 != -1) {
                return i10;
            }
            m();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        InputStream inputStream = this.f30948c;
        if (inputStream == null || j10 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j10);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f30948c.skip(j10 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        Preconditions.checkNotNull(bArr);
        while (true) {
            InputStream inputStream = this.f30948c;
            if (inputStream == null) {
                return -1;
            }
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 != -1) {
                return i12;
            }
            m();
        }
    }
}
