package yads;

import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class gw2 extends vn {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f111363i = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f111364j = 20000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final short f111365k = 1024;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f111366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f111367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f111368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f111369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f111370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f111371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f111372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f111373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f111374t;

    public gw2(int i10) {
        byte[] bArr = w83.f117346f;
        this.f111368n = bArr;
        this.f111369o = bArr;
    }

    @Override // yads.tk
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int iLimit2;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f117130g.hasRemaining()) {
            int i10 = this.f111370p;
            if (i10 == 0) {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f111368n.length));
                int iLimit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit4)) > this.f111365k) {
                            int i11 = this.f111366l;
                            iPosition = ((iLimit4 / i11) * i11) + i11;
                            break;
                        }
                        iLimit4 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.f111370p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    a(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.f111373s = true;
                    }
                }
                byteBuffer.limit(iLimit3);
            } else if (i10 == 1) {
                int iLimit5 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position();
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit2 = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition2)) > this.f111365k) {
                            int i12 = this.f111366l;
                            iLimit2 = (iPosition2 / i12) * i12;
                            break;
                        }
                        iPosition2 += 2;
                    }
                }
                int iPosition3 = iLimit2 - byteBuffer.position();
                byte[] bArr = this.f111368n;
                int length = bArr.length;
                int i13 = this.f111371q;
                int i14 = length - i13;
                if (iLimit2 >= iLimit5 || iPosition3 >= i14) {
                    int iMin = Math.min(iPosition3, i14);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.f111368n, this.f111371q, iMin);
                    int i15 = this.f111371q + iMin;
                    this.f111371q = i15;
                    byte[] bArr2 = this.f111368n;
                    if (i15 == bArr2.length) {
                        if (this.f111373s) {
                            int i16 = this.f111372r;
                            a(i16).put(bArr2, 0, i16).flip();
                            if (i16 > 0) {
                                this.f111373s = true;
                            }
                            this.f111374t += (long) ((this.f111371q - (this.f111372r * 2)) / this.f111366l);
                        } else {
                            this.f111374t += (long) ((i15 - this.f111372r) / this.f111366l);
                        }
                        byte[] bArr3 = this.f111368n;
                        int i17 = this.f111371q;
                        int iMin2 = Math.min(byteBuffer.remaining(), this.f111372r);
                        int i18 = this.f111372r - iMin2;
                        System.arraycopy(bArr3, i17 - i18, this.f111369o, 0, i18);
                        byteBuffer.position(byteBuffer.limit() - iMin2);
                        byteBuffer.get(this.f111369o, i18, iMin2);
                        this.f111371q = 0;
                        this.f111370p = 2;
                    }
                    byteBuffer.limit(iLimit5);
                } else {
                    a(i13).put(bArr, 0, i13).flip();
                    if (i13 > 0) {
                        this.f111373s = true;
                    }
                    this.f111371q = 0;
                    this.f111370p = 0;
                }
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                int iLimit6 = byteBuffer.limit();
                int iPosition4 = byteBuffer.position();
                while (true) {
                    if (iPosition4 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iPosition4)) > this.f111365k) {
                            int i19 = this.f111366l;
                            iLimit = (iPosition4 / i19) * i19;
                            break;
                        }
                        iPosition4 += 2;
                    }
                }
                byteBuffer.limit(iLimit);
                this.f111374t += (long) (byteBuffer.remaining() / this.f111366l);
                byte[] bArr4 = this.f111369o;
                int i20 = this.f111372r;
                int iMin3 = Math.min(byteBuffer.remaining(), this.f111372r);
                int i21 = this.f111372r - iMin3;
                System.arraycopy(bArr4, i20 - i21, this.f111369o, 0, i21);
                byteBuffer.position(byteBuffer.limit() - iMin3);
                byteBuffer.get(this.f111369o, i21, iMin3);
                if (iLimit < iLimit6) {
                    byte[] bArr5 = this.f111369o;
                    int i22 = this.f111372r;
                    a(i22).put(bArr5, 0, i22).flip();
                    if (i22 > 0) {
                        this.f111373s = true;
                    }
                    this.f111370p = 0;
                    byteBuffer.limit(iLimit6);
                }
            }
        }
    }

    @Override // yads.vn
    public final rk b(rk rkVar) throws sk {
        if (rkVar.f115471c == 2) {
            return this.f111367m ? rkVar : rk.f115468e;
        }
        throw new sk(rkVar);
    }

    @Override // yads.vn
    public final void e() {
        if (this.f111367m) {
            rk rkVar = this.f117125b;
            int i10 = rkVar.f115472d;
            this.f111366l = i10;
            long j10 = this.f111363i;
            long j11 = rkVar.f115469a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f111368n.length != i11) {
                this.f111368n = new byte[i11];
            }
            int i12 = ((int) ((this.f111364j * j11) / 1000000)) * i10;
            this.f111372r = i12;
            if (this.f111369o.length != i12) {
                this.f111369o = new byte[i12];
            }
        }
        this.f111370p = 0;
        this.f111374t = 0L;
        this.f111371q = 0;
        this.f111373s = false;
    }

    @Override // yads.vn
    public final void f() {
        int i10 = this.f111371q;
        if (i10 > 0) {
            a(i10).put(this.f111368n, 0, i10).flip();
            if (i10 > 0) {
                this.f111373s = true;
            }
        }
        if (this.f111373s) {
            return;
        }
        this.f111374t += (long) (this.f111372r / this.f111366l);
    }

    @Override // yads.vn
    public final void g() {
        this.f111367m = false;
        this.f111372r = 0;
        byte[] bArr = w83.f117346f;
        this.f111368n = bArr;
        this.f111369o = bArr;
    }

    @Override // yads.vn, yads.tk
    public final boolean isActive() {
        return this.f111367m;
    }
}
