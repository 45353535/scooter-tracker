package io.sentry;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v5 f84281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Iterable f84282b;

    public u5(v5 v5Var, Iterable iterable) {
        this.f84281a = (v5) io.sentry.util.w.c(v5Var, "SentryEnvelopeHeader is required.");
        this.f84282b = (Iterable) io.sentry.util.w.c(iterable, "SentryEnvelope items are required.");
    }

    public static u5 a(h1 h1Var, k8 k8Var, io.sentry.protocol.r rVar) {
        io.sentry.util.w.c(h1Var, "Serializer is required.");
        io.sentry.util.w.c(k8Var, "session is required.");
        return new u5(null, rVar, u6.G(h1Var, k8Var));
    }

    public v5 b() {
        return this.f84281a;
    }

    public Iterable c() {
        return this.f84282b;
    }

    public u5(io.sentry.protocol.x xVar, io.sentry.protocol.r rVar, u6 u6Var) {
        io.sentry.util.w.c(u6Var, "SentryEnvelopeItem is required.");
        this.f84281a = new v5(xVar, rVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(u6Var);
        this.f84282b = arrayList;
    }
}
