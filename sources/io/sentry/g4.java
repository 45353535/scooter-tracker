package io.sentry;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e9 f83512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f83513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f83514c;

    public g4(e9 e9Var, j jVar, Double d10, Map map) {
        this.f83512a = (e9) io.sentry.util.w.c(e9Var, "transactionContexts is required");
        this.f83513b = d10;
        this.f83514c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f83513b;
    }

    public e9 b() {
        return this.f83512a;
    }
}
