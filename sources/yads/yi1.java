package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yi1 extends jo {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    public final long[] A;
    public lm0 A0;
    public yv0 B;
    public ca0 B0;
    public yv0 C;
    public long C0;
    public hj0 D;
    public long D0;
    public hj0 E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public final long H;
    public float I;
    public float J;
    public pi1 K;
    public yv0 L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque P;
    public xi1 Q;
    public ui1 R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f118192a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f118193b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f118194c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public zq f118195d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f118196e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f118197f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f118198g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ByteBuffer f118199h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f118200i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f118201j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f118202k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f118203l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f118204m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ni1 f118205n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f118206n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final aj1 f118207o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f118208o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f118209p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f118210p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f118211q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f118212q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fa0 f118213r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f118214r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final fa0 f118215s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f118216s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fa0 f118217t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f118218t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final qo f118219u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f118220u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a43 f118221v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f118222v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f118223w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f118224w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f118225x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f118226x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long[] f118227y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f118228y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long[] f118229z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f118230z0;

    public yi1(int i10, od0 od0Var, aj1 aj1Var, boolean z10, float f10) {
        super(i10);
        this.f118205n = od0Var;
        this.f118207o = (aj1) fi.a(aj1Var);
        this.f118209p = z10;
        this.f118211q = f10;
        this.f118213r = fa0.d();
        this.f118215s = new fa0(0);
        this.f118217t = new fa0(2);
        qo qoVar = new qo();
        this.f118219u = qoVar;
        this.f118221v = new a43();
        this.f118223w = new ArrayList();
        this.f118225x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f118227y = new long[10];
        this.f118229z = new long[10];
        this.A = new long[10];
        this.C0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        qoVar.c(0);
        qoVar.f110670d.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f118208o0 = 0;
        this.f118197f0 = -1;
        this.f118198g0 = -1;
        this.f118196e0 = -9223372036854775807L;
        this.f118220u0 = -9223372036854775807L;
        this.f118222v0 = -9223372036854775807L;
        this.f118210p0 = 0;
        this.f118212q0 = 0;
    }

    public abstract float a(float f10, yv0[] yv0VarArr);

    public abstract int a(aj1 aj1Var, yv0 yv0Var);

    public abstract ArrayList a(aj1 aj1Var, yv0 yv0Var, boolean z10);

    public abstract ia0 a(ui1 ui1Var, yv0 yv0Var, yv0 yv0Var2);

    public abstract mi1 a(ui1 ui1Var, yv0 yv0Var, MediaCrypto mediaCrypto, float f10);

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public abstract void a(String str, long j10, long j11);

    public void a(fa0 fa0Var) {
    }

    public abstract void a(yv0 yv0Var, MediaFormat mediaFormat);

    public abstract boolean a(long j10, long j11, pi1 pi1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, yv0 yv0Var);

    public abstract void b(fa0 fa0Var);

    public boolean b(yv0 yv0Var) {
        return false;
    }

    public final boolean c(long j10, long j11) throws lm0 {
        boolean z10;
        boolean zA;
        int iA;
        boolean z11;
        if (this.f118198g0 < 0) {
            if (this.X && this.f118216s0) {
                try {
                    iA = this.K.a(this.f118225x);
                } catch (IllegalStateException unused) {
                    t();
                    if (this.f118226x0) {
                        u();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.f118225x);
            }
            if (iA < 0) {
                if (iA != -2) {
                    if (this.f118194c0 && (this.f118224w0 || this.f118210p0 == 2)) {
                        t();
                    }
                    return false;
                }
                this.f118218t0 = true;
                MediaFormat mediaFormatA = this.K.a();
                if (this.S != 0 && mediaFormatA.getInteger("width") == 32 && mediaFormatA.getInteger("height") == 32) {
                    this.f118193b0 = true;
                } else {
                    if (this.Z) {
                        mediaFormatA.setInteger("channel-count", 1);
                    }
                    this.M = mediaFormatA;
                    this.N = true;
                }
                return true;
            }
            if (this.f118193b0) {
                this.f118193b0 = false;
                this.K.a(false, iA);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f118225x;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                t();
                return false;
            }
            this.f118198g0 = iA;
            ByteBuffer byteBufferC = this.K.c(iA);
            this.f118199h0 = byteBufferC;
            if (byteBufferC != null) {
                byteBufferC.position(this.f118225x.offset);
                ByteBuffer byteBuffer = this.f118199h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f118225x;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f118225x;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f118220u0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            long j13 = this.f118225x.presentationTimeUs;
            int size = this.f118223w.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z11 = false;
                    break;
                }
                if (((Long) this.f118223w.get(i10)).longValue() == j13) {
                    this.f118223w.remove(i10);
                    z11 = true;
                    break;
                }
                i10++;
            }
            this.f118200i0 = z11;
            long j14 = this.f118222v0;
            long j15 = this.f118225x.presentationTimeUs;
            this.f118201j0 = j14 == j15;
            b(j15);
        }
        if (this.X && this.f118216s0) {
            try {
                pi1 pi1Var = this.K;
                ByteBuffer byteBuffer2 = this.f118199h0;
                int i11 = this.f118198g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f118225x;
                z10 = false;
                try {
                    zA = a(j10, j11, pi1Var, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f118200i0, this.f118201j0, this.C);
                } catch (IllegalStateException unused2) {
                    t();
                    if (this.f118226x0) {
                        u();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            pi1 pi1Var2 = this.K;
            ByteBuffer byteBuffer3 = this.f118199h0;
            int i12 = this.f118198g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f118225x;
            zA = a(j10, j11, pi1Var2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f118200i0, this.f118201j0, this.C);
        }
        if (zA) {
            a(this.f118225x.presentationTimeUs);
            boolean z12 = (this.f118225x.flags & 4) != 0 ? true : z10;
            this.f118198g0 = -1;
            this.f118199h0 = null;
            if (!z12) {
                return true;
            }
            t();
        }
        return z10;
    }

    @Override // yads.jo
    public boolean f() {
        return this.f118226x0;
    }

    @Override // yads.jo
    public boolean g() {
        boolean zC;
        if (this.B == null) {
            return false;
        }
        if (e()) {
            zC = this.f112417l;
        } else {
            iq2 iq2Var = this.f112413h;
            iq2Var.getClass();
            zC = iq2Var.c();
        }
        if (zC || this.f118198g0 >= 0) {
            return true;
        }
        return this.f118196e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f118196e0;
    }

    @Override // yads.jo
    public final int l() {
        return 8;
    }

    public final boolean m() throws lm0 {
        if (this.f118214r0) {
            this.f118210p0 = 1;
            if (this.U || this.W) {
                this.f118212q0 = 3;
                return false;
            }
            this.f118212q0 = 2;
        } else {
            y();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() throws yads.lm0 {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi1.n():boolean");
    }

    public final void o() {
        try {
            this.K.flush();
        } finally {
            w();
        }
    }

    public final boolean p() {
        if (this.K == null) {
            return false;
        }
        int i10 = this.f118212q0;
        if (i10 == 3 || this.U || ((this.V && !this.f118218t0) || (this.W && this.f118216s0))) {
            u();
            return true;
        }
        if (i10 == 2) {
            int i11 = w83.f117341a;
            if (i11 < 23) {
                throw new IllegalStateException();
            }
            if (i11 >= 23) {
                try {
                    y();
                } catch (lm0 e10) {
                    uf1.d("MediaCodecRenderer", uf1.a("Failed to update the DRM session, releasing the codec instead.", e10));
                    u();
                    return true;
                }
            }
        }
        o();
        return false;
    }

    public boolean q() {
        return false;
    }

    public final void r() {
        yv0 yv0Var;
        if (this.K != null || this.f118202k0 || (yv0Var = this.B) == null) {
            return;
        }
        if (this.E == null && b(yv0Var)) {
            yv0 yv0Var2 = this.B;
            this.f118204m0 = false;
            this.f118219u.b();
            this.f118217t.b();
            this.f118203l0 = false;
            this.f118202k0 = false;
            String str = yv0Var2.f118398m;
            if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                this.f118219u.f115106l = 32;
            } else {
                this.f118219u.f115106l = 1;
            }
            this.f118202k0 = true;
            return;
        }
        hj0 hj0Var = this.E;
        z7.a(this.D, hj0Var);
        this.D = hj0Var;
        String str2 = this.B.f118398m;
        if (hj0Var != null) {
            if (this.F == null) {
                gw0 gw0VarA = a(hj0Var);
                if (gw0VarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(gw0VarA.f111360a, gw0VarA.f111361b);
                        this.F = mediaCrypto;
                        this.G = !gw0VarA.f111362c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw a(6006, this.B, e10, false);
                    }
                } else if (this.D.d() == null) {
                    return;
                }
            }
            if (gw0.f111359d) {
                int iC = this.D.c();
                if (iC == 1) {
                    gj0 gj0VarD = this.D.d();
                    gj0VarD.getClass();
                    throw a(gj0VarD.f111227b, this.B, (Exception) gj0VarD, false);
                }
                if (iC != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (xi1 e11) {
            throw a(4001, this.B, e11, false);
        }
    }

    public abstract void s();

    public final void t() throws lm0 {
        int i10 = this.f118212q0;
        if (i10 == 1) {
            o();
            return;
        }
        if (i10 == 2) {
            o();
            y();
        } else if (i10 != 3) {
            this.f118226x0 = true;
            v();
        } else {
            u();
            r();
        }
    }

    public final void u() {
        try {
            pi1 pi1Var = this.K;
            if (pi1Var != null) {
                pi1Var.release();
                this.B0.f109296b++;
                a(this.R.f116659a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void v() {
    }

    public void w() {
        this.f118197f0 = -1;
        this.f118215s.f110670d = null;
        this.f118198g0 = -1;
        this.f118199h0 = null;
        this.f118196e0 = -9223372036854775807L;
        this.f118216s0 = false;
        this.f118214r0 = false;
        this.f118192a0 = false;
        this.f118193b0 = false;
        this.f118200i0 = false;
        this.f118201j0 = false;
        this.f118223w.clear();
        this.f118220u0 = -9223372036854775807L;
        this.f118222v0 = -9223372036854775807L;
        zq zqVar = this.f118195d0;
        if (zqVar != null) {
            zqVar.f118759a = 0L;
            zqVar.f118760b = 0L;
            zqVar.f118761c = false;
        }
        this.f118210p0 = 0;
        this.f118212q0 = 0;
        this.f118208o0 = this.f118206n0 ? 1 : 0;
    }

    public final void x() {
        w();
        this.A0 = null;
        this.f118195d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f118218t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f118194c0 = false;
        this.f118206n0 = false;
        this.f118208o0 = 0;
        this.G = false;
    }

    public final void y() throws lm0 {
        try {
            this.F.setMediaDrmSession(a(this.E).f111361b);
            hj0 hj0Var = this.E;
            z7.a(this.D, hj0Var);
            this.D = hj0Var;
            this.f118210p0 = 0;
            this.f118212q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a(6006, this.B, (Exception) e10, false);
        }
    }

    public boolean a(ui1 ui1Var) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public final boolean b(long j10, long j11) {
        ?? r15;
        if (this.f118226x0) {
            throw new IllegalStateException();
        }
        qo qoVar = this.f118219u;
        int i10 = qoVar.f115105k;
        if (i10 > 0) {
            r15 = 0;
            if (!a(j10, j11, null, qoVar.f110670d, this.f118198g0, 0, i10, qoVar.f110672f, qoVar.b(Integer.MIN_VALUE), this.f118219u.b(4), this.C)) {
                return false;
            }
            a(this.f118219u.f115104j);
            this.f118219u.b();
        } else {
            r15 = 0;
        }
        if (this.f118224w0) {
            this.f118226x0 = true;
            return r15;
        }
        if (this.f118203l0) {
            if (!this.f118219u.a(this.f118217t)) {
                throw new IllegalStateException();
            }
            this.f118203l0 = r15;
        }
        if (this.f118204m0) {
            qo qoVar2 = this.f118219u;
            if (qoVar2.f115105k > 0) {
                return true;
            }
            this.f118204m0 = r15;
            qoVar2.b();
            this.f118217t.b();
            this.f118203l0 = r15;
            this.f118202k0 = r15;
            this.f118204m0 = r15;
            r();
            if (!this.f118202k0) {
                return r15;
            }
        }
        if (this.f118224w0) {
            throw new IllegalStateException();
        }
        zv0 zv0Var = this.f112408c;
        zv0Var.f118844a = null;
        zv0Var.f118845b = null;
        this.f118217t.b();
        while (true) {
            this.f118217t.b();
            int iA = a(zv0Var, this.f118217t, (int) r15);
            if (iA == -5) {
                a(zv0Var);
                break;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
            } else {
                if (this.f118217t.b(4)) {
                    this.f118224w0 = true;
                    break;
                }
                if (this.f118228y0) {
                    yv0 yv0Var = this.B;
                    yv0Var.getClass();
                    this.C = yv0Var;
                    a(yv0Var, (MediaFormat) null);
                    this.f118228y0 = r15;
                }
                this.f118217t.c();
                if (!this.f118219u.a(this.f118217t)) {
                    this.f118203l0 = true;
                    break;
                }
            }
        }
        qo qoVar3 = this.f118219u;
        if (qoVar3.f115105k > 0) {
            qoVar3.c();
        }
        if (this.f118219u.f115105k > 0 || this.f118224w0 || this.f118204m0) {
            return true;
        }
        return r15;
    }

    public final gw0 a(hj0 hj0Var) throws lm0 {
        w10 w10VarE = hj0Var.e();
        if (w10VarE != null && !(w10VarE instanceof gw0)) {
            throw a(6001, this.B, (Exception) new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + w10VarE), false);
        }
        return (gw0) w10VarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.ui1 r18, android.media.MediaCrypto r19) {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi1.a(yads.ui1, android.media.MediaCrypto):void");
    }

    public final boolean c(int i10) throws lm0 {
        zv0 zv0Var = this.f112408c;
        zv0Var.f118844a = null;
        zv0Var.f118845b = null;
        this.f118213r.b();
        int iA = a(zv0Var, this.f118213r, i10 | 4);
        if (iA == -5) {
            a(zv0Var);
            return true;
        }
        if (iA != -4 || !this.f118213r.b(4)) {
            return false;
        }
        this.f118224w0 = true;
        t();
        return false;
    }

    public final boolean c(yv0 yv0Var) {
        if (w83.f117341a >= 23 && this.K != null && this.f118212q0 != 3 && this.f112412g != 0) {
            float f10 = this.J;
            yv0[] yv0VarArr = this.f112414i;
            yv0VarArr.getClass();
            float fA = a(f10, yv0VarArr);
            float f11 = this.O;
            if (f11 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                if (this.f118214r0) {
                    this.f118210p0 = 1;
                    this.f118212q0 = 3;
                    return false;
                }
                u();
                r();
                return false;
            }
            if (f11 == -1.0f && fA <= this.f118211q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    public final List b(boolean z10) {
        ArrayList arrayListA = a(this.f118207o, this.B, z10);
        if (!arrayListA.isEmpty() || !z10) {
            return arrayListA;
        }
        ArrayList arrayListA2 = a(this.f118207o, this.B, false);
        if (!arrayListA2.isEmpty()) {
            uf1.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f118398m + ", but no secure decoder available. Trying to proceed with " + arrayListA2 + ".");
        }
        return arrayListA2;
    }

    public final void b(long j10) {
        Object objA;
        a43 a43Var = this.f118221v;
        synchronized (a43Var) {
            objA = a43Var.a(j10, true);
        }
        yv0 yv0Var = (yv0) objA;
        if (yv0Var == null && this.N) {
            yv0Var = (yv0) this.f118221v.c();
        }
        if (yv0Var != null) {
            this.C = yv0Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0051 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.media.MediaCrypto r20, boolean r21) throws yads.xi1 {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi1.a(android.media.MediaCrypto, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (r12 != false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yads.ia0 a(yads.zv0 r12) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.yi1.a(yads.zv0):yads.ia0");
    }

    @Override // yads.jo
    public void a(long j10, boolean z10) {
        int i10;
        this.f118224w0 = false;
        this.f118226x0 = false;
        this.f118230z0 = false;
        if (this.f118202k0) {
            this.f118219u.b();
            this.f118217t.b();
            this.f118203l0 = false;
        } else if (p()) {
            r();
        }
        a43 a43Var = this.f118221v;
        synchronized (a43Var) {
            i10 = a43Var.f108554d;
        }
        if (i10 > 0) {
            this.f118228y0 = true;
        }
        this.f118221v.a();
        int i11 = this.E0;
        if (i11 != 0) {
            int i12 = i11 - 1;
            this.D0 = this.f118229z[i12];
            this.C0 = this.f118227y[i12];
            this.E0 = 0;
        }
    }

    public void a(long j10) {
        while (true) {
            int i10 = this.E0;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f118227y;
            this.C0 = jArr[0];
            this.D0 = this.f118229z[0];
            int i11 = i10 - 1;
            this.E0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f118229z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            s();
        }
    }

    @Override // yads.jo
    public final void a(yv0[] yv0VarArr, long j10, long j11) {
        if (this.D0 == -9223372036854775807L) {
            if (this.C0 == -9223372036854775807L) {
                this.C0 = j10;
                this.D0 = j11;
                return;
            }
            throw new IllegalStateException();
        }
        int i10 = this.E0;
        if (i10 == this.f118229z.length) {
            uf1.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f118229z[this.E0 - 1]);
        } else {
            this.E0 = i10 + 1;
        }
        long[] jArr = this.f118227y;
        int i11 = this.E0 - 1;
        jArr[i11] = j10;
        this.f118229z[i11] = j11;
        this.A[i11] = this.f118220u0;
    }

    @Override // yads.jo
    public final void a(long j10, long j11) throws lm0 {
        boolean z10 = false;
        if (this.f118230z0) {
            this.f118230z0 = false;
            t();
        }
        lm0 lm0Var = this.A0;
        if (lm0Var == null) {
            try {
                if (this.f118226x0) {
                    v();
                    return;
                }
                if (this.B != null || c(2)) {
                    r();
                    if (this.f118202k0) {
                        q43.a("bypassRender");
                        while (b(j10, j11)) {
                        }
                        q43.a();
                    } else if (this.K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        q43.a("drainAndFeed");
                        while (c(j10, j11) && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        while (n() && (this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < this.H)) {
                        }
                        q43.a();
                    } else {
                        ca0 ca0Var = this.B0;
                        int i10 = ca0Var.f109298d;
                        iq2 iq2Var = this.f112413h;
                        iq2Var.getClass();
                        ca0Var.f109298d = i10 + iq2Var.a(j10 - this.f112415j);
                        c(1);
                    }
                    synchronized (this.B0) {
                    }
                    return;
                }
                return;
            } catch (IllegalStateException e10) {
                int i11 = w83.f117341a;
                if (i11 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                    StackTraceElement[] stackTrace = e10.getStackTrace();
                    if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                        throw e10;
                    }
                }
                a(e10);
                if (i11 >= 21 && (e10 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e10).isRecoverable()) {
                    z10 = true;
                }
                if (z10) {
                    u();
                }
                throw a(4003, this.B, a(e10, this.R), z10);
            }
        }
        this.A0 = null;
        throw lm0Var;
    }

    @Override // yads.jo
    public void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
    }

    @Override // yads.jo
    public final int a(yv0 yv0Var) throws lm0 {
        try {
            return a(this.f118207o, yv0Var);
        } catch (dj1 e10) {
            throw a(4002, yv0Var, (Exception) e10, false);
        }
    }

    public ti1 a(IllegalStateException illegalStateException, ui1 ui1Var) {
        return new ti1(illegalStateException, ui1Var);
    }
}
