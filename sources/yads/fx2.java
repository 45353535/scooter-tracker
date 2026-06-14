package yads;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fx2 implements bl1, je1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h30 f110959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30 f110960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e63 f110961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fe1 f110962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ol1 f110963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v43 f110964g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f110966i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yv0 f110968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f110969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f110970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f110971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f110972o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f110965h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe1 f110967j = new qe1("SingleSampleMediaPeriod");

    public fx2(h30 h30Var, b30 b30Var, e63 e63Var, yv0 yv0Var, long j10, fe1 fe1Var, ol1 ol1Var, boolean z10) {
        this.f110959b = h30Var;
        this.f110960c = b30Var;
        this.f110961d = e63Var;
        this.f110968k = yv0Var;
        this.f110966i = j10;
        this.f110962e = fe1Var;
        this.f110963f = ol1Var;
        this.f110969l = z10;
        this.f110964g = new v43(new u43(yv0Var));
    }

    @Override // yads.bl1
    public final long a(long j10, ou2 ou2Var) {
        return j10;
    }

    @Override // yads.ev2
    public final boolean continueLoading(long j10) {
        if (this.f110970m || this.f110967j.b() || this.f110967j.f114976c != null) {
            return false;
        }
        c30 c30VarA = this.f110960c.a();
        e63 e63Var = this.f110961d;
        if (e63Var != null) {
            c30VarA.a(e63Var);
        }
        this.f110967j.a(new ex2(c30VarA, this.f110959b), this, ((ld0) this.f110962e).a(1));
        ol1 ol1Var = this.f110963f;
        Uri uri = this.f110959b.f111452a;
        ol1Var.c(new ge1(), new tk1(1, -1, this.f110968k, 0, null, ol1Var.a(0L), ol1Var.a(this.f110966i)));
        return true;
    }

    @Override // yads.bl1
    public final void discardBuffer(long j10, boolean z10) {
    }

    @Override // yads.ev2
    public final long getBufferedPositionUs() {
        return this.f110970m ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.ev2
    public final long getNextLoadPositionUs() {
        return (this.f110970m || this.f110967j.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override // yads.bl1
    public final v43 getTrackGroups() {
        return this.f110964g;
    }

    @Override // yads.ev2
    public final boolean isLoading() {
        return this.f110967j.b();
    }

    @Override // yads.bl1
    public final void maybeThrowPrepareError() {
    }

    @Override // yads.bl1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.ev2
    public final void reevaluateBuffer(long j10) {
    }

    @Override // yads.bl1
    public final long seekToUs(long j10) {
        for (int i10 = 0; i10 < this.f110965h.size(); i10++) {
            dx2 dx2Var = (dx2) this.f110965h.get(i10);
            if (dx2Var.f110107b == 2) {
                dx2Var.f110107b = 1;
            }
        }
        return j10;
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11, boolean z10) {
        Uri uri = ((ex2) me1Var).f110516b.f109698c;
        ge1 ge1Var = new ge1();
        this.f110962e.getClass();
        ol1 ol1Var = this.f110963f;
        ol1Var.a(ge1Var, new tk1(1, -1, null, 0, null, ol1Var.a(0L), ol1Var.a(this.f110966i)));
    }

    @Override // yads.je1
    public final void a(me1 me1Var, long j10, long j11) {
        ex2 ex2Var = (ex2) me1Var;
        this.f110972o = (int) ex2Var.f110516b.f109697b;
        byte[] bArr = ex2Var.f110517c;
        bArr.getClass();
        this.f110971n = bArr;
        this.f110970m = true;
        Uri uri = ex2Var.f110516b.f109698c;
        ge1 ge1Var = new ge1();
        this.f110962e.getClass();
        ol1 ol1Var = this.f110963f;
        ol1Var.b(ge1Var, new tk1(1, -1, this.f110968k, 0, null, ol1Var.a(0L), ol1Var.a(this.f110966i)));
    }

    @Override // yads.je1
    public final ke1 a(me1 me1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        ke1 ke1Var;
        Uri uri = ((ex2) me1Var).f110516b.f109698c;
        ge1 ge1Var = new ge1();
        int i11 = w83.f117341a;
        ((ld0) this.f110962e).getClass();
        if ((iOException instanceof ba2) || (iOException instanceof FileNotFoundException) || (iOException instanceof a01) || (iOException instanceof pe1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = d30.f109729c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof d30) && ((d30) cause).f109730b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        boolean z10 = jMin == -9223372036854775807L || i10 >= ((ld0) this.f110962e).a(1);
        if (this.f110969l && z10) {
            uf1.d("SingleSampleMediaPeriod", uf1.a("Loading failed, treating as end-of-stream.", iOException));
            this.f110970m = true;
            ke1Var = qe1.f114972d;
        } else if (jMin != -9223372036854775807L) {
            ke1Var = new ke1(0, jMin);
        } else {
            ke1Var = qe1.f114973e;
        }
        int i13 = ke1Var.f112694a;
        boolean z11 = i13 == 0 || i13 == 1;
        ol1 ol1Var = this.f110963f;
        ol1Var.a(ge1Var, new tk1(1, -1, this.f110968k, 0, null, ol1Var.a(0L), ol1Var.a(this.f110966i)), iOException, true ^ z11);
        if (!z11) {
            this.f110962e.getClass();
        }
        return ke1Var;
    }

    @Override // yads.bl1
    public final void a(al1 al1Var, long j10) {
        al1Var.a((bl1) this);
    }

    @Override // yads.bl1
    public final long a(bo0[] bo0VarArr, boolean[] zArr, iq2[] iq2VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < bo0VarArr.length; i10++) {
            iq2 iq2Var = iq2VarArr[i10];
            if (iq2Var != null && (bo0VarArr[i10] == null || !zArr[i10])) {
                this.f110965h.remove(iq2Var);
                iq2VarArr[i10] = null;
            }
            if (iq2VarArr[i10] == null && bo0VarArr[i10] != null) {
                dx2 dx2Var = new dx2(this);
                this.f110965h.add(dx2Var);
                iq2VarArr[i10] = dx2Var;
                zArr2[i10] = true;
            }
        }
        return j10;
    }
}
