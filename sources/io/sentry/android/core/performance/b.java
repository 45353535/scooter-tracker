package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import com.ironsource.C4240b4;
import io.sentry.android.core.x;
import io.sentry.j1;
import io.sentry.q1;
import io.sentry.s5;
import io.sentry.w8;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f82697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s5 f82698b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s5 f82699c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j1 f82700d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private j1 f82701e = null;

    public b(String str) {
        this.f82697a = str;
    }

    private j1 d(j1 j1Var, String str, s5 s5Var) {
        j1 j1VarC = j1Var.c("activity.load", str, s5Var, q1.SENTRY);
        f(j1VarC);
        return j1VarC;
    }

    private void f(j1 j1Var) {
        j1Var.k("thread.id", Long.valueOf(Looper.getMainLooper().getThread().getId()));
        j1Var.k("thread.name", C4240b4.i.Z);
        Boolean bool = Boolean.TRUE;
        j1Var.k("ui.contributes_to_ttid", bool);
        j1Var.k("ui.contributes_to_ttfd", bool);
    }

    public void a() {
        j1 j1Var = this.f82700d;
        if (j1Var != null && !j1Var.g()) {
            this.f82700d.l(w8.CANCELLED);
        }
        this.f82700d = null;
        j1 j1Var2 = this.f82701e;
        if (j1Var2 != null && !j1Var2.g()) {
            this.f82701e.l(w8.CANCELLED);
        }
        this.f82701e = null;
    }

    public void b(j1 j1Var) {
        if (this.f82698b == null || j1Var == null) {
            return;
        }
        j1 j1VarD = d(j1Var, this.f82697a + ".onCreate", this.f82698b);
        this.f82700d = j1VarD;
        j1VarD.finish();
    }

    public void c(j1 j1Var) {
        if (this.f82699c == null || j1Var == null) {
            return;
        }
        j1 j1VarD = d(j1Var, this.f82697a + ".onStart", this.f82699c);
        this.f82701e = j1VarD;
        j1VarD.finish();
    }

    public void e() {
        j1 j1Var = this.f82700d;
        if (j1Var == null || this.f82701e == null) {
            return;
        }
        s5 s5VarQ = j1Var.q();
        s5 s5VarQ2 = this.f82701e.q();
        if (s5VarQ == null || s5VarQ2 == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        s5 s5VarA = x.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(s5VarA.c(this.f82700d.r()));
        long millis2 = timeUnit.toMillis(s5VarA.c(s5VarQ));
        long millis3 = timeUnit.toMillis(s5VarA.c(this.f82701e.r()));
        long millis4 = timeUnit.toMillis(s5VarA.c(s5VarQ2));
        c cVar = new c();
        cVar.c().q(this.f82700d.getDescription(), timeUnit.toMillis(this.f82700d.r().g()), jUptimeMillis - millis, jUptimeMillis - millis2);
        cVar.d().q(this.f82701e.getDescription(), timeUnit.toMillis(this.f82701e.r().g()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        h.p().e(cVar);
    }

    public void g(s5 s5Var) {
        this.f82698b = s5Var;
    }

    public void h(s5 s5Var) {
        this.f82699c = s5Var;
    }
}
