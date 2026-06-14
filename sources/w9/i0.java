package w9;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import o9.f;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 extends o9.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f107707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final short f107708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f107709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f107710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f107711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f107712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f107713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f107714p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f107715q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f107716r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f107717s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f107718t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f107719u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f107720v;

    public i0() {
        this(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, SilenceSkippingAudioProcessor.DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, (short) 1024);
    }

    private static int A(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    private int h(float f10) {
        return i((int) f10);
    }

    private int i(int i10) {
        int i11 = this.f107712n;
        return (i10 / i11) * i11;
    }

    private int j(int i10, int i11) {
        int i12 = this.f107709k;
        return i12 + ((((100 - i12) * (i10 * 1000)) / i11) / 1000);
    }

    private int k(int i10, int i11) {
        return (((this.f107709k - 100) * ((i10 * 1000) / i11)) / 1000) + 100;
    }

    private int l(int i10) {
        int iM = ((m(this.f107711m) - this.f107716r) * this.f107712n) - (this.f107717s.length / 2);
        q9.a.g(iM >= 0);
        return h(Math.min((i10 * this.f107707i) + 0.5f, iM));
    }

    private int m(long j10) {
        return (int) ((j10 * ((long) this.f96398b.f96393a)) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (q(byteBuffer.get(iLimit), byteBuffer.get(iLimit - 1))) {
                int i10 = this.f107712n;
                return ((iLimit / i10) * i10) + i10;
            }
        }
        return byteBuffer.position();
    }

    private int o(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (q(byteBuffer.get(iPosition), byteBuffer.get(iPosition - 1))) {
                int i10 = this.f107712n;
                return i10 * (iPosition / i10);
            }
        }
        return byteBuffer.limit();
    }

    private boolean q(byte b10, byte b11) {
        return Math.abs(A(b10, b11)) > this.f107708j;
    }

    private void r(byte[] bArr, int i10, int i11) {
        if (i11 == 3) {
            return;
        }
        for (int i12 = 0; i12 < i10; i12 += 2) {
            x(bArr, i12, (A(bArr[i12 + 1], bArr[i12]) * (i11 == 0 ? k(i12, i10 - 1) : i11 == 2 ? j(i12, i10 - 1) : this.f107709k)) / 100);
        }
    }

    private void s(ByteBuffer byteBuffer) {
        g(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void t(byte[] bArr, int i10, int i11) {
        q9.a.b(i10 % this.f107712n == 0, "byteOutput size is not aligned to frame size " + i10);
        r(bArr, i10, i11);
        g(i10).put(bArr, 0, i10).flip();
    }

    private void u(boolean z10) {
        int length;
        int iL;
        int i10 = this.f107719u;
        byte[] bArr = this.f107717s;
        if (i10 == bArr.length || z10) {
            if (this.f107716r == 0) {
                if (z10) {
                    v(i10, 3);
                    length = i10;
                } else {
                    q9.a.g(i10 >= bArr.length / 2);
                    length = this.f107717s.length / 2;
                    v(length, 0);
                }
                iL = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.f107717s.length / 2);
                v(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iL = l(length);
                v(iL, 1);
            }
            q9.a.h(length % this.f107712n == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            q9.a.g(i10 >= iL);
            this.f107719u -= length;
            int i11 = this.f107718t + length;
            this.f107718t = i11;
            this.f107718t = i11 % this.f107717s.length;
            int i12 = this.f107716r;
            int i13 = this.f107712n;
            this.f107716r = i12 + (iL / i13);
            this.f107715q += (long) ((length - iL) / i13);
        }
    }

    private void v(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        q9.a.a(this.f107719u >= i10);
        if (i11 == 2) {
            int i12 = this.f107718t;
            int i13 = this.f107719u;
            int i14 = i12 + i13;
            byte[] bArr = this.f107717s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, (i12 + i13) - i10, this.f107720v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f107720v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f107720v, 0, i15);
                    System.arraycopy(this.f107717s, 0, this.f107720v, i15, length);
                }
            }
        } else {
            int i16 = this.f107718t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f107717s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f107720v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f107720v, 0, length2);
                System.arraycopy(this.f107717s, 0, this.f107720v, length2, i10 - length2);
            }
        }
        q9.a.b(i10 % this.f107712n == 0, "sizeToOutput is not aligned to frame size: " + i10);
        q9.a.g(this.f107718t < this.f107717s.length);
        t(this.f107720v, i10, i11);
    }

    private void w(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f107717s.length));
        int iN = n(byteBuffer);
        if (iN == byteBuffer.position()) {
            this.f107714p = 1;
        } else {
            byteBuffer.limit(Math.min(iN, byteBuffer.capacity()));
            s(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private static void x(byte[] bArr, int i10, int i11) {
        if (i11 >= 32767) {
            bArr[i10] = -1;
            bArr[i10 + 1] = Ascii.DEL;
        } else if (i11 <= -32768) {
            bArr[i10] = 0;
            bArr[i10 + 1] = UnsignedBytes.MAX_POWER_OF_TWO;
        } else {
            bArr[i10] = (byte) (i11 & 255);
            bArr[i10 + 1] = (byte) (i11 >> 8);
        }
    }

    private void z(ByteBuffer byteBuffer) {
        int length;
        int i10;
        q9.a.g(this.f107718t < this.f107717s.length);
        int iLimit = byteBuffer.limit();
        int iO = o(byteBuffer);
        int iPosition = iO - byteBuffer.position();
        int i11 = this.f107718t;
        int i12 = this.f107719u;
        int i13 = i11 + i12;
        byte[] bArr = this.f107717s;
        if (i13 < bArr.length) {
            length = bArr.length - (i12 + i11);
            i10 = i11 + i12;
        } else {
            int length2 = i12 - (bArr.length - i11);
            length = i11 - length2;
            i10 = length2;
        }
        boolean z10 = iO < iLimit;
        int iMin = Math.min(iPosition, length);
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer.get(this.f107717s, i10, iMin);
        int i14 = this.f107719u + iMin;
        this.f107719u = i14;
        q9.a.g(i14 <= this.f107717s.length);
        boolean z11 = z10 && iPosition < length;
        u(z11);
        if (z11) {
            this.f107714p = 0;
            this.f107716r = 0;
        }
        byteBuffer.limit(iLimit);
    }

    @Override // o9.h
    protected f.a c(f.a aVar) throws f.b {
        if (aVar.f96395c == 2) {
            return aVar.f96393a == -1 ? f.a.f96392e : aVar;
        }
        throw new f.b(aVar);
    }

    @Override // o9.h
    public void d() {
        if (isActive()) {
            this.f107712n = this.f96398b.f96394b * 2;
            int i10 = i(m(this.f107710l) / 2) * 2;
            if (this.f107717s.length != i10) {
                this.f107717s = new byte[i10];
                this.f107720v = new byte[i10];
            }
        }
        this.f107714p = 0;
        this.f107715q = 0L;
        this.f107716r = 0;
        this.f107718t = 0;
        this.f107719u = 0;
    }

    @Override // o9.h
    public void e() {
        if (this.f107719u > 0) {
            u(true);
            this.f107716r = 0;
        }
    }

    @Override // o9.h
    public void f() {
        this.f107713o = false;
        byte[] bArr = o0.f98842f;
        this.f107717s = bArr;
        this.f107720v = bArr;
    }

    @Override // o9.h, o9.f
    public boolean isActive() {
        return super.isActive() && this.f107713o;
    }

    public long p() {
        return this.f107715q;
    }

    @Override // o9.f
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !b()) {
            int i10 = this.f107714p;
            if (i10 == 0) {
                w(byteBuffer);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                z(byteBuffer);
            }
        }
    }

    public void y(boolean z10) {
        this.f107713o = z10;
    }

    public i0(long j10, float f10, long j11, int i10, short s10) {
        boolean z10 = false;
        this.f107716r = 0;
        this.f107718t = 0;
        this.f107719u = 0;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z10 = true;
        }
        q9.a.a(z10);
        this.f107710l = j10;
        this.f107707i = f10;
        this.f107711m = j11;
        this.f107709k = i10;
        this.f107708j = s10;
        byte[] bArr = o0.f98842f;
        this.f107717s = bArr;
        this.f107720v = bArr;
    }
}
