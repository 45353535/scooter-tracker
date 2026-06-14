package f1;

import f1.y0;
import f1.z2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements ag, Cif {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Lazy f70277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Lazy f70278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Lazy f70279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Lazy f70280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Lazy f70281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Lazy f70282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f70283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f70284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f70285j;

    public l(Lazy config, Lazy throttler, Lazy requestBodyBuilder, Lazy privacyApi, Lazy trackingRequest, Lazy trackingEventCache) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(throttler, "throttler");
        Intrinsics.checkNotNullParameter(requestBodyBuilder, "requestBodyBuilder");
        Intrinsics.checkNotNullParameter(privacyApi, "privacyApi");
        Intrinsics.checkNotNullParameter(trackingRequest, "trackingRequest");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        this.f70277b = config;
        this.f70278c = throttler;
        this.f70279d = requestBodyBuilder;
        this.f70280e = privacyApi;
        this.f70281f = trackingRequest;
        this.f70282g = trackingEventCache;
        this.f70283h = new LinkedHashMap();
        this.f70284i = new LinkedHashMap();
        this.f70285j = new ArrayList();
    }

    public final float a(y0 y0Var) {
        if (!y0Var.m()) {
            return y0Var.f();
        }
        if (!y0Var.r()) {
            return 0.0f;
        }
        try {
            if (((y0) this.f70284i.remove(k(y0Var))) != null) {
                return (y0Var.n() - r1.n()) / 1000.0f;
            }
            return -1.0f;
        } catch (Exception e10) {
            eg.d("Cannot calculate latency", e10);
            return -1.0f;
        }
    }

    public final fb b() {
        try {
            n3 n3VarA = ((g2) this.f70279d.getValue()).a();
            return pa.f70777a.c(n3VarA.f(), n3VarA.k(), n3VarA.j().c(), (g0) this.f70280e.getValue(), n3VarA.f70522h);
        } catch (Exception e10) {
            eg.d("Cannot create environment data for tracking", e10);
            return new fb(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
    }

    public final String c(xc xcVar) {
        return xcVar.e() + xcVar.d();
    }

    public final String d(String str, String str2) {
        return str + str2;
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        mo4436e(y0Var);
        return y0Var;
    }

    public final void f(List list) {
        ((u4) this.f70281f.getValue()).a(((u) this.f70277b.getValue()).b(), list);
    }

    public final void g(y0 y0Var) {
        Unit unit;
        if (y0Var != null) {
            try {
                if (((u) this.f70277b.getValue()).d()) {
                    h(y0Var);
                } else {
                    j(y0Var);
                }
                unit = Unit.f93236a;
            } catch (Exception e10) {
                eg.d("Cannot send tracking event", e10);
                return;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Cannot save empty event", null, 2, null);
        }
    }

    public final void h(y0 y0Var) {
        ((h2) this.f70282g.getValue()).f(y0Var, b(), ((u) this.f70277b.getValue()).e());
        if (y0Var.l() == y0.a.f71594c) {
            f(((h2) this.f70282g.getValue()).b());
        }
    }

    public void i(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ((h2) this.f70282g.getValue()).d(event);
    }

    public final void j(y0 y0Var) {
        this.f70285j.add(y0Var);
        if (y0Var.l() == y0.a.f71594c) {
            f(((h2) this.f70282g.getValue()).c(this.f70285j, b()));
        }
    }

    public final String k(y0 y0Var) {
        return d(y0Var.h(), y0Var.a());
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70284i.remove(d(location, type));
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        v(xcVar);
        return xcVar;
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        t(uVar);
        return uVar;
    }

    public final boolean o(y0 y0Var) {
        z2 z2VarK = y0Var.k();
        return z2VarK == z2.a.f71693d || z2VarK == z2.i.f71747c;
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        s(y0Var);
        return y0Var;
    }

    public final void q(y0 y0Var) {
        y0Var.d((xc) this.f70283h.get(k(y0Var)));
        y0Var.b(a(y0Var));
        g(y0Var);
        eg.e("Event: " + y0Var, null, 2, null);
        r(y0Var);
    }

    public final void r(y0 y0Var) {
        if (o(y0Var)) {
            this.f70284i.put(k(y0Var), y0Var);
        }
    }

    public void s(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.d((xc) this.f70283h.get(k(event)));
        event.b(a(event));
        eg.e("Persist event: " + event, null, 2, null);
        ((h2) this.f70282g.getValue()).e(event, b());
    }

    public void t(u config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f70277b = lf.i.c(config);
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        i(y0Var);
        return y0Var;
    }

    public void v(xc ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f70283h.put(c(ad2), ad2);
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Unit unit;
        Intrinsics.checkNotNullParameter(event, "event");
        u uVar = (u) this.f70277b.getValue();
        if (!uVar.g()) {
            eg.e("Tracking is disabled", null, 2, null);
            return;
        }
        if (uVar.a().contains(event.k())) {
            eg.e("Event name " + event.k() + " is black-listed", null, 2, null);
            return;
        }
        y0 y0VarE = ((ud) this.f70278c.getValue()).e(event);
        if (y0VarE != null) {
            q(y0VarE);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Event is throttled " + event, null, 2, null);
        }
    }
}
