package yads;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nj1 extends yi1 {

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int[] f113923p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static boolean f113924q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static boolean f113925r1;
    public final Context G0;
    public final if3 H0;
    public final kg3 I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public lj1 M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public ub2 Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public int f113926a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f113927b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public long f113928c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public long f113929d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public long f113930e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f113931f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public int f113932g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public int f113933h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public int f113934i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f113935j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public tg3 f113936k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f113937l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f113938m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public mj1 f113939n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public bf3 f113940o1;

    public nj1(Context context, od0 od0Var, aj1 aj1Var, boolean z10, Handler handler, sm0 sm0Var) {
        super(2, od0Var, aj1Var, z10, 30.0f);
        this.J0 = 5000L;
        this.K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new if3(applicationContext);
        this.I0 = new kg3(handler, sm0Var);
        this.L0 = B();
        this.X0 = -9223372036854775807L;
        this.f113932g1 = -1;
        this.f113933h1 = -1;
        this.f113935j1 = -1.0f;
        this.S0 = 1;
        this.f113938m1 = 0;
        A();
    }

    public static boolean B() {
        return li2.f113106g.Z0().equals(w83.f117343c);
    }

    public static boolean C() {
        int i10 = w83.f117341a;
        if (i10 <= 28) {
            oj1 oj1Var = li2.f113106g;
            String strR = oj1Var.r();
            String str = w83.f117342b;
            if (strR.equals(str) || oj1Var.I().equals(str) || oj1Var.K().equals(str) || oj1Var.J().equals(str) || oj1Var.Q0().equals(str) || oj1Var.P0().equals(str) || oj1Var.d1().equals(str) || oj1Var.e1().equals(str)) {
                return true;
            }
        }
        if (i10 <= 27 && li2.f113106g.w0().equals(w83.f117342b)) {
            return true;
        }
        if (i10 > 26) {
            return false;
        }
        oj1 oj1Var2 = li2.f113106g;
        String strA = oj1Var2.a();
        String str2 = w83.f117342b;
        if (!strA.equals(str2) && !oj1Var2.b().equals(str2) && !oj1Var2.c().equals(str2) && !oj1Var2.d().equals(str2) && !oj1Var2.e().equals(str2) && !oj1Var2.f().equals(str2) && !oj1Var2.g().equals(str2) && !oj1Var2.h().equals(str2) && !oj1Var2.i().equals(str2) && !oj1Var2.j().equals(str2) && !oj1Var2.k().equals(str2) && !oj1Var2.l().equals(str2) && !oj1Var2.m().equals(str2) && !oj1Var2.s().equals(str2) && !oj1Var2.t().equals(str2) && !oj1Var2.u().equals(str2) && !oj1Var2.v().equals(str2) && !oj1Var2.w().equals(str2) && !oj1Var2.y().equals(str2) && !oj1Var2.z().equals(str2) && !oj1Var2.A().equals(str2) && !oj1Var2.B().equals(str2) && !oj1Var2.C().equals(str2) && !oj1Var2.D().equals(str2) && !oj1Var2.E().equals(str2) && !oj1Var2.F().equals(str2) && !oj1Var2.G().equals(str2) && !oj1Var2.H().equals(str2) && !oj1Var2.L().equals(str2) && !oj1Var2.M().equals(str2) && !oj1Var2.N().equals(str2) && !oj1Var2.O().equals(str2) && !oj1Var2.P().equals(str2) && !oj1Var2.Q().equals(str2) && !oj1Var2.R().equals(str2) && !oj1Var2.S().equals(str2) && !oj1Var2.T().equals(str2) && !oj1Var2.U().equals(str2) && !oj1Var2.V().equals(str2) && !oj1Var2.W().equals(str2) && !oj1Var2.X().equals(str2) && !oj1Var2.Y().equals(str2) && !oj1Var2.Z().equals(str2) && !oj1Var2.a0().equals(str2) && !oj1Var2.b0().equals(str2) && !oj1Var2.c0().equals(str2) && !oj1Var2.d0().equals(str2) && !oj1Var2.e0().equals(str2) && !oj1Var2.f0().equals(str2) && !oj1Var2.g0().equals(str2) && !oj1Var2.h0().equals(str2) && !oj1Var2.i0().equals(str2) && !oj1Var2.j0().equals(str2) && !oj1Var2.k0().equals(str2) && !oj1Var2.l0().equals(str2) && !oj1Var2.m0().equals(str2) && !oj1Var2.n0().equals(str2) && !oj1Var2.o0().equals(str2) && !oj1Var2.p0().equals(str2) && !oj1Var2.q0().equals(str2) && !oj1Var2.r0().equals(str2) && !oj1Var2.s0().equals(str2) && !oj1Var2.t0().equals(str2) && !oj1Var2.u0().equals(str2) && !oj1Var2.v0().equals(str2) && !oj1Var2.x0().equals(str2) && !oj1Var2.y0().equals(str2) && !oj1Var2.z0().equals(str2) && !oj1Var2.A0().equals(str2) && !oj1Var2.B0().equals(str2) && !oj1Var2.C0().equals(str2) && !oj1Var2.D0().equals(str2) && !oj1Var2.E0().equals(str2) && !oj1Var2.F0().equals(str2) && !oj1Var2.H0().equals(str2) && !oj1Var2.I0().equals(str2) && !oj1Var2.K0().equals(str2) && !oj1Var2.L0().equals(str2) && !oj1Var2.M0().equals(str2) && !oj1Var2.N0().equals(str2) && !oj1Var2.O0().equals(str2) && !oj1Var2.R0().equals(str2) && !oj1Var2.S0().equals(str2) && !oj1Var2.T0().equals(str2) && !oj1Var2.U0().equals(str2) && !oj1Var2.V0().equals(str2) && !oj1Var2.W0().equals(str2) && !oj1Var2.X0().equals(str2) && !oj1Var2.Y0().equals(str2) && !oj1Var2.a1().equals(str2) && !oj1Var2.b1().equals(str2) && !oj1Var2.f1().equals(str2) && !oj1Var2.g1().equals(str2) && !oj1Var2.h1().equals(str2) && !oj1Var2.i1().equals(str2) && !oj1Var2.j1().equals(str2) && !oj1Var2.k1().equals(str2) && !oj1Var2.l1().equals(str2) && !oj1Var2.m1().equals(str2) && !oj1Var2.n1().equals(str2) && !oj1Var2.o1().equals(str2) && !oj1Var2.p1().equals(str2) && !oj1Var2.q1().equals(str2) && !oj1Var2.r1().equals(str2) && !oj1Var2.s1().equals(str2) && !oj1Var2.t1().equals(str2) && !oj1Var2.u1().equals(str2) && !oj1Var2.v1().equals(str2) && !oj1Var2.w1().equals(str2) && !oj1Var2.x1().equals(str2) && !oj1Var2.y1().equals(str2) && !oj1Var2.z1().equals(str2) && !oj1Var2.A1().equals(str2) && !oj1Var2.B1().equals(str2) && !oj1Var2.C1().equals(str2) && !oj1Var2.D1().equals(str2) && !oj1Var2.E1().equals(str2) && !oj1Var2.G1().equals(str2) && !oj1Var2.H1().equals(str2) && !oj1Var2.I1().equals(str2) && !oj1Var2.F1().equals(str2) && !oj1Var2.J1().equals(str2) && !oj1Var2.K1().equals(str2) && !oj1Var2.L1().equals(str2) && !oj1Var2.M1().equals(str2) && !oj1Var2.N1().equals(str2) && !oj1Var2.O1().equals(str2) && !oj1Var2.P1().equals(str2) && !oj1Var2.Q1().equals(str2) && !oj1Var2.R1().equals(str2) && !oj1Var2.S1().equals(str2) && !oj1Var2.T1().equals(str2) && !oj1Var2.U1().equals(str2) && !oj1Var2.V1().equals(str2) && !oj1Var2.W1().equals(str2) && !oj1Var2.X1().equals(str2) && !oj1Var2.Y1().equals(str2) && !oj1Var2.Z1().equals(str2) && !oj1Var2.a2().equals(str2) && !oj1Var2.b2().equals(str2)) {
            String strN = oj1Var2.n();
            String str3 = w83.f117344d;
            if (!strN.equals(str3) && !oj1Var2.o().equals(str3) && !oj1Var2.G0().equals(str3)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(String str) {
        if (str.startsWith(li2.f113106g.c1())) {
            return false;
        }
        synchronized (nj1.class) {
            try {
                if (!f113924q1) {
                    f113925r1 = C();
                    f113924q1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f113925r1;
    }

    public final void A() {
        this.f113936k1 = null;
    }

    public final void D() {
        int i10 = this.f113932g1;
        if (i10 == -1 && this.f113933h1 == -1) {
            return;
        }
        tg3 tg3Var = this.f113936k1;
        if (tg3Var != null && tg3Var.f116240b == i10 && tg3Var.f116241c == this.f113933h1 && tg3Var.f116242d == this.f113934i1 && tg3Var.f116243e == this.f113935j1) {
            return;
        }
        tg3 tg3Var2 = new tg3(this.f113932g1, this.f113933h1, this.f113934i1, this.f113935j1);
        this.f113936k1 = tg3Var2;
        this.I0.b(tg3Var2);
    }

    @Override // yads.yi1
    public final ia0 a(ui1 ui1Var, yv0 yv0Var, yv0 yv0Var2) {
        ia0 ia0VarA = ui1Var.a(yv0Var, yv0Var2);
        int i10 = ia0VarA.f111931e;
        int i11 = yv0Var2.f118403r;
        lj1 lj1Var = this.M0;
        if (i11 > lj1Var.f113117a || yv0Var2.f118404s > lj1Var.f113118b) {
            i10 |= 256;
        }
        if (b(yv0Var2, ui1Var) > this.M0.f113119c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new ia0(ui1Var.f116659a, yv0Var, yv0Var2, i12 != 0 ? 0 : ia0VarA.f111930d, i12);
    }

    public final void c(long j10) {
        ca0 ca0Var = this.B0;
        ca0Var.f109305k += j10;
        ca0Var.f109306l++;
        this.f113930e1 += j10;
        this.f113931f1++;
    }

    @Override // yads.jo
    public final String d() {
        return "MediaCodecVideoRenderer";
    }

    @Override // yads.yi1, yads.jo
    public final boolean g() {
        ub2 ub2Var;
        if (super.g() && (this.T0 || (((ub2Var = this.Q0) != null && this.P0 == ub2Var) || this.K == null || this.f113937l1))) {
            this.X0 = -9223372036854775807L;
            return true;
        }
        if (this.X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = -9223372036854775807L;
        return false;
    }

    @Override // yads.jo
    public final void h() {
        this.f113936k1 = null;
        z();
        this.R0 = false;
        this.f113939n1 = null;
        try {
            this.B = null;
            this.C0 = -9223372036854775807L;
            this.D0 = -9223372036854775807L;
            this.E0 = 0;
            p();
        } finally {
            this.I0.a(this.B0);
        }
    }

    @Override // yads.jo
    public final void i() {
        try {
            try {
                this.f118204m0 = false;
                this.f118219u.b();
                this.f118217t.b();
                this.f118203l0 = false;
                this.f118202k0 = false;
                u();
            } finally {
                z7.a(this.E, null);
                this.E = null;
            }
        } finally {
            ub2 ub2Var = this.Q0;
            if (ub2Var != null) {
                if (this.P0 == ub2Var) {
                    this.P0 = null;
                }
                ub2Var.release();
                this.Q0 = null;
            }
        }
    }

    @Override // yads.jo
    public final void j() {
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.f113929d1 = SystemClock.elapsedRealtime() * 1000;
        this.f113930e1 = 0L;
        this.f113931f1 = 0;
        this.H0.a();
    }

    @Override // yads.jo
    public final void k() {
        Surface surface;
        this.X0 = -9223372036854775807L;
        if (this.Z0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.a(this.Z0, jElapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = jElapsedRealtime;
        }
        int i10 = this.f113931f1;
        if (i10 != 0) {
            this.I0.c(i10, this.f113930e1);
            this.f113930e1 = 0L;
            this.f113931f1 = 0;
        }
        if3 if3Var = this.H0;
        if3Var.f111975d = false;
        ef3 ef3Var = if3Var.f111973b;
        if (ef3Var != null) {
            ef3Var.a();
            hf3 hf3Var = if3Var.f111974c;
            hf3Var.getClass();
            hf3Var.f111571c.sendEmptyMessage(2);
        }
        if (w83.f117341a < 30 || (surface = if3Var.f111976e) == null || if3Var.f111981j == Integer.MIN_VALUE || if3Var.f111979h == 0.0f) {
            return;
        }
        if3Var.f111979h = 0.0f;
        cf3.a(surface, 0.0f);
    }

    @Override // yads.yi1
    public final boolean q() {
        return this.f113937l1 && w83.f117341a < 23;
    }

    @Override // yads.yi1
    public final void s() {
        z();
    }

    @Override // yads.yi1
    public final void w() {
        super.w();
        this.f113927b1 = 0;
    }

    public final void z() {
        pi1 pi1Var;
        this.T0 = false;
        if (w83.f117341a < 23 || !this.f113937l1 || (pi1Var = this.K) == null) {
            return;
        }
        this.f113939n1 = new mj1(this, pi1Var);
    }

    public static int a(yv0 yv0Var, ui1 ui1Var) {
        int i10;
        int iIntValue;
        int i11 = 4;
        int i12 = yv0Var.f118403r;
        int i13 = yv0Var.f118404s;
        if (i12 == -1 || i13 == -1) {
            return -1;
        }
        String str = yv0Var.f118398m;
        if ("video/dolby-vision".equals(str)) {
            Pair pairB = ij1.b(yv0Var);
            str = (pairB == null || !((iIntValue = ((Integer) pairB.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                i10 = i13 * i12;
                i11 = 2;
                break;
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                i10 = i13 * i12;
                break;
            case "video/avc":
                oj1 oj1Var = li2.f113106g;
                String strX = oj1Var.x();
                String str2 = w83.f117344d;
                if (!strX.equals(str2) && (!oj1Var.q().equals(w83.f117343c) || (!oj1Var.J0().equals(str2) && (!oj1Var.p().equals(str2) || !ui1Var.f116664f)))) {
                    i10 = ((i13 + 15) / 16) * ((i12 + 15) / 16) * 256;
                    i11 = 2;
                    break;
                }
                break;
        }
        return -1;
    }

    public static int b(yv0 yv0Var, ui1 ui1Var) {
        if (yv0Var.f118399n != -1) {
            int size = yv0Var.f118400o.size();
            int length = 0;
            for (int i10 = 0; i10 < size; i10++) {
                length += ((byte[]) yv0Var.f118400o.get(i10)).length;
            }
            return yv0Var.f118399n + length;
        }
        return a(yv0Var, ui1Var);
    }

    @Override // yads.yi1
    public final void b(fa0 fa0Var) {
        boolean z10 = this.f113937l1;
        if (!z10) {
            this.f113927b1++;
        }
        if (w83.f117341a >= 23 || !z10) {
            return;
        }
        long j10 = fa0Var.f110672f;
        b(j10);
        D();
        this.B0.f109299e++;
        this.V0 = true;
        if (!this.T0) {
            this.T0 = true;
            this.I0.a(this.P0);
            this.R0 = true;
        }
        a(j10);
    }

    @Override // yads.yi1
    public final float a(float f10, yv0[] yv0VarArr) {
        float fMax = -1.0f;
        for (yv0 yv0Var : yv0VarArr) {
            float f11 = yv0Var.f118405t;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // yads.yi1
    public final ArrayList a(aj1 aj1Var, yv0 yv0Var, boolean z10) {
        return ij1.a(a(aj1Var, yv0Var, z10, this.f113937l1), yv0Var);
    }

    public static y31 a(aj1 aj1Var, yv0 yv0Var, boolean z10, boolean z11) {
        String str = yv0Var.f118398m;
        if (str == null) {
            v31 v31Var = y31.f118068c;
            return nk2.f113952f;
        }
        List listA = aj1Var.a(str, z10, z11);
        String strA = ij1.a(yv0Var);
        if (strA == null) {
            return y31.a((Collection) listA);
        }
        List listA2 = aj1Var.a(strA, z10, z11);
        v31 v31Var2 = y31.f118068c;
        return new u31().a(listA).a(listA2).a();
    }

    public final boolean b(ui1 ui1Var) {
        boolean z10;
        int i10;
        if (w83.f117341a >= 23 && !this.f113937l1 && !b(ui1Var.f116659a)) {
            if (ui1Var.f116664f) {
                Context context = this.G0;
                synchronized (ub2.class) {
                    try {
                        if (!ub2.f116602f) {
                            if (dy0.a(context)) {
                                i10 = dy0.c() ? 1 : 2;
                            } else {
                                i10 = 0;
                            }
                            ub2.f116601e = i10;
                            ub2.f116602f = true;
                        }
                        z10 = ub2.f116601e != 0;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // yads.yi1
    public final mi1 a(ui1 ui1Var, yv0 yv0Var, MediaCrypto mediaCrypto, float f10) {
        boolean z10;
        lj1 lj1Var;
        Point point;
        boolean z11;
        Point point2;
        boolean z12;
        int i10;
        int i11;
        int i12;
        Pair pairB;
        int iA;
        boolean z13 = true;
        ub2 ub2Var = this.Q0;
        if (ub2Var != null && ub2Var.f116603b != ui1Var.f116664f) {
            if (this.P0 == ub2Var) {
                this.P0 = null;
            }
            ub2Var.release();
            this.Q0 = null;
        }
        String str = ui1Var.f116661c;
        yv0[] yv0VarArr = this.f112414i;
        yv0VarArr.getClass();
        int iMax = yv0Var.f118403r;
        int iMax2 = yv0Var.f118404s;
        int iB = b(yv0Var, ui1Var);
        if (yv0VarArr.length == 1) {
            if (iB != -1 && (iA = a(yv0Var, ui1Var)) != -1) {
                iB = Math.min((int) (iB * 1.5f), iA);
            }
            lj1Var = new lj1(iMax, iMax2, iB);
            z10 = true;
        } else {
            int length = yv0VarArr.length;
            int i13 = 0;
            boolean z14 = false;
            while (i13 < length) {
                yv0 yv0Var2 = yv0VarArr[i13];
                boolean z15 = z13;
                if (yv0Var.f118410y != null && yv0Var2.f118410y == null) {
                    xv0 xv0Var = new xv0(yv0Var2);
                    xv0Var.f117994w = yv0Var.f118410y;
                    yv0Var2 = new yv0(xv0Var);
                }
                if (ui1Var.a(yv0Var, yv0Var2).f111930d != 0) {
                    int i14 = yv0Var2.f118403r;
                    z14 |= (i14 == -1 || yv0Var2.f118404s == -1) ? z15 : false;
                    int iMax3 = Math.max(iMax, i14);
                    int iMax4 = Math.max(iMax2, yv0Var2.f118404s);
                    iB = Math.max(iB, b(yv0Var2, ui1Var));
                    iMax2 = iMax4;
                    iMax = iMax3;
                }
                i13++;
                z13 = z15;
            }
            z10 = z13;
            if (z14) {
                uf1.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i15 = yv0Var.f118404s;
                int i16 = yv0Var.f118403r;
                boolean z16 = i15 > i16 ? z10 : false;
                int i17 = z16 ? i15 : i16;
                if (z16) {
                    i15 = i16;
                }
                float f11 = i15 / i17;
                int[] iArr = f113923p1;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int i20 = (int) (i19 * f11);
                    if (i19 <= i17 || i20 <= i15) {
                        break;
                    }
                    int i21 = i15;
                    float f12 = f11;
                    if (w83.f117341a >= 21) {
                        int i22 = z16 ? i20 : i19;
                        if (!z16) {
                            i19 = i20;
                        }
                        point2 = ui1Var.a(i22, i19);
                        z11 = z16;
                        if (ui1Var.a(point2.x, point2.y, yv0Var.f118405t)) {
                            point = point2;
                            break;
                        }
                        i18++;
                        i15 = i21;
                        f11 = f12;
                        z16 = z11;
                    } else {
                        z11 = z16;
                        try {
                            int i23 = ((i19 + 15) / 16) * 16;
                            int i24 = ((i20 + 15) / 16) * 16;
                            if (i23 * i24 <= ij1.a()) {
                                int i25 = z11 ? i24 : i23;
                                if (!z11) {
                                    i23 = i24;
                                }
                                point2 = new Point(i25, i23);
                                point = point2;
                                break;
                            }
                            i18++;
                            i15 = i21;
                            f11 = f12;
                            z16 = z11;
                        } catch (dj1 unused) {
                            point = null;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    xv0 xv0Var2 = new xv0(yv0Var);
                    xv0Var2.f117987p = iMax;
                    xv0Var2.f117988q = iMax2;
                    iB = Math.max(iB, a(new yv0(xv0Var2), ui1Var));
                    uf1.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            lj1Var = new lj1(iMax, iMax2, iB);
        }
        this.M0 = lj1Var;
        boolean z17 = this.L0;
        int i26 = this.f113937l1 ? this.f113938m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", yv0Var.f118403r);
        mediaFormat.setInteger("height", yv0Var.f118404s);
        List list = yv0Var.f118400o;
        for (int i27 = 0; i27 < list.size(); i27++) {
            mediaFormat.setByteBuffer(he2.a("csd-", i27), ByteBuffer.wrap((byte[]) list.get(i27)));
        }
        float f13 = yv0Var.f118405t;
        if (f13 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f13);
        }
        ck1.a(mediaFormat, "rotation-degrees", yv0Var.f118406u);
        ww wwVar = yv0Var.f118410y;
        if (wwVar != null) {
            ck1.a(mediaFormat, "color-transfer", wwVar.f117614d);
            ck1.a(mediaFormat, "color-standard", wwVar.f117612b);
            ck1.a(mediaFormat, "color-range", wwVar.f117613c);
            byte[] bArr = wwVar.f117615e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(yv0Var.f118398m) && (pairB = ij1.b(yv0Var)) != null) {
            ck1.a(mediaFormat, Scopes.PROFILE, ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", lj1Var.f113117a);
        mediaFormat.setInteger("max-height", lj1Var.f113118b);
        ck1.a(mediaFormat, "max-input-size", lj1Var.f113119c);
        if (w83.f117341a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z17) {
            z12 = z10;
            mediaFormat.setInteger("no-post-process", z12 ? 1 : 0);
            i10 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = z10;
            i10 = 0;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (this.P0 == null) {
            if (b(ui1Var)) {
                if (this.Q0 == null) {
                    Context context = this.G0;
                    boolean z18 = ui1Var.f116664f;
                    int i28 = ub2.f116601e;
                    if (z18) {
                        synchronized (ub2.class) {
                            try {
                                if (ub2.f116602f) {
                                    i11 = 1;
                                } else {
                                    if (dy0.a(context)) {
                                        i12 = dy0.c() ? 1 : 2;
                                    } else {
                                        i12 = i10;
                                    }
                                    ub2.f116601e = i12;
                                    i11 = 1;
                                    ub2.f116602f = true;
                                }
                                if (ub2.f116601e == 0) {
                                    i11 = i10;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i11 == 0) {
                            throw new IllegalStateException();
                        }
                    }
                    this.Q0 = new tb2().a(z18 ? ub2.f116601e : i10);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return new mi1(ui1Var, mediaFormat, yv0Var, this.P0, mediaCrypto);
    }

    @Override // yads.yi1
    public final void a(fa0 fa0Var) {
        if (this.O0) {
            ByteBuffer byteBuffer = fa0Var.f110673g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    pi1 pi1Var = this.K;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    pi1Var.a(bundle);
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // yads.jo, yads.yc2
    public final void a(int i10, Object obj) {
        boolean z10;
        int i11;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f113940o1 = (bf3) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f113938m1 != iIntValue) {
                    this.f113938m1 = iIntValue;
                    if (this.f113937l1) {
                        u();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.S0 = iIntValue2;
                pi1 pi1Var = this.K;
                if (pi1Var != null) {
                    pi1Var.a(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 != 5) {
                return;
            }
            if3 if3Var = this.H0;
            int iIntValue3 = ((Integer) obj).intValue();
            if (if3Var.f111981j == iIntValue3) {
                return;
            }
            if3Var.f111981j = iIntValue3;
            if3Var.a(true);
            return;
        }
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = surface;
        if (surface == null) {
            ub2 ub2Var = this.Q0;
            if (ub2Var != null) {
                surface2 = ub2Var;
            } else {
                ui1 ui1Var = this.R;
                surface2 = surface;
                if (ui1Var != null) {
                    surface2 = surface;
                    if (b(ui1Var)) {
                        Context context = this.G0;
                        boolean z11 = ui1Var.f116664f;
                        int i12 = ub2.f116601e;
                        if (z11) {
                            synchronized (ub2.class) {
                                try {
                                    if (!ub2.f116602f) {
                                        if (dy0.a(context)) {
                                            i11 = dy0.c() ? 1 : 2;
                                        } else {
                                            i11 = 0;
                                        }
                                        ub2.f116601e = i11;
                                        ub2.f116602f = true;
                                    }
                                    z10 = ub2.f116601e != 0;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (!z10) {
                                throw new IllegalStateException();
                            }
                        }
                        ub2 ub2VarA = new tb2().a(z11 ? ub2.f116601e : 0);
                        this.Q0 = ub2VarA;
                        surface2 = ub2VarA;
                    }
                }
            }
        }
        if (this.P0 != surface2) {
            this.P0 = surface2;
            if3 if3Var2 = this.H0;
            if3Var2.getClass();
            Surface surface3 = surface2 instanceof ub2 ? null : surface2;
            Surface surface4 = if3Var2.f111976e;
            if (surface4 != surface3) {
                if (w83.f117341a >= 30 && surface4 != null && if3Var2.f111981j != Integer.MIN_VALUE && if3Var2.f111979h != 0.0f) {
                    if3Var2.f111979h = 0.0f;
                    cf3.a(surface4, 0.0f);
                }
                if3Var2.f111976e = surface3;
                if3Var2.a(true);
            }
            this.R0 = false;
            int i13 = this.f112412g;
            pi1 pi1Var2 = this.K;
            if (pi1Var2 != null) {
                if (w83.f117341a >= 23 && surface2 != null && !this.N0) {
                    pi1Var2.a(surface2);
                } else {
                    u();
                    r();
                }
            }
            if (surface2 != null && surface2 != this.Q0) {
                tg3 tg3Var = this.f113936k1;
                if (tg3Var != null) {
                    this.I0.b(tg3Var);
                }
                z();
                if (i13 == 2) {
                    this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
                    return;
                }
                return;
            }
            this.f113936k1 = null;
            z();
            return;
        }
        if (surface2 == null || surface2 == this.Q0) {
            return;
        }
        tg3 tg3Var2 = this.f113936k1;
        if (tg3Var2 != null) {
            this.I0.b(tg3Var2);
        }
        if (this.R0) {
            this.I0.a(this.P0);
        }
    }

    @Override // yads.yi1
    public final void a(Exception exc) {
        uf1.b("MediaCodecVideoRenderer", uf1.a("Video codec error", exc));
        this.I0.b(exc);
    }

    @Override // yads.yi1
    public final void a(String str, long j10, long j11) {
        this.I0.a(str, j10, j11);
        this.N0 = b(str);
        ui1 ui1Var = this.R;
        ui1Var.getClass();
        this.O0 = ui1Var.a();
        if (w83.f117341a < 23 || !this.f113937l1) {
            return;
        }
        pi1 pi1Var = this.K;
        pi1Var.getClass();
        this.f113939n1 = new mj1(this, pi1Var);
    }

    @Override // yads.yi1
    public final void a(String str) {
        this.I0.a(str);
    }

    @Override // yads.jo
    public final void a(boolean z10) {
        this.B0 = new ca0();
        hl2 hl2Var = this.f112409d;
        hl2Var.getClass();
        boolean z11 = hl2Var.f111631a;
        if (z11 && this.f113938m1 == 0) {
            throw new IllegalStateException();
        }
        if (this.f113937l1 != z11) {
            this.f113937l1 = z11;
            u();
        }
        this.I0.b(this.B0);
        this.U0 = z10;
        this.V0 = false;
    }

    @Override // yads.yi1
    public final ia0 a(zv0 zv0Var) {
        ia0 ia0VarA = super.a(zv0Var);
        this.I0.a(zv0Var.f118845b, ia0VarA);
        return ia0VarA;
    }

    @Override // yads.yi1
    public final void a(yv0 yv0Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        pi1 pi1Var = this.K;
        if (pi1Var != null) {
            pi1Var.a(this.S0);
        }
        if (this.f113937l1) {
            this.f113932g1 = yv0Var.f118403r;
            this.f113933h1 = yv0Var.f118404s;
        } else {
            mediaFormat.getClass();
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f113932g1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f113933h1 = integer2;
        }
        float f10 = yv0Var.f118407v;
        this.f113935j1 = f10;
        if (w83.f117341a >= 21) {
            int i10 = yv0Var.f118406u;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f113932g1;
                this.f113932g1 = this.f113933h1;
                this.f113933h1 = i11;
                this.f113935j1 = 1.0f / f10;
            }
        } else {
            this.f113934i1 = yv0Var.f118406u;
        }
        if3 if3Var = this.H0;
        if3Var.f111977f = yv0Var.f118405t;
        wt0 wt0Var = if3Var.f111972a;
        vt0 vt0Var = wt0Var.f117561a;
        vt0Var.f117176d = 0L;
        vt0Var.f117177e = 0L;
        vt0Var.f117178f = 0L;
        vt0Var.f117180h = 0;
        Arrays.fill(vt0Var.f117179g, false);
        vt0 vt0Var2 = wt0Var.f117562b;
        vt0Var2.f117176d = 0L;
        vt0Var2.f117177e = 0L;
        vt0Var2.f117178f = 0L;
        vt0Var2.f117180h = 0;
        Arrays.fill(vt0Var2.f117179g, false);
        wt0Var.f117563c = false;
        wt0Var.f117564d = -9223372036854775807L;
        wt0Var.f117565e = 0;
        if3Var.b();
    }

    @Override // yads.yi1, yads.jo
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        z();
        if3 if3Var = this.H0;
        if3Var.f111984m = 0L;
        if3Var.f111987p = -1L;
        if3Var.f111985n = -1L;
        this.f113928c1 = -9223372036854775807L;
        this.W0 = -9223372036854775807L;
        this.f113926a1 = 0;
        if (z10) {
            this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : -9223372036854775807L;
        } else {
            this.X0 = -9223372036854775807L;
        }
    }

    @Override // yads.yi1
    public final void a(long j10) {
        super.a(j10);
        if (this.f113937l1) {
            return;
        }
        this.f113927b1--;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x030a  */
    @Override // yads.yi1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(long r33, long r35, yads.pi1 r37, java.nio.ByteBuffer r38, int r39, int r40, int r41, long r42, boolean r44, boolean r45, yads.yv0 r46) {
        /*
            Method dump skipped, instruction units count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.nj1.a(long, long, yads.pi1, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, yads.yv0):boolean");
    }

    @Override // yads.yi1, yads.jo
    public final void a(float f10, float f11) {
        this.I = f10;
        this.J = f11;
        c(this.L);
        if3 if3Var = this.H0;
        if3Var.f111980i = f10;
        if3Var.f111984m = 0L;
        if3Var.f111987p = -1L;
        if3Var.f111985n = -1L;
        if3Var.a(false);
    }

    @Override // yads.yi1
    public final boolean a(ui1 ui1Var) {
        return this.P0 != null || b(ui1Var);
    }

    @Override // yads.yi1
    public final int a(aj1 aj1Var, yv0 yv0Var) {
        boolean z10;
        int i10 = 0;
        if (!"video".equals(tr1.c(yv0Var.f118398m))) {
            return jo.a(0, 0, 0);
        }
        boolean z11 = yv0Var.f118401p != null;
        y31 y31VarA = a(aj1Var, yv0Var, z11, false);
        if (z11 && y31VarA.isEmpty()) {
            y31VarA = a(aj1Var, yv0Var, false, false);
        }
        if (y31VarA.isEmpty()) {
            return jo.a(1, 0, 0);
        }
        int i11 = yv0Var.F;
        if (i11 != 0 && i11 != 2) {
            return jo.a(2, 0, 0);
        }
        ui1 ui1Var = (ui1) y31VarA.get(0);
        boolean zA = ui1Var.a(yv0Var);
        if (zA) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < y31VarA.size(); i12++) {
                ui1 ui1Var2 = (ui1) y31VarA.get(i12);
                if (ui1Var2.a(yv0Var)) {
                    z10 = false;
                    zA = true;
                    ui1Var = ui1Var2;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = zA ? 4 : 3;
        int i14 = ui1Var.b(yv0Var) ? 16 : 8;
        int i15 = ui1Var.f116665g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (zA) {
            y31 y31VarA2 = a(aj1Var, yv0Var, z11, true);
            if (!y31VarA2.isEmpty()) {
                ui1 ui1Var3 = (ui1) ij1.a(y31VarA2, yv0Var).get(0);
                if (ui1Var3.a(yv0Var) && ui1Var3.b(yv0Var)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // yads.yi1
    public final ti1 a(IllegalStateException illegalStateException, ui1 ui1Var) {
        return new kj1(illegalStateException, ui1Var, this.P0);
    }
}
