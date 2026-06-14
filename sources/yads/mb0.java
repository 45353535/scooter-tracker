package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public final class mb0 implements bl {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public tk[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public il X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mk f113371a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f113372a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fb0 f113373b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f113374b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f113375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jt f113376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l63 f113377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tk[] f113378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tk[] f113379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final hy f113380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gl f113381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f113382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f113383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f113384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lb0 f113385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ib0 f113386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ib0 f113387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ob0 f113388p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wc2 f113389q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public yk f113390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public eb0 f113391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public eb0 f113392t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f113393u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public hk f113394v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public hb0 f113395w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public hb0 f113396x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public gc2 f113397y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f113398z;

    public mb0(db0 db0Var) {
        this.f113371a = db0Var.f109867a;
        fb0 fb0Var = db0Var.f109868b;
        this.f113373b = fb0Var;
        int i10 = w83.f117341a;
        this.f113375c = i10 >= 21 && db0Var.f109869c;
        this.f113383k = i10 >= 23 && db0Var.f109870d;
        this.f113384l = i10 >= 29 ? db0Var.f109871e : 0;
        this.f113388p = db0Var.f109872f;
        hy hyVar = new hy(0);
        this.f113380h = hyVar;
        hyVar.d();
        this.f113381i = new gl(new jb0(this));
        jt jtVar = new jt();
        this.f113376d = jtVar;
        l63 l63Var = new l63();
        this.f113377e = l63Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new mn2(), jtVar, l63Var);
        Collections.addAll(arrayList, fb0Var.a());
        this.f113378f = (tk[]) arrayList.toArray(new tk[0]);
        this.f113379g = new tk[]{new qu0()};
        this.J = 1.0f;
        this.f113394v = hk.f111607h;
        this.W = 0;
        this.X = new il();
        gc2 gc2Var = gc2.f111140e;
        this.f113396x = new hb0(gc2Var, false, 0L, 0L);
        this.f113397y = gc2Var;
        this.R = -1;
        this.K = new tk[0];
        this.L = new ByteBuffer[0];
        this.f113382j = new ArrayDeque();
        this.f113386n = new ib0();
        this.f113387o = new ib0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mb0.a(long):void");
    }

    public final void b() {
        if (f()) {
            j();
            AudioTrack audioTrack = this.f113381i.f111248c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f113393u.pause();
            }
            if (a(this.f113393u)) {
                lb0 lb0Var = this.f113385m;
                lb0Var.getClass();
                lb0Var.b(this.f113393u);
            }
            AudioTrack audioTrack2 = this.f113393u;
            this.f113393u = null;
            if (w83.f117341a < 21 && !this.V) {
                this.W = 0;
            }
            eb0 eb0Var = this.f113391s;
            if (eb0Var != null) {
                this.f113392t = eb0Var;
                this.f113391s = null;
            }
            gl glVar = this.f113381i;
            glVar.f111257l = 0L;
            glVar.f111268w = 0;
            glVar.f111267v = 0;
            glVar.f111258m = 0L;
            glVar.C = 0L;
            glVar.F = 0L;
            glVar.f111256k = false;
            glVar.f111248c = null;
            glVar.f111251f = null;
            hy hyVar = this.f113380h;
            synchronized (hyVar) {
                hyVar.f111800a = false;
            }
            new ab0(this, audioTrack2).start();
        }
        this.f113387o.f111938a = null;
        this.f113386n.f111938a = null;
    }

    public final hb0 c() {
        hb0 hb0Var = this.f113395w;
        return hb0Var != null ? hb0Var : !this.f113382j.isEmpty() ? (hb0) this.f113382j.getLast() : this.f113396x;
    }

    public final long d() {
        eb0 eb0Var = this.f113392t;
        return eb0Var.f110279c == 0 ? this.D / ((long) eb0Var.f110280d) : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws yads.xk {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mb0.e():boolean");
    }

    public final boolean f() {
        return this.f113393u != null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            gl glVar = this.f113381i;
            glVar.f111257l = 0L;
            glVar.f111268w = 0;
            glVar.f111267v = 0;
            glVar.f111258m = 0L;
            glVar.C = 0L;
            glVar.F = 0L;
            glVar.f111256k = false;
            if (glVar.f111269x == -9223372036854775807L) {
                el elVar = glVar.f111251f;
                elVar.getClass();
                elVar.a();
                this.f113393u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            el elVar = this.f113381i.f111251f;
            elVar.getClass();
            elVar.a();
            this.f113393u.play();
        }
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        gl glVar = this.f113381i;
        long jD = d();
        glVar.f111271z = glVar.a();
        glVar.f111269x = SystemClock.elapsedRealtime() * 1000;
        glVar.A = jD;
        this.f113393u.stop();
        this.A = 0;
    }

    public final void j() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i10 = 0;
        this.f113374b0 = false;
        this.F = 0;
        this.f113396x = new hb0(c().f111533a, c().f111534b, 0L, 0L);
        this.I = 0L;
        this.f113395w = null;
        this.f113382j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f113398z = null;
        this.A = 0;
        this.f113377e.f112990o = 0L;
        while (true) {
            tk[] tkVarArr = this.K;
            if (i10 >= tkVarArr.length) {
                return;
            }
            tk tkVar = tkVarArr[i10];
            tkVar.flush();
            this.L[i10] = tkVar.a();
            i10++;
        }
    }

    public final void k() {
        if (f()) {
            if (w83.f117341a >= 21) {
                this.f113393u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f113393u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final void b(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.L[i10 - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = tk.f116269a;
                }
            }
            if (i10 == length) {
                a(byteBuffer, j10);
            } else {
                tk tkVar = this.K[i10];
                if (i10 > this.R) {
                    tkVar.a(byteBuffer);
                }
                ByteBuffer byteBufferA = tkVar.a();
                this.L[i10] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(yv0 yv0Var, int[] iArr) throws wk {
        int iB;
        int iIntValue;
        tk[] tkVarArr;
        int i10;
        int iIntValue2;
        int i11;
        int iB2;
        int i12;
        int iMax;
        boolean z10;
        tk[] tkVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(yv0Var.f118398m)) {
            if (w83.e(yv0Var.B)) {
                iB2 = w83.b(yv0Var.B, yv0Var.f118411z);
                int i13 = yv0Var.B;
                if (this.f113375c && (i13 == 536870912 || i13 == 805306368 || i13 == 4)) {
                    tkVarArr2 = this.f113379g;
                } else {
                    tkVarArr2 = this.f113378f;
                }
                l63 l63Var = this.f113377e;
                int i14 = yv0Var.C;
                int i15 = yv0Var.D;
                l63Var.f112984i = i14;
                l63Var.f112985j = i15;
                if (w83.f117341a < 21 && yv0Var.f118411z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i16 = 0; i16 < 6; i16++) {
                        iArr2[i16] = i16;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.f113376d.f112448i = iArr2;
                rk rkVar = new rk(yv0Var.A, yv0Var.f118411z, yv0Var.B);
                for (tk tkVar : tkVarArr2) {
                    try {
                        rk rkVarA = tkVar.a(rkVar);
                        if (tkVar.isActive()) {
                            rkVar = rkVarA;
                        }
                    } catch (sk e10) {
                        throw new wk(e10, yv0Var);
                    }
                }
                iIntValue = rkVar.f115471c;
                int i17 = rkVar.f115469a;
                int iA = w83.a(rkVar.f115470b);
                iB = w83.b(iIntValue, rkVar.f115470b);
                tkVarArr = tkVarArr2;
                i10 = i17;
                iIntValue2 = iA;
                i11 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            tk[] tkVarArr3 = new tk[0];
            int i18 = yv0Var.A;
            iB = -1;
            if (a(yv0Var, this.f113394v)) {
                String str = yv0Var.f118398m;
                str.getClass();
                iIntValue = tr1.b(str, yv0Var.f118395j);
                tkVarArr = tkVarArr3;
                i10 = i18;
                iIntValue2 = w83.a(yv0Var.f118411z);
                i11 = 1;
            } else {
                Pair pairA = this.f113371a.a(yv0Var);
                if (pairA != null) {
                    iIntValue = ((Integer) pairA.first).intValue();
                    tkVarArr = tkVarArr3;
                    i10 = i18;
                    iIntValue2 = ((Integer) pairA.second).intValue();
                    i11 = 2;
                } else {
                    throw new wk("Unable to configure passthrough for: " + yv0Var, yv0Var);
                }
            }
            iB2 = -1;
        }
        ob0 ob0Var = this.f113388p;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, iIntValue2, iIntValue);
        if (minBufferSize != -2) {
            double d10 = this.f113383k ? 8.0d : 1.0d;
            ob0Var.getClass();
            if (i11 != 0) {
                int i19 = 80000;
                if (i11 == 1) {
                    switch (iIntValue) {
                        case 5:
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 6:
                        case 18:
                            i19 = 768000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 7:
                            i19 = 192000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 8:
                            i19 = 2250000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 9:
                            i19 = 40000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 10:
                            i19 = 100000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 11:
                            i19 = 16000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 12:
                            i19 = 7000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            i19 = 3062500;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 15:
                            i19 = 8000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 16:
                            i19 = 256000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                        case 17:
                            i19 = 336000;
                            i12 = iB2;
                            iMax = ec1.a((((long) 50000000) * ((long) i19)) / 1000000);
                            break;
                    }
                } else if (i11 == 2) {
                    int i20 = iIntValue == 5 ? 500000 : 250000;
                    switch (iIntValue) {
                        case 5:
                            z10 = true;
                            break;
                        case 6:
                        case 18:
                            z10 = true;
                            i19 = 768000;
                            break;
                        case 7:
                            z10 = true;
                            i19 = 192000;
                            break;
                        case 8:
                            z10 = true;
                            i19 = 2250000;
                            break;
                        case 9:
                            z10 = true;
                            i19 = 40000;
                            break;
                        case 10:
                            z10 = true;
                            i19 = 100000;
                            break;
                        case 11:
                            z10 = true;
                            i19 = 16000;
                            break;
                        case 12:
                            z10 = true;
                            i19 = 7000;
                            break;
                        case 13:
                        default:
                            throw new IllegalArgumentException();
                        case 14:
                            z10 = true;
                            i19 = 3062500;
                            break;
                        case 15:
                            z10 = true;
                            i19 = 8000;
                            break;
                        case 16:
                            z10 = true;
                            i19 = 256000;
                            break;
                        case 17:
                            z10 = true;
                            i19 = 336000;
                            break;
                    }
                    iMax = ec1.a((((long) i20) * ((long) i19)) / 1000000);
                    i12 = iB2;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                i12 = iB2;
                long j10 = i10;
                long j11 = iB;
                int iA2 = ec1.a(((((long) 250000) * j10) * j11) / 1000000);
                int iA3 = ec1.a(((((long) 750000) * j10) * j11) / 1000000);
                int i21 = w83.f117341a;
                iMax = Math.max(iA2, Math.min(4 * minBufferSize, iA3));
            }
            int iMax2 = (((Math.max(minBufferSize, (int) (((double) iMax) * d10)) + iB) - 1) / iB) * iB;
            if (iIntValue == 0) {
                throw new wk("Invalid output encoding (mode=" + i11 + ") for: " + yv0Var, yv0Var);
            }
            if (iIntValue2 != 0) {
                this.f113372a0 = false;
                eb0 eb0Var = new eb0(yv0Var, i12, i11, iB, i10, iIntValue2, iIntValue, iMax2, tkVarArr);
                if (f()) {
                    this.f113391s = eb0Var;
                    return;
                } else {
                    this.f113392t = eb0Var;
                    return;
                }
            }
            throw new wk("Invalid output channel config (mode=" + i11 + ") for: " + yv0Var, yv0Var);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            yads.tk[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.b(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mb0.a():boolean");
    }

    public final long a(boolean z10) {
        long j10;
        long jA;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f113381i.a(z10), (d() * 1000000) / ((long) this.f113392t.f110281e));
        while (!this.f113382j.isEmpty() && jMin >= ((hb0) this.f113382j.getFirst()).f111536d) {
            this.f113396x = (hb0) this.f113382j.remove();
        }
        hb0 hb0Var = this.f113396x;
        long j11 = jMin - hb0Var.f111536d;
        if (hb0Var.f111533a.equals(gc2.f111140e)) {
            j10 = this.f113396x.f111535c + j11;
        } else if (this.f113382j.isEmpty()) {
            pz2 pz2Var = this.f113373b.f110684c;
            if (pz2Var.f114831o >= 1024) {
                long j12 = pz2Var.f114830n;
                oz2 oz2Var = pz2Var.f114826j;
                oz2Var.getClass();
                long j13 = j12 - ((long) ((oz2Var.f114466k * oz2Var.f114457b) * 2));
                int i10 = pz2Var.f114824h.f115469a;
                int i11 = pz2Var.f114823g.f115469a;
                if (i10 == i11) {
                    jA = w83.a(j11, j13, pz2Var.f114831o);
                } else {
                    jA = w83.a(j11, j13 * ((long) i10), pz2Var.f114831o * ((long) i11));
                }
            } else {
                jA = (long) (((double) pz2Var.f114819c) * j11);
            }
            j10 = jA + this.f113396x.f111535c;
        } else {
            hb0 hb0Var2 = (hb0) this.f113382j.getFirst();
            long jRound = hb0Var2.f111536d - jMin;
            float f10 = this.f113396x.f111533a.f111141b;
            int i12 = w83.f117341a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * ((double) f10));
            }
            j10 = hb0Var2.f111535c - jRound;
        }
        return ((this.f113373b.f110683b.f111374t * 1000000) / ((long) this.f113392t.f110281e)) + j10;
    }

    public final int a(yv0 yv0Var) {
        if (!"audio/raw".equals(yv0Var.f118398m)) {
            return ((this.f113372a0 || !a(yv0Var, this.f113394v)) && this.f113371a.a(yv0Var) == null) ? 0 : 2;
        }
        if (!w83.e(yv0Var.B)) {
            uf1.d("DefaultAudioSink", "Invalid PCM encoding: " + yv0Var.B);
            return 0;
        }
        int i10 = yv0Var.B;
        return (i10 == 2 || (this.f113375c && i10 == 4)) ? 2 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x011e, code lost:
    
        if (r6.a() == 0) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mb0.a(java.nio.ByteBuffer, long, int):boolean");
    }

    public final void a(gc2 gc2Var) {
        if (f()) {
            try {
                this.f113393u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(gc2Var.f111141b).setPitch(gc2Var.f111142c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                uf1.d("DefaultAudioSink", uf1.a("Failed to set playback params", e10));
            }
            gc2Var = new gc2(this.f113393u.getPlaybackParams().getSpeed(), this.f113393u.getPlaybackParams().getPitch());
            gl glVar = this.f113381i;
            glVar.f111255j = gc2Var.f111141b;
            el elVar = glVar.f111251f;
            if (elVar != null) {
                elVar.a();
            }
        }
        this.f113397y = gc2Var;
    }

    public final void a(il ilVar) {
        if (this.X.equals(ilVar)) {
            return;
        }
        ilVar.getClass();
        if (this.f113393u != null) {
            this.X.getClass();
        }
        this.X = ilVar;
    }

    public final void a(qi1 qi1Var) {
        this.f113390r = qi1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.mb0.a(java.nio.ByteBuffer, long):void");
    }

    public final boolean a(yv0 yv0Var, hk hkVar) {
        int iA;
        int playbackOffloadSupport;
        int i10 = w83.f117341a;
        if (i10 >= 29 && this.f113384l != 0) {
            String str = yv0Var.f118398m;
            str.getClass();
            int iB = tr1.b(str, yv0Var.f118395j);
            if (iB == 0 || (iA = w83.a(yv0Var.f118411z)) == 0) {
                return false;
            }
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(yv0Var.A).setChannelMask(iA).setEncoding(iB).build();
            if (hkVar.f111613g == null) {
                hkVar.f111613g = new gk(hkVar);
            }
            AudioAttributes audioAttributes = hkVar.f111613g.f111232a;
            if (i10 >= 31) {
                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
                playbackOffloadSupport = (i10 == 30 && w83.f117344d.startsWith("Pixel")) ? 2 : 1;
            } else {
                playbackOffloadSupport = 0;
            }
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((yv0Var.C != 0 || yv0Var.D != 0) && (this.f113384l == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    public static boolean a(AudioTrack audioTrack) {
        return w83.f117341a >= 29 && audioTrack.isOffloadedPlayback();
    }
}
