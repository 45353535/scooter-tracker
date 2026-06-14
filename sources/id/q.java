package id;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f74596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f74597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f74598c;

    public q(boolean z10, p algorithmParams, long j10) {
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
        this.f74596a = z10;
        this.f74597b = algorithmParams;
        this.f74598c = j10;
    }

    public final p a() {
        return this.f74597b;
    }

    public final long b() {
        return this.f74598c;
    }

    public final boolean c() {
        return this.f74596a;
    }
}
