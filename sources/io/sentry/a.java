package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements n1 {
    @Override // io.sentry.n1
    public io.sentry.transport.r a(v7 v7Var, e4 e4Var) {
        io.sentry.util.w.c(v7Var, "options is required");
        io.sentry.util.w.c(e4Var, "requestDetails is required");
        return new io.sentry.transport.e(v7Var, new io.sentry.transport.b0(v7Var), v7Var.getTransportGate(), e4Var);
    }
}
