package u2;

import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105183b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f105182a = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Set f105184c = new HashSet();

    private b() {
    }

    public static final void a() {
        if (e3.a.d(b.class)) {
            return;
        }
        try {
            f105182a.c();
            Set set = f105184c;
            if (set != null && !set.isEmpty()) {
                f105183b = true;
            }
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
        }
    }

    public static final boolean b(String eventName) {
        if (e3.a.d(b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (f105183b) {
                return f105184c.contains(eventName);
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, b.class);
            return false;
        }
    }

    private final void c() {
        HashSet hashSetL;
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null || (hashSetL = z.l(iVarU.c())) == null) {
                return;
            }
            f105184c = hashSetL;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }
}
