package w9;

import java.nio.ByteBuffer;
import o9.f;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class j0 extends o9.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f107723i = Float.floatToIntBits(Float.NaN);

    j0() {
    }

    private static void h(int i10, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i10) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f107723i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // o9.h
    public f.a c(f.a aVar) throws f.b {
        int i10 = aVar.f96395c;
        if (o0.F0(i10)) {
            return i10 != 4 ? new f.a(aVar.f96393a, aVar.f96394b, 4) : f.a.f96392e;
        }
        throw new f.b(aVar);
    }

    @Override // o9.f
    public void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferG;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f96398b.f96395c;
        if (i11 == 21) {
            byteBufferG = g((i10 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferG);
                iPosition += 3;
            }
        } else if (i11 == 22) {
            byteBufferG = g(i10);
            while (iPosition < iLimit) {
                h((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferG);
                iPosition += 4;
            }
        } else if (i11 == 1342177280) {
            byteBufferG = g((i10 / 3) * 4);
            while (iPosition < iLimit) {
                h(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferG);
                iPosition += 3;
            }
        } else {
            if (i11 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferG = g(i10);
            while (iPosition < iLimit) {
                h((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferG);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferG.flip();
    }
}
