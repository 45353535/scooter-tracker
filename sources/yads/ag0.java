package yads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class ag0 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f108681b;

    public ag0(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f108680a = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.f108681b++;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f108681b += (long) i12;
        }
        return i12;
    }
}
