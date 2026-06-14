package yads;

import android.util.SparseArray;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class rq implements ap0, wt {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ut f115544k = new ut() { // from class: yads.mp0
        @Override // yads.ut
        public final wt a(int i10, yv0 yv0Var, boolean z10, List list, z43 z43Var, wc2 wc2Var) {
            return rq.a(i10, yv0Var, z10, list, z43Var, wc2Var);
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final be2 f115545l = new be2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo0 f115546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv0 f115548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f115549e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f115550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vt f115551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f115552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public nu2 f115553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yv0[] f115554j;

    public rq(xo0 xo0Var, int i10, yv0 yv0Var) {
        this.f115546b = xo0Var;
        this.f115547c = i10;
        this.f115548d = yv0Var;
    }

    @Override // yads.ap0
    public final void a() {
        yv0[] yv0VarArr = new yv0[this.f115549e.size()];
        for (int i10 = 0; i10 < this.f115549e.size(); i10++) {
            yv0 yv0Var = ((qq) this.f115549e.valueAt(i10)).f115125d;
            if (yv0Var == null) {
                throw new IllegalStateException();
            }
            yv0VarArr[i10] = yv0Var;
        }
        this.f115554j = yv0VarArr;
    }

    public final void a(vt vtVar, long j10, long j11) {
        z43 wj0Var;
        this.f115551g = vtVar;
        this.f115552h = j11;
        if (!this.f115550f) {
            this.f115546b.a(this);
            if (j10 != -9223372036854775807L) {
                this.f115546b.a(0L, j10);
            }
            this.f115550f = true;
            return;
        }
        xo0 xo0Var = this.f115546b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        xo0Var.a(0L, j10);
        for (int i10 = 0; i10 < this.f115549e.size(); i10++) {
            qq qqVar = (qq) this.f115549e.valueAt(i10);
            if (vtVar == null) {
                qqVar.f115126e = qqVar.f115124c;
            } else {
                qqVar.f115127f = j11;
                int i11 = qqVar.f115122a;
                Cdo cdo = (Cdo) vtVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = cdo.f109988a;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            wj0Var = cdo.f109989b[i12];
                            break;
                        }
                        i12++;
                    } else {
                        uf1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        wj0Var = new wj0();
                        break;
                    }
                }
                qqVar.f115126e = wj0Var;
                yv0 yv0Var = qqVar.f115125d;
                if (yv0Var != null) {
                    wj0Var.a(yv0Var);
                }
            }
        }
    }

    public static wt a(int i10, yv0 yv0Var, boolean z10, List list, z43 z43Var, wc2 wc2Var) {
        xo0 ew0Var;
        String str = yv0Var.f118397l;
        if (tr1.e(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            ew0Var = new ew0(z10 ? 4 : 0, list, z43Var);
        } else {
            ew0Var = new nh1(new wc0(), 1);
        }
        return new rq(ew0Var, i10, yv0Var);
    }

    @Override // yads.ap0
    public final void a(nu2 nu2Var) {
        this.f115553i = nu2Var;
    }

    @Override // yads.ap0
    public final z43 a(int i10, int i11) {
        z43 wj0Var;
        qq qqVar = (qq) this.f115549e.get(i10);
        if (qqVar != null) {
            return qqVar;
        }
        if (this.f115554j == null) {
            qq qqVar2 = new qq(i10, i11, i11 == this.f115547c ? this.f115548d : null);
            vt vtVar = this.f115551g;
            long j10 = this.f115552h;
            if (vtVar == null) {
                qqVar2.f115126e = qqVar2.f115124c;
            } else {
                qqVar2.f115127f = j10;
                Cdo cdo = (Cdo) vtVar;
                int i12 = 0;
                while (true) {
                    int[] iArr = cdo.f109988a;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            wj0Var = cdo.f109989b[i12];
                            break;
                        }
                        i12++;
                    } else {
                        uf1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i11);
                        wj0Var = new wj0();
                        break;
                    }
                }
                qqVar2.f115126e = wj0Var;
                yv0 yv0Var = qqVar2.f115125d;
                if (yv0Var != null) {
                    wj0Var.a(yv0Var);
                }
            }
            this.f115549e.put(i10, qqVar2);
            return qqVar2;
        }
        throw new IllegalStateException();
    }
}
