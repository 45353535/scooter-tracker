package io.sentry;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f84409b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f84410c;

    public w(v7 v7Var) {
        this.f84410c = (v7) io.sentry.util.w.c(v7Var, "options are required");
    }

    private static List a(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        while (th2.getCause() != null) {
            arrayList.add(th2.getCause());
            th2 = th2.getCause();
        }
        return arrayList;
    }

    private static boolean b(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, i0 i0Var) {
        return c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, i0 i0Var) {
        if (!this.f84410c.isEnableDeduplication()) {
            this.f84410c.getLogger().c(g7.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return w6Var;
        }
        Throwable thO = w6Var.O();
        if (thO == null) {
            return w6Var;
        }
        if (this.f84409b.containsKey(thO) || b(this.f84409b, a(thO))) {
            this.f84410c.getLogger().c(g7.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", w6Var.G());
            return null;
        }
        this.f84409b.put(thO, null);
        return w6Var;
    }

    @Override // io.sentry.d0
    public /* synthetic */ io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, i0 i0Var) {
        return c0.b(this, e0Var, i0Var);
    }
}
