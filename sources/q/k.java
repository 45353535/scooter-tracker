package q;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
final class k extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f98578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f98579c = 1073741824;

    public k(InputStream inputStream) {
        this.f98578b = inputStream;
    }

    private final int c(int i10) {
        if (i10 == -1) {
            this.f98579c = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f98579c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f98578b.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return c(this.f98578b.read());
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.f98578b.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return c(this.f98578b.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return c(this.f98578b.read(bArr, i10, i11));
    }
}
