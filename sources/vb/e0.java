package vb;

import androidx.core.view.InputDeviceCompat;
import q9.o0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f106104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106105b = new q9.d0(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f106106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f106107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f106109f;

    public e0(d0 d0Var) {
        this.f106104a = d0Var;
    }

    @Override // vb.l0
    public void a(q9.d0 d0Var, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iF = z10 ? d0Var.f() + d0Var.H() : -1;
        if (this.f106109f) {
            if (!z10) {
                return;
            }
            this.f106109f = false;
            d0Var.W(iF);
            this.f106107d = 0;
        }
        while (d0Var.a() > 0) {
            int i11 = this.f106107d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = d0Var.H();
                    d0Var.W(d0Var.f() - 1);
                    if (iH == 255) {
                        this.f106109f = true;
                        return;
                    }
                }
                int iMin = Math.min(d0Var.a(), 3 - this.f106107d);
                d0Var.l(this.f106105b.e(), this.f106107d, iMin);
                int i12 = this.f106107d + iMin;
                this.f106107d = i12;
                if (i12 == 3) {
                    this.f106105b.W(0);
                    this.f106105b.V(3);
                    this.f106105b.X(1);
                    int iH2 = this.f106105b.H();
                    int iH3 = this.f106105b.H();
                    this.f106108e = (iH2 & 128) != 0;
                    this.f106106c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f106105b.b();
                    int i13 = this.f106106c;
                    if (iB < i13) {
                        this.f106105b.c(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i13, this.f106105b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d0Var.a(), this.f106106c - this.f106107d);
                d0Var.l(this.f106105b.e(), this.f106107d, iMin2);
                int i14 = this.f106107d + iMin2;
                this.f106107d = i14;
                int i15 = this.f106106c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f106108e) {
                        this.f106105b.V(i15);
                    } else {
                        if (o0.x(this.f106105b.e(), 0, this.f106106c, -1) != 0) {
                            this.f106109f = true;
                            return;
                        }
                        this.f106105b.V(this.f106106c - 4);
                    }
                    this.f106105b.W(0);
                    this.f106104a.a(this.f106105b);
                    this.f106107d = 0;
                }
            }
        }
    }

    @Override // vb.l0
    public void b(q9.j0 j0Var, oa.t tVar, l0.d dVar) {
        this.f106104a.b(j0Var, tVar, dVar);
        this.f106109f = true;
    }

    @Override // vb.l0
    public void seek() {
        this.f106109f = true;
    }
}
