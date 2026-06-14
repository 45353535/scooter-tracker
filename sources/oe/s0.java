package oe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final re.d f96880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f96881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final se.c f96882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Throwable f96883d;

    public s0(re.d request, int i10, se.c cVar, Throwable th2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f96880a = request;
        this.f96881b = i10;
        this.f96882c = cVar;
        this.f96883d = th2;
    }

    public final Throwable a() {
        return this.f96883d;
    }

    public final re.d b() {
        return this.f96880a;
    }

    public final se.c c() {
        return this.f96882c;
    }

    public final int d() {
        return this.f96881b;
    }
}
