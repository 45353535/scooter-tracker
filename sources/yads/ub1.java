package yads;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class ub1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nb1 f116596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi2 f116597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg1 f116598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag1 f116599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f116600e = new AtomicBoolean(false);

    public ub1(nb1 nb1Var, pi2 pi2Var, fg1 fg1Var, ag1 ag1Var) {
        this.f116596a = nb1Var;
        this.f116597b = pi2Var;
        this.f116598c = fg1Var;
        this.f116599d = ag1Var;
        nb1Var.a(pi2Var);
    }

    public final void a(final Activity activity) {
        this.f116598c.a();
        this.f116599d.a(new Runnable() { // from class: yads.br0
            @Override // java.lang.Runnable
            public final void run() {
                ub1.a(this.f109082b, activity);
            }
        });
    }

    public static final void a(ub1 ub1Var, Activity activity) {
        if (!ub1Var.f116600e.getAndSet(true)) {
            Throwable thG = Result.g(ub1Var.f116596a.a(activity));
            if (thG != null) {
                ub1Var.f116597b.a(new l7(String.valueOf(thG.getMessage())));
                return;
            }
            return;
        }
        ub1Var.f116597b.a(m7.f113340a);
    }
}
