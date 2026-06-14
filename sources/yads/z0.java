package yads;

import android.app.Application;
import android.content.Context;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 implements w0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f118474f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile z0 f118475g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f118476a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f118477b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f118478c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f118479d = new y0(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f118480e;

    public final void a(Context context, l1 l1Var) {
        synchronized (this.f118476a) {
            try {
                this.f118477b.put(l1Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Context context, l1 l1Var) {
        synchronized (this.f118476a) {
            this.f118477b.remove(l1Var);
            b(context);
            Unit unit = Unit.f93236a;
        }
    }

    public final void b(Context context) {
        synchronized (this.f118476a) {
            try {
                if (this.f118477b.isEmpty() && this.f118478c.isEmpty()) {
                    try {
                        if (a()) {
                            Context applicationContext = context.getApplicationContext();
                            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f118479d);
                            this.f118480e = false;
                        }
                    } catch (Throwable unused) {
                        boolean z10 = lb1.f113032a;
                    }
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(Context context, d1 d1Var) {
        synchronized (this.f118476a) {
            try {
                this.f118478c.put(d1Var, null);
                if (!a()) {
                    a(context);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f118476a) {
            z10 = this.f118480e;
        }
        return z10;
    }

    public final void a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f118479d);
            this.f118480e = true;
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
        }
    }
}
