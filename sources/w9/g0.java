package w9;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f107696d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, UnsignedBytes.MAX_POWER_OF_TWO, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f107697e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f107698a = o9.f.f96391a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f107700c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f107699b = 2;

    private ByteBuffer b(ByteBuffer byteBuffer, byte[] bArr) {
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = (i11 + 255) / 255;
        int length = i12 + 27 + i11;
        if (this.f107699b == 2) {
            int length2 = bArr != null ? bArr.length + 28 : f107696d.length;
            length += f107697e.length + length2;
            i10 = length2;
        } else {
            i10 = 0;
        }
        ByteBuffer byteBufferC = c(length);
        if (this.f107699b == 2) {
            if (bArr != null) {
                e(byteBufferC, bArr);
            } else {
                byteBufferC.put(f107696d);
            }
            byteBufferC.put(f107697e);
        }
        int iJ = this.f107700c + oa.k0.j(byteBuffer);
        this.f107700c = iJ;
        f(byteBufferC, iJ, this.f107699b, i12, false);
        for (int i13 = 0; i13 < i12; i13++) {
            if (i11 >= 255) {
                byteBufferC.put((byte) -1);
                i11 -= 255;
            } else {
                byteBufferC.put((byte) i11);
                i11 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBufferC.put(byteBuffer.get(iPosition));
            iPosition++;
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferC.flip();
        if (this.f107699b == 2) {
            byte[] bArrArray = byteBufferC.array();
            int iArrayOffset = byteBufferC.arrayOffset() + i10;
            byte[] bArr2 = f107697e;
            byteBufferC.putInt(i10 + bArr2.length + 22, o0.x(bArrArray, iArrayOffset + bArr2.length, byteBufferC.limit() - byteBufferC.position(), 0));
        } else {
            byteBufferC.putInt(22, o0.x(byteBufferC.array(), byteBufferC.arrayOffset(), byteBufferC.limit() - byteBufferC.position(), 0));
        }
        this.f107699b++;
        return byteBufferC;
    }

    private ByteBuffer c(int i10) {
        if (this.f107698a.capacity() < i10) {
            this.f107698a = ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f107698a.clear();
        }
        return this.f107698a;
    }

    private void e(ByteBuffer byteBuffer, byte[] bArr) {
        f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(UnsignedBytes.checkedCast(bArr.length));
        byteBuffer.put(bArr);
        byteBuffer.putInt(22, o0.x(byteBuffer.array(), byteBuffer.arrayOffset(), bArr.length + 28, 0));
        byteBuffer.position(bArr.length + 28);
    }

    private void f(ByteBuffer byteBuffer, long j10, int i10, int i11, boolean z10) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z10 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j10);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i10);
        byteBuffer.putInt(0);
        byteBuffer.put(UnsignedBytes.checkedCast(i11));
    }

    public void a(t9.f fVar, List list) {
        q9.a.e(fVar.f104988e);
        if (fVar.f104988e.limit() - fVar.f104988e.position() == 0) {
            return;
        }
        this.f107698a = b(fVar.f104988e, (this.f107699b == 2 && (list.size() == 1 || list.size() == 3)) ? (byte[]) list.get(0) : null);
        fVar.c();
        fVar.m(this.f107698a.remaining());
        fVar.f104988e.put(this.f107698a);
        fVar.n();
    }

    public void d() {
        this.f107698a = o9.f.f96391a;
        this.f107700c = 0;
        this.f107699b = 2;
    }
}
