package id;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f74613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f74614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f74615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f74616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g1 f74617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f74618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f74619g;

    public s(long j10, double d10, boolean z10, boolean z11, g1 stopAfter, double d11, List algorithms) {
        Intrinsics.checkNotNullParameter(stopAfter, "stopAfter");
        Intrinsics.checkNotNullParameter(algorithms, "algorithms");
        this.f74613a = j10;
        this.f74614b = d10;
        this.f74615c = z10;
        this.f74616d = z11;
        this.f74617e = stopAfter;
        this.f74618f = d11;
        this.f74619g = algorithms;
    }

    public final List a() {
        return this.f74619g;
    }

    public final double b() {
        return this.f74614b;
    }

    public final g1 c() {
        return this.f74617e;
    }

    public final long d() {
        return this.f74613a;
    }

    public final double e() {
        return this.f74618f;
    }

    public final boolean f() {
        return this.f74616d;
    }

    public final boolean g() {
        return this.f74615c;
    }
}
