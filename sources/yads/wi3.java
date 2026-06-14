package yads;

import android.os.SystemClock;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class wi3 implements ed3, gd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb3 f117474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xd3 f117475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh3 f117476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oc3 f117477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mh3 f117478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f117479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117480g;

    public wi3(xb3 xb3Var, xd3 xd3Var, fh3 fh3Var, oc3 oc3Var, mh3 mh3Var) {
        this.f117474a = xb3Var;
        this.f117475b = xd3Var;
        this.f117476c = fh3Var;
        this.f117477d = oc3Var;
        this.f117478e = mh3Var;
    }

    @Override // yads.ed3
    public final void a(long j10, long j11) {
        if (this.f117480g) {
            return;
        }
        Unit unit = null;
        if (!this.f117478e.a() || this.f117475b.a() != vd3.f116981e) {
            this.f117479f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l10 = this.f117479f;
        if (l10 != null) {
            if (jElapsedRealtime - l10.longValue() >= 2000) {
                this.f117480g = true;
                this.f117477d.i(this.f117474a);
                this.f117476c.n();
            }
            unit = Unit.f93236a;
        }
        if (unit == null) {
            this.f117479f = Long.valueOf(jElapsedRealtime);
            this.f117477d.a(this.f117474a);
        }
    }

    @Override // yads.gd3
    public final void b() {
        this.f117479f = null;
    }

    public /* synthetic */ wi3(xb3 xb3Var, kh3 kh3Var, xd3 xd3Var, fh3 fh3Var, oc3 oc3Var) {
        this(xb3Var, xd3Var, fh3Var, oc3Var, new mh3(kh3Var));
    }

    @Override // yads.gd3
    public final void a() {
        this.f117479f = null;
    }
}
