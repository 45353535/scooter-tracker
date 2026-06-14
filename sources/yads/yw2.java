package yads;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class yw2 implements vb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f118419b = TimeUnit.SECONDS.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9 f118420a;

    public yw2(t9 t9Var) {
        this.f118420a = t9Var;
    }

    @Override // yads.vb0
    public final long a() {
        Long l10 = this.f118420a.f116126s;
        return l10 != null ? l10.longValue() : f118419b;
    }
}
