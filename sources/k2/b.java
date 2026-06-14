package k2;

import android.app.Activity;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f85953a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f85954b = b.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f85955c;

    private b() {
    }

    public static final void b() {
        try {
            if (e3.a.d(b.class)) {
                return;
            }
            try {
                s.t().execute(new Runnable() { // from class: k2.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.c();
                    }
                });
            } catch (Exception e10) {
                z.Z(f85954b, e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c() {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            if (com.facebook.internal.a.f19837f.h(s.m())) {
                return;
            }
            f85953a.e();
            f85955c = true;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final void d(Activity activity) {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                if (f85955c && !d.f85957d.c().isEmpty()) {
                    f.f85964f.e(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    private final void e() {
        String strN;
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null || (strN = iVarU.n()) == null) {
                return;
            }
            d.f85957d.d(strN);
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
