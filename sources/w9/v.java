package w9;

import java.nio.ByteBuffer;
import java.util.Arrays;
import o9.f;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class v extends o9.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f107800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f107801j;

    v() {
    }

    @Override // o9.h
    public f.a c(f.a aVar) throws f.b {
        int[] iArr = this.f107800i;
        if (iArr == null) {
            return f.a.f96392e;
        }
        int i10 = aVar.f96395c;
        if (i10 != 2 && i10 != 4) {
            throw new f.b(aVar);
        }
        boolean z10 = aVar.f96394b != iArr.length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= aVar.f96394b) {
                throw new f.b("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", aVar);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new f.a(aVar.f96393a, iArr.length, aVar.f96395c) : f.a.f96392e;
    }

    @Override // o9.h
    protected void d() {
        this.f107801j = this.f107800i;
    }

    @Override // o9.h
    protected void f() {
        this.f107801j = null;
        this.f107800i = null;
    }

    public void h(int[] iArr) {
        this.f107800i = iArr;
    }

    @Override // o9.f
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) q9.a.e(this.f107801j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f96398b.f96396d) * this.f96399c.f96396d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                int iQ = (o0.Q(this.f96398b.f96395c) * i10) + iPosition;
                int i11 = this.f96398b.f96395c;
                if (i11 == 2) {
                    byteBufferG.putShort(byteBuffer.getShort(iQ));
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("Unexpected encoding: " + this.f96398b.f96395c);
                    }
                    byteBufferG.putFloat(byteBuffer.getFloat(iQ));
                }
            }
            iPosition += this.f96398b.f96396d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
