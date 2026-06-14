package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class c9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83311a;

    public c9(v7 v7Var) {
        this.f83311a = (v7) io.sentry.util.w.c(v7Var, "options are required");
    }

    private boolean b(Double d10, Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }

    public d9 a(g4 g4Var) {
        Double dA = g4Var.a();
        d9 d9VarL = g4Var.b().l();
        if (d9VarL != null) {
            return io.sentry.util.a0.a(d9VarL);
        }
        this.f83311a.getProfilesSampler();
        Double profilesSampleRate = this.f83311a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA));
        this.f83311a.getTracesSampler();
        d9 d9VarZ = g4Var.b().z();
        if (d9VarZ != null) {
            return io.sentry.util.a0.a(d9VarZ);
        }
        Double tracesSampleRate = this.f83311a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f83311a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new d9(Boolean.valueOf(b(dValueOf, dA)), dValueOf, dA, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new d9(bool, null, dA, bool, null);
    }

    public boolean c(double d10) {
        Double profileSessionSampleRate = this.f83311a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d10));
    }
}
