package io.sentry;

import io.sentry.UncaughtExceptionHandlerIntegration;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f83725b = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f83726c;

    public m(v7 v7Var) {
        this.f83726c = v7Var;
    }

    @Override // io.sentry.d0
    public /* synthetic */ w7 c(w7 w7Var, i0 i0Var) {
        return c0.a(this, w7Var, i0Var);
    }

    @Override // io.sentry.d0
    public w6 d(w6 w6Var, i0 i0Var) {
        io.sentry.protocol.s sVarZ0;
        String strK;
        Long lJ;
        if (!io.sentry.util.m.h(i0Var, UncaughtExceptionHandlerIntegration.a.class) || (sVarZ0 = w6Var.z0()) == null || (strK = sVarZ0.k()) == null || (lJ = sVarZ0.j()) == null) {
            return w6Var;
        }
        Long l10 = (Long) this.f83725b.get(strK);
        if (l10 == null || l10.equals(lJ)) {
            this.f83725b.put(strK, lJ);
            return w6Var;
        }
        this.f83726c.getLogger().c(g7.INFO, "Event %s has been dropped due to multi-threaded deduplication", w6Var.G());
        io.sentry.util.m.n(i0Var, io.sentry.hints.h.MULTITHREADED_DEDUPLICATION);
        return null;
    }

    @Override // io.sentry.d0
    public /* synthetic */ io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, i0 i0Var) {
        return c0.b(this, e0Var, i0Var);
    }
}
