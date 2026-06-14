package da;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
final class h extends t9.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f68519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f68520l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68521m;

    public h() {
        super(2);
        this.f68521m = 32;
    }

    private boolean s(t9.f fVar) {
        ByteBuffer byteBuffer;
        if (!w()) {
            return true;
        }
        if (this.f68520l >= this.f68521m) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.f104988e;
        return byteBuffer2 == null || (byteBuffer = this.f104988e) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    @Override // t9.f, t9.a
    public void c() {
        super.c();
        this.f68520l = 0;
    }

    public boolean r(t9.f fVar) {
        q9.a.a(!fVar.o());
        q9.a.a(!fVar.e());
        q9.a.a(!fVar.f());
        if (!s(fVar)) {
            return false;
        }
        int i10 = this.f68520l;
        this.f68520l = i10 + 1;
        if (i10 == 0) {
            this.f104990g = fVar.f104990g;
            if (fVar.h()) {
                k(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f104988e;
        if (byteBuffer != null) {
            m(byteBuffer.remaining());
            this.f104988e.put(byteBuffer);
        }
        this.f68519k = fVar.f104990g;
        return true;
    }

    public long t() {
        return this.f104990g;
    }

    public long u() {
        return this.f68519k;
    }

    public int v() {
        return this.f68520l;
    }

    public boolean w() {
        return this.f68520l > 0;
    }

    public void x(int i10) {
        q9.a.a(i10 > 0);
        this.f68521m = i10;
    }
}
