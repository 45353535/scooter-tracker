package f1;

import f1.z2;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f71301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f71302c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f71303d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f71304e = new LinkedHashSet();

    public ud(int i10, int i11) {
        this.f71300a = i10;
        this.f71301b = i11;
    }

    public final long a(y0 y0Var) {
        Long l10 = (Long) this.f71302c.get(y0Var.k());
        return l10 != null ? l10.longValue() : y0Var.n();
    }

    public final long b(y0 y0Var) {
        return (y0Var.n() - a(y0Var)) / ((long) 1000);
    }

    public final int c(y0 y0Var) {
        Integer num = (Integer) this.f71303d.get(y0Var.k());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void d(y0 y0Var) {
        if (this.f71302c.containsKey(y0Var.k())) {
            return;
        }
        this.f71302c.put(y0Var.k(), Long.valueOf(y0Var.n()));
    }

    public final synchronized y0 e(y0 y0Var) {
        if (y0Var == null) {
            return null;
        }
        try {
            d(y0Var);
            if (b(y0Var) > this.f71301b) {
                g(y0Var);
            }
            if (this.f71304e.contains(y0Var.k())) {
                return null;
            }
            if (i(y0Var) <= this.f71300a) {
                return y0Var;
            }
            return f(y0Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final y0 f(y0 y0Var) {
        l1 l1Var = new l1(z2.f.f71731i, y0Var.k().getValue(), null, null, null, null, 60, null);
        this.f71304e.add(y0Var.k());
        return l1Var;
    }

    public final void g(y0 y0Var) {
        h(y0Var);
        this.f71303d.remove(y0Var.k());
    }

    public final void h(y0 y0Var) {
        this.f71302c.put(y0Var.k(), Long.valueOf(y0Var.n()));
    }

    public final int i(y0 y0Var) {
        int iC = c(y0Var) + 1;
        this.f71303d.put(y0Var.k(), Integer.valueOf(iC));
        return iC;
    }
}
