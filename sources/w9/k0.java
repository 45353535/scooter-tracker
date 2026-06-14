package w9;

import java.nio.ByteBuffer;
import o9.f;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class k0 extends o9.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f107726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f107727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f107728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f107729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte[] f107730m = o0.f98842f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f107731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f107732o;

    @Override // o9.h
    public f.a c(f.a aVar) throws f.b {
        int i10 = aVar.f96395c;
        if (i10 != 2 && i10 != 4) {
            throw new f.b(aVar);
        }
        this.f107728k = true;
        return (this.f107726i == 0 && this.f107727j == 0) ? f.a.f96392e : aVar;
    }

    @Override // o9.h
    protected void d() {
        if (this.f107728k) {
            this.f107728k = false;
            int i10 = this.f107727j;
            int i11 = this.f96398b.f96396d;
            this.f107730m = new byte[i10 * i11];
            this.f107729l = this.f107726i * i11;
        }
        this.f107731n = 0;
    }

    @Override // o9.h
    protected void e() {
        if (this.f107728k) {
            int i10 = this.f107731n;
            if (i10 > 0) {
                this.f107732o += (long) (i10 / this.f96398b.f96396d);
            }
            this.f107731n = 0;
        }
    }

    @Override // o9.h
    protected void f() {
        this.f107730m = o0.f98842f;
    }

    @Override // o9.h, o9.f
    public ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f107731n) > 0) {
            g(i10).put(this.f107730m, 0, this.f107731n).flip();
            this.f107731n = 0;
        }
        return super.getOutput();
    }

    public long h() {
        return this.f107732o;
    }

    public void i() {
        this.f107732o = 0L;
    }

    @Override // o9.h, o9.f
    public boolean isEnded() {
        return super.isEnded() && this.f107731n == 0;
    }

    public void j(int i10, int i11) {
        this.f107726i = i10;
        this.f107727j = i11;
    }

    @Override // o9.f
    public void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f107729l);
        this.f107732o += (long) (iMin / this.f96398b.f96396d);
        this.f107729l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f107729l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f107731n + i11) - this.f107730m.length;
        ByteBuffer byteBufferG = g(length);
        int iP = o0.p(length, 0, this.f107731n);
        byteBufferG.put(this.f107730m, 0, iP);
        int iP2 = o0.p(length - iP, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iP2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iP2;
        int i13 = this.f107731n - iP;
        this.f107731n = i13;
        byte[] bArr = this.f107730m;
        System.arraycopy(bArr, iP, bArr, 0, i13);
        byteBuffer.get(this.f107730m, this.f107731n, i12);
        this.f107731n += i12;
        byteBufferG.flip();
    }
}
