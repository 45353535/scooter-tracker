package u2;

import android.os.Bundle;
import com.facebook.internal.i;
import com.facebook.internal.m;
import com.facebook.internal.z;
import com.facebook.s;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f105180b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f105179a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static HashSet f105181c = new HashSet();

    private a() {
    }

    public static final void a() {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            if (f105180b) {
                return;
            }
            f105179a.b();
            f105180b = !f105181c.isEmpty();
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }

    private final void b() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            i iVarU = m.u(s.n(), false);
            if (iVarU == null) {
                return;
            }
            f105181c = c(iVarU.b());
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private final HashSet c(JSONArray jSONArray) {
        try {
            if (e3.a.d(this)) {
                return null;
            }
            try {
                HashSet hashSetL = z.l(jSONArray);
                return hashSetL == null ? new HashSet() : hashSetL;
            } catch (Exception unused) {
                return new HashSet();
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final void d(Bundle bundle) {
        if (e3.a.d(a.class)) {
            return;
        }
        try {
            if (f105180b && bundle != null) {
                Iterator it = f105181c.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
            }
        } catch (Throwable th2) {
            e3.a.b(th2, a.class);
        }
    }
}
