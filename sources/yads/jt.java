package yads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class jt extends vn {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f112448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f112449j;

    @Override // yads.tk
    public final void a(ByteBuffer byteBuffer) {
        int[] iArr = this.f112449j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferA = a(((iLimit - iPosition) / this.f117125b.f115472d) * this.f117126c.f115472d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferA.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f117125b.f115472d;
        }
        byteBuffer.position(iLimit);
        byteBufferA.flip();
    }

    @Override // yads.vn
    public final rk b(rk rkVar) throws sk {
        int[] iArr = this.f112448i;
        if (iArr == null) {
            return rk.f115468e;
        }
        if (rkVar.f115471c != 2) {
            throw new sk(rkVar);
        }
        boolean z10 = rkVar.f115470b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= rkVar.f115470b) {
                throw new sk(rkVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new rk(rkVar.f115469a, iArr.length, 2) : rk.f115468e;
    }

    @Override // yads.vn
    public final void e() {
        this.f112449j = this.f112448i;
    }

    @Override // yads.vn
    public final void g() {
        this.f112449j = null;
        this.f112448i = null;
    }
}
