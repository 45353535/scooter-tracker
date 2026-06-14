package oa;

import oa.s0;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f96646a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f96647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f96649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f96652g;

    public void a(s0 s0Var, s0.a aVar) {
        if (this.f96648c > 0) {
            s0Var.e(this.f96649d, this.f96650e, this.f96651f, this.f96652g, aVar);
            this.f96648c = 0;
        }
    }

    public void b() {
        this.f96647b = false;
        this.f96648c = 0;
    }

    public void c(s0 s0Var, long j10, int i10, int i11, int i12, s0.a aVar) {
        q9.a.h(this.f96652g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f96647b) {
            int i13 = this.f96648c;
            int i14 = i13 + 1;
            this.f96648c = i14;
            if (i13 == 0) {
                this.f96649d = j10;
                this.f96650e = i10;
                this.f96651f = 0;
            }
            this.f96651f += i11;
            this.f96652g = i12;
            if (i14 >= 16) {
                a(s0Var, aVar);
            }
        }
    }

    public void d(s sVar) {
        if (this.f96647b) {
            return;
        }
        sVar.peekFully(this.f96646a, 0, 10);
        sVar.resetPeekPosition();
        if (b.j(this.f96646a) == 0) {
            return;
        }
        this.f96647b = true;
    }
}
