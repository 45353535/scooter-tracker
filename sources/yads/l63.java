package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class l63 extends vn {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f112984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f112985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f112986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f112987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f112988m = w83.f117346f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f112989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f112990o;

    @Override // yads.vn, yads.tk
    public final ByteBuffer a() {
        int i10;
        if (super.c() && (i10 = this.f112989n) > 0) {
            a(i10).put(this.f112988m, 0, this.f112989n).flip();
            this.f112989n = 0;
        }
        ByteBuffer byteBuffer = this.f117130g;
        this.f117130g = tk.f116269a;
        return byteBuffer;
    }

    @Override // yads.vn
    public final rk b(rk rkVar) throws sk {
        if (rkVar.f115471c != 2) {
            throw new sk(rkVar);
        }
        this.f112986k = true;
        return (this.f112984i == 0 && this.f112985j == 0) ? rk.f115468e : rkVar;
    }

    @Override // yads.vn, yads.tk
    public final boolean c() {
        return super.c() && this.f112989n == 0;
    }

    @Override // yads.vn
    public final void e() {
        if (this.f112986k) {
            this.f112986k = false;
            int i10 = this.f112985j;
            int i11 = this.f117125b.f115472d;
            this.f112988m = new byte[i10 * i11];
            this.f112987l = this.f112984i * i11;
        }
        this.f112989n = 0;
    }

    @Override // yads.vn
    public final void f() {
        if (this.f112986k) {
            int i10 = this.f112989n;
            if (i10 > 0) {
                this.f112990o += (long) (i10 / this.f117125b.f115472d);
            }
            this.f112989n = 0;
        }
    }

    @Override // yads.vn
    public final void g() {
        this.f112988m = w83.f117346f;
    }

    @Override // yads.tk
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f112987l);
        this.f112990o += (long) (iMin / this.f117125b.f115472d);
        this.f112987l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f112987l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f112989n + i11) - this.f112988m.length;
        ByteBuffer byteBufferA = a(length);
        int i12 = this.f112989n;
        int i13 = w83.f117341a;
        int iMax = Math.max(0, Math.min(length, i12));
        byteBufferA.put(this.f112988m, 0, iMax);
        int iMax2 = Math.max(0, Math.min(length - iMax, i11));
        byteBuffer.limit(byteBuffer.position() + iMax2);
        byteBufferA.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i14 = i11 - iMax2;
        int i15 = this.f112989n - iMax;
        this.f112989n = i15;
        byte[] bArr = this.f112988m;
        System.arraycopy(bArr, iMax, bArr, 0, i15);
        byteBuffer.get(this.f112988m, this.f112989n, i14);
        this.f112989n += i14;
        byteBufferA.flip();
    }
}
