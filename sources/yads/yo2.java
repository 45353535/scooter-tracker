package yads;

import android.app.Activity;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class yo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ro2 f118305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ri2 f118306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fg1 f118307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ag1 f118308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f118309e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final oz f118310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f118311g;

    public yo2(ro2 ro2Var, ri2 ri2Var, fg1 fg1Var, ag1 ag1Var) {
        this.f118305a = ro2Var;
        this.f118306b = ri2Var;
        this.f118307c = fg1Var;
        this.f118308d = ag1Var;
        this.f118310f = ro2Var.d();
        this.f118311g = ro2Var.e();
        ro2Var.a(ri2Var);
    }

    public final void a(final Activity activity) {
        this.f118307c.a();
        this.f118308d.a(new Runnable() { // from class: yads.i71
            @Override // java.lang.Runnable
            public final void run() {
                yo2.a(this.f111892b, activity);
            }
        });
    }

    public static final void a(yo2 yo2Var, Activity activity) {
        if (!yo2Var.f118309e.getAndSet(true)) {
            Throwable thG = Result.g(yo2Var.f118305a.a(activity));
            if (thG != null) {
                yo2Var.f118306b.a(new l7(String.valueOf(thG.getMessage())));
                return;
            }
            return;
        }
        yo2Var.f118306b.a(m7.f113340a);
    }
}
