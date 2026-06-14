package jd;

import ic.t;
import ic.u;
import pd.b0;
import pd.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final kd.e f85817a = new kd.f();

    public static void c(Runnable runnable) {
        f85817a.cancel(runnable);
    }

    public static void d(Runnable runnable) {
        f85817a.execute(runnable);
    }

    public static void e(Runnable runnable, long j10) {
        f85817a.schedule(runnable, j10);
    }

    public static void f(final Object obj, final pd.h hVar) {
        if (hVar == null) {
            return;
        }
        b0.b(new u() { // from class: jd.g
            @Override // pd.w
            public /* synthetic */ void c(Throwable th2) {
                t.a(this, th2);
            }

            @Override // pd.w
            public final void onRun() {
                hVar.execute(obj);
            }

            @Override // pd.w, java.lang.Runnable
            public /* synthetic */ void run() {
                v.b(this);
            }
        });
    }

    public static String g(int i10) {
        return i10 != 0 ? i10 != 4 ? i10 != 8 ? "unknown" : "GONE" : "INVISIBLE" : "VISIBLE";
    }
}
