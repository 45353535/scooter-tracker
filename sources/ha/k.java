package ha;

import java.util.Arrays;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f73051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f73052k;

    public k(s9.g gVar, s9.k kVar, int i10, io.bidmachine.media3.common.a aVar, int i11, Object obj, byte[] bArr) {
        super(gVar, kVar, i10, aVar, i11, obj, -9223372036854775807L, -9223372036854775807L);
        this.f73051j = bArr == null ? o0.f98842f : bArr;
    }

    private void g(int i10) {
        byte[] bArr = this.f73051j;
        if (bArr.length < i10 + 16384) {
            this.f73051j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // ka.o.e
    public final void cancelLoad() {
        this.f73052k = true;
    }

    protected abstract void e(byte[] bArr, int i10);

    public byte[] f() {
        return this.f73051j;
    }

    @Override // ka.o.e
    public final void load() {
        try {
            this.f73012i.b(this.f73005b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f73052k) {
                g(i11);
                i10 = this.f73012i.read(this.f73051j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f73052k) {
                e(this.f73051j, i11);
            }
            s9.j.a(this.f73012i);
        } catch (Throwable th2) {
            s9.j.a(this.f73012i);
            throw th2;
        }
    }
}
