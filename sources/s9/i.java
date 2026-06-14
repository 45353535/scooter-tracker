package s9;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f99813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f99814c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f99818g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f99816e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f99817f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f99815d = new byte[1];

    public i(g gVar, k kVar) {
        this.f99813b = gVar;
        this.f99814c = kVar;
    }

    private void m() {
        if (this.f99816e) {
            return;
        }
        this.f99813b.b(this.f99814c);
        this.f99816e = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f99817f) {
            return;
        }
        this.f99813b.close();
        this.f99817f = true;
    }

    public void n() {
        m();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f99815d) == -1) {
            return -1;
        }
        return this.f99815d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        q9.a.g(!this.f99817f);
        m();
        int i12 = this.f99813b.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f99818g += (long) i12;
        return i12;
    }
}
