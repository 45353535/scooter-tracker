package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class sw2 implements u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f115964b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f115965a;

    public sw2(t9 t9Var) {
        this.f115965a = t9Var;
    }

    @Override // yads.u2
    public final long a() {
        Long l10 = this.f115965a.f116126s;
        return l10 != null ? l10.longValue() : f115964b;
    }

    @Override // yads.u2
    public final long a(long j10) {
        Long l10 = this.f115965a.f116126s;
        return l10 != null ? Math.min(j10, l10.longValue()) : j10;
    }
}
