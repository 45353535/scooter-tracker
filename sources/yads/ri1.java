package yads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ri1 extends yi1 implements li1 {
    public final Context G0;
    public final uk H0;
    public final bl I0;
    public int J0;
    public boolean K0;
    public yv0 L0;
    public long M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public gl2 Q0;

    public ri1(Context context, od0 od0Var, aj1 aj1Var, boolean z10, Handler handler, sm0 sm0Var, mb0 mb0Var) {
        super(1, od0Var, aj1Var, z10, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = mb0Var;
        this.H0 = new uk(handler, sm0Var);
        mb0Var.a(new qi1(this));
    }

    @Override // yads.yi1
    public final ia0 a(ui1 ui1Var, yv0 yv0Var, yv0 yv0Var2) {
        ia0 ia0VarA = ui1Var.a(yv0Var, yv0Var2);
        int i10 = ia0VarA.f111931e;
        if (a(yv0Var2, ui1Var) > this.J0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new ia0(ui1Var.f116659a, yv0Var, yv0Var2, i11 != 0 ? 0 : ia0VarA.f111930d, i11);
    }

    @Override // yads.yi1
    public final void b(fa0 fa0Var) {
        if (!this.N0 || fa0Var.b(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(fa0Var.f110672f - this.M0) > 500000) {
            this.M0 = fa0Var.f110672f;
        }
        this.N0 = false;
    }

    @Override // yads.jo
    public final li1 c() {
        return this;
    }

    @Override // yads.jo
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // yads.yi1, yads.jo
    public final boolean f() {
        if (!this.f118226x0) {
            return false;
        }
        mb0 mb0Var = (mb0) this.I0;
        if (!mb0Var.f()) {
            return true;
        }
        if (mb0Var.S) {
            return (mb0Var.f() && mb0Var.f113381i.b(mb0Var.d())) ? false : true;
        }
        return false;
    }

    @Override // yads.yi1, yads.jo
    public final boolean g() {
        mb0 mb0Var = (mb0) this.I0;
        return (mb0Var.f() && mb0Var.f113381i.b(mb0Var.d())) || super.g();
    }

    @Override // yads.li1
    public final gc2 getPlaybackParameters() {
        mb0 mb0Var = (mb0) this.I0;
        return mb0Var.f113383k ? mb0Var.f113397y : mb0Var.c().f111533a;
    }

    @Override // yads.jo
    public final void h() {
        this.P0 = true;
        try {
            ((mb0) this.I0).b();
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                this.B = null;
                this.C0 = -9223372036854775807L;
                this.D0 = -9223372036854775807L;
                this.E0 = 0;
                p();
                throw th2;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
            if (this.P0) {
                this.P0 = false;
                mb0 mb0Var = (mb0) this.I0;
                mb0Var.b();
                for (tk tkVar : mb0Var.f113378f) {
                    tkVar.d();
                }
                for (tk tkVar2 : mb0Var.f113379g) {
                    tkVar2.d();
                }
                mb0Var.U = false;
                mb0Var.f113372a0 = false;
            }
        }
    }

    @Override // yads.jo
    public final void j() {
        ((mb0) this.I0).h();
    }

    @Override // yads.jo
    public final void k() {
        long jA = ((mb0) this.I0).a(f());
        if (jA != Long.MIN_VALUE) {
            if (!this.O0) {
                jA = Math.max(this.M0, jA);
            }
            this.M0 = jA;
            this.O0 = false;
        }
        ((mb0) this.I0).g();
    }

    @Override // yads.yi1
    public final void s() {
        ((mb0) this.I0).G = true;
    }

    @Override // yads.yi1
    public final void v() throws lm0 {
        try {
            mb0 mb0Var = (mb0) this.I0;
            if (!mb0Var.S && mb0Var.f() && mb0Var.a()) {
                mb0Var.i();
                mb0Var.S = true;
            }
        } catch (al e10) {
            throw a(5002, e10.f108709d, e10, e10.f108708c);
        }
    }

    @Override // yads.yi1
    public final float a(float f10, yv0[] yv0VarArr) {
        int iMax = -1;
        for (yv0 yv0Var : yv0VarArr) {
            int i10 = yv0Var.A;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // yads.yi1
    public final boolean b(yv0 yv0Var) {
        return ((mb0) this.I0).a(yv0Var) != 0;
    }

    @Override // yads.yi1
    public final ArrayList a(aj1 aj1Var, yv0 yv0Var, boolean z10) {
        return ij1.a(a(aj1Var, yv0Var, z10, this.I0), yv0Var);
    }

    public static y31 a(aj1 aj1Var, yv0 yv0Var, boolean z10, bl blVar) {
        String str = yv0Var.f118398m;
        if (str == null) {
            v31 v31Var = y31.f118068c;
            return nk2.f113952f;
        }
        if (((mb0) blVar).a(yv0Var) != 0) {
            List listA = ij1.a("audio/raw", false, false);
            ui1 ui1Var = listA.isEmpty() ? null : (ui1) listA.get(0);
            if (ui1Var != null) {
                return y31.a(ui1Var);
            }
        }
        List listA2 = aj1Var.a(str, z10, false);
        String strA = ij1.a(yv0Var);
        if (strA == null) {
            return y31.a((Collection) listA2);
        }
        List listA3 = aj1Var.a(strA, z10, false);
        v31 v31Var2 = y31.f118068c;
        return new u31().a(listA2).a(listA3).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010c  */
    @Override // yads.yi1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.mi1 a(yads.ui1 r14, yads.yv0 r15, android.media.MediaCrypto r16, float r17) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ri1.a(yads.ui1, yads.yv0, android.media.MediaCrypto, float):yads.mi1");
    }

    @Override // yads.li1
    public final long a() {
        if (this.f112412g == 2) {
            long jA = ((mb0) this.I0).a(f());
            if (jA != Long.MIN_VALUE) {
                if (!this.O0) {
                    jA = Math.max(this.M0, jA);
                }
                this.M0 = jA;
                this.O0 = false;
            }
        }
        return this.M0;
    }

    @Override // yads.jo, yads.yc2
    public final void a(int i10, Object obj) {
        if (i10 == 2) {
            bl blVar = this.I0;
            float fFloatValue = ((Float) obj).floatValue();
            mb0 mb0Var = (mb0) blVar;
            if (mb0Var.J != fFloatValue) {
                mb0Var.J = fFloatValue;
                mb0Var.k();
                return;
            }
            return;
        }
        if (i10 == 3) {
            hk hkVar = (hk) obj;
            mb0 mb0Var2 = (mb0) this.I0;
            if (mb0Var2.f113394v.equals(hkVar)) {
                return;
            }
            mb0Var2.f113394v = hkVar;
            if (mb0Var2.Y) {
                return;
            }
            mb0Var2.b();
            return;
        }
        if (i10 != 6) {
            switch (i10) {
                case 9:
                    bl blVar2 = this.I0;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    mb0 mb0Var3 = (mb0) blVar2;
                    gc2 gc2Var = mb0Var3.c().f111533a;
                    hb0 hb0VarC = mb0Var3.c();
                    if (!gc2Var.equals(hb0VarC.f111533a) || zBooleanValue != hb0VarC.f111534b) {
                        hb0 hb0Var = new hb0(gc2Var, zBooleanValue, -9223372036854775807L, -9223372036854775807L);
                        if (mb0Var3.f()) {
                            mb0Var3.f113395w = hb0Var;
                        } else {
                            mb0Var3.f113396x = hb0Var;
                        }
                    }
                    break;
                case 10:
                    bl blVar3 = this.I0;
                    int iIntValue = ((Integer) obj).intValue();
                    mb0 mb0Var4 = (mb0) blVar3;
                    if (mb0Var4.W != iIntValue) {
                        mb0Var4.W = iIntValue;
                        mb0Var4.V = iIntValue != 0;
                        mb0Var4.b();
                    }
                    break;
                case 11:
                    this.Q0 = (gl2) obj;
                    break;
            }
            return;
        }
        ((mb0) this.I0).a((il) obj);
    }

    @Override // yads.yi1
    public final void a(Exception exc) {
        uf1.b("MediaCodecAudioRenderer", uf1.a("Audio codec error", exc));
        this.H0.a(exc);
    }

    @Override // yads.yi1
    public final void a(String str, long j10, long j11) {
        this.H0.a(str, j10, j11);
    }

    @Override // yads.yi1
    public final void a(String str) {
        this.H0.a(str);
    }

    @Override // yads.jo
    public final void a(boolean z10) {
        ca0 ca0Var = new ca0();
        this.B0 = ca0Var;
        this.H0.b(ca0Var);
        hl2 hl2Var = this.f112409d;
        hl2Var.getClass();
        if (hl2Var.f111631a) {
            mb0 mb0Var = (mb0) this.I0;
            mb0Var.getClass();
            if (w83.f117341a >= 21) {
                if (mb0Var.V) {
                    if (!mb0Var.Y) {
                        mb0Var.Y = true;
                        mb0Var.b();
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            mb0 mb0Var2 = (mb0) this.I0;
            if (mb0Var2.Y) {
                mb0Var2.Y = false;
                mb0Var2.b();
            }
        }
        bl blVar = this.I0;
        wc2 wc2Var = this.f112411f;
        wc2Var.getClass();
        ((mb0) blVar).f113389q = wc2Var;
    }

    @Override // yads.yi1
    public final ia0 a(zv0 zv0Var) {
        ia0 ia0VarA = super.a(zv0Var);
        this.H0.a(zv0Var.f118845b, ia0VarA);
        return ia0VarA;
    }

    @Override // yads.yi1
    public final void a(yv0 yv0Var, MediaFormat mediaFormat) throws lm0 {
        int iB;
        int i10;
        yv0 yv0Var2 = this.L0;
        int[] iArr = null;
        if (yv0Var2 != null) {
            yv0Var = yv0Var2;
        } else if (this.K != null) {
            if ("audio/raw".equals(yv0Var.f118398m)) {
                iB = yv0Var.B;
            } else if (w83.f117341a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iB = mediaFormat.getInteger("pcm-encoding");
            } else {
                iB = mediaFormat.containsKey("v-bits-per-sample") ? w83.b(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            xv0 xv0Var = new xv0();
            xv0Var.f117982k = "audio/raw";
            xv0Var.f117997z = iB;
            xv0Var.A = yv0Var.C;
            xv0Var.B = yv0Var.D;
            xv0Var.f117995x = mediaFormat.getInteger("channel-count");
            xv0Var.f117996y = mediaFormat.getInteger("sample-rate");
            yv0 yv0Var3 = new yv0(xv0Var);
            if (this.K0 && yv0Var3.f118411z == 6 && (i10 = yv0Var.f118411z) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < yv0Var.f118411z; i11++) {
                    iArr[i11] = i11;
                }
            }
            yv0Var = yv0Var3;
        }
        try {
            ((mb0) this.I0).a(yv0Var, iArr);
        } catch (wk e10) {
            throw a(5001, e10.f117502b, (Exception) e10, false);
        }
    }

    @Override // yads.yi1, yads.jo
    public final void a(long j10, boolean z10) {
        super.a(j10, z10);
        ((mb0) this.I0).b();
        this.M0 = j10;
        this.N0 = true;
        this.O0 = true;
    }

    @Override // yads.yi1
    public final boolean a(long j10, long j11, pi1 pi1Var, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, yv0 yv0Var) throws lm0 {
        byteBuffer.getClass();
        if (this.L0 != null && (i11 & 2) != 0) {
            pi1Var.getClass();
            pi1Var.a(false, i10);
            return true;
        }
        if (z10) {
            if (pi1Var != null) {
                pi1Var.a(false, i10);
            }
            this.B0.f109300f += i12;
            ((mb0) this.I0).G = true;
            return true;
        }
        try {
            if (!((mb0) this.I0).a(byteBuffer, j12, i12)) {
                return false;
            }
            if (pi1Var != null) {
                pi1Var.a(false, i10);
            }
            this.B0.f109299e += i12;
            return true;
        } catch (al e10) {
            throw a(5002, yv0Var, e10, e10.f108708c);
        } catch (xk e11) {
            throw a(5001, e11.f117841d, e11, e11.f117840c);
        }
    }

    @Override // yads.li1
    public final void a(gc2 gc2Var) {
        mb0 mb0Var = (mb0) this.I0;
        mb0Var.getClass();
        float f10 = gc2Var.f111141b;
        int i10 = w83.f117341a;
        gc2 gc2Var2 = new gc2(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(gc2Var.f111142c, 8.0f)));
        if (mb0Var.f113383k && w83.f117341a >= 23) {
            mb0Var.a(gc2Var2);
            return;
        }
        boolean z10 = mb0Var.c().f111534b;
        hb0 hb0VarC = mb0Var.c();
        if (gc2Var2.equals(hb0VarC.f111533a) && z10 == hb0VarC.f111534b) {
            return;
        }
        hb0 hb0Var = new hb0(gc2Var2, z10, -9223372036854775807L, -9223372036854775807L);
        if (mb0Var.f()) {
            mb0Var.f113395w = hb0Var;
        } else {
            mb0Var.f113396x = hb0Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if ((r4.isEmpty() ? null : (yads.ui1) r4.get(0)) != null) goto L30;
     */
    @Override // yads.yi1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(yads.aj1 r13, yads.yv0 r14) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ri1.a(yads.aj1, yads.yv0):int");
    }

    public final int a(yv0 yv0Var, ui1 ui1Var) {
        int i10;
        if (!li2.f113100a.a().equals(ui1Var.f116659a) || (i10 = w83.f117341a) >= 24 || (i10 == 23 && w83.d(this.G0))) {
            return yv0Var.f118399n;
        }
        return -1;
    }
}
