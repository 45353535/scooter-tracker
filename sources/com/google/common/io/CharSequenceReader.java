package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import j$.util.Objects;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class CharSequenceReader extends Reader implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f30902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30904d;

    public CharSequenceReader(CharSequence charSequence) {
        this.f30902b = (CharSequence) Preconditions.checkNotNull(charSequence);
    }

    private void m() throws IOException {
        if (this.f30902b == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean n() {
        return o() > 0;
    }

    private int o() {
        Objects.requireNonNull(this.f30902b);
        return this.f30902b.length() - this.f30903c;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f30902b = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i10) throws IOException {
        Preconditions.checkArgument(i10 >= 0, "readAheadLimit (%s) may not be negative", i10);
        m();
        this.f30904d = this.f30903c;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        Preconditions.checkNotNull(charBuffer);
        m();
        Objects.requireNonNull(this.f30902b);
        if (!n()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), o());
        for (int i10 = 0; i10 < iMin; i10++) {
            CharSequence charSequence = this.f30902b;
            int i11 = this.f30903c;
            this.f30903c = i11 + 1;
            charBuffer.put(charSequence.charAt(i11));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        m();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        m();
        this.f30903c = this.f30904d;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j10) throws IOException {
        int iMin;
        Preconditions.checkArgument(j10 >= 0, "n (%s) may not be negative", j10);
        m();
        iMin = (int) Math.min(o(), j10);
        this.f30903c += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        m();
        Objects.requireNonNull(this.f30902b);
        if (n()) {
            CharSequence charSequence = this.f30902b;
            int i10 = this.f30903c;
            this.f30903c = i10 + 1;
            iCharAt = charSequence.charAt(i10);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i10, int i11) throws IOException {
        Preconditions.checkPositionIndexes(i10, i10 + i11, cArr.length);
        m();
        Objects.requireNonNull(this.f30902b);
        if (!n()) {
            return -1;
        }
        int iMin = Math.min(i11, o());
        for (int i12 = 0; i12 < iMin; i12++) {
            CharSequence charSequence = this.f30902b;
            int i13 = this.f30903c;
            this.f30903c = i13 + 1;
            cArr[i10 + i12] = charSequence.charAt(i13);
        }
        return iMin;
    }
}
